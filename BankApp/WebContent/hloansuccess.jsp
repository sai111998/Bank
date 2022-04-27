<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
</head>
<body>
<h2>Home Loan Details</h2>
<%
out.println("Mr. "+session.getAttribute("name")+" Applied for Home Loan Successfully");
%>
</body>
</html>