<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Curse</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/AppDesign.css">
</head>
<body>
	<header class="upperSection"> 
	Order Management
		<a href="<c:url value='/curse'/>" class="upperSection">Orders</a>
		<a href="<c:url value='/companii'/>" class="upperSection">Companies</a>
		<a href="<c:url value='/vehicule'/>" class="upperSection">Vehicles</a>
	</header>
	<table	class="table">
	<tr>
		<th>Order Nr</th>
		<th>Plate</th>
		<th>Carrier</th>
		<th>Client Number</th>
		<th>Client</th>
		<th>Loading</th>
		<th>Delivery</th>
		<th>Status</th>
		<th>Info</th>
		<th>T</th>
	</tr>
	<c:forEach var="cursa" items="${curse}">
		<tr>
		<td><c:out value="${cursa.orderNumber}"></c:out></td>
		<td>
			<a href="<c:url value="/vehicul?plate=${cursa.plate}"/>">
			<c:out value="${cursa.plate}"></c:out>
			</a>
		</td>
		<td><c:out value="${cursa.carrier}"></c:out></td>
		<td><c:out value="${cursa.clientNumber}"></c:out></td>
		<td><c:out value="${cursa.client}"></c:out></td>
		<td><c:out value="${cursa.loading}"></c:out></td>
		<td><c:out value="${cursa.delivery}"></c:out></td>
		<td><c:out value="${cursa.status}"></c:out></td>
		<td><c:out value="${cursa.info}"></c:out></td>
		<td><c:out value="${cursa.vehicleType}"></c:out></td>
		<td>
			<a href="<c:url value='/cursa?orderNumber=${cursa.orderNumber}'/>">
				Details
			</a>
		</td>
		<td>
			<a href="<c:url value='/curse/edit?orderNumber=${cursa.orderNumber}'/>">
				Edit
			</a>
		</td>
		<td>
			<a href="<c:url value='/curse/deleteCursa?orderNumber=${cursa.orderNumber}'/>">
				Delete
			</a>
		</td>
		</tr>
	</c:forEach>
	</table>
	<a href="<c:url value='/curse/create'/>">Adauga Cursa</a>	
</body>
</html>