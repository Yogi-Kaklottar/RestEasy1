<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Phone insert</h1>
		<form method="post" action="http://localhost:8080/sampleRESTEasy/hello/pinsert">
	     <table border=1 align="center">
			<tr>
				<td>Enter Your name:</td>
				<td><input type="text" name="pname"></td>
			</tr>
			<tr>
				<td><input type="submit" name="submit"></td>
			</tr>
	     </table>
	</form>
</body>
</html>