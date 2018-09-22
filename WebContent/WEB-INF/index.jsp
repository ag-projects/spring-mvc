<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Index Home Page</title>
</head>
<body>
	<h2>Home Page: List of users in the project</h2>
	<br />
	
	<a href="${pageContext.request.contextPath}/addUser">Add user</a>
	
	<p/>
	
	<table border="1" align="left">
		<tr>
			<th>User Id</th>
			<th>User Name</th>
			<th>User Email</th>
		</tr>
		
		<c:forEach items="${users}" var="user">
			<tr>
				<td>${user.userId}</td>
				<td>${user.name}</td>
				<td>${user.email}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>