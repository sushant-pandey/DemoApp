<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Package Import here</h1>
<h1><%@page import="java.util.Date" %></h1>
<%@page import="java.util.Date" %>

<h1>Declaration tag here</h1>
<h1><%! int i = 4; %></h1>

<h1>Scriptlet tag here</h1>

<% out.println("This is part of servlet");
out.println("printing i " + i); 
Date d = new Date();
out.println("Today is " + d.getDay());
%>
<h1>Expression tag here</h1>
Declared instance var is : <%= i  %>
</body>
</html>