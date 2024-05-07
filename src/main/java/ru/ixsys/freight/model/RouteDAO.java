package ru.ixsys.freight.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import ru.ixsys.freight.util.DBUtil;


import java.sql.ResultSet;
import java.sql.SQLException;

public class RouteDAO {

    //*******************************
    //SELECT an Route
    //*******************************
    public static Route searchRoute (String routeId) throws SQLException, ClassNotFoundException {
        //Declare a SELECT statement
        String selectStmt = "SELECT * FROM employees WHERE employee_id=" + routeId;

        //Execute SELECT statement
        try {
            //Get ResultSet from dbExecuteQuery method
            ResultSet rsEmp = DBUtil.dbExecuteQuery(selectStmt);

            //Send ResultSet to the getEmployeeFromResultSet method and get employee object
            Route route = getRouteFromResultSet(rsEmp);

            //Return route object
            return route;
        } catch (SQLException e) {
            System.out.println("While searching an employee with " + routeId + " id, an error occurred: " + e);
            //Return exception
            throw e;
        }
    }

    //Use ResultSet from DB as parameter and set Employee Object's attributes and return employee object.
    private static Route getRouteFromResultSet(ResultSet rs) throws SQLException
    {
        Route route = null;
        if (rs.next()) {
            route = new Route();
            route.setRoute_id(rs.getInt("ROUTE_ID"));
            route.setSending_address(rs.getString("SENDING_ADDRESS"));
            route.setDelivery_address(rs.getString("DELIVERY_ADDRESS"));
        }
        return route;
    }

    //*******************************
    //SELECT Employees
    //*******************************
    public static ObservableList<Route> searchRoutes () throws SQLException, ClassNotFoundException {
        //Declare a SELECT statement
        String selectStmt = "SELECT * FROM routes";

        //Execute SELECT statement
        try {
            //Get ResultSet from dbExecuteQuery method
            ResultSet rsRoutes = DBUtil.dbExecuteQuery(selectStmt);

            //Send ResultSet to the getEmployeeList method and get employee object
            ObservableList<Route> routeList = getRouteList(rsRoutes);

            //Return employee object
            return routeList;
        } catch (SQLException e) {
            System.out.println("SQL select operation has been failed: " + e);
            //Return exception
            throw e;
        }
    }

    //Select * from employees operation
    private static ObservableList<Route> getRouteList(ResultSet rs) throws SQLException, ClassNotFoundException {
        //Declare a observable List which comprises of Employee objects
         ObservableList<Route> routeList = FXCollections.observableArrayList();

        while (rs.next()) {
            Route route = new Route();
            route.setRoute_id(rs.getInt("ROUTE_ID"));
            route.setSending_address(rs.getString("SENDING_ADDRESS"));
            route.setDelivery_address(rs.getString("delivery_address"));
            //Add employee to the ObservableList
            routeList.add(route);
        }
        //return empList (ObservableList of Employees)
        return routeList;
    }
//
//    //*************************************
//    //UPDATE an employee's email address
//    //*************************************
//    public static void updateEmpEmail (String empId, String empEmail) throws SQLException, ClassNotFoundException {
//        //Declare a UPDATE statement
//        String updateStmt =
//                "BEGIN\n" +
//                        "   UPDATE employees\n" +
//                        "      SET EMAIL = '" + empEmail + "'\n" +
//                        "    WHERE EMPLOYEE_ID = " + empId + ";\n" +
//                        "   COMMIT;\n" +
//                        "END;";
//
//        //Execute UPDATE operation
//        try {
//            DBUtil.dbExecuteUpdate(updateStmt);
//        } catch (SQLException e) {
//            System.out.print("Error occurred while UPDATE Operation: " + e);
//            throw e;
//        }
//    }
//
//    //*************************************
//    //DELETE an employee
//    //*************************************
//    public static void deleteEmpWithId (String empId) throws SQLException, ClassNotFoundException {
//        //Declare a DELETE statement
//        String updateStmt =
//                "BEGIN\n" +
//                        "   DELETE FROM employees\n" +
//                        "         WHERE employee_id ="+ empId +";\n" +
//                        "   COMMIT;\n" +
//                        "END;";
//
//        //Execute UPDATE operation
//        try {
//            DBUtil.dbExecuteUpdate(updateStmt);
//        } catch (SQLException e) {
//            System.out.print("Error occurred while DELETE Operation: " + e);
//            throw e;
//        }
//    }
//
//    //*************************************
//    //INSERT an employee
//    //*************************************
//    public static void insertEmp (String name, String lastname, String email) throws SQLException, ClassNotFoundException {
//        //Declare a DELETE statement
//        String updateStmt =
//                "BEGIN\n" +
//                        "INSERT INTO employees\n" +
//                        "(EMPLOYEE_ID, FIRST_NAME, LAST_NAME, EMAIL, HIRE_DATE, JOB_ID)\n" +
//                        "VALUES\n" +
//                        "(sequence_employee.nextval, '"+name+"', '"+lastname+"','"+email+"', SYSDATE, 'IT_PROG');\n" +
//                        "END;";
//
//        //Execute DELETE operation
//        try {
//            DBUtil.dbExecuteUpdate(updateStmt);
//        } catch (SQLException e) {
//            System.out.print("Error occurred while DELETE Operation: " + e);
//            throw e;
//        }
//    }
}
