/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog_bd;

import java.sql.*;
import java.util.*;

public class ejercicio14_2 {
    
    public static void main(String[] args) {
        
    
    
        String url = "jdbc:oracle:thin:@//localhost:1521/XEPDB_M";
        String sql;

        Scanner teclado = new Scanner(System.in);

        try (Connection con = DriverManager.getConnection(url, "alumno", "alumno2526");
             //con el CONNECTIO CREAMOS LA CONEXIO
            Statement sentencia = con.createStatement()) {
             //con.CREATESTATMENT  se hace los SELECT
            System.out.println("numero de alumno");
            int num = teclado.nextInt();
            teclado.nextLine();

            System.out.println("nombre");
            String nombre = teclado.nextLine();

            System.out.println("fecha de nacimiento: ");
            String fnac = teclado.nextLine();

            System.out.println("media: ");
            Double media = teclado.useLocale(Locale.US).nextDouble();
            teclado.nextLine();

            System.out.println("curso: ");
            String curso = teclado.nextLine();

            sql = "INSERT INTO Alumnos(num, nombre, fnac, media, curso) " +
                  "VALUES (" + num + ", '" + nombre + "', " +
                  "TO_DATE('" + fnac + "', 'YYYY-MM-DD'), " +
                  media + ", '" + curso + "')";

            sentencia.executeUpdate(sql); //ejecuta una instruccion en el sql 
            //REALIZA LA SENTENCIA DE ARRIBA QUE ESTA ENTRE PARENTESIS

            System.out.println("se ha insertado el nuevo alumno");

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

    }
}
