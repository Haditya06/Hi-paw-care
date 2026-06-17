/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataBase;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Dit
 */
public class dataBaseConnection {
    private static final String URL ="jdbc:mysql://localhost:3306/hazzelnut";

    private static final String USER = "root";
    private static final String PASSWORD = "";
    public static Connection getConnection() {

        try {

            return DriverManager.getConnection(URL,USER,PASSWORD);
        } catch (SQLException e) {
            System.out.println("Koneksi gagal : "+ e.getMessage());
            return null;
        }
    }
}
