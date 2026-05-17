/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ListadoInteractivo {

    // DATOS DE CONEXIÓN (cambiar por los de la profesora)
    private static final String URL = "jdbc:mysql://localhost:3306/empresa";
    private static final String USER = "root";
    private static final String PASSWORD = "1234";

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD)) {

            System.out.println("Conexión realizada correctamente.");

            String respuesta;

            do {

                int numOficina = -1;
                String ciudad;

                // PEDIR CIUDAD HASTA QUE SEA VÁLIDA
                do {
                    System.out.print("\nIntroduce una ciudad: ");
                    ciudad = teclado.nextLine();

                    numOficina = buscarOficina(con, ciudad);

                    if (numOficina == -1) {
                        System.out.println("No existe ninguna oficina en esa ciudad.");
                    }

                } while (numOficina == -1);

                // MOSTRAR EMPLEADOS Y RESUMEN
                mostrarEmpleados(con, numOficina, ciudad);

                // REPETICIÓN
                System.out.print("\n¿Deseas consultar otra ciudad? (S/N): ");
                respuesta = teclado.nextLine().toUpperCase();

            } while (respuesta.equals("S"));

            System.out.println("Programa finalizado.");

        } catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }

        teclado.close();
    }

    // BUSCAR OFICINA POR CIUDAD
    public static int buscarOficina(Connection con, String ciudad) throws SQLException {

        String sql = "SELECT num_oficina FROM Oficinas2526 WHERE ciudad = ?";

        try (PreparedStatement sentencia = con.prepareStatement(sql)) {

            sentencia.setString(1, ciudad);

            try (ResultSet resultado = sentencia.executeQuery()) {

                if (resultado.next()) {
                    return resultado.getInt("num_oficina");
                }
            }
        }

        return -1;
    }

    // MOSTRAR EMPLEADOS Y RESUMEN
    public static void mostrarEmpleados(Connection con, int numOficina, String ciudad)
            throws SQLException {

        String sql = """
                SELECT nombre, edad, puesto
                FROM Empleados2526
                WHERE oficina = ?
                """;

        try (PreparedStatement sentencia = con.prepareStatement(sql)) {

            sentencia.setInt(1, numOficina);

            try (ResultSet resultado = sentencia.executeQuery()) {

                System.out.println("\n--- Empleados en " + ciudad +
                        " (oficina " + numOficina + ") ---");

                int totalEmpleados = 0;
                int sumaEdades = 0;

                String nombreJoven = "";
                int edadJoven = Integer.MAX_VALUE;

                String nombreVeterano = "";
                int edadVeterano = Integer.MIN_VALUE;

                while (resultado.next()) {

                    String nombre = resultado.getString("nombre");
                    int edad = resultado.getInt("edad");
                    String puesto = resultado.getString("puesto");

                    System.out.println("Nombre: " + nombre
                            + " | Edad: " + edad
                            + " | Puesto: " + puesto);

                    // ESTADÍSTICAS
                    totalEmpleados++;
                    sumaEdades += edad;

                    // MÁS JOVEN
                    if (edad < edadJoven) {
                        edadJoven = edad;
                        nombreJoven = nombre;
                    }

                    // MÁS VETERANO
                    if (edad > edadVeterano) {
                        edadVeterano = edad;
                        nombreVeterano = nombre;
                    }
                }

                // RESUMEN
                if (totalEmpleados > 0) {

                    double mediaEdad =
                            (double) sumaEdades / totalEmpleados;

                    System.out.println("\n--- Resumen ---");
                    System.out.println("Total de empleados : " + totalEmpleados);

                    System.out.println("Más joven : "
                            + nombreJoven + " (" + edadJoven + " años)");

                    System.out.println("Más veterano : "
                            + nombreVeterano + " (" + edadVeterano + " años)");

                    System.out.printf("Media de edad : %.1f años%n", mediaEdad);

                } else {
                    System.out.println("No hay empleados en esta oficina.");
                }
            }
        }
    }
}