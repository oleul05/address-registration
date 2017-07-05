package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.UserDaoImpl;
import com.model.User;

/**
 * Servlet implementation class Update
 */
@WebServlet("/Update")
public class Update extends HttpServlet {
	
	public static List<User> alluser= new ArrayList<User>();
	private static final long serialVersionUID = 1L;
       
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
	        
	        request.getSession().setAttribute("user", u);
	        
	        alluser.add(u);
	        
	        HttpSession session = request.getSession();
	        
	        User ab = (User)session.getAttribute("user");
	        
	        
	        int status = UserDaoImpl.update(u);
	        
	        if(status>0){  
	            out.print("<p>Record updated successfully!</p>");  
	            response.sendRedirect("profile.jsp");  
	            //request.getRequestDispatcher("profile").include(request, response);  
	        }else{  
	            out.print("Sorry! unable to save record"); 
	            request.getRequestDispatcher("registration.jsp").include(request, response);  
	        }  
	          
	        /*out.close(); */ 
	    }

}
