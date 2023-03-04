 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.controlador;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    public static Connection getConexion() {
        Connection conexion = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String servidor = "jdbc:mysql://localhost:3306/procesadorarosasbimal?serverTimezone=UTC";
            String usuarioDB="root";
            String passwordDB="Kuro_Side666";
            conexion = DriverManager.getConnection(servidor,usuarioDB,passwordDB);
            System.out.println("Conexion Exitosa");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error en la conexión a la base de datos: " + e.getMessage());
        }
        return conexion;
    }
}