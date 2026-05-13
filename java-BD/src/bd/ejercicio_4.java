/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Locale;
import java.util.Scanner;

public class ejercicio_4 {

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@//localhost:1521/XE";
        String sql;

        Scanner teclado = new Scanner(System.in);

        try (Connection con = DriverManager.getConnection(url, "SYSTEM", "4341");
             Statement sentencia = con.createStatement()) {

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

            sentencia.executeUpdate(sql);

            System.out.println("se ha insertado el nuevo alumno");

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }
    }
}
