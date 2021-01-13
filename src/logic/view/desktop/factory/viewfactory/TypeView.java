package logic.view.desktop.factory.viewfactory;

import java.net.URL;

public enum TypeView {
	LOGIN(0, "/logic/view/desktop/view/ViewDesktopMain.fxml"),
	GYMPAGE(1, "/logic/view/desktop/view/ViewDesktopHome.fxml"),
	USERPAGE(2, "/logic/fxml/UserPage.fxml"),
	OFFERTRAININGFORM(3, "/logic/fxml/OfferTrainingForm.fxml"),
	BOOKINGFORM(4, "/logic/fxml/BookingForm.fxml"),
	OFFERTRAININGCONFIRMATION(5, "/logic/fxml/OfferTrainingConfirmation.fxml"),
	CARD(6, "/logic/fxml/Card.fxml");
	/* MAX SUBVIEW DIM: 900 x 542
	 * */

	private final int type;
	private final String path;
	private TypeView(int t, String p){
		this.type = t;
		this.path = p;
	}
	public static TypeView getView(int type) {
		for(TypeView subview : TypeView.values()) if(subview.type == type) return subview;
		throw new IllegalArgumentException("Unable to find the requested view("+type+")");
	}

	public int getType() {
		return type;
	}

	public static URL getUrl(TypeView subview){
		return TypeView.class.getResource(subview.path);
	}
}