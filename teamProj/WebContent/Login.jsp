<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student Log In</title>
</head>
<body>

<%
String studId = request.getParameter("StudentId");
String nullId = "";

boolean isInvalid = false;

if(studId == "" || studId == null ){
	nullId = "Please Enter A Valid Student ID";
	isInvalid = true;
}
%>

<h1 align="center">Please Sign In</h1>

<form action="CheckLogin">
	<fieldset align="center">
		<legend>Login In</legend>
		Student ID: <input type="text" name="StudentId" />
	</fieldset>
	
	<center>
		<input type="button" value="Log In" />
	</center> 
</form>

</body>
</html>