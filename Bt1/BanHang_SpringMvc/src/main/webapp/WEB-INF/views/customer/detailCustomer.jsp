<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form"  uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>INFORMATION CUSTOMER</h1>
	<p>Lastname:${customer.lastname }</p>
	<p>firstname:${customer.firstname }</p>
	<p>Gender:${customer.gender }</p>
	<p>Email:${customer.email }</p>
	<p>Phone:${customer.phone }</p>
	<p>Birthday:${customer.birthday }</p>
	<p>Address:${customer.address }</p>
	<a href="<c:url value='/list-customer' ></c:url>">list Customer</a>
	<c:url value="/update-customer/${customer.id }" var="url" ></c:url>
	<a href="${url}">Update Customer</a>
</body>
</html>