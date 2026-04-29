/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coleccionesJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collection;
import java.util.Scanner;

public class ejercicio4 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Collection<Integer> caja = new ArrayList<>();
        
        while (caja.size() < 20) {
            int num = (int)Math.random();
            caja.add(num);
        }
        
        Iterator<Integer> it = caja.iterator();
        
        while(it.hasNext()) {
            if (caja.equals(it)) {
                it.remove();
            }
        }
        
        for (Integer e : caja)  {
            System.out.println(e);
        }
        
    }
    
}
