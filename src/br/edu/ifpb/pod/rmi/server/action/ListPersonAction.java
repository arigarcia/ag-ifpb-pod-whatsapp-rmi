package br.edu.ifpb.pod.rmi.server.action;

import javax.servlet.http.HttpServletRequest;

import br.edu.ifpb.pod.rmi.server.Action;
import br.edu.ifpb.pod.rmi.server.model.PersonRepository;

public class ListPersonAction implements Action {
	PersonRepository repository = new PersonRepository();

	@Override
	public String execute(HttpServletRequest req) {
		req.setAttribute("ps", repository.list());
		return "list-page";
	}

}
