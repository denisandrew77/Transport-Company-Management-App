<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cursa</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/AppDesign.css">

</head>
<body>
	<header class="upperSection"> 
	Order Management
		<a href="<c:url value='/curse'/>" class="upperSection">Orders</a>
		<a href="<c:url value='/companii'/>" class="upperSection">Companies</a>
		<a href="<c:url value='/vehicule'/>" class="upperSection">Vehicles</a>
	</header>
	<div>
	<div>
	<label class="orderLabels">Order number:</label>
	<c:out value="${cursa.orderNumber}"></c:out>
	<br>
	<label class="orderLabels">Vehicle plate number:</label>
	<c:out value="${cursa.plate}"></c:out>
	<label class="orderLabels">, type:</label>
	<c:out value="${cursa.vehicleType}"></c:out>
	<br>
	<label class="orderLabels">Carrier:</label>
	<c:out value="${cursa.carrier}"></c:out>
	<br>
	<label class="orderLabels">Client: </label>
	<c:out value="${cursa.client}"></c:out>
	<label class="orderLabels">, number:</label>
	<c:out value="${cursa.clientNumber}"></c:out>
	<br>
	<label class="orderLabels">Status: </label>
	<c:out value="${cursa.status}"></c:out>
	<br>
	<label class="orderLabels">Mentions: </label>
	<c:out value="${cursa.info}"></c:out>
	<br>
	<label class="orderLabels">Goods: </label>
	<c:out value="${cursa.goodsNumber}"></c:out>
	<label>x</label>
	<c:out value="${cursa.goodsType}"></c:out>
	<c:out value="${cursa.goodsLength}"></c:out>
	<label>/</label>
	<c:out value="${cursa.goodsWidth}"></c:out>
	<label>/</label>
	<c:out value="${cursa.goodsHeight}"></c:out>
	<label>,</label>
	<c:out value="${cursa.goodsWeight}"></c:out>
	<label>kg</label>
	</div>
	<div>
	<table class="table">
	<tr>
		<th>Info</th>
		<th>Loading</th>
		<th>Delivery</th>
	</tr>
	<tr>
		<td>Address</td>
		<td><c:out value="${cursa.loading}"></c:out></td>
		<td><c:out value="${cursa.delivery}"></c:out></td>
	</tr>
	<tr>
		<td>Contact</td>
		<td><c:out value="${cursa.loadingContact}"></c:out></td>
		<td><c:out value="${cursa.deliveryContact}"></c:out></td>
	</tr>
	<tr>
		<td>Date</td>
		<td><c:out value="${cursa.loadingDate}"></c:out></td>
		<td><c:out value="${cursa.deliveryDate}"></c:out></td>
	</tr>
	<tr>
		<td>Time</td>
		<td><c:out value="${cursa.loadingTime}"></c:out></td>
		<td><c:out value="${cursa.deliveryTime}"></c:out></td>
	</tr>
	<tr>
		<td>Refference</td>
		<td><c:out value="${cursa.loadingRefference}"></c:out></td>
		<td><c:out value="${cursa.deliveryRefference}"></c:out></td>
	</tr>
	<tr>
		<td>Company</td>
		<td><c:out value="${cursa.loadingAtCompnay}"></c:out></td>
		<td><c:out value="${cursa.deliveryAtCompany}"></c:out></td>
	</tr>
	<tr>
		<td>Postal Code</td>
		<td><c:out value="${cursa.loadingPostalcode}"></c:out></td>
		<td><c:out value="${cursa.deliveryPostalcode}"></c:out></td>
	</tr>
	<tr>
		<td>City</td>
		<td><c:out value="${cursa.loadingCity}"></c:out></td>
		<td><c:out value="${cursa.deliveryCity}"></c:out></td>
	</tr>
	<tr>
		<td>Country</td>
		<td><c:out value="${cursa.loadingCountry}"></c:out></td>
		<td><c:out value="${cursa.deliveryCountry}"></c:out></td>
	</tr>
	</table>
	</div>
	</div>
	<a href='<c:url value="/curse"/>'>Exit</a>
</body>
</html>