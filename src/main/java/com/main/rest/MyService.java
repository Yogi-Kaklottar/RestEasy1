package com.main.rest;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

import com.google.inject.Inject;


@Path("/hello")
public class MyService{
	@Inject
	StudentService studentservice;
	
	
	@POST
	@Path("/insert")
	public String createStudent(@FormParam("name") String name)
	{
		Student s1=new Student();
		s1.setName(name);
		studentservice.insertStudent(s1);
		System.out.println("Student insert");
		String ins="<a href='http://localhost:8080/sampleRESTEasy/insert.html'>insert</a>";
		String up="<a href='http://localhost:8080/sampleRESTEasy/update.html'>update</a>";
		String de="<a href='http://localhost:8080/sampleRESTEasy/delete.html'>delete</a>";
		String dis=ins+"    "+up+"      "+de;
		List<Student> ls=studentservice.displayStudent();
		for(Student k :ls)
		{
			dis+="</br>"+k.toString();
		}
		
		
		
		return dis;
	}
	
	@POST
	@Path("/update")
	public String updateStudent(@FormParam("name") String name,@FormParam("id")  String iid)
	{
		Student s1=new Student();
		int id=Integer.parseInt(iid);
		s1.setName(name);
		studentservice.updateStudent(s1, id);
		System.out.println("data will be update");
		String ins="<a href='http://localhost:8080/sampleRESTEasy/insert.html'>insert</a>";
		String up="<a href='http://localhost:8080/sampleRESTEasy/update.html'>update</a>";
		String de="<a href='http://localhost:8080/sampleRESTEasy/delete.html'>delete</a>";
		String dis=ins+"    "+up+"      "+de;
		List<Student> ls=studentservice.displayStudent();
		for(Student k :ls)
		{
			dis+="</br>"+k.toString();
		}
		
		
		
		return dis;
	}
	
	@POST
	@Path("/delete")
	public String deleteStudent(@FormParam("id") String iid)
	{
		int id=Integer.parseInt(iid);
		studentservice.deleteStudent(id);
		String ins="<a href='http://localhost:8080/sampleRESTEasy/insert.html'>insert</a>";
		String up="<a href='http://localhost:8080/sampleRESTEasy/update.html'>update</a>";
		String de="<a href='http://localhost:8080/sampleRESTEasy/delete.html'>delete</a>";
		String dis=ins+"    "+up+"      "+de;
		List<Student> ls=studentservice.displayStudent();
		for(Student k :ls)
		{
			dis+="</br>"+k.toString();
		}
		
		
		
		return dis;
	}
	
	
	

}
