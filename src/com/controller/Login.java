package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.UserDaoImpl;
import com.model.User;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	
	public static List<User> alluser= new ArrayList<User>();
	
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		request.getRequestDispatcher("profile.jsp").include(request, response);

		HttpSession session = request.getSession();
		
		String username=request.getParameter("username");  
        //int id=Integer.parseInt(sid);  
		
		User user = UserDaoImpl.getUserById(username);
		request.setAttribute("user", user);
		
		String susername = String.valueOf(session.getAttribute("username"));
        String spass = String.valueOf(session.getAttribute("password"));
        
        alluser.add(user);
		
		/*if (session != null) {
			String name = (String) session.getAttribute("username");

			out.print("Hello, " + name + " Welcome to Profile");
			request.getRequestDispatcher("profile.jsp").include(request, response);
		} else {
			out.print("Please login first");
			request.getRequestDispatcher("address.xhtml.jsp").include(request, response);
		}*/
		//out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		String sid=request.getParameter("username");  
        //int id=Integer.parseInt(sid);  
		
		User user = UserDaoImpl.getUserById(username);
		request.setAttribute("user", user);
		
		User u = new User();
		/*u.setUsername(username);
        u.setPassword(password);
        
		request.getSession().setAttribute("user", u);*/
		
		HttpSession session = request.getSession();
        
        
        String susername = String.valueOf(session.getAttribute("username"));
        String spass = String.valueOf(session.getAttribute("password"));
        
        //int status = UserDaoImpl.save(u);
        if(username.equals(susername) && password.equals(spass)) {
        	

			out.println(" Successfully Login");
			/*
			session.setAttribute("username", username);
			session.setAttribute("password", password);*/
			
			request.getRequestDispatcher("profile.jsp").include(request, response);
        } else {
        	request.getRequestDispatcher("profile.jsp").include(request, response);
        }
		
		/*if(username == "admin"  && password == "admin") {
			HttpSession session = request.getSession();

			out.println(" Successfully Login");
			
			session.setAttribute("username", username);
			session.setAttribute("password", password);
			
			request.getRequestDispatcher("profile.jsp").include(request, response);
		}  else {
			out.println("Username or Password incorrect");
			request.getRequestDispatcher("address.xhtml.jsp").include(request, response);
		}*/

		/*if (UserDaoImpl.checkUser(username, password)) {
			out.print("Welcome, "+ username );
			HttpSession session = request.getSession();

			out.println(" Successfully Login");
			
			session.setAttribute("username", username);
			session.setAttribute("password", password);
			
			request.getRequestDispatcher("profile.jsp").include(request, response);

		} else {
			out.println("Username or Password incorrect");
			request.getRequestDispatcher("address.xhtml.jsp").include(request, response);
		}*/
	}

}
