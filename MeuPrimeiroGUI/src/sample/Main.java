package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        GridPane root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        root.setAlignment(Pos.CENTER);
        root.setHgap(16.0);
        root.setVgap(16.0);

        Label label = new Label();
        label.setText("Ola Mundo JavaFX!");

        root.getChildren().add(label);
        label.setTextFill(Color.BLUEVIOLET);
        label.setFont(Font.font("Comic Sans",70.0 ));

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
