/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coleccionesJava;

import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Collection<Integer> caja = new ArrayList<>();
        
        int num = 0;
        
        do {
            System.out.println("introduce un numero que no sea menor que 0");
            num = sc.nextInt();
            if (num != -1){ 
                caja.add(num);
                        }
                
        } while (num != -1);
        
        System.out.println("lista de la collecion");
        
        for (Integer a : caja) {
            System.out.println(a);
        }
        
        Iterator<Integer> it = caja.iterator();
        
        while (it.hasNext()) {
            if (it.next() % 3 == 0 ) {
                it.remove();
            }
        }
        
        System.out.println("lista si los multiplos de 3 ");
        
        for (Integer p : caja) {
            System.out.println(p);
        }
        
    }
}
