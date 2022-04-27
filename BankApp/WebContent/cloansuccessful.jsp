<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
</head>
<body>
<h2>Car Loan Details</h2>
<%
out.println("MR."+session.getAttribute("name")+ " Applied for car Loan Successfully");
%>

</body>
</html>