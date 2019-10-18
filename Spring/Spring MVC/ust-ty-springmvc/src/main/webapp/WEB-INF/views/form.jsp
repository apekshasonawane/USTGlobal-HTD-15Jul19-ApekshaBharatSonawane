<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>form</title>
</head>
<body>
	<form action="./form" method="post">
		<table>
			<tr>
			<td>ID:</td>
			<td><input type="number" name="id"/>
			</td>
			</tr>
			<tr>
			<td>NAME:</td>
			<td><input type="text" name="name"/>
			</td>
			</tr>
			<tr>
			<td>DOB:</td>
			<td><input type="date" name="dob"/>
			</td>
			</tr>
			<tr>
			<td>EMAIL:</td>
			<td><input type="email" name="email"/>
			</td>
			</tr>
			<tr>
			<td>PASSWORD:</td>
			<td><input type="password" name="password"/>
			</td>
			</tr>
			<tr>
			<td><button type="submit" >Submit</button>
			</td>
			</tr>
		</table>
	</form>
</body>
</html>