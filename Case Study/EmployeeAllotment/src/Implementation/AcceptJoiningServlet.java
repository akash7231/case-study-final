package Implementation;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import JavaBeans.Common_Employee;

/**
 * Servlet implementation class AcceptJoiningServlet
 */
public class AcceptJoiningServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AcceptJoiningServlet() {
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
		
		PrintWriter pw=response.getWriter();
		Random r= new Random();
		int n= r.nextInt(1000)+1;
		//String m_emp_id=request.getParameter("name").substring(0,2)+Math.round(Math.random()+1000);
		String m_emp_id=request.getParameter("name").substring(0,2)+n;
		String m_name=request.getParameter("name");
		String m_gender=request.getParameter("gender");
		String m_qualification=request.getParameter("qualification");
		//String m_blood_group=request.getParameter("blood_group");
		String m_email=request.getParameter("email");
		String m_mobile=request.getParameter("mobile");
		//String m_address=request.getParameter("address");
		String m_password=request.getParameter("password");
		String m_skill=request.getParameter("skill");
		String m_dob=request.getParameter("dob");
		String m_date=request.getParameter("joiningDate");
		String m_app_id=request.getParameter("id");
		
		
		
//Employee e= new Employee(m_name, m_dob, m_gender, m_qualification, m_skill, m_blood_group, m_email, Long.parseLong(m_mobile),m_address, m_password,m_app_id);
		
		Common_Employee ce=new  Common_Employee(m_emp_id, m_name, m_password, m_dob, m_gender, m_qualification, m_skill, Integer.parseInt(m_app_id), m_email, Long.parseLong(m_mobile), m_date);
		
		EmployeeImpl ed= new EmployeeImpl();
		HrImpl hrd= new HrImpl();
		boolean b=hrd.delete(m_app_id);
		System.out.println("BBBBBBBBBBBBBBBBBB "+b);
		boolean rec=ed.insertCommonEmployee(ce);
		boolean rec1=ed.insertCommonEmployee1(ce);
		if(rec==true)
		{
			/*RequestDispatcher rd = request.getRequestDispatcher("hrHomePage.jsp");
        	rd.forward(request, response);*/
        	//ed.deleteCommonEmployee(Integer.parseInt(m_app_id));
        	response.sendRedirect("AcceptanceSent.jsp");

		}
		else{
			pw.println("Not sent");
			response.sendRedirect("userHomePage.jsp");
		}
		
	}

}
