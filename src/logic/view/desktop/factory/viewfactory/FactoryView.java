package logic.view.desktop.factory.viewfactory;


import logic.view.desktop.view.*;
import java.io.IOException;

public class FactoryView {
	
	//***Singleton***/
	private static FactoryView instance = null;
	private FactoryView() {}
	
	public static synchronized FactoryView getInstance() {
		if(instance == null) {
			instance = new FactoryView();
		}
		return instance;
	}//Fine singleton***
	
	public View createView(TypeView view) throws IOException{
		
		switch(view.getType()) {    //scelta view con switch -- numero = riferimento TypeView
		case 0:
			return new ViewLogin(view);
		case 1: 
			return new ViewHome(view);
		case 2: 
			return new ViewInsertVehicle(view);
		case 3:
			return new ViewBookMech(view);
		case 4:
			return new ViewListMech(view);
		
		default:
			return new ViewLogin(view);
		}
	}
}