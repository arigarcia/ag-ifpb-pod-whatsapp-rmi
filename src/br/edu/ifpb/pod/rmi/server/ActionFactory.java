package br.edu.ifpb.pod.rmi.server;

import br.edu.ifpb.pod.rmi.server.action.AuthenticationAction;
import br.edu.ifpb.pod.rmi.server.action.ErrorAction;
import br.edu.ifpb.pod.rmi.server.action.HelloAction;
import br.edu.ifpb.pod.rmi.server.action.HomePageAction;
import br.edu.ifpb.pod.rmi.server.action.ListPersonAction;
import br.edu.ifpb.pod.rmi.server.action.LoginErrorResultPageAction;
import br.edu.ifpb.pod.rmi.server.action.LoginPageAction;
import br.edu.ifpb.pod.rmi.server.action.LoginSuccessResultPageAction;
import br.edu.ifpb.pod.rmi.server.action.RegisterPersonAction;
import br.edu.ifpb.pod.rmi.server.action.ShowRegisterPersonPageAction;

public class ActionFactory {
	
	public Action create(String p){
		Action action;
		if ("hello".equals(p)){
			action = new HelloAction();
		}
		else if ("index".equals(p)){
			action = new HomePageAction();
		}
		else if ("register-page".equals(p)){
			action = new ShowRegisterPersonPageAction();
		}
		else if ("save-person".equals(p)){
			action = new RegisterPersonAction();
		}
		else if ("list-page".equals(p)){
			action = new ListPersonAction();
		}
		else if ("login-page".equals(p)){
			action = new LoginPageAction();
		}
		else if ("authenticate".equals(p)){
			action = new AuthenticationAction();
		}
		else if ("login-error".equals(p)){
			action = new LoginErrorResultPageAction();
		}
		else if ("login-success".equals(p)){
			action = new LoginSuccessResultPageAction();
		}
		else {
			action = new ErrorAction();
		}
		return action;
	}
	
}
