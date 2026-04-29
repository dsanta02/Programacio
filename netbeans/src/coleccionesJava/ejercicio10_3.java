/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coleccionesJava;

import java.util.*;

public class ejercicio10_3 {
    
    public static void main(String[] args) {
        

    Collection <Integer> caja = new ArrayList<>();

    while (caja.size() < 20) {
        int n = (int)(Math.random()* 100);
        caja.add(n);
    }
        System.out.println("orden aleatorio");
        System.out.print(caja);
    
    Integer [] tabla = caja.toArray(new Integer [0]);
    
    Arrays.sort(tabla);
    
        System.out.println("lista prdenada de maypr a menor");
        System.out.println(Arrays.toString(tabla));
        
        List<Integer> lista = new ArrayList<>(Arrays.asList(tabla));
        
        lista.sort(Collections.reverseOrder());
        
        System.out.println("lista en orden de mayor a menor:");
        System.out.print(lista);
        
  }
    
}
