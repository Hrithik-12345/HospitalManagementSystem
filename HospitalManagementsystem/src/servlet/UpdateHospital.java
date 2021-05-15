package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.SelectHospitalDetail;
import model.AdminHospitalPojo;


@WebServlet("/UpdateHospital")
public class UpdateHospital extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<h1>Update hospital</h1>");
		String sid=request.getParameter("HospitalID");
		int HospitalID=Integer.parseInt(sid);
		
		AdminHospitalPojo h=SelectHospitalDetail.getHospitalById(HospitalID);
		
		out.print("<form action='UpdateHospital2' method='post'>");
		out.print("<table>");
		out.print("<tr><td>HospitalID</td><td><input type='hiden' name='HospitalID' value='"+h.getHospitalID()+"'/></td></tr>");
		out.print("<tr><td>HospitalName</td><td><input type='text' name='HospitalName' value='"+h.getHospitalName()+"'/></td></tr>");
		out.print("<tr><td>HospitalType</td><td><input type='text' name='HospitalType' value='"+h.getHospitalType()+"'/></td></tr>");
		out.print("<tr><td>TotalBeds</td><td><input type='number' name='TotalBeds' value='"+h.getTotalBeds()+"'/></td></tr>");
		out.print("<tr><td>AvailableBeds</td><td><input type='number' name='AvailableBeds' value='"+h.getAvailableBeds()+"'/></td></tr>");
		out.print("<tr><td colspan='2'><input type='submit' value='Update & Save '/></td></tr>");  
        out.print("</table>");  
        out.print("</form>");  
		
		}

	

}