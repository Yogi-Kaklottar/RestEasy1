package com.main.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.jboss.resteasy.annotations.Form;
import org.jboss.resteasy.annotations.jaxrs.PathParam;
import org.jboss.resteasy.plugins.providers.html.View;

import com.google.inject.Inject;

@Path("/hello")
public class MyService {
	@Inject
	StudentService service;

	// Student Information
	@POST
	@Path("/insert")

	public View createStudent(@FormParam("name") String name) {
		Student s1 = new Student();
		s1.setName(name);
		service.insertStudent(s1);
		System.out.println("Student insert");
		List<Student> ls = service.displayStudent();
		return new View("/display.jsp", ls, "data");
	}

	@POST
	@Path("/update")
	public View updateStudent(@FormParam("name") String name, @FormParam("id") String iid) {
		Student s1 = new Student();
		int id = Integer.parseInt(iid);
		s1.setName(name);
		service.updateStudent(s1, id);
		List<Student> ls = service.displayStudent();
		return new View("/display.jsp", ls, "data");

	}

	@POST
	@Path("/delete")
	public View deleteStudent(@FormParam("id") String iid) {
		int id = Integer.parseInt(iid);
		service.deleteStudent(id);
		List<Student> ls = service.displayStudent();
		return new View("/display.jsp", ls, "data");
	}

	@GET
	@Path("/display")
	public View display() {
		List<Student> ls = service.displayStudent();
		return new View("/display.jsp", ls, "data");
	}

	@GET
	@Path("/up/{iid}")
	public View updateStudent(@PathParam("iid") String iid) {
		Student s1;
		int id = Integer.parseInt(iid);
		s1 = service.GetStudent(id);
		return new View("/update.jsp", s1, "data");
	}

	@GET
	@Path("/de/{iid}")
	public View delStudent(@PathParam("iid") String iid) {
		Student s1;
		int id = Integer.parseInt(iid);
		service.deleteStudent(id);
		List<Student> ls = service.displayStudent();
		return new View("/display.jsp", ls, "data");
	}

	// PhoneNo service

	@GET
	@Path("/pdisplay")
	public View pdisplay() {
		List<PhoneNo> list = service.display();
		return new View("/pdisplay.jsp", list, "data");
	}

	@POST
	@Path("/pinsert")
	public View phoneinsert(@FormParam("pname") String pname) {
		PhoneNo p = new PhoneNo();
		p.setNumber(pname);
		service.insertPhone(p);
		System.out.println("phone insert");
		return pdisplay();
	}

	@GET
	@Path("/pup/{pid}")
	public View phoneUpdate(@PathParam("pid") String pid) {
		int id = Integer.parseInt(pid);
		PhoneNo p = service.GetPhone(id);
		return new View("/pupdate.jsp", p, "data");

	}

	@POST
	@Path("/pupdate")
	public View pUpdate(@FormParam("pname") String pname, @FormParam("pid") String pid) {
		int id = Integer.parseInt(pid);
		PhoneNo p = new PhoneNo();
		p.setNumber(pname);
		service.updatePhone(p, id);
		return pdisplay();
	}

	@GET
	@Path("/pde/{pid}")
	public View phoneDelete(@PathParam("pid") int pid)
	{
		
		service.deletePhone(pid);
		System.out.println("data deletesd");
		return pdisplay();
	}

	// student with phone number

	@POST
	@Path("/spinsert")
	public View psinsert(@FormParam("spname") String spname,@FormParam("p1") String p1 ,@FormParam("p2") String p2,@FormParam("p3") String p3)
	{	
		PhoneNo n1=new PhoneNo();
		PhoneNo n2=new PhoneNo();
		PhoneNo n3=new PhoneNo();
		
		n1.setNumber(p1);
		n2.setNumber(p2);
		n3.setNumber(p3);
		List< PhoneNo> n=new ArrayList<PhoneNo>();
		n.add(n1);
		n.add(n2);
		n.add(n3);
		Student s=new Student();
		s.setName(spname);
		s.setPhoneList(n);
		service.insertStudentPhone(s);
		System.out.println("data inserted");
		return psDisplay();
	}
	@GET
	@Path("/spdisplay")
	public View psDisplay()
	{
		List<Student> list=service.displayStudentPhone();
		return new View("/studentphonedisplay.jsp",list,"data");
	}
	
	@GET
	@Path("/spu/{id}")
	public View studentphoneGetupdate(@PathParam("id") String iid)
	{
			int id =Integer.parseInt(iid);
			Student s1=service.getStudentPhone(id);
			return new View("/spupdate.jsp",s1,"data");
	}
	
	@POST
	@Path("/spup")
	public View psupdate(@FormParam("sid") String sid,@FormParam("spname") String spname,@FormParam("p1") String p1 ,@FormParam("p2") String p2,@FormParam("p3") String p3,@FormParam("i1") String i1 ,@FormParam("i2") String i2,@FormParam("i3") String i3)
	{
		PhoneNo n1;
		PhoneNo n2;
		PhoneNo n3;
		int i =Integer.parseInt(sid);
		int id1 =Integer.parseInt(i1);
		int id2 =Integer.parseInt(i2);
		int id3 =Integer.parseInt(i3);
		n1=service.GetPhone(id1);
		n2=service.GetPhone(id2);
		n3=service.GetPhone(id3);
		n1.setNumber(p1);
		n2.setNumber(p2);
		n3.setNumber(p3);
		service.updatePhone(n1, id1);
		service.updatePhone(n2, id2);
		service.updatePhone(n3, id3);
		List< PhoneNo> n=new ArrayList<PhoneNo>();
		n.add(n1);
		n.add(n2);
		n.add(n3);
		Student s=service.getStudentPhone(i);
		s.setName(spname);
		//s.setPhoneList(n);
		//System.out.println(sid+"-n1"+i1+"-n2"+i2+"-n3"+i3);
		service.UpdateStudentPhone(s, i);
		System.out.println("data inserted");
		return psDisplay();
	}
	
	@GET
	@Path("/spd/{id}")
	public View studentphonedelete(@PathParam("id") String iid)
	{
		int id =Integer.parseInt(iid);
		service.deleteStudentPhone(id);
		return psDisplay();
	}

}
