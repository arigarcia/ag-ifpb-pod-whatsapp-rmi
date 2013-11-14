package br.edu.ifpb.pod.rmi.server.model;

import java.io.Serializable;

public class Message implements Serializable {
	String text;
	Person to;
	Person from;
	
	public Message() {
  }
	
	public Message(String text, Person to, Person from) {
	  this.text = text;
	  this.to = to;
	  this.from = from;
  }

	public String getText() {
  	return text;
  }

	public Person getTo() {
  	return to;
  }

	public Person getFrom() {
  	return from;
  }
	
	
}
