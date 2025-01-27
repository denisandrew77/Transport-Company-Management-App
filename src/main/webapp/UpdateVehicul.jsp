<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Vehicul</title>
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
				action="${pageContext.request.contextPath}/vehicul/update" modelAttribute="vehicul">
		
		<form:input path="plate" class="form-control"/>
		
		<form:input path="phoneNumber1" class="form-control"/>
		
		<form:input path="name" class="form-control"/>
		
		<form:input path="length" class="form-control"/>
		
		<form:input path="width" class="form-control"/>
		
		<form:input path="height" class="form-control"/>
		
		<form:input path="type" class="form-control"/>
		
		<form:input path="phoneNumber2" class="form-control"/>
		
		<button type="submit">Submit</button>
	</form:form>
</body>
</html>