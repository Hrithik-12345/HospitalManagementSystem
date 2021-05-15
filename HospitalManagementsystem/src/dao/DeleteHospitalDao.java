package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import dbutility.DbConnection;

	public class DeleteHospitalDao {
		//static final Logger LOGGER=Logger.getLogger(DeleteHospitalDao.class);
		public static int delete(int HospitalID) { 
		//	LOGGER.info("inside delete method (dao)");
			int status=0;
			try {
				//LOGGER.info("Try to Established Connection");
				Connection con = DbConnection.getCon();
				PreparedStatement ps = con.prepareStatement("DELETE from hospitaldetails where HospitalID=?");
				ps.setInt(1, HospitalID);
				status=ps.executeUpdate();
				//LOGGER.info("delete the data from databse");
				
				con.close();
			}catch(Exception ex) {ex.printStackTrace();}
			return status;
		}

	}



