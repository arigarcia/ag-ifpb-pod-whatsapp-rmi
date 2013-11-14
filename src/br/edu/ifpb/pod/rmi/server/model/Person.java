package br.edu.ifpb.pod.rmi.server.model;

import java.io.Serializable;

public class Person implements Serializable{
	String name;
	
	public Person() {
  }
	
	public String getName() {
	  return name;
  }
	
	public void setName(String name) {
	  this.name = name;
  }
	
}
