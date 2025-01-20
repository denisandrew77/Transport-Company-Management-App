<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cursa</title>
</head>
<body>
	<c:out value="${cursa.orderNumber}"></c:out>
	<br>
	<c:out value="${cursa.plate}"></c:out>
	<br>
	<c:out value="${cursa.carrier}"></c:out>
	<br>
	<c:out value="${cursa.clientNumber}"></c:out>
	<br>
	<c:out value="${cursa.client}"></c:out>
	<br>
	<c:out value="${cursa.loading}"></c:out>
	<br>
	<c:out value="${cursa.delivery}"></c:out>
	<br>
	<c:out value="${cursa.status}"></c:out>
	<br>
	<c:out value="${cursa.info}"></c:out>
	<br>
	<c:out value="${cursa.vehicleType}"></c:out>
	<br>
	<c:out value="${cursa.loadingContact}"></c:out>
	<br>
	<c:out value="${cursa.loadingDate}"></c:out>
	<br>
	<c:out value="${cursa.loadingTime}"></c:out>
	<br>
	<c:out value="${cursa.loadingRefference}"></c:out>
	<br>
	<c:out value="${cursa.goodsType}"></c:out>
	<br>
	<c:out value="${cursa.goodsNumber}"></c:out>
	<br>
	<c:out value="${cursa.goodsLength}"></c:out>
	<br>
	<c:out value="${cursa.goodsWidth}"></c:out>
	<br>
	<c:out value="${cursa.goodsHeight}"></c:out>
	<br>
	<c:out value="${cursa.loadingAtCompnay}"></c:out>
	<br>
	<c:out value="${cursa.loadingPostalcode}"></c:out>
	<br>
	<c:out value="${cursa.loadingCity}"></c:out>
	<br>
	<c:out value="${cursa.loadingCountry}"></c:out>
	<br>
	<c:out value="${cursa.deliveryAtCompany}"></c:out>
	<br>
	<c:out value="${cursa.deliveryPostalcode}"></c:out>
	<br>
	<c:out value="${cursa.deliveryCity}"></c:out>
	<br>
	<c:out value="${cursa.deliveryCountry}"></c:out>
	<br>
	<c:out value="${cursa.deliveryContact}"></c:out>
	<br>
	<c:out value="${cursa.goodsWeight}"></c:out>
	<br>
	<c:out value="${cursa.deliveryDate}"></c:out>
	<br>
	<c:out value="${cursa.deliveryTime}"></c:out>
	<br>
	<c:out value="${cursa.deliveryRefference}"></c:out>
	<br>
	<a href='<c:url value="/curse"/>'>Exit</a>
</body>
</html>