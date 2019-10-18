<html>
<body>
<!-- <h2>Hello World!</h2> -->
<h2>${msg}</h2>
<h2><%=request.getAttribute("msg") %></h2>		<!--  req. object is getting created by spring-->
<%=session.getAttribute("emp") %>
</body>
</html>
