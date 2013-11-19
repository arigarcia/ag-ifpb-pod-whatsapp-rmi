package br.edu.ifpb.pod.rmi.server.model;

import java.io.Serializable;
import java.util.Date;


@SuppressWarnings("serial")
public class Access implements Serializable {
	private Person person;
	private Date date;
	
	public Access(Person person, Date date) {
	  this.person = person;
	  this.date = date;
  }
	
	public Date getDate() {
	  return date;
  }
	
	public Person getPerson() {
	  return person;
  }
	
	
}
