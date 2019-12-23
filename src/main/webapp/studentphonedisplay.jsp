<%@page import="com.main.rest.PhoneNo"%>
<%@page import="java.util.List"%>
<%@page import="com.main.rest.Student"%>
<%@page import="java.util.ArrayList"%>
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
   	   List<Student> list=(ArrayList<Student>) request.getAttribute("data");
   		
   %>
   
   <table align="center" border=1>
   <%
       for(Student s:list)
       {
    	   List<PhoneNo> listphone=s.getPhoneList();
    	   %>
    	   <tr>
    	   			<td><%=s.getId() %></td>
    	   			<td><%=s.getName() %></td>
    	   			<%
    	   			for(PhoneNo n:listphone)
    	   			{
    	   			%>
    	   			 <td><%=n.getNumber() %></td>    	   			
    	   			<%} %>
    	   			<td><a href="http://localhost:8080/sampleRESTEasy/hello/spu/<%=s.getId()%>">Update</a></td>	 
    	   			<td><a href="http://localhost:8080/sampleRESTEasy/hello/spd/<%=s.getId()%>">Delete</a></td>  			
    	   			
    	   </tr>
    	   		
    	   <%
    	   				
       }
   %>
   <h3 align="center"><a href="http://localhost:8080/sampleRESTEasy/studentPhoneInsert.jsp">Insert</a></h3>
   </table>
</body>
</html>