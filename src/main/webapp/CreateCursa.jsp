<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create cursa</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/AppDesign.css">

</head>
<body>
	<header class="upperSection"> 
	Order Management
		<a href="<c:url value='/curse'/>" class="upperSection">Orders</a>
		<a href="<c:url value='/companii'/>" class="upperSection">Companies</a>
		<a href="<c:url value='/vehicule'/>" class="upperSection">Vehicles</a>
	</header>
	<form:form method="post" 
				action="${pageContext.request.contextPath}/curse/saveCursa" modelAttribute="cursa">
		
		<label>Plate</label>
		<form:input path="plate" class="form-control"/>
		<br>
		<label>Carrier</label>
		<form:input path="carrier" class="form-control"/>
		<br>
		<label>Client Number</label>
		<form:input path="clientNumber" class="form-control"/>
		<br>
		<label>Client</label>
		<form:input path="client" class="form-control"/>
		<br>
		<label>Loading</label>
		<form:input path="loading" class="form-control"/>
		<br>
		<label>Delivery</label>
		<form:input path="delivery" class="form-control"/>
		<br>
		<label>status</label>
		<form:input path="status" class="form-control"/>
		<br>
		<label>Info</label>
		<form:input path="info" class="form-control"/>
		<br>
		<label>Vehicle Type</label>
		<form:input path="vehicleType" class="form-control"/>
		<br>
		<label>Loading Contact</label>
		<form:input path="loadingContact" class="form-control"/>
		<br>
		<label>Loading Date</label>
		<form:input path="loadingDate" type="date" class="form-control"/>
		<br>
		<label>Loading Time</label>
		<form:input path="loadingTime" type="time" class="form-control"/>
		<br>
		<label>Loading Refference</label>
		<form:input path="loadingRefference" class="form-control"/>
		<br>
		<label>Type of goods</label>
		<form:input path="goodsType" class="form-control"/>
		<br>
		<label>NUmber of Goods</label>
		<form:input path="goodsNumber" class="form-control"/>
		<br>
		<label>Length</label>
		<form:input path="goodsLength" class="form-control"/>
		<br>
		<label>Width</label>
		<form:input path="goodsWidth" class="form-control"/>
		<br>
		<label>Height</label>
		<form:input path="goodsHeight" class="form-control"/>
		<br>
		<label>Loading At Company</label>
		<form:input path="loadingAtCompnay" class="form-control"/>
		<br>
		<label>Loading Postalcode</label>
		<form:input path="loadingPostalcode" class="form-control"/>
		<br>
		<label>Loading City</label>
		<form:input path="loadingCity" class="form-control"/>
		<br>
		<label>Loading Country</label>
		<form:input path="loadingCountry" class="form-control"/>
		<br>
		<label>Delivery At Company</label>
		<form:input path="deliveryAtCompany" class="form-control"/>
		<br>
		<label>Delivery Postalcode</label>
		<form:input path="deliveryPostalcode" class="form-control"/>
		<br>
		<label>Delivery City</label>
		<form:input path="deliveryCity" class="form-control"/>
		<br>
		<label>Delivery Country</label>
		<form:input path="deliveryCountry" class="form-control"/>
		<br>
		<label>Delivery Contact</label>
		<form:input path="deliveryContact" class="form-control"/>
		<br>
		<label>Weight</label>
		<form:input path="goodsWeight" class="form-control"/>
		<br>
		<label>Delivery Date</label>
		<form:input path="deliveryDate" type="date" class="form-control"/>
		<br>
		<label>Delivery Time</label>
		<form:input path="deliveryTime" type="time" class="form-control"/>
		<br>
		<label>Delivery Refference</label>
		<form:input path="deliveryRefference" class="form-control"/>
		<br>
		<button type="submit">Submit</button>
	</form:form>
</body>
</html>