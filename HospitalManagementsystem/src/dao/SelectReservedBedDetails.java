package dao;


	

	import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dbutility.DbConnection;
import model.ReservedBedHospitalPojo;

	public class SelectReservedBedDetails {
	//	static final Logger LOGGER=Logger.getLogger( SelectReservedBedDetails.class);
		public static ReservedBedHospitalPojo getReservedBedByHospitalID(int bookingId) {
			//LOGGER.info("inside the ReservedBedHospitalPojo method(dao)");
			ReservedBedHospitalPojo b1=new ReservedBedHospitalPojo();
			
			
			try {
				//LOGGER.info("Try to Established Connection");
				Connection con = DbConnection.getCon();
				PreparedStatement ps = con.prepareStatement("SELECT * from booking where bookingId=?");
				ps.setInt(1, bookingId);
				ResultSet rs=ps.executeQuery();
				if(rs.next()) {
					b1.setBookingId(rs.getInt(1));
					b1.setPatientName(rs.getString(2)); 
					b1.setPatientAge(rs.getString(3));
					b1.setPatientMobileNo(rs.getLong(4));
					b1.setDate(rs.getString(5));
				//	LOGGER.info("storing data to database");
					
					}
				con.close();
			}catch(Exception ex) {ex.printStackTrace();}
			
			return b1;
		}
		
		public static List<ReservedBedHospitalPojo> getAllBookings(){
			List<ReservedBedHospitalPojo> list=new ArrayList<ReservedBedHospitalPojo>();
			
			try {
				Connection con = DbConnection.getCon();
				PreparedStatement ps = con.prepareStatement("SELECT * from booking");
				ResultSet rs=ps.executeQuery();
				while(rs.next()) {
					ReservedBedHospitalPojo b1=new ReservedBedHospitalPojo();
					b1.setBookingId(rs.getInt(1));
					b1.setHospitalID(rs.getInt(2));
					b1.setUserId(rs.getInt(3));
					b1.setPatientName(rs.getString(4));
					b1.setPatientAge(rs.getString(5));
					b1.setPatientMobileNo(rs.getLong(6));
					b1.setDate(rs.getString(7));
					b1.setBedQuant(rs.getString(8));
					list.add(b1);
					//LOGGER.info("fetching Reserved bed details");
				}
				con.close();
			}catch(Exception ex) {ex.printStackTrace();}
			return list;
		}
	}



