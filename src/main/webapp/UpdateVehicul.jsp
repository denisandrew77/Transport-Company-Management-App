<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Vehicul</title>
</head>
<body>
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