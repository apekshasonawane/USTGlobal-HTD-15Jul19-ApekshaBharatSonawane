<%@page import="com.ust.ustty.springmvc.dto.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
    List<Employee> employees=(List)request.getAttribute("list");
    Employee emp=(Employee)session.getAttribute("emp");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>show all records</title>
</head>
<body>
<div align="right">
<span><a href="./update">Update Profile</a></span>
<span><a href="./delete?id=<%=emp.getId()%>">Delete Profile</a></span>		<!-- in url one space will consider %20 -->
<span><a href="./logout">Logout </a></span>
</div>
<div><a href="./home">Home</a>
</div>
<table>
	<tr>
	<td>ID</td>
	<td>Name</td>
	<td>DOB</td>
	<td>Email</td>
	</tr>
	<% for(Employee employee:employees) {%>
	<tr>
	<td><%=employee.getId()%></td>
	<td><%=employee.getName()%></td>
	<td><%=employee.getDob()%></td>
	<td><%=employee.getPassword()%></td>
	</tr>
	<% }%>
</table>
</body>
</html>