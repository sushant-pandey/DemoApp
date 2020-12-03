<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:set var = "str" value="Sushant is learning JSP Servlets"/>
	String is : ${str}<br>
	
	Length of String : ${fn:length(str)}<br>
	Count of words : ${fn:length(fn:split(str, ' '))}<br>
	Index of servlets : ${fn:indexOf(str, 'Servlets') }<br>
</body>
</html>