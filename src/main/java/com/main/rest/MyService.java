package com.main.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.jboss.logging.Param;
import org.jboss.resteasy.annotations.jaxrs.PathParam;
import org.jboss.resteasy.annotations.providers.NoJackson;
import org.jboss.resteasy.plugins.providers.html.View;

import com.google.inject.Inject;


@Path("/hello")
public class MyService{
	@Inject
	StudentService studentservice;
	
	
	@POST
	@Path("/insert")
	
	public View createStudent(@FormParam("name") String name)
	{
		Student s1=new Student();
		s1.setName(name);
		studentservice.insertStudent(s1);
		System.out.println("Student insert");		
		List<Student> ls=studentservice.displayStudent();		
		return new View("/display.jsp",ls,"data");
	}
	
	@POST
	@Path("/update")
	public View updateStudent(@FormParam("name") String name,@FormParam("id")  String iid)
	{
		Student s1=new Student();
		int id=Integer.parseInt(iid);
		s1.setName(name);
		studentservice.updateStudent(s1, id);
	    List<Student> ls=studentservice.displayStudent();		
		return new View("/display.jsp",ls,"data");
		
	}
	
	@POST
	@Path("/delete")
	public View deleteStudent(@FormParam("id") String iid)
	{
		int id=Integer.parseInt(iid);
		studentservice.deleteStudent(id);
	     List<Student> ls=studentservice.displayStudent();		
		return new View("/display.jsp",ls,"data");
	}
	
	@GET
	@Path("/display")
	public View display()
	{
		  List<Student> ls=studentservice.displayStudent();		
		  return new View("/display.jsp",ls,"data");
	}
	
	@GET
	@Path("/up/{iid}")
	public View updateStudent(@PathParam("iid") String iid)
	{
		Student s1;
		int id=Integer.parseInt(iid);
		s1=studentservice.GetStudent(id);
		return new View("/update.jsp",s1,"data");
	}
	
	@GET
	@Path("/de/{iid}")
	public View delStudent(@PathParam("iid") String iid)
	{
		Student s1;
		int id=Integer.parseInt(iid);
		studentservice.deleteStudent(id);
		 List<Student> ls=studentservice.displayStudent();		
		  return new View("/display.jsp",ls,"data");
	}
	
	
	
	

}
