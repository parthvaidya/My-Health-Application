package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.PasswordField;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class UserInterfacteController {
	@FXML
	private TextField login_username;
	@FXML
	private PasswordField login_password;
	@FXML
	private Button login_button;
	@FXML
	private Button signup;
	
	public void handlebtn() throws Exception{
		
		Parent root = FXMLLoader.load(getClass().getResource("Signup.fxml"));
		
		Stage window = (Stage) signup.getScene().getWindow();	
		window.setScene(new Scene(root));
		window.setTitle("Sign up!!");
		window.show();
		
	}
	
	
	
}
