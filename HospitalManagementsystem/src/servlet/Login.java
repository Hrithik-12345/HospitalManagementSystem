package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.User;
import service.UserServiceImpl;


@WebServlet("/Login")
public class Login extends HttpServlet {
	
	//static final Logger LOGGER=Logger.getLogger(Login.class);
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//LOGGER.info("Inside method of login (servlet)");
		UserServiceImpl usi1 = new UserServiceImpl();
		User u1 = new User();
		
		String Name = request.getParameter("username");
		String Password = request.getParameter("password"); 
		
//		System.out.println(Name);
//		System.out.println(Password);
	
		
		u1.setName(Name);
		u1.setPassword(Password);
		
		int[] flag = {0,0};
		try {
			//LOGGER.info("calling signup method service");
			flag = usi1.login(u1);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		if(flag[0]==1)
		{
			HttpSession session = request.getSession();
			session.setAttribute("uID", flag[1]);
			if(flag[1] == 1)
			{
				//LOGGER.info("if flag[1]==1 Redirect to admin page");
				response.sendRedirect("adminHome.jsp");
				PrintWriter out = response.getWriter();
				out.print("login succesfull");
				//LOGGER.info("login successfull");
			}
			else
			{ 
				//LOGGER.info("else Redirect to home.html page");
				response.sendRedirect("home.html");
				PrintWriter out = response.getWriter();
				out.print("Login successfully.");
				//LOGGER.info("login successfull");
			}
		}
		else
		{
			//LOGGER.info("Redirect to login.html"); 
			response.sendRedirect("login.html");
			PrintWriter out = response.getWriter();
			out.print("Wrong Entry,please Sign up first.");
			//LOGGER.info("if no Signed up signup first");
		}
	}

}
	


