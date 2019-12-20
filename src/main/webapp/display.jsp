<%@page import="java.util.ArrayList"%>
<%@page import="org.apache.http.HttpRequest"%>
<%@page import="javax.ws.rs.core.Request"%>
<%@page import="com.main.rest.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert Student detail</title>
</head>
<body>
	<%
	List<Student> s=(ArrayList<Student>)request.getAttribute("data");
	
	%>
		<table align="center">
		  <th>id</th>
		  <th>name</th>
		  <th>Action</th>
		  <th>Action</th>
			
			<%for(Student p :s){%>
			<tr>
				<td><%=p.getId()%> </td>
				<td><%=p.getName()%> </td>
				<td><a href='http://localhost:8080/sampleRESTEasy/hello/up/<%=p.getId()%>'>Update</a></td>
				<td><a href='http://localhost:8080/sampleRESTEasy/hello/de/<%=p.getId()%>'>Delete</a></td>				
			</tr>
			
			<% }%>
        </table>
	<h1 align="center"><a href='http://localhost:8080/sampleRESTEasy/insert.jsp'>Insert</a></h1>
</body>
</html>