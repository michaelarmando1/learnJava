package com.michael.learnjava.ch10_database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Connect {
    public static void main(String... args) {
        driverManager();
    }

    private static void driverManager() {
        String URL = "jdbc:postgresql://localhost/learnjava";

        // CREATING OUR PROPERTIES
        Properties prop = new Properties();
        prop.put("user", "student");
        // prop.put ("password", "3680");
        try {
            Connection conn = DriverManager.getConnection(URL, prop);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
