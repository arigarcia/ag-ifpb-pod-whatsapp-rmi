package br.edu.ifpb.pod.rmi.server.action;

import javax.servlet.http.HttpServletRequest;

import br.edu.ifpb.pod.rmi.server.Action;
import br.edu.ifpb.pod.rmi.server.model.Person;
import br.edu.ifpb.pod.rmi.server.model.PersonRepository;

public class RegisterPersonAction implements Action {
	PersonRepository repository = new PersonRepository();

	@Override
	public String execute(HttpServletRequest req) {
		//receber dados
		String name = req.getParameter("personName");
		//registry
		Person person = new Person();
		person.setName(name);
		repository.registry(person);
		//
		req.setAttribute("ps", repository.list());
		//
		return "list-page";
	}

}
