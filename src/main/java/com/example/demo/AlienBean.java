package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AlienBean {

    @Id
	private int id;
	private String firstname;
	private String password;

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "AlienBean [id=" + id + ", firstname=" + firstname + ", password=" + password + "]";
	}
	
	
	
}
