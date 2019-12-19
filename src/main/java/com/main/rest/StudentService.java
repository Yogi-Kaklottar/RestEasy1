package com.main.rest;

public interface StudentService {
	
	public void insertStudent(Student s);
	public void updateStudent(Student s,int id);
	public void deleteStudent(int id);

}
