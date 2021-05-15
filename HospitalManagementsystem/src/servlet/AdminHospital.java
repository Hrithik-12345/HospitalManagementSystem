package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AdminHospitalDaoImpl;
import model.AdminHospitalPojo;


@WebServlet("/AdminHospital")
public class AdminHospital extends HttpServlet {
	
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
	
		    response.setContentType("text/html");
			PrintWriter out=response.getWriter(); 
			
			String HospitalName=request.getParameter("HospitalName"); 
			String HospitalType=request.getParameter("HospitalType");
			String TotalBeds=request.getParameter("TotalBeds");
			String AvailableBeds=request.getParameter("AvailableBeds");
			
//			System.out.println(HospitalName);
//			System.out.println(HospitalType);
//			System.out.println(TotalBeds);
//			System.out.println(AvailableBeds);
			AdminHospitalPojo h=new AdminHospitalPojo();
			//System.out.println(h.getHospitalName());
			
			h.setHospitalName(HospitalName);
			h.setHospitalType(HospitalType);
			h.setTotalBeds(TotalBeds);
			h.setAvailableBeds(AvailableBeds);
			
			
			int status=AdminHospitalDaoImpl.save(h);
			//System.out.println(status);
			if(status>0) {
				
				out.print("<p>Record saved successfully</p>");
				
				request.getRequestDispatcher("Hospital.html").include(request, response);
				
			}
			else {
				out.print("sorry! unable to save record");
			}
		}
		
	}
