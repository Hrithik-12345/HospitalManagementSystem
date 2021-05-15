package dao;

//public class ReservedBedHospitalDaoImpl {
	

	import java.sql.Connection;
import java.sql.PreparedStatement;

import dbutility.DbConnection;
import model.ReservedBedHospitalPojo;

	public class ReservedBedHospitalDaoImpl {
	//	static final Logger LOGGER=Logger.getLogger(ReservedBedHospitalDaoImpl.class);
		public int booking(ReservedBedHospitalPojo b1) throws Exception
		{
			//LOGGER.info("inside booking method (dao)");
			int x = 0;

			try{
				//LOGGER.info("Try to Established Connection");
				Connection con = DbConnection.getCon();
				PreparedStatement ps = con.prepareStatement("INSERT INTO booking(HospitalID,UserId,PatientName, PatientAge, PatientMobileNo, Date,BedQuant) VALUES(?,?,?,?,?,?,?)");
				ps.setInt(1, b1.getHospitalID());
				ps.setInt(2, b1.getUserId());
				ps.setString(3, b1.getPatientName());
				ps.setString(4, b1.getPatientAge());
				ps.setLong(5, b1.getPatientMobileNo());
				ps.setString(6, b1.getDate());
				ps.setString(7, b1.getBedQuant());
				//LOGGER.info("storing data to database");
				
//				System.out.println(b1.getHospitalID());
//				System.out.println(b1.getUserId());
//				 System.out.println(b1.getPatientName());
//					System.out.println(b1.getPatientAge());
//					System.out.println(b1.getPatientMobileNo());
//					System.out.println(b1.getDate());
//					System.out.println(b1.getBedQuant());
					
				x = ps.executeUpdate(); 
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

	}


