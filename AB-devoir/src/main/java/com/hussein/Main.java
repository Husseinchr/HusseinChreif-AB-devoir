package com.hussein;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5433/Hussein-Chreif";
        String user = "postgres";
        String password = "postgres";

        System.out.println("JDBC PostgreSQL test - Hussein");

        try (
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users")) {
            System.out.println("Connected successfully!");

            while (rs.next()) {
                System.out.println(
                        "ID: " + rs.getInt("id") +
                                " | Name: " + rs.getString("name"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
