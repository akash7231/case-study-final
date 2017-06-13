<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee HomePage</title>
</head>
<body background="main2.jpg">
<font size="15cm">
<br><br>
<%
out.println(" <center><b>Welcome "+session.getAttribute("username")+" </b></center>");
%>

</font>
<%
session = request.getSession();
session.setAttribute("value", "Ok");
		
 %>

<br>
<form action="userApplication.jsp">
<center>
<br><br><br><br>
<button type="submit">My Applications</button>
</form>
<br><br>
<form action="Login.html" method="post">
<button type="submit">Logout</button>
</center>
</form>
</body>
</html>