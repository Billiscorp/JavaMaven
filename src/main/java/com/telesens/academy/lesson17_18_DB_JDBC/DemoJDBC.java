package com.telesens.academy.lesson17_18_DB_JDBC;

import com.telesens.academy.lesson16_File.PropertyDemo;

import java.sql.*;

public class DemoJDBC {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(PropertyDemo.readProperty("jdbc.url"));
            Statement statement = conn.createStatement();
            /*statement.executeUpdate(
                    "INSERT INTO subscriber VALUES(777, 35, 'Агнесса', 'f', 'Александрова')"); // id, age, first_name, gender, last_name*/
            statement.executeUpdate("DELETE FROM subscriber WHERE first_name = 'Агнесса'");
            ResultSet rs = statement.executeQuery("select * FROM subscriber where first_name = 'Агнесса' ");
//            ResultSet rs = statement.executeQuery("select * FROM subscriber");
            while (rs.next()) {
                int id = rs.getInt("id");
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                String gender = rs.getString("gender");
                int age = rs.getInt("age");
               /* System.out.println(String.format("%d| %-15s| %-15s",
                        id, firstName, lastName));*/
                System.out.println(String.format("%d| %-15s| %-15s| %s| %d",
                        id, firstName, lastName, gender, age));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
