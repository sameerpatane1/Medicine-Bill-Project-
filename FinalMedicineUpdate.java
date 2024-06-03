package org.medicinepharma.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.medicinepharma.admin.model.MedicineModel;
import org.medicinepharma.admin.service.MedicineService;
import org.medicinepharma.admin.service.MedicineServiceImpl;


@WebServlet("/finalupdate")
public class FinalMedicineUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public FinalMedicineUpdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
			int companyid=Integer.parseInt(request.getParameter("companyId"));
			 String companyname=request.getParameter("companyName");
			 MedicineModel model= new MedicineModel();
			 model.setCompanyId(companyid);
			 model.setCompanyName(companyname);
			 MedicineService mService=new MedicineServiceImpl();
			 boolean b=mService.isUpdateCompanyName(model);
			 if(b) {
				 RequestDispatcher r=request.getRequestDispatcher("viewmedicinename.jsp");
				r.forward(request, response);
			 }else {
				out.println("<h1>compny name not updated sucess...</h1>");
			 }
			}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
