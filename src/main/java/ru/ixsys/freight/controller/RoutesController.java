package ru.ixsys.freight.controller;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import ru.ixsys.freight.model.Route;
import ru.ixsys.freight.model.RouteDAO;

import java.sql.SQLException;

public class RoutesController {

    @FXML
    private TableView routesTable;

    @FXML
    private TableColumn<Route, Integer> routeIdColumn;

    @FXML
    private TableColumn<Route, String>  routeSendingAddress;

    @FXML
    private TableColumn<Route, String>  routeDeliveryAddress;

    //Search all routes
    @FXML
    public void getAllRoutes(ActionEvent actionEvent) throws SQLException, ClassNotFoundException {
        System.out.println("getAllRoutes\n");
        try {
        //Get all Employees information
        ObservableList<Route> routesData = RouteDAO.searchRoutes();
        //Populate Employees on TableView
        populateRoutes(routesData);
    } catch (SQLException e) {
            System.out.println("Error occurred while getting employees information from DB.\n" + e);
            throw e;
        }
    }

    //Populate Routes for TableView
    @FXML
    private void populateRoutes (ObservableList<Route> routesData) throws ClassNotFoundException {
        //Set items to the RoutesTable
        routesTable.setItems(routesData);
    }
}
