<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add User Page</title>
</head>
<body>
	<table>
		<form:form modelAttribute="user" action="addUser">

			<tr>
				<td>Name : <form:input path="name" /> <form:errors path="name"></form:errors></td>
			</tr>
			<tr>
				<td>Email : <form:input path="email" /> <form:errors
						path="email"></form:errors></td>
			</tr>
			<tr>
				<td>Password : <form:input path="password" type="password"/> <form:errors
						path="password"></form:errors></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit"></td>
			</tr>
		</form:form>
		<tr>
			<td>
				<c:url var="logoutUrl" value="/logout" />
				<form action="${logoutUrl}" method="post">
					<input type="submit" value="Logout" />
					<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
				</form>
			</td>	
		</tr>
	</table>
</body>
</html>