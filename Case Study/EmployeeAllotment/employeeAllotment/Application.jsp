<%@page import="monfox.toolkit.snmp.agent.modules.SnmpV2Mib.SysOREntry"%>
<%@page import="Implementation.DisplayEmpFormImpl"%>

<%@page import="JavaBeans.Common_Employee"%>
<%@page import="Implementation.EmployeeImpl"%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Iterator"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" errorPage="NoAppilicationFound.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
      var datefield=document.createElement("input")
      datefield.setAttribute("type", "date")
      if (datefield.type!="date"){ //if browser doesn't support input type="date", load files for jQuery UI Date Picker
         document.write('<link href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/themes/base/jquery-ui.css" rel="stylesheet" type="text/css" />\n')
        document.write('<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.4/jquery.min.js"><\/script>\n')
        document.write('<script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/jquery-ui.min.js"><\/script>\n')
      }
   </script>

 <script>
    if (datefield.type!="date"){ //if browser doesn't support input type="date", initialize date picker widget:
       jQuery(function($){ //on document.ready
           $('#JoiningDate').datepicker();
       })
    }
 </script>
</head>
<body background="main2.jpg" align="center">
<br><br>

	<h1>Allotment Page</h1>
	<br><br><br>
	<table border="2" align="center" style="color : GreenYellow;">
		<%
			request.getAttribute("username");
			Common_Employee reg = new Common_Employee();
			DisplayEmpFormImpl formList = new DisplayEmpFormImpl();
			ArrayList<Common_Employee> display = formList.forms1(reg);
			//reg = formList.forms(reg);
			System.out.println("Size : "+display.size());
			
			
		%>

		<tr>
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
			/*  Iterator<Common_Employee> it = display.iterator();
			System.out.println(it.hasNext());

		
			while (it.hasNext()) { 
				Common_Employee form = it.next();
				out.println(it.next()); */
				
				for(Common_Employee form : display){
			//Employee form1=new Employee();
			%>
		
		<tr>
			<%--form changed to reg --%>
			<td><%=form.getApplication_id()%></td>
			<% System.out.println(form.getApplication_id());%>
<%-- 			<<%HttpSession session1 = request.setAttribute("m_app_id", reg.getApplication_id()); %>
 --%>			<td><%=form.getName()%></td>
			<td><%=form.getDob()%></td>
			<td><%=form.getGender()%></td>
			<td><%=form.getQualification()%></td>
			<td><%=form.getSkill()%></td>
			<td><%=form.getEmail()%></td>
			<td><%=form.getMobile()%></td>
			<td>

				<form action="SendJoiningDateServlet" method="post">
					<!--  <input type="text" name="joiningDate">-->
					<input type="date" id="JoiningDate" name="joiningDate" placeholder="MM/dd/yyyy" />
			</td>
			<td><input type="hidden" name="id"
				value=<%=form.getApplication_id()%>> <input type="hidden"
				name="name" value=<%=form.getName()%>> <input type="hidden"
				name="dob" value=<%=form.getDob()%>> <input type="hidden"
				name="gender" value=<%=form.getGender()%>> <input
				type="hidden" name="qualification" value=<%=form.getQualification()%>>
				<input type="hidden" name="skill" value=<%=form.getSkill()%>>
				<input type="hidden" name="email" value=<%=form.getEmail()%>>
				<input type="hidden" name="mobile" value=<%=form.getMobile()%>>
				<input type="hidden" name="password" value=<%=form.getPassword()%>>
				<input type="submit" value="Send To Employee">
				</form></td>
			<td>
				<form action="Decline" method="post">
					<input type="hidden" name="id" value=<%=form.getApplication_id()%>>
					<input type="hidden" name="decline" value="hrReject"> <input
						type="submit" value="Reject">
				</form>
			</td>

		</tr>

		<%
			}
		
%>

	</table>
	</form>
<br><br>

	<form action="hrHome.jsp">

		<button type="submit">Home</button>
	</form>

</body>
</html>