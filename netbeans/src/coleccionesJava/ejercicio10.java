/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coleccionesJava;

import java.util.*;
import tema7_progObjetos.ejemplo3.listaTamaños;

public class ejercicio10 {
    
    public static void main(String[] args) {
        
    Collection<Integer> lista = new ArrayList<>();
    
    
    while (lista.size() < 20) {
        int n = (int) (Math.random()*100);
        lista.add(n);
    }
        
    System.out.println(lista);
    
    Integer [] tabla = lista.toArray(new Integer [0]); //para convertir una coleecion en Array
    
    Arrays.sort(tabla); //para ordenarlo de menor a mayor 
    
    System.out.println(Arrays.toString(tabla));
    
    List <Integer> nuevaLista = new ArrayList<>(Arrays.asList(tabla));
    
    nuevaLista.sort(Collections.reverseOrder());
    
    System.out.println(nuevaLista);

        
    }

}

