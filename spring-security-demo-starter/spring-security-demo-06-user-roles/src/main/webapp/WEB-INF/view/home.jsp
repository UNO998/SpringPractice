<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> Welcome to the luv2code company home page! </title>
</head>
<body>
Welcome to the luv2code company home page!

<hr>

<!-- display user name and role -->

	<p>

	User: <security:authentication property="principal.username" />
	<br><br>
	Role(s): <security:authentication property="principal.authorities" />

	</p>
	
	<hr>
	<!-- Add a link to point to /leaders ... this is for the managers -->
	<p>
		<a href="${pageContext.request.contextPath}/leaders">LeaderShip Meeting</a>
		(Only for Manager peeps)
	</p>

	

	<!-- Add a link to point to /systems ... this is for the admin -->
	<p>
		<a href="${pageContext.request.contextPath}/systems">IT Meeting</a>
		(Only for Admin peeps)
	</p>
	<hr>
<hr>

<!-- Logout button -->

<form:form action="${pageContext.request.contextPath}/logout" method="POST">

	<input type="submit" value="Logout" />
	
</form:form>
</body>
</html>