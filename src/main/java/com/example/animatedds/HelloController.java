package com.example.animatedds;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.animation.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;
public class HelloController {
    @FXML
    private Label welcomeText;
   // private double location =  0;
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
  //  private HelloApplication scene;
    //private View view;
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
 /*   public HelloController(HelloApplication model){// }, View view) {
        this.scene = model;
        //this.view = view;
    }*/

    @FXML
     void push() throws InterruptedException {
        //reset circles
        PathTransition trans1 = new PathTransition(Duration.seconds(2), circle1path, circle1);
        PathTransition trans2 = new PathTransition((Duration.seconds(2)), circle2path, circle2);
        PathTransition trans3 = new PathTransition((Duration.seconds(2)), circle3path, circle3);
        PathTransition trans4 = new PathTransition((Duration.seconds(2)), circle4path, circle4);
        PathTransition trans5 = new PathTransition((Duration.seconds(2)), circle5path, circle5);
        SequentialTransition sequentialTransition;
        sequentialTransition = new SequentialTransition();
        sequentialTransition.getChildren().addAll(trans1, trans2, trans3, trans4, trans5);
        sequentialTransition.setAutoReverse(false);
        sequentialTransition.play();
    }
    @FXML
     void pop() {
        PathTransition trans1 = new PathTransition(Duration.seconds(2), circle5pathback, circle5);
        PathTransition trans2 = new PathTransition((Duration.seconds(2)), circle4pathback, circle4);
        PathTransition trans3 = new PathTransition((Duration.seconds(2)), circle3pathback, circle3);
        PathTransition trans4 = new PathTransition((Duration.seconds(2)), circle2pathback, circle2);
        PathTransition trans5 = new PathTransition((Duration.seconds(2)), circle1pathback, circle1);
        SequentialTransition sequentialTransition;
        sequentialTransition = new SequentialTransition();
        sequentialTransition.getChildren().addAll(trans1, trans2, trans3, trans4, trans5);
        sequentialTransition.setAutoReverse(false);
        sequentialTransition.play();
    }
    @FXML
    void initialize() {
        assert circle1 != null : "fx:id=\"circle1\" was not injected: check your FXML file 'Calculator.fxml'.";
        assert circle2 != null
                : "fx:id=\"circle2\" was not injected: check your FXML file 'Calculator.fxml'.";
        assert circle3 != null : "fx:id=\"circle3\" was not injected: check your FXML file 'Calculator.fxml'.";
        assert circle4 != null
                : "fx:id=\"circle4\" was not injected: check your FXML file 'Calculator.fxml'.";
        assert circle5 != null : "fx:id=\"circle5\" was not injected: check your FXML file 'Calculator.fxml'.";
        assert errorLabel != null : "fx:id=\"errorLabel\" was not injected: check your FXML file 'Calculator.fxml'.";
        assert scene != null ; // : "fx:id=\"buttonMinus\" was not injected: check your FXML file 'Calculator.fxml'.";

    }
}
/*

public class BunnyAnimation extends Application {






public class Controller {
    private Model model;
    private View view;
    private Timeline colorTimeline;
    private Timeline translateTimeline;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;

        colorTimeline = createColorTimeline();
        colorTimeline.setCycleCount(Timeline.INDEFINITE);

        translateTimeline = createTranslateTimeline();
        translateTimeline.setCycleCount(Timeline.INDEFINITE);

        view.getButton().setOnAction(e -> {
            if (view.getButton().isSelected()) {
                colorTimeline.play();
                translateTimeline.play();
            } else {
                colorTimeline.pause();
                translateTimeline.pause();
            }
        });
    }

    private Timeline createColorTimeline() {
        return new Timeline(new KeyFrame(Duration.millis(200), e -> {
            double[] color = model.getColor();
            color[0] = color[0] + 0.3 > 1.0 ? 0 : color[0] + 0.3;
            color[1] = color[1] + 0.1 > 1.0 ? 0 : color[1] + 0.1;
            color[2] = color[2] + 0.2 > 1.0 ? 0 : color[2] + 0.2;
            model.getRect().setFill(Color.color(color[0], color[1], color[2]));
        }));
    }

    private Timeline createTranslateTimeline() {
        return new Timeline(new KeyFrame(Duration.millis(100), e -> {
            model.getRect().setRotate(model.getRect().getRotate() + 10);
            double newX = model.getRect().getTranslateX() + 5;
            if (newX > model.getRect().getParent().getLayoutBounds().getWidth()) {
                newX = -model.getRect().getWidth();
            }
            model.getRect().setTranslateX(newX);
        }));
    }







        Button startButton = new Button("Start");
        startButton.setOnAction(e -> {
            TranslateTransition moveBunny = new TranslateTransition(Duration.seconds(2), bunnyView);
            moveBunny.setFromX(scene.getWidth() - bunnyView.getFitWidth());
            moveBunny.setToX(0);
            moveBunny.setCycleCount(Animation.INDEFINITE);

            Timeline hopBunny = new Timeline(new KeyFrame(Duration.seconds(0.2), ev -> {
                bunnyView.setY(bunnyView.getY() == 0 ? 30 : 0);
            }));
            hopBunny.setCycleCount(Animation.INDEFINITE);

            moveBunny.play();
            hopBunny.play();
        });

        root.getChildren().addAll(bunnyView, startButton);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}*/