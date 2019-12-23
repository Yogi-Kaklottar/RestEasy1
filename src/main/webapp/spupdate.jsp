<%@page import="java.util.ArrayList"%>
<%@page import="com.main.rest.PhoneNo"%>
<%@page import="java.util.List"%>
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
			<%
			
				Student s=(Student)request.getAttribute("data");
			
					List<PhoneNo> l=s.getPhoneList();
					
			%>
			
			<form method="post" action="http://localhost:8080/sampleRESTEasy/hello/spup">
	     <table border=1>
			<tr>
				<td>Enter Your name:</td>
				<td><input type="text" name="spname" value="<%= s.getName()%>"></td>
				<td><input type="hidden" name="sid" value="<%= s.getId()%>"></td>
			</tr>
			<%
			int n=0;
			for(PhoneNo k:l) {
				n++;
			%>
			
			<tr>	
				<td>update Phone Number1:</td>
				<td><input type="text" name="<%="p"+n %>" value="<%=k.getNumber()%>"></td>
				<td><input type="hidden" name="<%="i"+n %>" value="<%=k.getId()%>"></td>
			</tr>
			<% } %>	
			<tr>
				<td><input type="submit" name="submit"></td>
			</tr>
	     </table>
	</form>
			
</body>
</html>