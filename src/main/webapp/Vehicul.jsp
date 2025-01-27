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
	<table class="table">
	<tr>
		<th>Details</th>
		<th>Description</th>
	</tr>
	<tr>
		<td>Plate</td>
		<td><c:out value="${vehicul.plate}"></c:out></td>
	</tr>
	<tr>
		<td>Phone number 1</td>
		<td><c:out value="${vehicul.phoneNumber1}"></c:out></td>
	</tr>
	<tr>
		<td>Driver's name</td>
		<td><c:out value="${vehicul.name}"></c:out></td>
	</tr>
	<tr>
		<td>Length</td>
		<td><c:out value="${vehicul.length}"></c:out></td>
	</tr>
	<tr>
		<td>Width</td>
		<td><c:out value="${vehicul.height}"></c:out></td>
	</tr>
	<tr>
		<td>Type</td>
		<td><c:out value="${vehicul.type}"></c:out></td>
	</tr>
	<tr>
		<td>Phone number 2</td>
		<td><c:out value="${vehicul.phoneNumber2}"></c:out></td>
	</tr>
	</table>
	<a href='<c:url value="/vehicule"/>'>Exit</a>
</body>
</html>