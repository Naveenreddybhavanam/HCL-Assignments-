<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">

.error {
color: red;
}
</style>
</head>
<body>
	<form:form action="login" method="post" modelAttribute="key">

 Enter user id : <form:input path="userId" />
		<form:errors path="userId">
		</form:errors>
Enter user name: <form:input path="userName" />
		<form:errors path="userName" cssClass="error">
		</form:errors>
Enter password : <form:password path="password" />
		<form:errors path="password" cssClass="error">
		</form:errors>
		<input type="submit" value="Login">
	</form:form>
</body>
</html>