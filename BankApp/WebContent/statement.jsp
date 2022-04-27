<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Account Statement</title>
</head>
<body>

<%
	out.println("Amount transfered"+ session.getAttribute("al"));
	out.println("Account"+ session.getAttribute("al1"));
	out.println("To Account"+ session.getAttribute("al2"));
%>
</body>
</html>