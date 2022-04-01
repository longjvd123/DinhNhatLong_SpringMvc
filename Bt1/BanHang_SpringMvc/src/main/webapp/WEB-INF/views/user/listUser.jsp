<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>LIST USER</h1>
	<table border="1">
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>PHONENUMBER</th>
			<th>ACTION</th>
		</tr>
		<c:forEach items="${users}" var="users">		
			<tr>
				<td>${users.id }</td>
				<td>${users.name }</td>
				<td>${users.phoneNumber }</td>
				<c:url value="/informationUser?${users.id }" var="urlDetail"></c:url>
				<c:url value="/deleteUser?${users.id }" var="urlDelete"></c:url>
				<td><a href="${urlDetail}">Detail</a> | <a href="${urlDelete}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>