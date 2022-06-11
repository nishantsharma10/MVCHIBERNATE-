<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Home Page</title>
</head>
<body>
		<h2>Welcome to Admin Home Page</h2>
		How are you ${userInSession}
		
		<Br /> Hello ${user.name}
		<a href="logout">logout</a>
</body>
</html>