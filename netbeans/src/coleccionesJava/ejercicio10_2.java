/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coleccionesJava;

import java.util.*;

public class ejercicio10_2 {
    
    public static void main(String[] args) {
        
        Collection<Integer> caja = new ArrayList<>();
        
        while (caja.size()< 20) {
            int n = (int) (Math.random()*100);
            caja.add(n);
        }
        
        System.out.println(caja);
        
        Integer [] lista = caja.toArray(new Integer[0]);
        
        Arrays.sort(lista);
        
        System.out.println("lista ordenada de menor a mayor");
        System.out.println(Arrays.toString(lista));
        
        List<Integer> caja2 = new ArrayList<>(Arrays.asList(lista));
        
        caja2.sort(Collections.reverseOrder());
        
        System.out.println("lista ordenada de mayor a menor");
        System.out.print(caja2);
        
    }
    
}
