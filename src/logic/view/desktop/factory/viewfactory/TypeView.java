package logic.view.desktop.factory.viewfactory;

import java.net.URL;

public enum TypeView {
	LOGIN(0, "/logic/view/desktop/view/ViewDesktopMain.fxml"),
	HOMEPAGE(1, "/logic/view/desktop/view/ViewDesktopHome.fxml"),
	INSERTVEHICLEPAGE(2, "/logic/view/desktop/view/ViewInsert.fxml"),
	MECHANICPAGE(3,"/logic/view/desktop/view/ViewDesktopMechBook.fxml"),
	LISTBOOKINGMECHPAGE(4,"/logic/view/desktop/view/ViewListBookMech.fxml");
	
	

	private final int type;
	private final String path;
	
	private TypeView(int t, String p){
		this.type = t;
		this.path = p;
	}
	public static TypeView getView(int type) {
		for(TypeView subview : TypeView.values()) 
			if(subview.type == type) 
				return subview;
		throw new IllegalArgumentException("Unable to find the requested view("+type+")");
	}

	public int getType() {
		return type;
	}

	public static URL getUrl(TypeView subview){
		return TypeView.class.getResource(subview.path);
	}
}