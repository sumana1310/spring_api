<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%> --%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Here</title>

	

</head>
<body>
<form action="/registration" method="POST">

	<h2>EXPLORE</h2>


 
    <h1>Register here </h1>
<h2> <label for="username"><b>username</b></label></h2>
    <input type="text" placeholder="Enter user name" name="username" required>
   <h2> <label for="emailId"><b>email address</b></label></h2>
    <input type="text" placeholder="Enter email address " name="emailId" required>

   <h2><label for="password"><b>passowrd</b></label></h2>
    <input type="password" placeholder="Enter password." name="password" required>

   <h2><button type="submit" class="btn">Register</button></h2>
</body>
</form>
</html>
