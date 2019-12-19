package com.main.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.jboss.resteasy.annotations.jaxrs.PathParam;


@Path("/hello")
public class MyService{
	
	@GET
	@Path("{name}")
	public String Greeting(@PathParam("name")final String name)
	{
		System.out.println("Trst");
		return "Hello World"+name;
	}
	
	@GET
	@Path("display")
	public String display()
	{
		System.out.println("display");
		return "hello guice";
	}
	

}
