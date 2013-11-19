package br.edu.ifpb.pod.rmi.server.action;

import javax.servlet.http.HttpServletRequest;

import br.edu.ifpb.pod.rmi.server.Action;

public class LoginSuccessResultPageAction implements Action {

	@Override
	public String execute(HttpServletRequest req) {
		return "login-success-page";
	}

}
