/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog_bd.EJERCICIO_14_10_AMPLIADO;

import java.util.*;
import java.sql.*;

public class Main {

    public static void main(String[] args) {
        
    }
    
    static Connection connextion () {
        
        String url = "jdbc:oracle:thin:@//localhost:1521/XEPDB_M";
        Connection con = null;
        
        try {
             con = DriverManager.getConnection(url, "alumno", "alumno2526");
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return con;
        
    }
    

    }
    
}
