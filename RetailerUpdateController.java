package org.medicinepharma.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RetailerUpdateController")
public class RetailerUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public RetailerUpdateController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int id=Integer.parseInt(request.getParameter("retid"));
		String retname=request.getParameter("retname");
		String contact=request.getParameter("contact");
		String address=request.getParameter("address");
		String email=request.getParameter("email");
		out.println("<center>");
		out.println("<form action='FinalRetailerUpdate' method='POST'>");
		out.println("<input type='hidden' name='retid' value='" + id + "' style='width: 400px; height: 30px;background-color: greenyellow;border-radius: 10px;'/><br><br>");
		out.println("<input type='text' name='retname' value='" + retname + "' style='width: 400px; height: 30px;background-color: greenyellow;border-radius: 10px;'/><br><br>");
		out.println("<input type='text' name='contact' value='" + contact + "' style='width: 400px; height: 30px;background-color: greenyellow;border-radius: 10px;'/><br><br>");
		out.println("<input type='text' name='address' value='" + address + "' style='width: 400px; height: 30px;background-color: greenyellow;border-radius: 10px;'/><br><br>");
		out.println("<input type='text' name='email' value='" + email + "' style='width: 400px; height: 30px;background-color: greenyellow;border-radius: 10px;'/><br><br>");
		out.println("<input type='submit' name='s' value='Update retailer Details' />");
		out.println("</center>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
