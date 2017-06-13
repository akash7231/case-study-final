package Implementation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Decline
 */
public class Decline extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Decline() {
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
		
		DisplayEmpFormImpl de= new DisplayEmpFormImpl();
		//t APP_ID=de.aaa;
		String m_empid = request.getParameter("id");
		String role = request.getParameter("decline");
		
		

		if (role.equalsIgnoreCase("hrReject")) {

			HrImpl hDao = new HrImpl();
			hDao.delete(m_empid);

			RequestDispatcher rd = request
					.getRequestDispatcher("hrHome.jsp");
			rd.forward(request, response);
		}
		
		else if (role.equalsIgnoreCase("mbuWait")) {

			
			HrImpl hDao = new HrImpl();
			hDao.delete(m_empid);
			MbuImpl mdao = new MbuImpl();
			
			mdao.delete(m_empid);
			
			mdao.insertCommonEmployee(m_empid);

			RequestDispatcher rd = request.getRequestDispatcher("mbuHome.jsp");
			rd.forward(request, response);
		}
		else if (role.equalsIgnoreCase("userReject")) {

			HrImpl hDao = new HrImpl();
			hDao.delete(m_empid);

			RequestDispatcher rd = request
					.getRequestDispatcher("userHomePage.jsp");
			rd.forward(request, response);
		}
	
	}

}
