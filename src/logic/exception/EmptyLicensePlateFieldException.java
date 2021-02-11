package logic.exception;

public class EmptyLicensePlateFieldException extends Exception{


	private static final long serialVersionUID = -3787975639712218432L;

	public EmptyLicensePlateFieldException(String message) {
		super(message); //riporta il messaggio inserito
	}
}
