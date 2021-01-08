package logic.model;

import java.util.Date;

public class Deadlines {
	
	Date vehicleInsurance;
	Date vehicleTax;
	Date vehicleReview;
	Date vehicleService;
	
	public Deadlines(Date vehicleInsurance, Date vehicleTax, Date vehicleReview, Date vehicleService) {
		
		this.vehicleInsurance = vehicleInsurance;
		this.vehicleTax = vehicleTax;
		this.vehicleReview = vehicleReview;
		this.vehicleService = vehicleService;
	}
	
}
