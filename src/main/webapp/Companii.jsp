<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Companii</title>
</head>
<body>
	<table>
	
	<c:forEach var="companie" items="${companii}">
	<tr>
	<td><c:out value="${companie.companyName}"></c:out></td>
	<td><c:out value="${companie.location}"></c:out></td>
	<td><c:out value="${companie.contact}"></c:out></td>
	<td><c:out value="${companie.numberOfEmployees}"></c:out></td>
	<td>
			<a href="<c:url value='/companie?companyName=${companie.companyName}'/>">
				Details
			</a>
		</td>
		<td>
			<a href="<c:url value='/companie/update?companyName=${companie.companyName}'/>">
				Edit
			</a>
		</td>
		<td>
			<a href="<c:url value='/companie/delete?companyName=${companie.companyName}'/>">
				Delete
			</a>
		</td>
	</tr>
	</c:forEach>
	<a href="<c:url value='/companie/create'/>">Add company</a>
	
	</table>
</body>
</html>