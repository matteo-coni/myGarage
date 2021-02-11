package logic.exception;

public class DuplicatedVehicleException extends Exception {

	//MATTEO CONI
	
	private static final long serialVersionUID = 1L;
	
	public DuplicatedVehicleException (String message){
		super("Error: " + message);
	}
}
