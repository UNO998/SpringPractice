<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> Welcome to the luv2code company home page! </title>
</head>
<body>
Welcome to the luv2code company home page!

<!-- Logout button -->

<form:form action="${pageContext.request.contextPath}/logout" method="POST">

	<input type="submit" value="Logout" />
	
</form:form>
</body>
</html>