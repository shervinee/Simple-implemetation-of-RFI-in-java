package tehrann.controller;


import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
//import model.Person;
//import model.PersonManager;

public class Frame1 implements Initializable {
	@FXML
	private TableView dataTable1;
	@FXML
	private Button btn1;
	
	
	public static Stage frame2 = new Stage();
	//public static Person person = new Person();
	@Override
	public void initialize(URL location, ResourceBundle resources)  {
		btn1.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {
			  System.out.println("java fx");
			}
			
		});
			
		/*ArrayList<Person> list = new PersonManager().select();
		ObservableList<Person> data = FXCollections.observableArrayList(list);
		////////////////////////////////////////////////////////////////////
		TableColumn firstNameCol = new TableColumn("نام");
		firstNameCol.setMinWidth(100);
		firstNameCol.setCellValueFactory(
				new PropertyValueFactory<Person, String>("name"));
		////////////////////////////////////////////////////////////
		TableColumn id = new TableColumn("");*/
		
		
	}
	

}
