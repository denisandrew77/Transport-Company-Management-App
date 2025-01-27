<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
	<form:form method="post" 
				action="${pageContext.request.contextPath}/companie/save" modelAttribute="companie">
		
		<label>Companie</label>
		<form:input path="companyName" class="form-control"/>
		<br>
		<label>Location</label>
		<form:input path="location" class="form-control"/>
		<br>
		<label>Contact</label>
		<form:input path="contact" class="form-control"/>
		<br>
		<label>Number of employees</label>
		<form:input path="numberOfEmployees" class="form-control"/>
		<br>
		<button type="submit">Submit</button>
	</form:form>
</body>
</html>