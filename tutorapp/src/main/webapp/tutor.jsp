<%@page import="java.sql.*"%>
<%@page import="com.tutorapp.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Tutor</title>
</head>
<body>
<h1>You're a tutor</h1>
<%!
	
%>
<%
	for(Tutor t:LoginBusinessLogic.tutorList)
	{
		out.println(t.getUserName()+"\t"
					+t.getFirstName()+"\t"
					+t.getLastName()+"\t"
					+t.getGender()+"\t"
					+t.getEmail()+"\n");
		
	}
%>
</body>
</html>