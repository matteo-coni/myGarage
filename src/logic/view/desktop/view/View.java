package logic.view.desktop.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import logic.view.desktop.factory.viewfactory.*;
import java.io.IOException;

public class View {
	private Parent root;
	
	protected View(TypeView view) {
		FXMLLoader loader = new FXMLLoader(TypeView.getUrl(view));
        try {
            setRoot(loader.load());
        } catch (IOException e) {
                    }
    }

    public Parent getRoot() {
        return root;
    }

    public void setRoot(Parent root) {
        this.root = root;
    }
}