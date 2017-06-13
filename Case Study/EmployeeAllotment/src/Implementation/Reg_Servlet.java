package Implementation;

import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import JavaBeans.Common_Employee;
import JavaBeans.Employee;

/**
 * Servlet implementation class Reg_Servlet
 */
public class Reg_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Reg_Servlet() {
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
		
		String m_name=request.getParameter("name");
		String m_gender=request.getParameter("gender");
		String m_qualification=request.getParameter("qualification");
		String m_blood_group=request.getParameter("blood_group");
		String m_email=request.getParameter("email");
		long m_mobile=Long.parseLong(request.getParameter("mobile"));
		String m_address=request.getParameter("address");
		String m_password=request.getParameter("password");
		String m_skill=request.getParameter("skill");
		String m_dob=request.getParameter("dob");
		String m_emp_id=request.getParameter("emp_id");
		String m_doj=request.getParameter("doj");
		//int m_app_id=Integer.parseInt(request.getParameter("application_id"));

		Random rand = new Random();

		 int  m_app_id = rand.nextInt(9999) + 1000;
		
	/*	HttpSession session = request.getSession();
		session.setAttribute("m_app_id", m_app_id);*/
		
		Employee e= new Employee(m_name, m_dob, m_gender, m_qualification, m_skill, m_blood_group, m_email,m_mobile,m_address, m_password,m_app_id);
		
		EmployeeImpl ed= new EmployeeImpl();
		
		boolean rec=ed.insert(e);
		if(rec==true)
		{
			RequestDispatcher rd = request.getRequestDispatcher("Reg_Successful.jsp");
        	rd.forward(request, response);
		}
		
		EmployeeImpl ei = new EmployeeImpl();
		Common_Employee ce = new Common_Employee(m_emp_id, m_name, m_password, m_dob, m_gender, m_qualification, m_skill, m_app_id, m_email, m_mobile,m_doj);
		
		boolean rec1 = ei.insertCommonEmployee(ce);
		if(rec1){
			System.out.println("record inserted into common employee");
		}
		
	
	}

}
