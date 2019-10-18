<%@page import="com.ust.ustty.springmvc.dto.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<% Employee employee=(Employee)session.getAttribute("emp"); %>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
<span style="float:right;"><a href="./home">Home</a></span>
<span><a href="./logout">Logout</a></span>
</div>
<form action="./update" method="post">
		<table>
			<tr>
			<td>ID:</td>
			<td><input type="number" name="id" value="<%=employee.getId()%>"/>
			</td>
			</tr>
			<tr>
				<td >NAME:</td>
				<td><input type="text" name="name" required="required" value="<%=employee.getName()%>"/></td>
			</tr>
			<tr>
				<td>DOB:</td>
				<td><input type="date" name="dob" /></td>
			</tr>
		
			<tr>
				<td>PASSWORD:</td>
				<td><input type="password" name="password" required="required"  value="<%=employee.getPassword()%>"/></td>
			</tr>
			<tr>
				<td><button type="submit">Update</button></td>
			</tr>
		</table>
	</form>
</body>
</html>