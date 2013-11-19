package br.edu.ifpb.pod.rmi.server.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import br.edu.ifpb.pod.rmi.server.model.Message;
import br.edu.ifpb.pod.rmi.server.model.Person;

/**
 * Representa o serviço de mensagem do sistema
 * 
 * @author ari
 *
 */
public interface MessageService extends Remote {
	/**
	 * Envia mensagem para um servidor
	 * 
	 * @param message
	 */
	void send(Message message) throws RemoteException;
	
	/**
	 * Recupera todas as mensagens para um determinado 
	 * usuário (person)
	 * 
	 * @param person
	 * @return
	 */
	List<Message> receive(Person person) throws RemoteException;
	
}	
