<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Me Form</title>
</head>
<body>
<form:form method="post" modelAttribute="user">
<table>
	<tr>
		<th colspan="2" align="center">
		<h3>Registration Form</h3>
		</th>
		</tr>
		
		<tr>
		<td>User Name</td>
		<td><form:input type="text" path="name" /></td>
		<td><form:errors path="name" cssClass="errorMsg" /></td>
		</tr>
		<tr>
			<td>Password</td>
			<td><form:password path="password" /></td>
			<td><form:errors path="password" cssClass="errorMsg" /></td>
			</tr>
			<tr>
				<td>City</td>
				<td><form:input type="text" path="city" /></td>
				<td><form:errors path="password" cssClass="errorMsg" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><Input type="submit" value="verify" /></td>
					</tr>
					
</table>
</form:form>
</body>
</html>