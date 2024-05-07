package ru.ixsys.freight;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.StackPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class RootLayoutController implements Initializable {

    @FXML
    private StackPane contentArea;

    @FXML
    private JFXButton routeButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            Parent fxml = FXMLLoader.load(getClass().getResource("view/transportation.fxml"));
            contentArea.getChildren().removeAll();
            contentArea.getChildren().setAll(fxml);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void home(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent fxml = FXMLLoader.load(getClass().getResource("view/transportation.fxml"));
        contentArea.getChildren().removeAll();
        contentArea.getChildren().setAll(fxml);
//        routeButton.setStyle("-fx-background-color: slateblue; -fx-text-fill: white;");
    }

    public void page1(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent fxml = FXMLLoader.load(getClass().getResource("view/routes.fxml"));
        contentArea.getChildren().removeAll();
        contentArea.getChildren().setAll(fxml);
    }

//    @FXML
//    public void page1(MouseEvent event) {
//        System.out.println("afdsafas");
//    }

    public void page2(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent fxml = FXMLLoader.load(getClass().getResource("view/page2.fxml"));
        contentArea.getChildren().removeAll();
        contentArea.getChildren().setAll(fxml);
    }
    public void page3(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent fxml = FXMLLoader.load(getClass().getResource("view/page3.fxml"));
        contentArea.getChildren().removeAll();
        contentArea.getChildren().setAll(fxml);
    }
}
