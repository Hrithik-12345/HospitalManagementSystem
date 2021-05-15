package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dbutility.DbConnection;
import model.AdminHospitalPojo;

public class SelectHospitalDetail {
	//static final Logger LOGGER=Logger.getLogger( SelectHospitalDetail.class);

	public static AdminHospitalPojo getHospitalById(int HospitalID) {
		//LOGGER.info("inside AdminHospitalPojo method (dao)");
		AdminHospitalPojo h=new AdminHospitalPojo();
		
		
		try {
			//LOGGER.info("Try to Established Connection");
			Connection con = DbConnection.getCon();
			PreparedStatement ps = con.prepareStatement("SELECT * from hospitaldetails where HospitalID=?");
			ps.setInt(1, HospitalID);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				h.setHospitalID(rs.getInt(1));
				h.setHospitalName(rs.getString(2)); 
				h.setHospitalType(rs.getString(3));
				h.setTotalBeds(rs.getString(4));
				h.setAvailableBeds(rs.getString(5));
				//LOGGER.info("storing data to database"); 
				
				}
			con.close();
		}catch(Exception ex) {ex.printStackTrace();}
		
		return h;
	}
	
	public static List<AdminHospitalPojo> getAllHospital(){
		List<AdminHospitalPojo> list=new ArrayList<AdminHospitalPojo>();
		
		try {
			//LOGGER.info("Try to Established Connection");
			Connection con = DbConnection.getCon();
			PreparedStatement ps = con.prepareStatement("SELECT * from hospitaldetails");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				AdminHospitalPojo h=new AdminHospitalPojo();
				h.setHospitalID(rs.getInt(1));
				h.setHospitalName(rs.getString(2));
				h.setHospitalType(rs.getString(3));
				h.setTotalBeds(rs.getString(4));
				h.setAvailableBeds(rs.getString(5));
				list.add(h);
				//LOGGER.info("fetching hospital data ");
			}
			con.close();
		}catch(Exception ex) {ex.printStackTrace();}
		return list;
	}
}


