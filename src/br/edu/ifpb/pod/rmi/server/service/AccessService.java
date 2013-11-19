package br.edu.ifpb.pod.rmi.server.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

import br.edu.ifpb.pod.rmi.server.model.Access;
import br.edu.ifpb.pod.rmi.server.model.Person;

public interface AccessService extends Remote {
	boolean registryUser(Person person) throws RemoteException;
	Access authenticUser(String email, String password) throws RemoteException;
}
