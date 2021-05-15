package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DeleteHospital")
public class DeleteHospital extends HttpServlet { 
	//static final Logger LOGGER=Logger.getLogger(DeleteHospital.class);
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//LOGGER.info("Inside  method of  DeleteHospital servlet");
		String sid=request.getParameter("HospitalID");
		int HospitalID=Integer.parseInt(sid);
		dao.DeleteHospitalDao.delete(HospitalID);
		//LOGGER.info("Redirect to ShowHospital");
		response.sendRedirect("ShowHospital");
	}

	
}
