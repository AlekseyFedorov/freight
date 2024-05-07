package ru.ixsys.freight;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
//    double x, y;
    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("view/freight_main.fxml"));
//        FXLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("freight_main.fxml"));
        stage.setScene(new Scene(fxmlLoader.load(), 1200, 640));
        stage.setTitle("Лабораторная работа !");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}