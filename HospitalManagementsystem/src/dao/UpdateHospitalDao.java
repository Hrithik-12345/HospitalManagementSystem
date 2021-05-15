package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import dbutility.DbConnection;
import model.AdminHospitalPojo;

	public class UpdateHospitalDao {
	//	static final Logger LOGGER=Logger.getLogger(  UpdateHospitalDao.class);
		public static int update(AdminHospitalPojo h) {
		//	LOGGER.info("inside update method dao");
			int status=0;
			try {
				//LOGGER.info("Try to Established Connection");
				Connection con = DbConnection.getCon();
				PreparedStatement ps = con.prepareStatement("UPDATE hospitaldetails SET HospitalName=?,HospitalType=?,TotalBeds=?,AvailableBeds=? where HospitalID=?");
				//LOGGER.info("Try to update the hospital list");
				ps.setInt(5, h.getHospitalID());
				ps.setString(1, h.getHospitalName()); 
				ps.setString(2, h.getHospitalType());
				ps.setString(3, h.getTotalBeds());
				ps.setString(4, h.getAvailableBeds());
				
				
				System.out.println(h.getHospitalID());
				System.out.println(h.getHospitalName());
				System.out.println(h.getHospitalType());
				System.out.println(h.getTotalBeds());
				System.out.println(h.getAvailableBeds());
				
				status=ps.executeUpdate();
				//LOGGER.info("storing updated data to database");
				con.close();
				
			}catch(Exception ex) {ex.printStackTrace();}
			return status;
		}

	}



