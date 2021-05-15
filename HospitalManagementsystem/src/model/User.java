package model;

public class User { 
	
	   // static final Logger LOGGER=Logger.getLogger(User.class);
		private int Userid;
		private String Name;
		private long PhoneNumber;
		private String EmailID;
		private String Password;

	public int getUserid() {
		//LOGGER.info("creating getter setter for User");
		return Userid;
	}
	public void setUserid(int userid) {
		Userid = userid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public long getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public String getEmailID() {
		return EmailID;
	}
	public void setEmailID(String emailID) {
		EmailID = emailID;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	}


