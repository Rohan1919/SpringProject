<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Entry page</title>
</head>
<body>
<h1>Larson and Turbo Information Technology Limited</h1>
<div style="color:RED">${msg}</div>
<form action="createDept.do">
<table>
<tr>
<th>Department number:</th>
<td><input type="text" name="deptId"/></td> 
</tr>
<tr>
<th>Department Name:</th>
<td><input type="text" name="deptNm"/></td> 
</tr>
<tr>
<th>Location:</th>
<td><input type="text" name="deptLoc"/></td> 
</tr>

<th colspan="2" align="center"><input type="submit" value="submit data"></th>

</tr>

</table>

</body>
</html>