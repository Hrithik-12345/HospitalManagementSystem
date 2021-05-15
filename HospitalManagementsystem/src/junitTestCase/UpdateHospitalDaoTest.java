package junitTestCase;

import static org.junit.Assert.assertNotEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
//import org.junit.AfterClass;
//import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import dao.UpdateHospitalDao;
import dbutility.DbConnection;
import model.AdminHospitalPojo;

	public class UpdateHospitalDaoTest {
	 private UpdateHospitalDao obj2=new UpdateHospitalDao();
		@BeforeAll
		public static void setUpBeforeClass() throws Exception {
			DbConnection.getCon();
		}

		@AfterAll
		public static void tearDownAfterClass() throws Exception {
			DbConnection.conClose();
		}

		@Test
		
		public void updateTest() {
			AdminHospitalPojo h1 = new AdminHospitalPojo();
			h1.setHospitalID(20);
			h1.setHospitalName("pqr");
			h1.setHospitalType("govt");
			h1.setTotalBeds("500");
			h1.setAvailableBeds("100");
			
			int result = obj2.update(h1);
			int expected = 1;
			assertNotEquals(result,expected);
			
		}
	}

	

