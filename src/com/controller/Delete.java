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
 * Servlet implementation class Delete
 */
@WebServlet("/Delete")
public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		request.getRequestDispatcher("delete.jsp").include(request, response);

		HttpSession session = request.getSession(false);
		
		String username=request.getParameter("username");  
        //int id=Integer.parseInt(sid);  
		
		User user = UserDaoImpl.getUserById(username);
		request.setAttribute("user", user);
		
		if (session != null) {
			String name = (String) session.getAttribute("username");

			out.print("Hello, " + name + " Welcome to Profile");
			request.getRequestDispatcher("profile.jsp").include(request, response);
		} else {
			out.print("Please login first");
			request.getRequestDispatcher("address.xhtml.jsp").include(request, response);
		}
		//out.close();
	}
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response)   
	         throws ServletException, IOException {  
	        response.setContentType("text/html");  
	        PrintWriter out=response.getWriter();
	        
	        String username = request.getParameter("username");  
	        String name = request.getParameter("name");  
	        String surname = request.getParameter("surname");
	        String phone = request.getParameter("phone");
	        String address = request.getParameter("address");
	        String age = request.getParameter("age");
	        
	         
	        User u = new User();
	        u.setUsername(username);
	        u.setName(name);
	        u.setSurname(surname);
	        u.setPhone(phone);
	        u.setAddress(address);
	        u.setAge(age);
	        
	        
	        int status = UserDaoImpl.delete(u);
	        
	        User user = UserDaoImpl.getUserById(username);
			request.setAttribute("user", user);
	        
	        if(status>0){  
	            out.print("<p>Record Deleted successfully!</p>");  
	            response.sendRedirect("profile.jsp");  
	            //request.getRequestDispatcher("profile").include(request, response);  
	        }else{  
	            out.print("Sorry! unable to save record"); 
	            request.getRequestDispatcher("address.xhtml.jsp").include(request, response);  
	        }  
	          
	        /*out.close(); */ 
	    }

}
