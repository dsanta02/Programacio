/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog_bd;

import java.sql.*;
import java.util.*;

public class EJERCICIO13_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        String url = "jdbc:oracle:thin:@//localhost:1521/XEPDB_M";
        String sql;
        try (Connection con = DriverManager.getConnection(url, "alumno", "alumno2526");
                Statement sentencia = con.createStatement();
                ){
            System.out.println("numero de alumno:");
            int num = sc.nextInt();
            
            sql = sql = "DELETE FROM alumnos WHERE num = " + num;
            sentencia.execute(sql);
            
            System.out.println("alumno eliminado");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
