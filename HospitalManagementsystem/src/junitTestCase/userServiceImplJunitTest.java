package junitTestCase;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.jupiter.api.Test;

import dao.UserDaoImpl;
import model.User;

class userServiceImplJunitTest {

	//private static UserServiceImpl obj1=new UserServiceImpl();
	@Test
	public void signupTest() throws Exception
	{   UserDaoImpl Dao=new UserDaoImpl();
		User u1=new User();
		u1.setName("Hrithik");
		u1.setPhoneNumber(88888888);
		u1.setEmailID("hrithik@gmail.com");
		u1.setPassword("sonal");
		
		int a=Dao.signup(u1);
		assertEquals(0,a);
		
	}
	@Test
	public void loginTest() throws Exception
	{
		UserDaoImpl Dao=new UserDaoImpl();
	    User u1=new User();
		u1.setName("Hrithik");
		u1.setPassword("sonal");
		int[] abc =Dao.login(u1);
		assertNotEquals(1,abc);
		
	}
}


	
	


