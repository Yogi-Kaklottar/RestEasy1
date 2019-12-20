package com.main.rest;

import java.util.List;

import javax.persistence.EntityManager;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.persist.Transactional;



public class StudentImplement implements StudentService {

	@Inject
	Provider<EntityManager> entitymanager;
	
	@Override
	@Transactional
	public void insertStudent(Student s) {
		entitymanager.get().persist(s);
		
	}

	@Override
	@Transactional
	public void updateStudent(Student s, int id) {
		Student s1=entitymanager.get().find(Student.class, id);
		   s1.setName(s.getName());
		
	}

	@Override
	@Transactional
	public void deleteStudent(int id) {
		Student s1=entitymanager.get().find(Student.class, id);
		  entitymanager.get().remove(s1);
		
	}

	@Override
	@Transactional
	public List<Student> displayStudent() {
		java.util.List<Student> l= entitymanager.get().createQuery("Select p FROM Student p",Student.class).getResultList();		
		return l;
	}

	@Override
	@Transactional
	public Student GetStudent(int id) {
			Student s=entitymanager.get().find(Student.class,id);
			return s;
	}

	
	//PhoneNo Information Method
	@Override
	@Transactional
	public void insertPhone(PhoneNo p) {
		entitymanager.get().persist(p);
		
	}

	@Override
	@Transactional
	public void updatePhone(PhoneNo p, int id) {
		PhoneNo p1=entitymanager.get().find(PhoneNo.class,id);
		p1.setNumber(p.getNumber());
		
	}

	@Override
	@Transactional
	public void deletePhone(int id) {
		PhoneNo p=entitymanager.get().find(PhoneNo.class,id);
		entitymanager.get().remove(p);
		
	}

	@Override
	@Transactional
	public PhoneNo GetPhone(int id) {
		PhoneNo p=entitymanager.get().find(PhoneNo.class,id);
		return p;
	}

	@Override
	@Transactional
	public List<PhoneNo> display() {
		java.util.List<PhoneNo> l= entitymanager.get().createQuery("Select p FROM PhoneNo p",PhoneNo.class).getResultList();		
		return l;
	}

	
		
	
	//phone Student both data
	
	
	@Override
	public void insertStudentPhone(Student s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void UpdateStudentPhone(Student s, int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteStudentPhone(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Student> displayStudentPhone() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getStudentPhone(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
