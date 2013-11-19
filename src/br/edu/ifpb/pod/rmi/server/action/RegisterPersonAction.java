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
		String email = req.getParameter("personEmail");
		String password = req.getParameter("personPassword");
		//registry
		Person person = new Person();
		person.setName(name);
		person.setEmail(email);
		person.setPassword(password);
		repository.registry(person);
		//
		req.setAttribute("ps", repository.list());
		//
		return "list-page";
	}

}
