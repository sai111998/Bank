<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
body{
background-image:url("dmitry-demidko-eBWzFKahEaU-unsplash.jpg");
  background-size:100% ;
  background-repeat: no-repeat;
} 
	
h2{
  text-align:center;
  background-color:red;
  
}
.center {
  margin: auto;
  width: 50%;
  padding: 50px;
  text-align:center;
  justify-content: center;
  align-items: center;
  height: 200px;
}

a:hover {
  color: red;
  background-color: transparent;
  text-decoration: underline;
}

</style>
<meta charset="ISO-8859-1">
<title>fail</title>
</head>
<body>
<h2>Login Failed</h2>
<form action="Login">
<div class="center">
<label>Customer Id:</label><input type="text" name="custid" placeholder="Customer Id"><br>
<label>Password:</label><input type="password" name="pswd" placeholder="Password"><br>
<input type="submit" value="login"><br>
<a href="forgotpswd.jsp">forgot password?</a>
</div>
</form>
</body>
</html>