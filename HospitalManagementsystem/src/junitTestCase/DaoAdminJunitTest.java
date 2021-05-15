
package junitTestCase;

import static org.junit.Assert.assertNotEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

//import org.junit.AfterClass;
//import org.junit.BeforeClass;
//import org.junit.Test;

import dao.AdminHospitalDaoImpl;
import dbutility.DbConnection;
import model.AdminHospitalPojo;

public class  DaoAdminJunitTest {
 private AdminHospitalDaoImpl adi=new AdminHospitalDaoImpl();
	@BeforeAll
	public static void setUpBeforeClass() throws Exception {
		DbConnection.getCon();
	}

	@AfterAll
	public static void tearDownAfterClass() throws Exception {
		DbConnection.conClose();
	}

	@Test

	public void saveTest() {
		AdminHospitalPojo h1 = new AdminHospitalPojo(); 
		h1.setHospitalName("buddha");
		h1.setHospitalType("govt");
		h1.setTotalBeds("800");
		h1.setAvailableBeds("80");
		
		int result = adi.save(h1);
		//int expected = 1;
		assertNotEquals(0,result);
		
		
	}

}