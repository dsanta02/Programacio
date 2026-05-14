/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog_bd;

import java.sql.*;
import java.util.*;

public class ListadoInteractivo {

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@//localhost:1521/XEPDB_M";

        try (
                Connection con = DriverManager.getConnection(url, "alumno", "alumno2526");
                Scanner sc = new Scanner(System.in)
        ) {

            String respuesta = "S";

            while (respuesta.equalsIgnoreCase("S")) {

                int oficina = -1;
                String ciudad;

                // 2. ciudad válida
                do {
                    System.out.println("Introduce ciudad: ");
                    ciudad = sc.nextLine();

                    oficina = buscarOficina(con, ciudad);

                    if (oficina == -1) {
                        System.out.println("No existe oficina en esa ciudad");
                    }

                } while (oficina == -1);

                // 3 y 4. empleados + resumen
                mostrarEmpleados(con, oficina, ciudad);

                // 5. repetir
                System.out.println("¿Deseas consultar otra ciudad? (S/N)");
                respuesta = sc.nextLine();

            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // --------------------------------------------------

    static int buscarOficina(Connection con, String ciudad) throws SQLException {

        String sql = "SELECT OFICINA FROM OFICINAS2526 WHERE CIUDAD = ?";

        try (PreparedStatement sentencia = con.prepareStatement(sql)) {

            sentencia.setString(1, ciudad);

            ResultSet rs = sentencia.executeQuery();

            if (rs.next()) {
                return rs.getInt("OFICINA");
            } else {
                return -1;
            }
        }
    }

    // --------------------------------------------------

    static void mostrarEmpleados(Connection con, int numOficina, String ciudad) throws SQLException {

        String sql = "SELECT NOMBRE, EDAD, PUESTO FROM EMPLEADOS2526 WHERE OFICINA = ?";

        try (PreparedStatement sentencia = con.prepareStatement(sql)) {

            sentencia.setInt(1, numOficina);

            ResultSet rs = sentencia.executeQuery();

            System.out.println("\n--- Empleados en " + ciudad + " (oficina " + numOficina + ") ---");

            int total = 0;

            String masJovenNombre = "";
            int masJovenEdad = Integer.MAX_VALUE;

            String masViejNombre = "";
            int masViejEdad = Integer.MIN_VALUE;

            int sumaEdades = 0;

            while (rs.next()) {

                String nombre = rs.getString("NOMBRE");
                int edad = rs.getInt("EDAD");
                String puesto = rs.getString("PUESTO");

                System.out.println("Nombre: " + nombre + " | Edad: " + edad + " | Puesto: " + puesto);

                total++;
                sumaEdades += edad;

                if (edad < masJovenEdad) {
                    masJovenEdad = edad;
                    masJovenNombre = nombre;
                }

                if (edad > masViejEdad) {
                    masViejEdad = edad;
                    masViejNombre = nombre;
                }
            }

            System.out.println("\n--- Resumen ---");

            if (total == 0) {
                System.out.println("No hay empleados en esta oficina");
                return;
            }

            double media = (double) sumaEdades / total;

            System.out.println("Total de empleados : " + total);
            System.out.println("Más joven : " + masJovenNombre + " (" + masJovenEdad + " años)");
            System.out.println("Más veterano : " + masViejNombre + " (" + masViejEdad + " años)");
            System.out.println("Media de edad : " + String.format(Locale.US, "%.1f", media) + " años");
        }
    }
}