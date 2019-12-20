<%@page import="com.main.rest.PhoneNo"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	List<PhoneNo> s=(ArrayList<PhoneNo>)request.getAttribute("data");
	
	%>
		<table align="center">
		  <th>id</th>
		  <th>name</th>
		  <th>Action</th>
		  <th>Action</th>
			
			<%for(PhoneNo p :s){%>
			<tr>
				<td><%=p.getId()%> </td>
				<td><%=p.getNumber()%> </td>
				<td><a href='http://localhost:8080/sampleRESTEasy/hello/pup/<%=p.getId()%>'>Update</a></td>
				<td><a href='http://localhost:8080/sampleRESTEasy/hello/pde/<%=p.getId()%>'>Delete</a></td>				
			</tr>
			
			<% }%>
        </table>
	<h1 align="center"><a href='http://localhost:8080/sampleRESTEasy/phoneInsertJsp.jsp'>Insert</a></h1>
</body>
</html>