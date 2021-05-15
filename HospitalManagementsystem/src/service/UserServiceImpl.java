package service;

import dao.UserDaoImpl;
import model.User;

public class UserServiceImpl {
	//static final Logger LOGGER=Logger.getLogger(UserServiceImpl.class);
	private UserDaoImpl udi = new UserDaoImpl();
	public int signup(User u1) throws Exception
	{
//		System.out.println(u1.getName());
//		System.out.println(u1.getPhoneNumber());	
//		System.out.println(u1.getEmailID());
//		System.out.println(u1.getPassword());
		//LOGGER.info("inside signup method(service)");
		System.out.println("UserServiceImpl.signup()"); 
		//LOGGER.info("calling signup method(dao)");
			int x = udi.signup(u1);
			
			return x;
	}

	public int[] login(User u1) throws Exception	
	{
		//LOGGER.info("inside login method(service)"); 
		//LOGGER.info("calling login method(dao)");
		int[] flag = udi.login(u1);
		
		return flag;
	}

}
