package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import dbutility.DbConnection;
import model.User;

public class UserDaoImpl implements UserDao 
{
	//static final Logger LOGGER=Logger.getLogger(UserDaoImpl.class);

	public int signup(User u1) throws Exception
	{
//		LOGGER.info("inside signup method Dao"); 
//		System.out.println(u1.getName());
//		System.out.println(u1.getPhoneNumber());	
//		System.out.println(u1.getEmailID());
//	    System.out.println(u1.getPassword());
		
		//System.out.println("UserDaoImpl.signup()");
int x = 0;

		try{
			//LOGGER.info("Try to Established Connection");
			Connection con = DbConnection.getCon();
			//System.out.println(con);
			PreparedStatement ps = con.prepareStatement("INSERT INTO login (UserName, PhoneNumber, EmailID, Password) VALUES(?,?,?,?)");
			//System.out.println(ps);
			//System.out.println(u1.getName()+"" +u1.getPassword()+"" +u1.getPhoneNumber()+""+u1.getEmailID());
			
			
			ps.setString(1, u1.getName());
			ps.setLong(2, u1.getPhoneNumber());
			ps.setString(3, u1.getEmailID());
			ps.setString(4, u1.getPassword());
			//LOGGER.info("storing data to database");
			x = ps.executeUpdate();
			//System.out.println(x);
		}
		catch(Exception e)
		{
			e.getMessage();
		}
		finally
		{
			DbConnection.conClose();
		}
		return x;
	}
	
	public int[] login(User u1) throws Exception
	{	
		//LOGGER.info("inside login method Dao");
		int[] flag = {0,0};
		String Name = u1.getName();
		String Password = u1.getPassword();
		//System.out.println(Name); 
		//System.out.println(Password);
		try{
			//LOGGER.info("try to execute login query(dao) ");
			Connection con = DbConnection.getCon();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT Userid FROM login Where Username = '"+ Name +"' AND Password = '"+Password+"'");
			
			if(rs.next())
			{
				flag[0]= 1;
				flag[1]=rs.getInt(1);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			DbConnection.conClose();
			//LOGGER.info("connection close");
		}
		return flag;
	}
	}