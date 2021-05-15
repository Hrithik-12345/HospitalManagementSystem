package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.SelectHospitalDetail;
import model.AdminHospitalPojo;


@WebServlet("/ShowHospital")
public class ShowHospital extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.print("<html>");
		out.print("<head>");
		out.println("<style>");
		
		  out.println("table,th,td {");        
		  out.println("color:orangered;");
		  
		  out.println("border: 1px solid black;");
		  out.println("width:30%;");
		  out.println("text-align:center;");
		  out.println("background-color:rgba(0,100,0,0.5)");
		  
		  out.println("}"); 
		  
		  out.println("body{");
			 out.println("background-image: url('http://www.welkinholidaysinnsuites.com/assets/new/images/awesome-slider/as8.jpg')");
			  out.println("background-repeat: no-repeat;");
			  out.println("background-size: 1500px 1200px;");
			  out.println("}"); 
			 
		  
		  out.println("</style>");  
		  out.println("</head>");
		
		  out.println("<body>");
		  
		
		out.println("<a href='hospital.html'>Add New Hospital</a>");
		out.println("<h1><center>Hospital Lists</center></h1>");
		List<AdminHospitalPojo> list=SelectHospitalDetail.getAllHospital();
		
		out.print("<table>");
		out.println("<tr><th>HospitalID</th><th>HospitalName</th><th>HospitalType</th><th>TotalBeds</th><th>AvailableBeds</th></tr>");
		for(AdminHospitalPojo h:list) {
			out.print("<tr><td>"+h.getHospitalID()+"</td> <td>"+h.getHospitalName()+"</td>  <td>"+h.getHospitalType()+"</td> <td>"+h.getTotalBeds()+"</td>   <td>"+h.getAvailableBeds()+"</td>  <td><a href='UpdateHospital?HospitalID="+h.getHospitalID()+"'>Update</a></td> <td><a href='DeleteHospital?HospitalID="+h.getHospitalID()+"'>Delete</a></td></tr>");
		}
		out.print("</table>");
		
		out.println("</body>");
		out.print("</html>");
		out.print("</head>");
		
		out.close();
	}

}
