<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Larson and Turbo Information Technology Limited</h1>
<div style="color:RED">${errorMsg}</div>
<form action="authenticate.do">
<table>
<tr>
<th>Username:</th>
<td><input type="text" name="userNm"/></td> 
</tr>
<tr>
<th>Password:</th>
<td><input type="password" name="password"/></td> 
</tr>
<th colspan="2" align="center"><input type="submit" value="Login Please"></th>

</tr>

</table>

 </form>
</body>
</html>