package com.main.rest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PhoneNo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	
	private String number;

	public PhoneNo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PhoneNo(int id, String number) {
		super();
		this.id = id;
		this.number = number;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "PhoneNo [Id=" + getId() + ", Number=" + getNumber() + "]";
	}
	
	

}
