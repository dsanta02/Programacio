/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog_bd;

import java.util.*;
import java.sql.*;
import java.util.Date;

public class ejercicio14_4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        ResultSet rs; // se pone fura del resorcesw del try 
        String sql;
        
        String url = "jdbc:oracle:thin:@//localhost:1521/XEPDB_M";
        
        try (
                Connection con = DriverManager.getConnection(url, "alumno", "alumno2526");
                Statement sentencia = con.createStatement();
                ){
            System.out.println("escriba un curso:");
            String curso = sc.nextLine();
            
            sql = "SELECT nombre, fnac "
                    + "FROM alumnos WHERE CURSO = " + "'" + curso + "'";
            
            rs = sentencia.executeQuery(sql); // usamos la sentencia que es la q ejecuta
            // la sentencia que ponemos en el sql, la usamos con rs lpor que es una consulta
            
            System.out.println("lista de alumnos");
            
            
            while (rs.next()) { //con este leemos todos los datos 
                String nombre = rs.getNString("nombre"); // y con esto los vamos sacandp
                Date fecha = rs.getDate("FNAC");
                System.out.println("Alumno: " + nombre + " nacimiento: " + fecha);
            }
            
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
