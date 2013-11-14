package br.edu.ifpb.pod.rmi.server;

import br.edu.ifpb.pod.rmi.server.action.ErrorAction;
import br.edu.ifpb.pod.rmi.server.action.HelloAction;
import br.edu.ifpb.pod.rmi.server.action.HomePageAction;
import br.edu.ifpb.pod.rmi.server.action.ListPersonAction;
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
		else {
			action = new ErrorAction();
		}
		return action;
	}
	
}
