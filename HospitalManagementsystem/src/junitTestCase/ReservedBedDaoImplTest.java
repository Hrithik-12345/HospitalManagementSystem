package junitTestCase;

import static org.junit.Assert.assertNotEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
//import org.junit.AfterClass;
//import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import dao.ReservedBedHospitalDaoImpl;
import dbutility.DbConnection;
import model.ReservedBedHospitalPojo;

	class ReservedBedDaoImplTest {
		
		private ReservedBedHospitalDaoImpl bhd=new ReservedBedHospitalDaoImpl();
		@BeforeAll
		public static void setUpBeforeClass() throws Exception {
			DbConnection.getCon();
		}

		@AfterAll
		public static void tearDownAfterClass() throws Exception {
			DbConnection.conClose();
		}

		@Test
		
		public void booking() throws Exception {
			ReservedBedHospitalPojo b1=new ReservedBedHospitalPojo();
			b1.setHospitalID(34);
			b1.setUserId(23);
			b1.setPatientName("abhishek");
			b1.setPatientAge("12");
			b1.setPatientMobileNo(9878878);
			b1.setDate("12-09-2021");
			b1.setBedQuant("1");
			
			
			int result = bhd.booking(b1);
			int expected = 1;
			assertNotEquals(result,expected);
		}

	}
	


	