<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Access Denied</title>
</head>
<body>
	<p>Follow the link below to navigate to home page</p>
	<c:url var="homepage" value="/" />
	<a href="${homepage}">Follow me</a>
</body>
</html>