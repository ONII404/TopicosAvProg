package app.components;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ONII404
 */
public class Conexion {

    private Connection con;
    private final String URL = "jdbc:mysql://localhost:3306/",
            DB = "TopAvProg",
            USER = "root",
            PASSWORD = "Br3nd@100",
            DRIVER = "com.mysql.cj.jdbc.Driver"; // En desuso:  com.mysql.jdbc.Driver

    public void open() {
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL + DB, USER, PASSWORD);
            System.out.println("Conectado");
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public void close() {
        try {
            con.close();
            System.out.println("Desconectado");
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public Connection getConnection() {
        return con;
    }
}
