<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Vehicul</title>
</head>
<body>
	<c:out value="${vehicul.plate}"></c:out>
	<br>
	<c:out value="${vehicul.phoneNumber1}"></c:out>
	<br>
	<c:out value="${vehicul.name}"></c:out>
	<br>
	<c:out value="${vehicul.length}"></c:out>
	<br>
	<c:out value="${vehicul.width}"></c:out>
	<br>
	<c:out value="${vehicul.height}"></c:out>
	<br>
	<c:out value="${vehicul.type}"></c:out>
	<br>
	<c:out value="${vehicul.phoneNumber2}"></c:out>
	<br>
</body>
</html>