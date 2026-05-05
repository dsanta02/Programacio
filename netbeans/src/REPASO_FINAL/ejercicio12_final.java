/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package REPASO_FINAL;

import java.util.*;
import java.io.*;

public class ejercicio12_final {

    public static void main(String[] args) {
        
    }
    
    static List<Integer>lectura (String fichero ) {
        List<Integer> lista = new ArrayList<>();
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fichero))){
            lista = (List<Integer>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return lista;
    }
    
    static void escritura (String fichero, List<Integer> lista) {
        
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fichero))){
            out.writeObject(lista);
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    static void fusionar (String ficheroBase, String ficheroNuevo) {
        
        List<Integer> listaBase = lectura(ficheroBase);
        List<Integer> listaNueva = lectura(ficheroNuevo);
        
        listaBase.addAll(listaNueva);
        
        Collections.sort(listaBase);
        
        
    }
    
    static void Mostrar (String nombre) {
        List<Integer> lista = lectura(nombre);
        System.out.println(lista);
    }
    
    
}
