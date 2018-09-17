<%@ page language="java" contentType="text/html; charset=windows-1256"
	pageEncoding="windows-1256"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Companies</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css" />
</head>
<body>
	<h2>Companies List</h2>
	<br>
	<hr>

	<div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Relationship Manager</h2>
		</div>
	</div>

	<div id="container">

		<div id="content">

			<!-- put new button: Add Customer -->

			<!-- 			<input type="button" value="Add Customer"
				   onclick="window.location.href='showFormForAdd'; return false;"
				   class="add-button"
			/> -->

			<!--  add our html table here -->

			<table>
				<tr>
					<th>Company Name</th>
					<th>Address</th>
					<th>phone no</th>
					<!-- 					<th>Action</th>
 -->
				</tr>

				<!-- loop over and print our customers -->
				<c:forEach var="tempCo" items="${coList}">

					<tr>
						<td>${tempCo.co_name}</td>
						<td>${tempCo.co_address}</td>
						<td>${tempCo.co_phone}</td>

					</tr>

				</c:forEach>

			</table>

		</div>

	</div>

</body>
</html>