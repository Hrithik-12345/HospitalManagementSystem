package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UpdateHospitalDao;
import model.AdminHospitalPojo;


@WebServlet("/UpdateHospital2")
public class UpdateHospital2 extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String sid=request.getParameter("HospitalID");
		int HospitalID=Integer.parseInt(sid);
		
		String HospitalName=request.getParameter("HospitalName");
		String HospitalType=request.getParameter("HospitalType");
		String TotalBeds=request.getParameter("TotalBeds");
		String AvailableBeds=request.getParameter("AvailableBeds"); 
		
		AdminHospitalPojo h=new AdminHospitalPojo();
		h.setHospitalID(HospitalID);
		h.setHospitalName(HospitalName);
		h.setHospitalType(HospitalType);
		h.setTotalBeds(TotalBeds);
		h.setAvailableBeds(AvailableBeds);
		
//		System.out.println(HospitalID);
//		System.out.println(HospitalName);
//		System.out.println(HospitalType);
//		System.out.println(TotalBeds);
//		System.out.println(AvailableBeds);
//		
		int status = 0;
		try {
			status = UpdateHospitalDao.update(h);
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
		
		if(status>0)
		{
			response.sendRedirect("ShowHospital");
		}else {
			out.println("Sorry! unable to update record");
		}
		out.close();
	}
}
	
