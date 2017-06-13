<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Implementation.DisplayEmpFormImpl"%>

<%@page import="JavaBeans.Mbu_Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Alloted</title>
</head>
<body background="main2.jpg" align="center">
<br><br>
<h1>MBU referred Page</h1>
<br><br>
	<table border="1" align="center" style="color : GreenYellow;">
		<%
			
	
			Mbu_Employee me = new Mbu_Employee();
			DisplayEmpFormImpl formList = new DisplayEmpFormImpl();
			ArrayList<Mbu_Employee> display = formList.alloted(me);
			
		%>

		<tr>
		    <td>Employee ID</td>
			<td>Name</td>
			<td>Gender</td>	
			<td>Joining date</td>
			<td>System</td>

		</tr>

		<%
			Iterator<Mbu_Employee> it = display.iterator();
		%>
		<%
			while (it.hasNext()) {
				Mbu_Employee form = it.next();
			//	out.println(it.next());
		%>
		<tr>
			<td><%=form.getEmp_id()%></td>
			<td><%=form.getName()%></td>
			<td><%=form.getGender()%></td>
			<td><%=form.getDoj()%></td>
			<td><%=form.getSysid() %></td>	
		
		</tr>
			
			<%} %>
</tr>
	</table>
</form> 

<br><br><br>

<form action="mbuHome.jsp">
<button type="submit">Home</button>
</form>

</body>
</html>