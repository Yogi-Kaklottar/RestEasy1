package com.main.rest;
import java.util.List;
public interface StudentService {
	
	public void insertStudent(Student s);
	public void updateStudent(Student s,int id);
	public void deleteStudent(int id);
	public List<Student> displayStudent();

}
