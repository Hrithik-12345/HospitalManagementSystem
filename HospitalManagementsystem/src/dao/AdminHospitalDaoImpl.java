package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import dbutility.DbConnection;
import model.AdminHospitalPojo;

	public class AdminHospitalDaoImpl {
		//static final Logger LOGGER=Logger.getLogger(AdminHospitalDaoImpl.class);
		public static int save(AdminHospitalPojo h) {
			//LOGGER.info("inside save method (dao)");
			int status=0;
			try
			{ 
				//LOGGER.info("Try to Established Connection"); 
				Connection con = DbConnection.getCon();
				PreparedStatement ps = con.prepareStatement
						("INSERT INTO hospitaldetails(HospitalName,HospitalType,TotalBeds,AvailableBeds) VALUES (?,?,?,?)");
				
				
				ps.setString(1, h.getHospitalName());
				ps.setString(2, h.getHospitalType());
				ps.setString(3, h.getTotalBeds());
				ps.setString(4, h.getAvailableBeds());
				System.out.println(h.getHospitalName()); 
				System.out.println(h.getHospitalType());
				System.out.println(h.getTotalBeds());
				System.out.println(h.getAvailableBeds());			
				status=ps.executeUpdate();
				//LOGGER.info("storing data to database");
				con.close();
			
			}catch(Exception ex) {ex.printStackTrace();}
			
			return status;
		}
		
	}



