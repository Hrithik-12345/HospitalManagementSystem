package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.SelectReservedBedDetails;
import model.ReservedBedHospitalPojo;


@WebServlet("/ShowReservedBed")
public class ShowReservedBed extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
		
		List<ReservedBedHospitalPojo> list=SelectReservedBedDetails.getAllBookings();
		
		
		out.print("<table>");
		out.println("<h1><center>Reserved Bed Lists</center></h1>");
		out.print("<table>");
		out.println("<tr><th>BookingID</th><th>HospitalID</th><th>UserId</th><th>PatientName</th><th>PatientAge</th><th>PatientMobileNo</th><th>DateOfReservingBed</th><th>TotalBeds</th></tr>");
		for(ReservedBedHospitalPojo b1:list) {
			out.print("<tr><td>"+b1.getBookingId()+"</td> <td>"+b1.getHospitalID()+"</td>  <td>"+b1.getUserId()+"</td> <td>"+b1.getPatientName()+"</td>   <td>"+b1.getPatientAge()+"</td>  <td>"+b1.getPatientMobileNo()+"</td>  <td>"+ b1.getDate()+"</td>  <td>"+b1.getBedQuant()+"</td>  </tr>");
		}
		out.print("</table>");
		
		
			
		out.close();
	}

	

}