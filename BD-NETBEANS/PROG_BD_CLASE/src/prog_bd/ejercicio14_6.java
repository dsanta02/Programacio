/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog_bd;

import java.util.*;
import java.sql.*;

public class ejercicio14_6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        String url;
        ResultSet rs;
        String sql;

        url = "jdbc:oracle:thin:@//localhost:1521/XEPDB_M";

        try (
            Connection con = DriverManager.getConnection(url, "alumno", "alumno2526");
            Statement sentencia = con.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
                //tipo de resultado, concurrencia
        ) {

            sql = "SELECT NOMBRE, MEDIA FROM ALUMNOS ORDER BY MEDIA ASC";

            rs = sentencia.executeQuery(sql);

            // imprimir todos
            while (rs.next()) {
                System.out.println(rs.getString("nombre") + " - " + rs.getDouble("media"));
            }

            // mejor volver al inicio explícitamente
            rs.first();

            String nombreMin = rs.getString("nombre");
            double mediaMin = rs.getDouble("media");

            System.out.println("nota mas baja: " + mediaMin + " del alumno " + nombreMin);

            rs.last();

            String nombreMax = rs.getString("nombre");
            double mediaMax = rs.getDouble("media");

            System.out.println("nota mas alta: " + mediaMax + " del alumno " + nombreMax);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}