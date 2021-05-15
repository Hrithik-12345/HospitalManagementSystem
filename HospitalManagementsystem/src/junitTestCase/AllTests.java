package junitTestCase;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
//@SuiteClasses({ DaoAdminJunitTest.class,DeleteHospitalDaoTest.class,ReservedBedDaoImplTest.class,UpdateHospitalDaoTest.class,userServiceImplJunitTest.class })
@SelectPackages("junitTestCase")
@IncludePackages({"junitTestCase.DaoAdminJunitTest",
	"junitTestCase.DeleteHospitalDaoTest",
	"junitTestCase.ReservedBedDaoImplTest",
	"junitTestCase.UpdateHospitalDaoTest",
	"junitTestCase.userServiceImplJunitTest"
})
public class AllTests {

}
