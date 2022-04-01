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
	<h1>CREATE CUSTOMER</h1>
	<c:url value="/add-customer" var="url"></c:url>
	<form:form modelAttribute="customer" method="post" action="${url}">
		<p>LastName:</p>
		<form:input path="lastname" />
		<p>Firstname:</p>
		<form:input path="firstname" />
		<p>Gender:</p>
		<form:select path="gender">
			<form:option value="Nam">Nam</form:option>
			<form:option value="Nữ">Nữ</form:option>			
		</form:select>
		<p>Email:</p>
		<form:input path="email" />
		<p>Phone:</p>
		<form:input path="phone" />
		<p>Birthday:</p>
		<form:input path="birthday" />
		<p>Address:</p>
		<form:input path="address" />
		<input type="submit" value="SUBMIT">
	</form:form>
</body>
</html>