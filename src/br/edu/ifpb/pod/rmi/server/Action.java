package br.edu.ifpb.pod.rmi.server;

import javax.servlet.http.HttpServletRequest;

public interface Action {

	String execute(HttpServletRequest req);
	
}
