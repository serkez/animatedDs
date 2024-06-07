package com.example.animatedds;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;
/* Naomi Serkez*/
public class HelloApplication extends Application {
    //start method, sets everything up
    @Override
    public void start(Stage stage) throws IOException {
        GridPane root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("stack.fxml")));
        Scene scene = new Scene(root, 620, 440);
        stage.setScene(scene);
        stage.setTitle("Stack!");
        stage.show();
    }
//launches the application
    public static void main(String[] args) {
        launch();
    }
}