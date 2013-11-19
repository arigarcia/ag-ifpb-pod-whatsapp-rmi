package br.edu.ifpb.pod.rmi.server.model;

import java.util.ArrayList;
import java.util.List;

public class AccessRepository {
	private final static List<Access> list = new ArrayList<Access>();
	
	public void store(Access access){
		if (getAccess(access.getPerson()) == null)
			list.add(access);
		else 
			throw new RuntimeException(
					"Usuário já conectado!"
			);
	}
	
	public Access getAccess(Person person){
		for (Access a: list) {
	    if (a.getPerson().equals(person)){
	    	return a;
	    }
    }
		return null;
	}
	
	public void removeAccessBy(Person person){
		for (Access a: list) {
	    if (a.getPerson().equals(person)){
	    	list.remove(a);
	    }
    }
	}
	
	
}
