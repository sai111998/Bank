<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
body{
background-image: url("rupixen-com-LGM0PPU9Q4U-unsplash.jpg");
background-size: 100%
}
h3{
background-color:#DEB887;
width:40%;
font-size:30px;
}

.main{
position:absolute;
color:gold;
font-size:25px;
width:500px;
padding:30px;
 vertical-align: middle
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<title>Transfer</title>
</head>
<body>
<h3>Enter the details to Transfer Amount</h3>
<form action="Transfer">
<div class="main">
<label>To AccountNo:</label><input type="text" name="tacctno" placeholder="acctno"><br>
<label>Amount:</label><input type="text" name="amt" placeholder="amount"><br>
<input type="submit" value="Transfer">
</div>
</form>

</body>
</html>