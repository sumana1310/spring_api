 <html>
<head>
<title>Explore!!</title>

<%-- <link rel="stylesheet" type="text/css"
	href="<c:url value="C:\Users\1461569\Downloads\Step07\src\main\resources\css\login.css"/>"> --%>
</head>

<body>
<%-- <%@ include file="navbar.jsp"%> --%>
  <p><font color="blue">${registrationSuccess}</font></p>
    <p><font color="red">${errorMessage}</font></p>
    <form  action="/login" method="POST">
    <!--  <div class="imgcontainer">
    <img src="C:\Users\1461569\Downloads\Step07\src\main\resources\images\img_1.png" alt="Avatar" class="avatar">
  </div> -->
  <div class="container">
        Name : <input name="name" type="text" /> Password : <input name="password" type="password" /> 
      <button type="submit">Login</button>
    <label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label>
    </div>
    <div class="container" style="background-color:"black">
    </div>
    </form>
    <%-- <%@ include file="footer.jsp"%> --%>
</body>
</html> 
 