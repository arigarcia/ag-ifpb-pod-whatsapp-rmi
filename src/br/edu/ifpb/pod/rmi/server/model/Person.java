package br.edu.ifpb.pod.rmi.server.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Person implements Serializable{
	String name;
	String email;
	String password;
	
	public Person() {
  }
	
	public String getEmail() {
  	return email;
  }

	public void setEmail(String email) {
  	this.email = email;
  }

	public String getPassword() {
  	return password;
  }
	
	public void setPassword(String password) {
  	this.password = password;
  }

	public String getName() {
	  return name;
  }
	
	public void setName(String name) {
	  this.name = name;
  }
	
}
