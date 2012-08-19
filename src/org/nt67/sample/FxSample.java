package org.nt67.sample;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;


public class FxSample extends Application {
    public static void main(String[] args){
	launch(args);
	launch(FxSample.class, args);
    }

    @Override
    public void start(Stage stage) throws Exception{
	// set window title.
	stage.setTitle("Hello world");
	
	// constrcut element.
	Pane rootPane = new Pane();
	Scene scene = new Scene(rootPane, 256, 212);
	Label label = new Label("Hello World!");

	// constructed element add to the tree of pane.
	rootPane.getChildren().add(label);

	stage.setScene(scene);
	stage.show();
    }
}