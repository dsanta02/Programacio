/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog_bd;

import java.util.*;
import java.sql.*;

public class ejercicio14_9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        String url;

        url = "jdbc:oracle:thin:@//localhost:1521/XEPDB_M";

        try (
                Connection con = DriverManager.getConnection(url, "alumno", "alumno2526");
        ) {

            System.out.println("Alumnos con bien:");

            alumnosXnota(con, 6, 7);
            
            System.out.println("Lumnos con notable: ");
            
            alumnosXnota(con, 7, 9);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    static void alumnosXnota(Connection con, double n1, double n2) {

        String sql = "SELECT NOMBRE, MEDIA "
                + "FROM ALUMNOS "
                + "WHERE MEDIA >= ? AND MEDIA < ? "
                + "ORDER BY MEDIA ASC";

        ResultSet rs;

        try (
                PreparedStatement sentencia = con.prepareStatement(sql);
        ) {

            sentencia.setDouble(1, n1);
            sentencia.setDouble(2, n2);

            rs = sentencia.executeQuery();

            while (rs.next()) {
                System.out.println(
                        rs.getString("NOMBRE") + " " +
                        rs.getDouble("MEDIA")
                );
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

}