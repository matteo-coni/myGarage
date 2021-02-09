package logic.view.desktop.controllerview;

import logic.bean.*;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.text.*;
import logic.control.ControllerLogin;
import logic.view.desktop.factory.viewfactory.*;
import logic.view.desktop.view.View;



public class ControllerGrafLogin {
	
	public ControllerGrafLogin() {}
	
	@FXML
	Button loginButton;
	@FXML
	TextField usernameField;
	@FXML
	PasswordField passwordField;
	@FXML
	Button registrButton;
	@FXML
	Button loginButtonMech;
	@FXML
	Button loginButtonGoogle;
	@FXML
	Text textError;
	
	@FXML
	public void login() throws IOException {
		
		String username = usernameField.getText();
		String password = passwordField.getText();
		
		LoginBean loginBean = new LoginBean(username,password);
		//ControllerLogin controlLogin = ControllerLogin.getInstance();
		ControllerLogin controlLogin = new ControllerLogin();
		
		
		if (controlLogin.isValidate(loginBean)){
			System.out.println(username);
			
			ControllerMain.getInstance().setId(loginBean.getUsername());
			FactoryView factory = FactoryView.getInstance();
			View view;
			view = factory.createView(TypeView.HOMEPAGE); 
				
			ControllerMain.getInstance().replace(ControllerMain.getContainer(), view);
			/*ControllerMain controlMain = new ControllerMain();
			controlMain.replace(controlMain.getContainer(), view);*/
			
		} else {
			System.out.println("errore nel login"); //debug
			textError.setText("Username o password errati");
		
			
		}	
	}
	
	@FXML
	public void loginMech() throws IOException{
		
		String username = usernameField.getText();
		String password = passwordField.getText();
		
		LoginBean loginBean = new LoginBean(username,password);
		ControllerLogin controlLogin = new ControllerLogin();
		
		if(controlLogin.isValidateMech(loginBean)) {
			
			ControllerMain.getInstance().setId(loginBean.getUsername());
			FactoryView factory = FactoryView.getInstance();
			View view;
			view = factory.createView(TypeView.LISTBOOKINGMECHPAGE); 
				
			ControllerMain.getInstance().replace(ControllerMain.getContainer(), view);
		} else {
			textError.setText("Username o password errati --- L'utente non è un meccanico");
		}
		
	}

}
