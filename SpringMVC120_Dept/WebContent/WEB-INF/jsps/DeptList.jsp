<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DeptList</title>
</head>
<body>
 
<table>
<tr>
<th>Department number</th>
<th>Department Name</th>
<th>Location</th>
</tr>
	<c:forEach items= "${deptList}" var="dept">
	<tr>
	<td><!-- employee name -->${dept.deptId}</td>
	<td>${dept.deptNm}</td>
	<td>${dept.deptLoc}</td>
	</tr>
	</c:forEach>
	

</table>
</form>
</body>
</html>