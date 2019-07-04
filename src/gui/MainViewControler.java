package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewControler implements Initializable{

	
	@FXML
	private MenuItem menuItemSeller;
	
	@FXML
	private MenuItem menuItemDepartament;
	
	@FXML
	private MenuItem menuItemAbout;
	
	@FXML
	public void onmenuItemSellerAction() {
		System.out.println("onmenuItemSellerAction");
	}
	
	@FXML
	public void onmenuItemDepartamentAction() {
		System.out.println("onmenuItemDepartamentAction");
	}
	
	@FXML
	public void onmenuItemAboutAction() {
		System.out.println("onmenuItemAboutAction");
	}
	
	@Override
	public void initialize(URL uri, ResourceBundle rb) {
				
	}

}
