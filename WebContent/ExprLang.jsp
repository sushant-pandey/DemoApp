<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Print with the servlet request : 
	
	<%
		String name = request.getAttribute("name").toString();
		out.println(name);
	%>
	<br>
	Print with the expression language : 
	<!-- This is done using expression language -->
	${name}
</body>
</html>