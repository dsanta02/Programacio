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

        escrituraFichero(lista2, "fichero2.dat");
        escrituraFichero(lista1, "fichero3.dat");

        fusion("fichero2.dat", "fichero3.dat");

        mostrarList("fichero2.dat");
    }


    public static List<Integer> leerArchivo(String fichero) throws ClassNotFoundException {

        List<Integer> lista = new ArrayList<>();

        try (ObjectInputStream in =
                     new ObjectInputStream(new FileInputStream(fichero))) {

            lista = (List<Integer>) in.readObject();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return lista;
    }


    public static void escrituraFichero(List<Integer> lista, String fichero) {

        try (ObjectOutputStream out =
                     new ObjectOutputStream(new FileOutputStream(fichero))) {

            out.writeObject(lista);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


    public static void fusion(String ficheroBase, String ficheroNuevo) throws ClassNotFoundException {

        List<Integer> listaBase = leerArchivo(ficheroBase);
        List<Integer> listaNueva = leerArchivo(ficheroNuevo);

        listaBase.addAll(listaNueva);
        Collections.sort(listaBase);

        escrituraFichero(listaBase, ficheroBase);
    }


    public static void mostrarList(String nombre) throws ClassNotFoundException {

        List<Integer> lista = leerArchivo(nombre);
        System.out.println(lista);
    }
}