<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
body{
background-image:url("bluehouse-skis-M6tN7AZ_bNs-unsplash.jpg");
background-size:100%;
background-repeat:no-repeat;
}
h3{
color:green;
}
.color{
color:dogerblue;
}
</style>
<meta charset="ISO-8859-1">
<title>Change Password</title>
</head>
<body>
<h3>Enter the new password</h3>
<form action="Change">
<div class="color">
<label>New Password:</label><input type="password" name="npswd"><br>
<label>Confirm New Password</label><input type="password" name="cnpswd"><br>
<input type="submit" value="confirm">
</div>
</form>

</body>
</html>