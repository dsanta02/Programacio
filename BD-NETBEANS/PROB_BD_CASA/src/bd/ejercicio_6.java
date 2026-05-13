/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bd;

import java.util.*;
import java.sql.*;

public class ejercicio_6 {

    public static void main(String[] args) {
        
        String url;
        String sql;
        ResultSet rs;
        
        url = "jdbc:oracle:thin:@//localhost:1521/XE";
        
        try (
                Connection con = DriverManager.getConnection(url, "C##alumno5", "alumno2526");
                Statement sentencia = con.createStatement(
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_READ_ONLY
                    )
                ){
            
            sql = "SELECT NOMBRE, MEDIA FROM ALUMNOS ORDER BY MEDIA";
            
            rs = sentencia.executeQuery(sql);
            
            while (rs.next()) {
                String nombre = rs.getString("NOMBRE");
                Double media = rs.getDouble("MEDIA");
                
                System.out.println("nombre: " + nombre + " media: " + media);
            }
            
            rs.first();
            String nombre = rs.getString("NOMBRE");
            Double media = rs.getDouble("MEDIA");
            
            System.out.println("alumno con menor media: ");
            System.out.println("nombre: " + nombre + " media " + media);
            
            rs.last();
            String nombre2 = rs.getString("NOMBRE");
            Double media2 = rs.getDouble("MEDIA");
            
            System.out.println("alumno con menor media: ");
            System.out.println("nombre: " + nombre2 + " media " + media2);
            
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
    }
    
}
