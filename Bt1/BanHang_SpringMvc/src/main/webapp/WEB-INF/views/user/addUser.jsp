<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form"  uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>CREATE CUSTOMER</h1>
	<c:url value="/add-user" var="url"></c:url>
	<form:form modelAttribute="user" method="post" action="${url}">
		<p>LastName:</p>
		<form:input path="lastname" />
		<form:errors path="lastname"></form:errors>
		<p>Firstname:</p>
		<form:input path="firstname" />
		<form:errors path="firstname"></form:errors>
		<p>Gender:</p>
		<form:select path="gender">
			<form:option value="Nam">Nam</form:option>
			<form:option value="Nữ">Nữ</form:option>			
		</form:select>
		<p>Email:</p>
		<form:input path="email" />
		<form:errors path="email"></form:errors>
		<p>Phone:</p>
		<form:input path="phone" />
		<form:errors path="phone"></form:errors>
		<p>Birthday:</p>
		<form:input path="birthday" />
		<form:errors path="birthday"></form:errors>
		<p>Address:</p>
		<form:input path="address" />
		<form:errors path="address"></form:errors>
		<input type="submit" value="SUBMIT">
	</form:form>
</body>
</html>