package org.nt67.sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

import java.io.File;
import java.io.FileInputStream;

import org.nt67.sample.control.FxSampleControl;

public class FxSampleApplication extends Application {
    public static void main(String[] args){
	launch(args);
	launch(FxSampleApplication.class, args);
    }

    @Override
    public void start(Stage stage) throws Exception{
	// set window title.
	stage.setTitle("nt67");

	// create Scene
	File fxmlFile = new File("sample.fxml");
	
	FXMLLoader loader = new FXMLLoader();
	Parent root = (Parent) loader.load(new FileInputStream(fxmlFile));
	
	Scene scene = new Scene(root);
	stage.setScene(scene);
	stage.show();
    }
}