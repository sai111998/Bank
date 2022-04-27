<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
body{
background-image:url("bills-capital-cash-cent-210679.jpg");
background-size:100%;
}
h2{
text-align:center;
background-color:skyblue;
}
.center{
  margin: auto;
  width: 30%;
  padding: 10px;
  text-align:center;
  justify-content: center;
  align-items: center;
  font-size: 30px;
  color:#FF7F50;
  background-color:#008B8B;
}

a:hover {
  color: red;
  background-color: transparent;
  text-decoration: underline;
}

.left1{
  position: absolute;
  left: 100px;
  width: 300px;
  padding: 20px;
  margin:50px;
  font-size:40px;
 
}

.left2{
  position: absolute;
  left: 50px;
  width: 300px;
  padding: 20px;
  margin:100px;
  font-size:40px;
}


.left3{
  position: absolute;
  left: 0px;
  width: 300px;
  padding: 20px;
  margin:150px;
  font-size:40px;
}
.right1{
  position: absolute;
  right: 0px;
  width: 300px;
  padding: 20px;
  margin:50px;
  font-size:40px;
}

.right2{
  position: absolute;
  right: 0px;
  width: 250px;
  padding: 20px;
  margin:100px;
  font-size:40px;
}

.right3{
  position: absolute;
  right: 0px;
  width: 200px;
  padding: 20px;
  margin:150px;
  font-size:40px;
}

</style>
<meta charset="ISO-8859-1">
<title>Login success</title>
</head>
<body>
<h2>Login Successful</h2>
<div class="center">
<%
out.println("Welcome MR."+session.getAttribute("name"));
%>
</div>
<br>
<div class="full">

<div class="left1">

<a href="Balance">Check Balance</a><br>
</div>

<div class="left2">
<a href="changepswd.jsp">Change Password</a><br>
</div>

<div class="left3">
<a href="tranfer.jsp">Transfer Amount</a><br>
</div>

<div class="right1">
<a href="Statement1">Get Statement</a><br>
</div>

<div class="right2">
<a href="loan.jsp">Apply for Loan</a><br>
</div>

<div class="right3">
<a href="Logout">Logout</a>
</div>
</div>
</body>
</html> 