<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Login Page</title>
</head>
<body onload='document.f.username.focus();'>
	<hr />
	Custom Form
	<hr />

	<h3>Login with Username and Password</h3>
	<form name='f' action='${loginUrl}' method='POST'>
		<table>

			<c:if test="${param.error != null}">
				<span style="color: red">Invalid Credentials</span>
			</c:if>

			<tr>
				<td>User:</td>
				<td><input type='text' name='username' value=''></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type='password' name='password' /></td>
			</tr>
			<tr>
				<td>Remember me:</td>
				<td><input name="remember-me" id="remember-me" type="checkbox"
					checked="checked" /></td>
			</tr>
			<tr>
				<td colspan='2'><input name="submit" type="submit"
					value="Login" /></td>
			</tr>
			<input name="${_csrf.parameterName}" type="hidden"
				value="${_csrf.token}" />
		</table>
	</form>
</body>
</html>