package org.medicinepharma.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;
import org.medicinepharma.admin.service.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/delt")
public class DeleteRetailerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public DeleteRetailerController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int retId=Integer.parseInt(request.getParameter("retid"));
		System.out.println(retId);
		RetailerService rService=new RetailerServiceImpl();
		boolean b=rService.isdeleteAllRetailerById(retId);
		if(b) {
			RequestDispatcher r=request.getRequestDispatcher("retailerview.jsp");
			r.forward(request, response);
		}
		else {
			System.out.println("record not deleted...");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
