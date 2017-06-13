package Implementation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import JavaBeans.Common_Employee;

/**
 * Servlet implementation class SendToMBU
 */
public class SendToMBU extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SendToMBU() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String m_emp_id=request.getParameter("emp_id");
		String m_name=request.getParameter("name");
		String m_gender=request.getParameter("gender");
		String m_qualification=request.getParameter("qualification");
		//String m_blood_group=request.getParameter("blood_group");
		String m_email=request.getParameter("email");
		//String m_mobile=request.getParameter("mobile");
		//String m_address=request.getParameter("address");
		//String m_password=request.getParameter("password");
		String m_skill=request.getParameter("skill");
		//String m_dob=request.getParameter("dob");
		String m_date=request.getParameter("joiningDate");
		String m_app_id=request.getParameter("id");
		
Common_Employee ce= new Common_Employee(m_emp_id, m_name, m_gender, m_qualification, m_skill, m_email, m_date);
		
		//Joining_Emp je=new Joining_Emp(m_name, m_dob, m_gender, m_qualification, m_skill,m_email, Long.parseLong(m_mobile),Integer.parseInt(m_app_id), m_date, m_password);
		
		EmployeeImpl ed= new EmployeeImpl();
		
		boolean rec=ed.insertReferEmployee(ce);
		
		if(rec==true)
		{
			ed.deleteCommonEmployee(Integer.parseInt(m_app_id));
			
			
			RequestDispatcher rd = request.getRequestDispatcher("ReferredEmployee.jsp");
        	rd.forward(request, response);
        	
        	//response.sendRedirect("hrHome.jsp");
	}
	}

}
