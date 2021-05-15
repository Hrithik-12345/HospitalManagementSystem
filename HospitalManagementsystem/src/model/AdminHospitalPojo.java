package model;

public class AdminHospitalPojo {
		//static final Logger LOGGER=Logger.getLogger(AdminHospitalPojo.class);
		
		private int HospitalID;
		private String HospitalName;
		private String HospitalType;
		private String TotalBeds;
		private String AvailableBeds;
		public int getHospitalID() {
			//LOGGER.info("creating getter setter for AdminHospital"); 
			return HospitalID;
		}
		public void setHospitalID(int hospitalID) {
			HospitalID = hospitalID;
		}
		public String getHospitalName() {
			return HospitalName;
		}
		public void setHospitalName(String hospitalName) {
			HospitalName = hospitalName;
		}
		public String getHospitalType() {
			return HospitalType;
		}
		public void setHospitalType(String hospitalType) {
			HospitalType = hospitalType;
		}
		public String getTotalBeds() {
			return TotalBeds;
		}
		public void setTotalBeds(String totalBeds) {
			TotalBeds = totalBeds;
		}
		public String getAvailableBeds() {
			return AvailableBeds;
		}
		public void setAvailableBeds(String availableBeds) {
			AvailableBeds = availableBeds;
		}
		
		
}
