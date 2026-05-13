/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bd;

import java.util.*;
import java.sql.*;
import java.util.Date;

public class ejercicio_4 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String sql;
        String url;
        ResultSet rs; // una vez hecha la consulta aqui se guardan los datos
        
        url = "jdbc:oracle:thin:@//localhost:1521/XE";
        
        try (
                Connection con = DriverManager.getConnection(url, "C##alumno5", "alumno2526");
                Statement sentencia = con.createStatement() //permite enviar instrucciones sql
                ){
            
            System.out.println("selecciona el curso: ");
            String curso = sc.nextLine();
            
            sql = "SELECT NOMBRE, FNAC FROM ALUMNOS WHERE CURSO = '" + curso + "'";
            
            rs = sentencia.executeQuery(sql);
            
            System.out.println("lista de alumnos: ");
            
            while (rs.next()) { // con esto recorremos la tabla
                String nom = rs.getNString("nombre");
                Date fecha = rs.getDate("fnac");
                
                System.out.println("fecha de nacimiento: " + fecha + " nombre: " + nom);
            }
            
            
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
    }
    
}
