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

@WebServlet("/registration")
public class UserController extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)   
	         throws ServletException, IOException {  
	        response.setContentType("text/html");  
	        PrintWriter out=response.getWriter();  
	          
	        String username=request.getParameter("username");  
	        String password=request.getParameter("password");  
	         
	        User u = new User();
	        
	        u.setUsername(username);
	        u.setPassword(password);
	        
	        //int status = UserDaoImpl.save(u);
	        //if(status>0){  
	        	//HttpSession session = request.getSession();

				/*out.println(" Successfully Login");*/
	        
	        request.getSession().setAttribute("username", username);
	        request.getSession().setAttribute("password", password);
				
	            out.print("<p>Record saved successfully!</p>");  
	            request.getRequestDispatcher("address.xhtml.jsp").include(request, response);  
	        /*}else{  
	            out.print("Sorry! unable to save record"); 
	            request.getRequestDispatcher("registration.jsp").include(request, response);  
	        }  */
	          
	        /*out.close(); */ 
	    }  
}
