
package dbutility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection
{
	//static final Logger LOGGER=Logger.getLogger(DbConnection.class);
	
	private static Connection con = null;
	public static Connection getCon() throws ClassNotFoundException, SQLException {
		//LOGGER.info("try to create connection"); 
		//System.out.println("hii");
		Class.forName("com.mysql.cj.jdbc.Driver");
		//System.out.println("hello");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydab", "root","hrithik@123");
		//System.out.println("byee"+con);
		return con;
	}

	public static void  conClose() throws SQLException
	{
		if(con!=null) 
		{
			
con.close();
		}
	}
}