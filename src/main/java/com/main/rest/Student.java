package com.main.rest;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;

	private String name;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<PhoneNo> PhoneList;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
	}
	

	public List<PhoneNo> getPhoneList() {
		return PhoneList;
	}

	public void setPhoneList(List<PhoneNo> phoneList) {
		PhoneList = phoneList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	
	

	

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [getId()=" + getId() + ", getName()=" + getName() +  "]";
	}
	
	
	
}
