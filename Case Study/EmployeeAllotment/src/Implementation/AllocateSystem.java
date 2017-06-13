package Implementation;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import JavaBeans.Mbu_Employee;

/**
 * Servlet implementation class AllocateSystem
 */
public class AllocateSystem extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AllocateSystem() {
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
		
		String sys = "SYSTEM";
		Random r= new Random();
		int n= r.nextInt(1000)+1;
		//String m_sys_id=sys.substring(0,2)+Math.round(Math.random()+1000);
		String m_sys_id=sys.substring(0,2)+n;
		String m_name=request.getParameter("name");
		String m_gender=request.getParameter("gender");	
		String m_date=request.getParameter("joiningDate");
		String m_emp_id=request.getParameter("empid");
		
		System.out.println("***************"+m_emp_id);
		
		Mbu_Employee me = new Mbu_Employee(m_emp_id, m_name, m_gender, m_date, m_sys_id);
		
		MbuImpl mdao = new MbuImpl();
		System.out.println("date2"+m_date);
		boolean result=mdao.insert(me);
		
		if(result==true){
			
			System.out.println("Record Inserted Successfully");
			mdao.delete(m_emp_id);
			
			RequestDispatcher rd = request.getRequestDispatcher("HrReferel.jsp");
        	rd.forward(request, response);	
        
		}else {
			System.out.println("Failed to insert");
		}
		
		
		
		


	}
	

}
