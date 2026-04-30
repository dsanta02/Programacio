/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FicherosTexto.HOJA_EJERCICIOS;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ejercicio15 {

    public static void main(String[] args) {
        String archivo1 = "lista1.txt";
        String archivo2 = "lista2.txt";
        String archivoSalida = "resultado.txt";

        // Leer los dos archivos en listas
        List<Integer> lista1 = leerFichero(archivo1);
        List<Integer> lista2 = leerFichero(archivo2);

        // Unir listas
        List<Integer> listaUnica = new ArrayList<>();
        listaUnica.addAll(lista1);
        listaUnica.addAll(lista2);

        // Ordenar
        Collections.sort(listaUnica);

        // Guardar resultado
        guardarFichero(archivoSalida, listaUnica);

        System.out.println("Proceso completado.");
    }

    // Método para leer fichero sin throws
    public static List<Integer> leerFichero(String nombreArchivo) {
        List<Integer> lista = new ArrayList<>();

        try {
            BufferedReader in = new BufferedReader(new FileReader(nombreArchivo));
            String linea;

            while ((linea = in.readLine()) != null) {
                lista.add(Integer.parseInt(linea));
            }

            in.close();

        } catch (IOException e) {
            System.out.println("Error al leer el fichero.");
        }

        return lista;
    }

    // Método para guardar fichero sin throws
    public static void guardarFichero(String nombreArchivo, List<Integer> lista) {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(nombreArchivo));

            for (Integer numero : lista) {
                out.write(numero.toString());
                out.newLine();
            }

            out.close();

        } catch (IOException e) {
            System.out.println("Error al escribir el fichero.");
        }
    }
}
