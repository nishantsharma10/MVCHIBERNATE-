<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login page</title>
</head>
<body>
<div class = "container" >
	<div class="wrapper">
		<form action="loginhtml" method="post" name="Login_Form" class="form-signin">       
		    <h3 class="form-signin-heading">Please Sign In</h3>
			  <hr class="colorgraph"><br>
			  
			  <input type="text" class="form-control" name="username" placeholder="Username"  autofocus="autofocus" />
			  <input type="password" class="form-control" name="password" placeholder="Password" required="required" />     		  
			 
			  <button class="btn btn-lg btn-primary btn-block"  name="Submit" value="Login" type="Submit">Login</button>  			
		</form>			
	</div>
</div>
</body>
</html>