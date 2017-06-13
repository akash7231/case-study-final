<%@page import="java.util.Iterator"%>
<%@page import="Implementation.DisplayEmpFormImpl"%>
<%@page import="java.util.ArrayList"%>

<%@page import="JavaBeans.Common_Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="NoAcceptedEmployees.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Accepting Employee</title>
</head>
<body background="main2.jpg" align="center">
<br><br>
<h1>Allotment Page</h1>
<br><br>
	<table border="1" align="center" style="color: GreenYellow;">
		<%
			Common_Employee ce = new Common_Employee();
			DisplayEmpFormImpl formList = new DisplayEmpFormImpl();
			ArrayList<Common_Employee> ce1= formList.forms1(ce);
		%>

		<tr>
			<td>Employee ID</td>
			 <td>Application ID</td>
			<td>Name</td>
			<td>DOB</td>
			<td>Gender</td>
			<td>Qualification</td>
			<td>Skill</td>
		   <td>Email</td>
		   <td>Mobile</td>
		   <td>Joining date</td>
			
			
		

		</tr>

		<%
			Iterator<Common_Employee> it = ce1.iterator();
			 int count=1;
		
			while (it.hasNext()) {
				Common_Employee form = it.next();
				count++;
				if(count%2!=0)
				{
			//	out.println(it.next());
		%>
		<tr>
			<td><%=form.getEmp_id()%></td>
			<td><%=form.getApplication_id() %></td>
			<td><%=form.getName()%></td>
			<td><%=form.getDob()%></td>
			<td><%=form.getGender()%></td>
			<td><%=form.getQualification()%></td>
			<td><%=form.getSkill()%></td>
			<td><%=form.getEmail()%></td>
			<td><%=form.getMobile()%></td>
			
			<td><%=form.getDoj()%></td>
			
			<td>
			
			
			
			 
				<form action="SendToMBU" method="post">
					<!-- <input type="text" name="joiningDate"></td> -->
					
					<input type="hidden" name="emp_id" value=<%=form.getEmp_id()%>>
					<input type="hidden" name="id" value=<%=form.getApplication_id()%>>
					<input type="hidden" name="name" value=<%=form.getName()%>> 
					<input type="hidden" name="dob" value=<%=form.getDob()%>>
					<input type="hidden" name="gender" value=<%=form.getGender()%>>
					<input type="hidden" name="qualification" value=<%=form.getQualification()%>>
					<input type="hidden" name="skill" value=<%=form.getSkill()%>>
					<input type="hidden" name="email" value=<%=form.getEmail()%>>
					<input type="hidden" name="mobile" value=<%=form.getMobile()%>>
					<input type="hidden" name="joiningDate" value=<%=form.getDoj()%>>
					<input type="hidden" name="password" value=<%=form.getPassword()%>>
					
					
					<input type="submit" value="Refer">
				</form>
			</td>
			<!--  
			<td>
				<form action="Decline" method="post">
					<input type="hidden" name="id" value=<%=form.getApplication_id()%>> <input
						type="submit" value="Reject">
				</form>
			</td>
			-->

		</tr> 
		<%} %>

		<%
			}
		%>
		

	</table>
<!--  </form>-->
<br><br><br>
<form action="hrHome.jsp">
<button type="submit">Go Home</button>
</form>

</body>
</body>
</html>