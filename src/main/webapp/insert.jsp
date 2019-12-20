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
	<form method="post" action="http://localhost:8080/sampleRESTEasy/hello/insert">
	     <table border=1>
			<tr>
				<td>Enter Your name:</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td><input type="submit" name="submit"></td>
			</tr>
	     </table>
	</form>
</body>
</html>