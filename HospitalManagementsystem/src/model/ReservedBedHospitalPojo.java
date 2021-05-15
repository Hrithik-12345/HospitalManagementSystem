package model;

public class ReservedBedHospitalPojo {
	//static final Logger LOGGER=Logger.getLogger(ReservedBedHospitalPojo.class);

		private int bookingId;
		private String PatientName;
		private String PatientAge;
		private Long PatientMobileNo;
		private String Date;
		private String BedQuant;
		private int UserId;
		private int HospitalID;
		private AdminHospitalPojo h;
		public int getBookingId() {
			//LOGGER.info("creating getter setter for ReservedBedHospital");
			return bookingId;
		}
		public void setBookingId(int bookingId) {
			this.bookingId = bookingId;
		}
		public String getPatientName() {
			return PatientName;
		}
		public void setPatientName(String patientName) {
			PatientName = patientName;
		}
		public String getPatientAge() {
			return PatientAge;
		}
		public void setPatientAge(String patientAge) {
			PatientAge = patientAge;
		}
		public Long getPatientMobileNo() {
			return PatientMobileNo;
		}
		public void setPatientMobileNo(long i) {
			PatientMobileNo = i; 
		}
		public String getDate() {
			return Date;
		}
		public void setDate(String date) {
			Date = date;
		}
		public String getBedQuant() {
			return BedQuant;
		}
		public void setBedQuant(String bedQuant) {
			BedQuant = bedQuant;
		}
		public int getUserId() {
			return UserId;
		}
		public void setUserId(int userId) {
			UserId = userId;
		}
		public int getHospitalID() {
			return HospitalID;
		}
		public void setHospitalID(int hospitalID) {
			HospitalID = hospitalID;
		}
}	
		
		
		
