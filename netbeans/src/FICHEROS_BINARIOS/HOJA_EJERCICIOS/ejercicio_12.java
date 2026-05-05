/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FICHEROS_BINARIOS.HOJA_EJERCICIOS;

import java.util.*;
import java.io.*;

public class ejercicio_12 {

    public static void main(String[] args) throws ClassNotFoundException {
      
        List<Integer> lista1 = Arrays.asList(5, 2, 9, 1);
        List<Integer> lista2 = Arrays.asList(8, 3, 7, 4);
        
        List<Integer> lectura = leerArchivo("datos2.dat");
        escrituraFichero(lista2, "fichero2.dat");
        escrituraFichero(lista1, "fichero3.dat");
        
        leerArchivo("fichero2.dat");
        
        fusion("fichero2.dat", "fichero3.dat");
    }
    
    public static List<Integer> leerArchivo(String fichero) throws ClassNotFoundException {
        
        List<Integer> lista = new ArrayList<>();
        
        ObjectInputStream in = null;
        
        
        try {
            in = new ObjectInputStream(new FileInputStream(fichero));
            lista = (List<Integer>) in.readObject();
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        return lista;
    }
    
    public static void escrituraFichero (List<Integer> lista, String fichero) {
        
        ObjectOutputStream out = null;
        
        try {
            out = new ObjectOutputStream(new FileOutputStream(fichero));
            out.writeObject(lista);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        
    }
    
    public static void fusion  (String fichrtoBase, String ficheroNuevo) throws ClassNotFoundException {
        List<Integer> listaBase = leerArchivo(fichrtoBase);
        List<Integer> listaNueva = leerArchivo(ficheroNuevo);
        
        listaBase.addAll(listaNueva);
        Collections.sort(listaBase);
        
        escrituraFichero(listaBase, fichrtoBase);
        
    }
    
    public static void mostrarList (String nombre) throws ClassNotFoundException {
        List<Integer> lista = leerArchivo(nombre);
        System.out.println(lista);
    }
    
    
}
