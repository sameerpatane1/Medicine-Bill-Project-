package org.medicinepharma.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.medicinepharma.admin.model.*;
import org.medicinepharma.admin.service.*;
/**
 * Servlet implementation class UpdateController
 */
@WebServlet("/UpdateController")
public class UpdateController extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int companyid=Integer.parseInt(request.getParameter("companyId"));
		String companyname=request.getParameter("companyName");
		out.println("<center>");
		out.println("<form class='formarea' name='frm' action='finalupdate' method='POST'>");
		out.println("<section> <h1>Update Company Name </h1></section>");
		out.println("<input type='hidden' name='companyId' value='" + companyid + "' style='width: 400px; height: 30px;background-color: greenyellow;border-radius: 10px;'/><br><br>");
		out.println("<input type='text' name='companyName' value='" + companyname + "' style='width:400px; height:30px;background-color: greenyellow;border-radius: 10px;'/><br><br>");
		out.println("<input type='submit' name='s' value='Update company Name' />");
		out.println("</center>");
		
		
	}
}
