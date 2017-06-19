package cn.sz.gl.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HelloServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		ServletContext application = request.getServletContext();
		
		request.setAttribute("reqMsg", "������request�м����Ϣ");
		session.setAttribute("sessionMsg", "������session�е���Ϣ");
		application.setAttribute("appMsg", "������application�����е���Ϣ");
		
		request.getRequestDispatcher("one.jsp").forward(request, response);
		//response.sendRedirect("one.jsp");
		
		
	}

}
