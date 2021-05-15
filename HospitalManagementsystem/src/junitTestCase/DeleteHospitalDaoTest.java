package junitTestCase;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
//import org.junit.AfterClass;
//import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import dao.DeleteHospitalDao;
import dbutility.DbConnection;

class DeleteHospitalDaoTest {

private DeleteHospitalDao obj=new DeleteHospitalDao();
	@BeforeAll
	public static void setUpBeforeClass() throws Exception {
		DbConnection.getCon();
	}

	@AfterAll
	public static void tearDownAfterClass() throws Exception {
		DbConnection.conClose();
	}
	
	@Test
	
	public void deleteTest() {
		int HospitalID=9;
		int result = obj.delete(HospitalID);
		//int expected=1;
		assertEquals(0,result);
		
	}
	
}



	


