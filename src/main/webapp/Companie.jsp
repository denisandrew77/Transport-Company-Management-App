<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
		<td>Company</td>
		<td><c:out value="${companie.location}"></c:out></td>
	</tr>
	<tr>
		<td>Location</td>
		<td><c:out value="${companie.companyName}"></c:out></td>
	</tr>
	<tr>
		<td>Contact</td>
		<td><c:out value="${companie.contact}"></c:out></td>
	</tr>
	<tr>
		<td>Number of Employees</td>
		<td><c:out value="${companie.numberOfEmployees}"></c:out></td>
	</tr>
	</table>
	<br>
	<a href='<c:url value="/companii"/>'>Exit</a>
</body>
</html>