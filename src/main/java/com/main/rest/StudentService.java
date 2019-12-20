package com.main.rest;
import java.util.List;
public interface StudentService {	
	//student Service
	public void insertStudent(Student s);
	public void updateStudent(Student s,int id);
	public void deleteStudent(int id);
	public List<Student> displayStudent();
	public Student GetStudent(int id);
	
	//phone Service
	
	public void insertPhone(PhoneNo p);
	public void updatePhone(PhoneNo p,int id);
	public void deletePhone(int id);
	public PhoneNo GetPhone(int id);
	public List<PhoneNo> display();
	
	//phone and student merger One To Many
	
	public void insertStudentPhone(Student s);
	public void UpdateStudentPhone(Student s,int id);
	public void deleteStudentPhone(int id);
	public  List<Student> displayStudentPhone();
	public Student getStudentPhone(int id);
	

}
