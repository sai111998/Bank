<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
body{
background-image:url("rolled-20-u-s-dollar-bill-164527.jpg");
background-size:100%;
}

h2{
background-color:#400000;
color:white;
font-size:30px;
width:20%;
}

.color{
background-color:#000033;
color:white;
font-size:30px;
width:25%;
}

</style>
<meta charset="ISO-8859-1">
<title>Balance</title>
</head>
<body>
<h2>Balance Details</h2>

<div class="color">
<%
out.print("Your balance is:"+session.getAttribute("balance"));
%>
</div>
</body>
</html>