package com.michael.learnjava.ch10_database;

import java.sql.*;
import java.util.Properties;

public class Crud {
    public static void main(String... args) {
        execute();
    }

    private static void execute() {
        //cleanTablePerson();
        executeInsert();
        //executeUpdate();
        //executeDelete();
    }

    private static void cleanTablePerson() {
        System.out.println("\ncleanTablePerson():");
        Connection conn = getConnection();
        try (conn; Statement st = conn.createStatement()) {
            //
            st.execute("delete from person");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    private static Connection getConnection() {
        // CREATE STRING TO CONTAIN OUR HOST URL
        String URL = "jdbc:postgresql://localhost/learnjava";
        Properties prop = new Properties();
        prop.put("user", "student");
        prop.put ("password", "3680");

        try {
            // code to connect to our postgres database
            return DriverManager.getConnection(URL, prop);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }


    private static void executeInsert() {
        System.out.println("\nexecuteInsert():");
        String sql = "insert into person (first_name, last_name, dob)" + " values ('Bill', 'Grey', '1980-01-27')";
        Connection conn = getConnection();
        try (conn; Statement st = conn.createStatement()) {
            System.out.println(st.execute(sql));             //prints: false
            System.out.println(st.getResultSet() == null);   //prints: true
            System.out.println(st.getUpdateCount());         //prints: 1
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        System.out.println(selectAllFirstNames());           //prints: Bill

    }

    private static void executeUpdate() {
        System.out.println("\nexecuteUpdate():");
        String sql = "update person set first_name = 'Adam'";
        Connection conn = getConnection();
        try (conn; Statement st = conn.createStatement()) {
            System.out.println(st.execute(sql));             //prints: false
            System.out.println(st.getResultSet() == null);   //prints: true
            System.out.println(st.getUpdateCount());         //prints: 1
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        System.out.println(selectAllFirstNames());           //prints: Adam
    }

    private static void executeDelete() {
        System.out.println("\nexecuteDelete():");
        String sql = "delete from person";
        Connection conn = getConnection();
        try (conn; Statement st = conn.createStatement()) {
            System.out.println(st.execute(sql));             //prints: false
            System.out.println(st.getResultSet() == null);   //prints: true
            System.out.println(st.getUpdateCount());         //prints: 1
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        System.out.println(selectAllFirstNames());           //prints:
    }

    private static String selectAllFirstNames() {
        String result = "";
        Connection conn = getConnection();
        try (conn; Statement st = conn.createStatement()) {
            ResultSet rs = st.executeQuery("select first_name from person");
            while (rs.next()) {
                result += rs.getString(1) + " ";
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return result;
    }


}
