package application;
	
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.DriverManager;
import java.time.LocalDateTime;
import java.sql.*;

import javafx.application.Application;  
import javafx.event.ActionEvent;  
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;  
import javafx.scene.control.Button;  
import javafx.stage.Stage;  
import javafx.scene.layout.StackPane; 


public class Main extends Application {
	

	@Override
	public void start(Stage primaryStage) throws IOException {
		 
	        Parent root = FXMLLoader.load(getClass().getResource("Healthrecord.fxml"));    
	        Scene scene =  new Scene(root);
	        
	        primaryStage.setTitle("Log in !!"); 
	        primaryStage.setScene(scene);  
	        primaryStage.show();  
	}
	
	public static void main(String[] args) {
		launch(args);
	
	}
	
	
}
