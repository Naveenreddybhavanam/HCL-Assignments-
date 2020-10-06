<%@page import="com.model.User"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Welcome to JSP</h3>
<%
User user=new User();
user.setUserid(100);
user.setPassword("hai");
user.setUserName("Nani");
%>
<%= user.getUserid() %>>

<%! int a=10; %>

<%! int add(int val1,int val2)
{
	return val1+val2;
}

%>
<%
java.util.Date var=new java.util.Date();
//display
out.print("Todays date : "+var);
//System.out.println("Console");
%>
<br>
<%
out.print("Int a value : "+a);
out.print("<br>Addition of two numbers is : "+add(2,3));
%>
</body>
</html>