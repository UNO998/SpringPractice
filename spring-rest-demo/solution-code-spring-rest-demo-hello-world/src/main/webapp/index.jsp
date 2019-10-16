<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome Page</title>
</head>
<body>

<h3>Spring REST Demo</h3>

<a href="${pageContext.request.contextPath}/test/hello">Hello world</a>
<br><br>
<a href="${pageContext.request.contextPath}/api/students">Student List</a>

</body>
</html>