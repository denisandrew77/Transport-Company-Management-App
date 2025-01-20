<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form method="post" 
				action="${pageContext.request.contextPath}/companie/update" modelAttribute="companie">
		
		<form:input path="companyName" class="form-control"/>
	
		<form:input path="location" class="form-control"/>
		
		<form:input path="contact" class="form-control"/>
		
		<form:input path="numberOfEmployees" class="form-control"/>
		
		<button type="submit">Submit</button>
	</form:form>
</body>
</html>