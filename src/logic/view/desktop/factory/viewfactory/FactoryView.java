package logic.view.desktop.factory.viewfactory;

//import logic.view.desktop.view.View;
//import logic.view.desktop.view.ViewLogin;
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
		
		switch(view.getType()) {
		case 0:
			return new ViewLogin(view);
		case 1: // return gymPage
			return new ViewHome(view);
		/*case 2: // return userPage
			return new UserPageView(view);
		case 3: // return offerTraining
			return new TrainingFormView(view);
		case 5:
			return new TrainingConfView(view);*/
		default:
			//throw new IOException("Factory exception: view not found");
			return new ViewLogin(view);
		}
	}
}