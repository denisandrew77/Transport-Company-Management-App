<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Page</title>
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
				action="${pageContext.request.contextPath}/curse/edit" modelAttribute="cursa">
		
		<form:input path="orderNumber" class="form-control"/>
		<br>
		<form:input path="plate" class="form-control"/>
		<br>
		<form:input path="carrier" class="form-control"/>
		<br>
		<form:input path="clientNumber" class="form-control"/>
		<br>
		<form:input path="client" class="form-control"/>
		<br>
		<form:input path="loading" class="form-control"/>
		<br>
		<form:input path="delivery" class="form-control"/>
		<br>
		<form:input path="status" class="form-control"/>
		<br>
		<form:input path="info" class="form-control"/>
		<br>
		<form:input path="vehicleType" class="form-control"/>
		<br>
		<form:input path="loadingContact" class="form-control"/>
		<br>
		<form:input path="loadingDate" type="date" class="form-control"/>
		<br>
		<form:input path="loadingTime" type="time" class="form-control"/>
		<br>
		<form:input path="loadingRefference" class="form-control"/>
		<br>
		<form:input path="goodsType" class="form-control"/>
		<br>
		<form:input path="goodsNumber" class="form-control"/>
		<br>
		<form:input path="goodsLength" class="form-control"/>
		<br>
		<form:input path="goodsWidth" class="form-control"/>
		<br>
		<form:input path="goodsHeight" class="form-control"/>
		<br>
		<form:input path="loadingAtCompnay" class="form-control"/>
		<br>
		<form:input path="loadingPostalcode" class="form-control"/>
		<br>
		<form:input path="loadingCity" class="form-control"/>
		<br>
		<form:input path="loadingCountry" class="form-control"/>
		<br>
		<form:input path="deliveryAtCompany" class="form-control"/>
		<br>
		<form:input path="deliveryPostalcode" class="form-control"/>
		<br>
		<form:input path="deliveryCity" class="form-control"/>
		<br>
		<form:input path="deliveryCountry" class="form-control"/>
		<br>
		<form:input path="deliveryContact" class="form-control"/>
		<br>
		<form:input path="goodsWeight" class="form-control"/>
		<br>
		<form:input path="deliveryDate" type="date" class="form-control"/>
		<br>
		<form:input path="deliveryTime" type="time" class="form-control"/>
		<br>
		<form:input path="deliveryRefference" class="form-control"/>
		<br>
		<button type="submit">Submit</button>
	</form:form>
</body>
</html>