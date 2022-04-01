<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>INFORMATION USER</p>
	<p>Name: ${user.name}</p>
	<p>Password: ${user.password }
	<p>Favorites: </p>
	<c:forEach items="${user.favorites }" var="favorites">
		<p>${favorites}</p>
	</c:forEach>
	<p>Gender: ${user.gender }</p>
	<p>About: ${user.about }</p>
	<p>AcceptAgreement: ${user.acceptAgreement }</p>
	<p>Avatar: ${user.avatar.getOriginalFilename() }</p>
</body>
</html>