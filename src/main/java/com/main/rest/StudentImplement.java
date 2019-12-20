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
	public Student GetStudent(int id) {
			Student s=entitymanager.get().find(Student.class,id);
			return s;
	}

	

}
