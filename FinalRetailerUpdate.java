package org.medicinepharma.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.medicinepharma.admin.model.RetailerModel;
import org.medicinepharma.admin.service.RetailerService;
import org.medicinepharma.admin.service.RetailerServiceImpl;




@WebServlet("/FinalRetailerUpdate")
public class FinalRetailerUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public FinalRetailerUpdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int id=Integer.parseInt( request.getParameter("retid"));
		String retname=request.getParameter("retname");
		String contact=request.getParameter("contact");
		String address=request.getParameter("address");
		String email=request.getParameter("email");
		RetailerModel model=new RetailerModel();
		
		model.setRetId(id);
		model.setRetName(retname);
		model.setContact(contact);
		model.setAddress(address);
		model.setEmail(email);
		RetailerService rService=new RetailerServiceImpl();
		boolean b=rService.isupdateRetailer(model);
		if(b) {
			 RequestDispatcher r=request.getRequestDispatcher("retailerview.jsp");
			 r.forward(request, response);
		}else {
			System.out.println("not updated..");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
