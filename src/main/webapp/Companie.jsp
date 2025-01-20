<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:out value="${companie.companyName}"></c:out>
	<br>
	<c:out value="${companie.location}"></c:out>
	<br>
	<c:out value="${companie.contact}"></c:out>
	<br>
	<c:out value="${companie.numberOfEmployees}"></c:out>
	<br>
	<br>
	<a href='<c:url value="/companii"/>'>Exit</a>
</body>
</html>