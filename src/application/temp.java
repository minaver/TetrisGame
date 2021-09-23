package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class temp extends Application {
		 
	    AnchorPane ROOT = new AnchorPane();
	 
	    public static void main(String[] args) {
	        launch();
	    }
	 
	    @Override
	    public void start(Stage stage) throws Exception {
	        
	        // root
	        ROOT.setPrefHeight(400);
	        ROOT.setPrefWidth(500);// scene
	        
	        // stage
	        Scene scene = new Scene(ROOT);
	        stage.setScene(scene);
	        stage.setTitle("TITLE");
	        stage.show();
	 
	    }//
	}