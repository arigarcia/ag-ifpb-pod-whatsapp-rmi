package br.edu.ifpb.pod.rmi.server.model;

import java.util.ArrayList;
import java.util.List;

public class PersonRepository {
	private final static List<Person> list = new ArrayList<Person>();
	
	public void registry(Person person){
		list.add(person);
	}
	
	public List<Person> list(){
		return list;
	}
	

}
