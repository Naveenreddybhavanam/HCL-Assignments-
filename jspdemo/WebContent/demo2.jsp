<%@page import="com.model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String val=request.getParameter("uid");
int intVal=Integer.parseInt(val);
String password=request.getParameter("pwd");
out.print("User id : "+intVal + " "+ password);
User user=new User();
user.setUserid(intVal);
user.setPassword(password);
session.setAttribute("key1", user);
%>
<br>
<a href="demo3.jsp">link</a>
</body>
</html>