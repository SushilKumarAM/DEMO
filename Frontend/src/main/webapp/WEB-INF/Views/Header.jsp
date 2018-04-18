<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> --%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Online Shopping</title>
</head>
<body>

<nav id ="navbar-red" class="navbar navbar-inverse navbar-static-top" role="navigation">

<div class="container">
<ul class="nan navbar-nav">
<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-1">

<span class = "icon-bar"></span>
<span class = "icon-bar"></span>
<span class = "icon-bar"></span>

</button>

</ul>
</div>
<div class="collapse navbar-collapse" id="bs-example-navbar-1">

<ul class="nav navbar-nav">

<li><a href=<c:url value="/register"/>>Register</a></li>
<li><a href=<c:url value="/login"/>><i class="fa fa-sign-in" aria-hidden="true"></i> Login</a></li>
<li><a href=<c:url value="/product"/>>Product</a></li>
<li><a href=<c:url value="/category"/>>Category</a></li>
<li><a href=<c:url value="/supplier"/>>Supplier</a></li>
<li><a href=<c:url value="/aboutus"/>>About US</a></li>
<li><a href=<c:url value="/contactus"/>>Contact Us</a></li>

</ul>

</div>

</nav>
</body>
</html>









<%-- 
<%@ page language="java" contentType="text/html"%>
<center>
<a href="login">Login</a>&nbsp;&nbsp;|&nbsp;&nbsp;
<a href="register">Register</a>&nbsp;&nbsp;|&nbsp;&nbsp;
<a href="aboutus">About Us</a>&nbsp;&nbsp;|&nbsp;&nbsp;
<a href="contactus">Contact Us</a>&nbsp;&nbsp;|&nbsp;&nbsp;
<a href="category">Category</a>&nbsp;&nbsp;|&nbsp;&nbsp;
<a href="supplier">Supplier</a>&nbsp;&nbsp;|&nbsp;&nbsp;
<a href="product">Product</a>&nbsp;&nbsp;|&nbsp;&nbsp;
</center>
</body> --%>