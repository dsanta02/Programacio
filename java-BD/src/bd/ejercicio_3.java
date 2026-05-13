/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Locale;
import java.util.Scanner;

public class ejercicio_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        String url = "jdbc:oracle:thin:@//localhost:1521/XE";
        String sql;

        try (Connection con = DriverManager.getConnection(url, "SYSTEM", "4341");
             Statement sentencia = con.createStatement()) {

            System.out.println("numero de alumno:");
            int num = sc.nextInt();

            sql = "DELETE FROM alumnos WHERE num = " + num;

            int filas = sentencia.executeUpdate(sql);

            System.out.println("Filas eliminadas: " + filas);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
