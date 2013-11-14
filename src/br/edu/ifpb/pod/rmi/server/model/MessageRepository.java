package br.edu.ifpb.pod.rmi.server.model;

import java.util.ArrayList;
import java.util.List;

public class MessageRepository {
	private final static List<Message> list = new ArrayList<Message>();
	
	public void store(Message message){
		list.add(message);
	}
	
	public List<Message> findBy(Person person){
		List<Message> result = new ArrayList<Message>();
		for (Message m: list) {
	    if (m.getTo().equals(person)){
	    	result.add(m);
	    }
    }
		return result;
	}
	
	
}
