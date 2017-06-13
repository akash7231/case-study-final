package ControllerPackage;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Implementation.*;
import JavaBeans.*;


public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginController() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String m_userName = request.getParameter("username");
		String m_password = request.getParameter("password");
		
		HttpSession hs = request.getSession();
		hs.setAttribute("username", m_userName);
		
		System.out.println("1"+m_userName);
		System.out.println("1"+m_password);

		Login login = new Login(m_userName,m_password);
		login.setUserName(m_userName);
		login.setPassword(m_password);

		LoginImpl log = new LoginImpl();
		String role = log.validateUser(login);

		
		
		if (role.equalsIgnoreCase("hr")) {
			HttpSession session = request.getSession(false);
			session.setAttribute("m1_userName",m_userName );
			session.setAttribute("m_password",m_password );
			String hrPage = getServletContext().getInitParameter("hrHomePage");
			RequestDispatcher rd = request.getRequestDispatcher("hrHome.jsp");
			rd.forward(request, response);
		}
		else if (role.equalsIgnoreCase("mbu")) {
			HttpSession session = request.getSession();
			session.setAttribute("m1_userName",m_userName );
			String mbuPage = getServletContext().getInitParameter("mbuHomePage");
			//RequestDispatcher rd = request.getRequestDispatcher("mbuHome.jsp");
			response.sendRedirect("mbuHome.jsp");
			//rd.forward(request, response);

		}
		 else if (role.equalsIgnoreCase("user")) {
			HttpSession ss = request.getSession();
			ss.setAttribute("m1_userName",m_userName );
			ss.setAttribute("m_password",m_password );
			String userPage = getServletContext().getInitParameter("userHomePage");
			System.out.println("2"+m_userName);
			RequestDispatcher rd = request.getRequestDispatcher("userHomePage.jsp");
			rd.forward(request, response);
			//response.sendRedirect("userHomePage.jsp");

		}
		 else
		 {
			 	out.println("<font color='red'>Enter correct credentials</font>");
			RequestDispatcher rd = request.getRequestDispatcher("Login.html");
			rd.include(request, response);

		}

	}

}
