package br.edu.ifpb.pod.rmi.server.service.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

import br.edu.ifpb.pod.rmi.server.model.Access;
import br.edu.ifpb.pod.rmi.server.model.AccessRepository;
import br.edu.ifpb.pod.rmi.server.model.Person;
import br.edu.ifpb.pod.rmi.server.model.PersonRepository;
import br.edu.ifpb.pod.rmi.server.service.AccessService;

@SuppressWarnings("serial")
public class AccessServiceImpl extends UnicastRemoteObject implements AccessService {
	private AccessRepository repository;

	public AccessServiceImpl() throws RemoteException {
	  repository = new AccessRepository();
  }

	@Override
	public boolean registryUser(Person person) throws RemoteException {
		PersonRepository repository = new PersonRepository();
		repository.registry(person);
		return true;
	}

	@Override
	public Access authenticUser(String email, String password)
	    throws RemoteException {
		PersonRepository repository = new PersonRepository();
		for (Person p : repository.list()){
			if (p.getEmail().equals(email) && p.getPassword().equals(password)){
				Access access = new Access(p, new Date());
				return access;
			}
		}
		return null;
	}

}
