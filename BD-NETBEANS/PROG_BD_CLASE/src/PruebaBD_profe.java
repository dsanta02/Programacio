/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PruebaBD_profe {
    
    public static void main(String[] args) {
        Connection con = null;
        Statement sentencia;
        ResultSet rs;
        String sql = "select * from alumnos2526";
        String url = "jdbc:oracle:thin:@//localhost:1521/XEPDB_M";//Puerto 1521 y Service Name XEPDB1
        try {
            con = DriverManager.getConnection(url, "profe", "profe");//Conecta con usuario profe y contraseña profe
            sentencia = con.createStatement();
            rs = sentencia.executeQuery(sql);
            while (rs.next()) { 
                System.out.println(rs.getString("NOMBRE"));
            }
            
            con.close(); //cerramos la conexión
        } catch (SQLException ex) {
            System.out.println("Ha ocurrido algún error. ");
            System.out.println(ex);
        }
    }
}
