<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Companies</title>
</head>
<body>
<h2>Companies List</h2><br><hr>
<c:forEach items="${coList}" var="tempCo">
	${tempCo.co_name}
</c:forEach>
</body>
</html>