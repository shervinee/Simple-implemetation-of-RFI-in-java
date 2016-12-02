package tehrann.controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{


	@Override
	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setTitle("Frame1");
		primaryStage.setScene(new Scene( (Parent) FXMLLoader.load(getClass().getResource("/tehrann/view/Frame1.fxml")), 400 , 500 ));
		primaryStage.show();
	
	}

}
