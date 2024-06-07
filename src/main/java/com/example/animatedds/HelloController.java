package com.example.animatedds;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.animation.*;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.util.Duration;
public class HelloController {
    //all the variables/gui components
    @FXML
   Circle circle1;
    @FXML
    Circle circle2;
    @FXML
    Circle circle3;
    @FXML
    Circle circle4;
    @FXML
    Circle circle5;
    @FXML
    private Label errorLabel;
    @FXML
    private Line circle1path;
    @FXML
    private Line circle1pathback;
    @FXML
    private Line circle2path;
    @FXML
    private Line circle2pathback;
    @FXML
    private Line circle3path;
    @FXML
    private Line circle3pathback;
    @FXML
    private Line circle4path;
    @FXML
    private Line circle4pathback;
    @FXML
    private Line circle5path;
    @FXML
    private Line circle5pathback;

    @FXML
    protected GridPane scene;
    //push method. This is where the circles move forward onto the stack

    @FXML
     void push() throws InterruptedException {
        //reset circles (to be implemented in the future)
        //create path transitions for each circle
        PathTransition trans1 = new PathTransition(Duration.seconds(2), circle1path, circle1);
        PathTransition trans2 = new PathTransition((Duration.seconds(2)), circle2path, circle2);
        PathTransition trans3 = new PathTransition((Duration.seconds(2)), circle3path, circle3);
        PathTransition trans4 = new PathTransition((Duration.seconds(2)), circle4path, circle4);
        PathTransition trans5 = new PathTransition((Duration.seconds(2)), circle5path, circle5);
        //create a sequential transition to play all the path transitions
        SequentialTransition sequentialTransition;
        sequentialTransition = new SequentialTransition();
        sequentialTransition.getChildren().addAll(trans1, trans2, trans3, trans4, trans5);
        sequentialTransition.setAutoReverse(false);
        sequentialTransition.play();
    }
    @FXML
     void pop() {
        //reset circles (to be implemented in the future)
        //create path transitions for each circle
        PathTransition trans1 = new PathTransition(Duration.seconds(2), circle5pathback, circle5);
        PathTransition trans2 = new PathTransition((Duration.seconds(2)), circle4pathback, circle4);
        PathTransition trans3 = new PathTransition((Duration.seconds(2)), circle3pathback, circle3);
        PathTransition trans4 = new PathTransition((Duration.seconds(2)), circle2pathback, circle2);
        PathTransition trans5 = new PathTransition((Duration.seconds(2)), circle1pathback, circle1);
        //create a sequential transition to play all the path transitions
        SequentialTransition sequentialTransition;
        sequentialTransition = new SequentialTransition();
        sequentialTransition.getChildren().addAll(trans1, trans2, trans3, trans4, trans5);
        sequentialTransition.setAutoReverse(false);
        sequentialTransition.play();
    }
    @FXML
    //initialize method. makes sure nothing is null
    void initialize() {
        assert circle1 != null;
        assert circle2 != null;
        assert circle3 != null;
        assert circle4 != null;
        assert circle5 != null;
        assert errorLabel != null;
        assert scene != null;
        assert circle1path != null;
        assert circle1pathback != null;
        assert circle2path != null;
        assert circle2pathback != null;
        assert circle3path != null;
        assert circle3pathback != null;
        assert circle4path != null;
        assert circle4pathback != null;
        assert circle5path != null;
        assert circle5pathback != null;
    }
}
