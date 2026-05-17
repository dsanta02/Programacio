/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bd;

import java.util.*;
import java.sql.*;


public class ListadoInteractivo_2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String url = "jdbc:oracle:thin:@//localhost:1521/XE";
        
        String ciudad;
        int numOficina;
        String respuesta;
        
        try (
                Connection con = DriverManager.getConnection(url, "C##alumno5", "alumno2526")
                ){
            
        do {    
            
            do {
                
                System.out.println("introduce una ciudad: ");
                ciudad = sc.nextLine();
                
                numOficina = buscarOfi(con, ciudad);
                
                if(numOficina == -1) {
                    
                    System.out.println("no existe ninguna oficina en esa ciudad");
                    
                }
                
                
            }while(numOficina == -1);
            
            mostrarEmple(ciudad, numOficina, con);
            
            ResumenEstadistico(con, numOficina);
            
            System.out.println("desea consultar otra ciudad: (S/N)");
            respuesta = sc.nextLine().toUpperCase();
            
        }while (respuesta.equals("S"));
        
            System.out.println("programa finalizado");
            
            
        } catch (SQLException e) {
            
            System.out.println(e.getMessage());
            
        }
                
                
    }
    
    static int buscarOfi(Connection con, String ciudad) {
        
        String sql = "SELECT OFICINA FROM OFICINAS2526 "
                + " WHERE CIUDAD = ?";
        
        ResultSet rs;
        
        try (
                PreparedStatement sentencia = con.prepareStatement(sql)
                ){
            
            sentencia.setString(1, ciudad);
            
            rs = sentencia.executeQuery();
            
           if(rs.next()) {
               return (rs.getInt("oficina"));
           }
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return -1;
        
    }
    


    static void mostrarEmple (String ciudad, int numOficina, Connection con) {
        
        String sql = "SELECT NOMBRE, EDAD, PUESTO FROM EMPLEADOS2526"
                + " WHERE OFICINA = ?";
        
        ResultSet rs;
        
        try (
                PreparedStatement sentencia = con.prepareStatement(sql)
                ){
            
            sentencia.setInt(1, numOficina);
            
            rs = sentencia.executeQuery();
            
            System.out.println("empleados en " + ciudad + " ( oficina " + numOficina + " ) ");

            
            while(rs.next()) {
                
                
                System.out.println("nombre: " + rs.getString("NOMBRE") + " || " + rs.getInt("EDAD") + " || " + rs.getString("PUESTO"));
                              
            }
            
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    static void ResumenEstadistico(Connection con, int numOficina) {

    String sql =
            "SELECT NOMBRE, EDAD "
            + "FROM EMPLEADOS2526 "
            + "WHERE OFICINA = ? "
            + "ORDER BY EDAD ASC";

    try (
        PreparedStatement sentencia = con.prepareStatement(
                sql,
                ResultSet.TYPE_SCROLL_INSENSITIVE,  //cuando queramos mover el cursor se 
                ResultSet.CONCUR_READ_ONLY  //usa estos metodos del result set
        )
    ) {

        sentencia.setInt(1, numOficina);

        ResultSet rs = sentencia.executeQuery();

        rs.first(); //cursor primera posicion
        String jovenNom = rs.getString("NOMBRE");
        int jovenEdad = rs.getInt("EDAD");

        
        rs.last(); //cursor ultima posicion
        String viejoNom = rs.getString("NOMBRE");
        int viejoEdad = rs.getInt("EDAD");


        rs.beforeFirst(); //te situal en la posicion inical antes del primero
                          //como te has moivido tienes que recolocarte

        int total = 0;
        int suma = 0;
        int edad = 0;

        while (rs.next()) {
            total++;
            edad = rs.getInt("EDAD");
            suma = suma + edad;
        }

        System.out.println("\n--- RESUMEN ---");
        System.out.println("Total: " + total);

        System.out.println(
                "Más joven: " + jovenNom + " (" + jovenEdad + ")"
        );

        System.out.println(
                "Más viejo: " + viejoNom + " (" + viejoEdad + ")"
        );

        System.out.println(
                "Media: " + (double) suma / total
        );

    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
}
    

}
