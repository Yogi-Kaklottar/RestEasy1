<%@page import="com.main.rest.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 align="center" >Update Student</h1>
		<%
			Student s=(Student) request.getAttribute("data");%>
		<form method="post" action="http://localhost:8080/sampleRESTEasy/hello/update">
	     <table border=1 align="center">
	     	<tr>
	     		<td>Enter Your id:</td>
				<td><input type="text" name="id" value="<%=s.getId()%>"></td>
	     	</tr>
			<tr>
				<td>Enter Your name:</td>
				<td><input type="text" name="name" value="<%=s.getName()%>"></td>
			</tr>
			<tr>
				<td><input type="submit" name="submit"></td>
			</tr>
	     </table>
	</form>  
		
		
		
</body>
</html>