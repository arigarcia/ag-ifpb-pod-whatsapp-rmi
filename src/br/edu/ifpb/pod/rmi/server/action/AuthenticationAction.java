package br.edu.ifpb.pod.rmi.server.action;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import javax.servlet.http.HttpServletRequest;

import br.edu.ifpb.pod.rmi.server.Action;
import br.edu.ifpb.pod.rmi.server.model.Access;
import br.edu.ifpb.pod.rmi.server.model.AccessRepository;
import br.edu.ifpb.pod.rmi.server.service.AccessService;

public class AuthenticationAction implements Action {

	@Override
	public String execute(HttpServletRequest req) {
		try {
			//
			String email = req.getParameter("userEmail");
			String password = req.getParameter("userPassword");
			//chamada do serviço em RMI
			Registry registry = LocateRegistry.getRegistry("localhost", 8989);
	    AccessService service = (AccessService) registry.lookup(
	    		"RMIAccessService"
	    );
	    Access access = service.authenticUser(email, password);
	    //
	    if (access == null){
	    	return "login-error-page";
	    }
	    else {
	    	AccessRepository repository = new AccessRepository();
	    	repository.store(access);
	    	return "login-success-page";
	    }
    } 
		catch (RemoteException | NotBoundException e) {
	    e.printStackTrace();
	    return "error";
    }
	}

}
