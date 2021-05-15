package service;

	import dao.ReservedBedHospitalDaoImpl;
import model.ReservedBedHospitalPojo;

    public class ReservedBedHospitalServiceImpl {
    	//static final Logger LOGGER=Logger.getLogger(ReservedBedHospitalServiceImpl.class);
		private ReservedBedHospitalDaoImpl bdi = new ReservedBedHospitalDaoImpl();
		public int booking(ReservedBedHospitalPojo b1) throws Exception
		{
		//	LOGGER.info("inside booking method(service)");
		//	LOGGER.info("calling booking method(dao)");
				int x = bdi.booking(b1);
//				System.out.println(b1.getUserId());
//				 System.out.println(b1.getPatientName());
//					System.out.println(b1.getPatientAge());
//					System.out.println(b1.getPatientMobileNo());
//					System.out.println(b1.getDate());
//					System.out.println(b1.getBedQuant());
				
				return x; 
		}

	}



