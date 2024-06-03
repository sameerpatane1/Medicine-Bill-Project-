package org.medicinepharma.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.medicinepharma.admin.model.LoginModel;
import org.medicinepharma.admin.service.LoginServiceImpl;


@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	
	    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        response.setContentType("text/html");
	        PrintWriter out=response.getWriter();
	        String email = request.getParameter("emailid");
	        String password = request.getParameter("password");
	        LoginServiceImpl service = new LoginServiceImpl();
	        LoginModel model = new LoginModel();
	        model.setEmailid(email);
	        model.setPassword(password);
	        boolean isLoggedIn = service.isuserLogin(model);
	        
	       
	        if(isLoggedIn) {
	            RequestDispatcher rs = request.getRequestDispatcher("addmindashboard.jsp");
	            rs.forward(request, response);
	        } else {
	          
	            out.println("<h1>Login failed Please try again...</h1>");
	        }
	    }
	}


