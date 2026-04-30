/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FicherosTexto;

import java.util.*;
import java.io.*;

public class ejercicio15_ficha {

    public static void main(String[] args) {
        String archivo1 = "lista1.txt";
        String archivo2 = "lista2.txt";
        String archivoSalida = "resultado.txt";

        // Leer los dos archivos en listas
        List<Integer> lista1 = lecturaFicher(archivo1);
        List<Integer> lista2 = lecturaFicher(archivo2);

        // Unir listas
        List<Integer> listaUnica = new ArrayList<>();
        listaUnica.addAll(lista1);
        listaUnica.addAll(lista2);

        // Ordenar
        Collections.sort(listaUnica);

        // Guardar resultado
        GuardarFicher(listaUnica, archivoSalida);

        System.out.println("Proceso completado.");      
        
        
    }
    
    public static List<Integer> lecturaFicher (String nombreArchivo) {
        
        List<Integer> lista = new ArrayList<>();
        
        BufferedReader in = null;
        
        try {
            in = new BufferedReader(new FileReader(nombreArchivo));
            String linea = in.readLine();
            while (linea != null) {
                lista.add(Integer.parseInt(linea));
                in.close();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        return lista;
        
    }
    
    public static void GuardarFicher (List<Integer> lista, String nombreArchivo) {
        BufferedWriter out = null;
        try {
            out = new BufferedWriter(new FileWriter(nombreArchivo));
            for (Integer i : lista) {
                out.write(Integer.toString(i));
                out.newLine();
            }
            out.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    

    
}
