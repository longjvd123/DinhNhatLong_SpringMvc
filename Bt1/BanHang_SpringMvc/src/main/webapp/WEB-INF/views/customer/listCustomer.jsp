<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form"  uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List Customer</title>
</head>
<body>
	<h1>LIST CUSTOMER</h1>
	<c:url value="/add-customer" var="addCustomer"></c:url>
	<a href="${addCustomer }">Create Customer</a>
	<table border="1">
		<tr>
			<th>ID</th>
			<th>LASTNAME</th>
			<th>FIRSTNAME</th>
			<th>GENDER</th>
			<th>EMAIL</th>
			<th>PHONE</th>
			<th>BIRTHDAY</th>
			<th>ADDRESS</th>
			<th>ACTION</th>
		</tr>
		<c:forEach items="${customers}" var="customers" >
			<tr>
				<td>${customers.id}</td>
				<td>${customers.lastname}</td>
				<td>${customers.firstname}</td>
				<td>${customers.gender}</td>
				<td>${customers.email}</td>
				<td>${customers.phone}</td>
				<td>${customers.birthday}</td>
				<td>${customers.address}</td>
				<c:url value="/detail-customer/${customers.id }" var="updateCustomer"></c:url>
				<c:url value="/delete-customer/${customers.id }" var="deleteCustomer"></c:url>
				<td>
					<a href="${updateCustomer }">detail</a> | 
					<a href="${deleteCustomer }">delete</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>