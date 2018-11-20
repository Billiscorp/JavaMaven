package com.telesens.academy.lesson17_18_DB_JDBC.homework17_18.dao.jdbc;

import java.sql.*;

public class TestJDBC {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // подключаем драйвер
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mobile?user=billiscorp&password=12345678&serverTimezone=UTC&useSSL=false&characterEncoding=UTF-8");
            Statement statement = conn.createStatement();
            statement.executeUpdate(
                    "INSERT INTO subscriber VALUES(456, 35, 'Агнесса', 'f', 'Александрова')"); // id, age, first_name, gender, last_name
          /*  statement.executeUpdate(
                    "UPDATE abonent SET first_name='Петр', last_name='Наливайченко' WHERE abonent_id=7");*/

//            statement.executeUpdate("DELETE FROM subscriber WHERE id=342");

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

//            statement.executeUpdate("DELETE FROM abonent WHERE abonent_id=7");

            rs.close(); // закрываем рессурсы
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
