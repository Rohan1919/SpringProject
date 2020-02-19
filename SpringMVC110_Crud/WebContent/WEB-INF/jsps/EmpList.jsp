<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Larson and Turbo Information Technology Limited</h1>
<h3>Main Menu</h3><br>
<table>
	<tr>
	<th>Employee ID</th>
	<th>Employee Names</th>
	<th>Employee Salary</th>
	</tr>
    <!-- repeat this many lines -->
	<c:forEach items= "${empList}" var="emp">
	<tr>
	<td><!-- employee name -->${emp.empno}</td>
	<td>${emp.empNm}</td>
	<td>${emp.empSal}</td>
	</tr>
	</c:forEach>
	<!-- End repeate -->
</table>
</body>
</html>