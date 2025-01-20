<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create cursa</title>
</head>
<body>
	<form:form method="post" 
				action="${pageContext.request.contextPath}/vehicule/save" modelAttribute="vehicul">
		
		<label>Plate</label>
		<form:input path="plate" class="form-control"/>
		<br>
		<label>Phone Number 1</label>
		<form:input path="phoneNumber1" class="form-control"/>
		<br>
		<label>name</label>
		<form:input path="name" class="form-control"/>
		<br>
		<label>length</label>
		<form:input path="length" class="form-control"/>
		<br>
		<label>width</label>
		<form:input path="width" class="form-control"/>
		<br>
		<label>height</label>
		<form:input path="height" class="form-control"/>
		<br>
		<label>type</label>
		<form:input path="type" class="form-control"/>
		<br>
		<label>Phone Number 2</label>
		<form:input path="phoneNumber2" class="form-control"/>
		<br>
		<button type="submit">Submit</button>
	</form:form>
</body>
</html>