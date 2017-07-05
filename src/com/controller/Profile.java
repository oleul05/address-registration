package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.UserDaoImpl;
import com.model.User;

/**
 * Servlet implementation class Profile
 */
@WebServlet("/Profile")
public class Profile extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		request.getRequestDispatcher("profile.jsp").include(request, response);

		HttpSession session = request.getSession(false);
		
		String sid=request.getParameter("username");  
        int id=Integer.parseInt(sid);  
		
		User user = UserDaoImpl.getUserById(sid);
		request.setAttribute("user", user);
		
		if (session != null) {
			String name = (String) session.getAttribute("username");

			out.print("Hello, " + name + " Welcome to Profile");
			request.setAttribute("user", user);
			
			
			request.getRequestDispatcher("profile.jsp").include(request, response);
		} else {
			out.print("Please login first");
			request.getRequestDispatcher("address.xhtml.jsp").include(request, response);
		}
		out.close();
	}
}
