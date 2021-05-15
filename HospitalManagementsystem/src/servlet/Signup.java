package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;
import service.UserServiceImpl; 

@WebServlet("/Signup")
public class Signup extends HttpServlet {
	//static final Logger LOGGER=Logger.getLogger(Signup.class);
	
	
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			//LOGGER.info("Inside signup method(servlet)");
			UserServiceImpl usi1 = new UserServiceImpl(); 
			User u1 = new User();
			
			String Name = request.getParameter("UserName");
			long PhoneNumber = Long.parseLong(request.getParameter("PhoneNumber"));
			String EmailID = request.getParameter("EmailID");
			String Password = request.getParameter("Password"); 
			
//  		System.out.println(Name);
//		System.out.println(PhoneNumber);	
//		System.out.println(EmailID);
//		System.out.println(Password);
			u1.setName(Name);
			u1.setPhoneNumber(PhoneNumber); 
			u1.setEmailID(EmailID);
			u1.setPassword(Password);
			
			
			int x = 0;
			try {
				//LOGGER.info("Calling signup method service");
				x = usi1.signup(u1);
			}
			catch (Exception e)
			{
				e.printStackTrace();
	
			}
			if(x>0)
			{
				//LOGGER.info("Redirect to html page");
				response.sendRedirect( "login.html" );
			}
		
	}

}
