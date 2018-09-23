
<html>
<head>
<title>Login Page</title>
</head>
<body onload='document.f.username.focus();'>
<hr/>Custom Login Form<hr/>

	<h3>Login with Username and Password</h3>
	<form name='f' action='/spring-mvc/login' method='POST'>
		<table>
			<tr>
				<td>User:</td>
				<td><input type='text' name='username' value=''></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type='password' name='password' /></td>
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