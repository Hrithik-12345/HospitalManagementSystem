package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.AdminHospitalPojo;
import model.ReservedBedHospitalPojo;
import service.ReservedBedHospitalServiceImpl;


@WebServlet("/ReservedBedHospital")
public class ReservedBedHospital extends HttpServlet {  
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		ReservedBedHospitalServiceImpl bsi = new ReservedBedHospitalServiceImpl();
		ReservedBedHospitalPojo b1 = new ReservedBedHospitalPojo();
		
		
		HttpSession session = request.getSession();
		int uID = (int)session.getAttribute("uID");
		
		AdminHospitalPojo h=new AdminHospitalPojo();
		
		
		
		int HospitalID = (int)session.getAttribute("HospitalID");
		//System.out.println(HospitalID);
		
		String PatientName=request.getParameter("PatientName");
		String PatientAge=request.getParameter("PatientAge");
		long PatientMobileNo=Long.parseLong(request.getParameter("PatientMobileNo"));
		String Date=request.getParameter("Date");
		String BedQuant=request.getParameter("BedQuant");
		
//		System.out.println(uID);
//		 System.out.println(PatientName);
//			System.out.println(PatientAge);
//			System.out.println(PatientMobileNo);
//			System.out.println(Date);
//			System.out.println(BedQuant);
		
	    b1.setHospitalID(HospitalID);
		b1.setUserId(uID);
		b1.setPatientName(PatientName);
		b1.setPatientAge(PatientAge);
		b1.setPatientMobileNo(PatientMobileNo);
		b1.setDate(Date);
		b1.setBedQuant(BedQuant);
		
		int flag;
		
		try {
			flag = bsi.booking(b1);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
