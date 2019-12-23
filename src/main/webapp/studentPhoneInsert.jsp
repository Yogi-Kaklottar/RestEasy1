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
	

	<form method="post" action="http://localhost:8080/sampleRESTEasy/hello/spinsert">
	     <table border=1>
			<tr>
				<td>Enter Your name:</td>
				<td><input type="text" name="spname"></td>
			</tr>
			<tr>	
				<td>Select Phone Number1:</td>
				<td><input type="text" name="p1"></td>
			</tr>
			<tr>	
				<td>Select Phone Number3:</td>
				<td><input type="text" name="p2"></td>
			</tr>
			<tr>	
				<td>Select Phone Number3:</td>
				<td><input type="text" name="p3"></td>
			</tr>
			<tr>
				<td><input type="submit" name="submit"></td>
			</tr>
	     </table>
	</form>

</body>
</html>