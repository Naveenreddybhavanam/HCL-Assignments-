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
Welcome to demo3.jsp
<br>
<%

User obj= (User) session.getAttribute("key1");
if(obj != null)
{
	out.print(obj.getUserid()+"  ");
	out.println(obj.getPassword());
}
else
{
	out.print("No Data");
}
%>
</body>
</html>