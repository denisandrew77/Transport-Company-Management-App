<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Vehicule</title>
</head>
<body>
	<table>
	
	<c:forEach var="vehicul" items="${vehicule}">
	<tr>
	<td><c:out value="${vehicul.plate}"></c:out></td>
	<td><c:out value="${vehicul.phoneNumber1}"></c:out></td>
	<td><c:out value="${vehicul.name}"></c:out></td>
	<td><c:out value="${vehicul.length}"></c:out></td>
	<td><c:out value="${vehicul.width}"></c:out></td>
	<td><c:out value="${vehicul.height}"></c:out></td>
	<td><c:out value="${vehicul.type}"></c:out></td>
	<td><c:out value="${vehicul.phoneNumber2}"></c:out></td>
	<td>
			<a href="<c:url value='/vehicul?plate=${vehicul.plate}'/>">
				Details
			</a>
		</td>
		<td>
			<a href="<c:url value='/vehicul/update?plate=${vehicul.plate}'/>">
				Edit
			</a>
		</td>
		<td>
			<a href="<c:url value='/vehicul/delete?plate=${vehicul.plate}'/>">
				Delete
			</a>
		</td>
	</tr>
	</c:forEach>
	<a href="<c:url value='/vehicule/create'/>">Add vehicle</a>
	
	</table>
</body>
</html>