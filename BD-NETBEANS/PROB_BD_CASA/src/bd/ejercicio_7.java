/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bd;

import java.util.*;
import java.sql.*;

public class ejercicio_7 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        String url;
        String sql;
        ResultSet rs;
        
        url = "jdbc:oracle:thin:@//localhost:1521/XE";
        
        try (
                Connection con = DriverManager.getConnection(url, "C##alumno5", "alumno2526");
                Statement sentencia = con.createStatement();
                ){
            System.out.println("introduce nombre: ");
            String nombre = sc.nextLine();
            
            sql = "DELETE FROM ALUMNOS WHERE NOMBRE = '" + nombre + "'";
            
            System.out.println(sql);
            
            sentencia.execute(sql);
            
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
    }
    
}
