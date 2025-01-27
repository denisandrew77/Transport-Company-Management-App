<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Vehicul</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/AppDesign.css">

</head>
<body>
<header class="upperSection"> 
	Order Management
		<a href="<c:url value='/curse'/>" class="upperSection">Orders</a>
		<a href="<c:url value='/companii'/>" class="upperSection">Companies</a>
		<a href="<c:url value='/vehicule'/>" class="upperSection">Vehicles</a>
	</header>
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