/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog_bd;

import java.util.*;
import java.sql.*;

public class ejercicio14_8 {

    public static void main(String[] args) {
        
        //CON PREPARED STATEMENT SQL ANTES DE MKETERLO EN EL SOURCES
        
        Scanner sc = new Scanner (System.in).useLocale(Locale.US);
        
        String url;
        String sql;
        ResultSet rs;
        
        url = "jdbc:oracle:thin:@//localhost:1521/XEPDB_M";
        
        sql = "SELECT * FROM ALUMNOS WHERE CURSO = ? AND MEDIA > ?";
        
        try (
                Connection con = DriverManager.getConnection(url, "alumno", "alumno2526");
                PreparedStatement sentencia = con.prepareStatement(sql);
                ){
            
            
            System.out.println("inreoduce el curso: ");
            String curso = sc.nextLine();
            
            System.out.println("introduce la media: ");
            Double media = sc.nextDouble();
            
            sentencia.setString(1, curso);
            sentencia.setDouble(2, media);
            
            rs = sentencia.executeQuery();
            
            while (rs.next())  {
                System.out.println(rs.getString("nombre") + " " + rs.getDouble("media"));
            }
            
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
    }
    
}
