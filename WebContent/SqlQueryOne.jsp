<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<sql:setDataSource var = "db" driver="oracle.jdbc.driver.OracleDriver"
		url="jdbc:oracle:thin:@localhost:1521/ORCLCDB.localdomain"
		user="HB" password="HB"/>
	<sql:query var="rs" dataSource="${db}">SELECT * FROM LAPTOP</sql:query>
	<c:forEach items="${rs.rows}" var = "laptop">
		<c:out value="${laptop.id}"/>:
		<c:out value="${laptop.brand}"/>:
		<c:out value="${laptop.price}"/>
		<br>
	</c:forEach>
</body>
</html>