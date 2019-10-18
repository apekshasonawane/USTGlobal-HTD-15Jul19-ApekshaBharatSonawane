<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="./login" method="post" >
		<table>
			<tr>
				<td>EMAIL:</td>
				<td><input type="email" name="email" required="required"/></td>
			</tr>
			<tr>
				<td>PASSWORD:</td>
				<td><input type="password" name="password" required="required"/></td>
			</tr>
			<tr>
				<td><button type="submit">Sign In</button></td>
			</tr>
		</table>
	</form>
<a href="./register">Sign Up</a>
<h3>${msg}</h3>
</body>
</html>