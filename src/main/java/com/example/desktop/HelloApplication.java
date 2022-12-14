package com.example.desktop;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        ScrollPane scrollPane = fxmlLoader.load();
        scrollPane.setFitToHeight(true);
        scrollPane.setFitToWidth(true);
        Scene scene = new Scene(scrollPane);
        stage.setTitle("Sample JavaFX application");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}