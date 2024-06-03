package org.medicinepharma.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.medicinepharma.admin.service.*;
@WebServlet("/del")
public class DeleteCompanyNameController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
     
    public DeleteCompanyNameController() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		int cid=Integer.parseInt(request.getParameter("companyId"));
		System.out.println("select id is"+cid);
		MedicineService mService=new MedicineServiceImpl();
		boolean b=mService.isDeleteCompanyNameById(cid);
		if(b) {
			RequestDispatcher r=request.getRequestDispatcher("viewmedicinename.jsp");
			r.forward(request, response);
		}else {
			out.println("Some Problem is there....");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
