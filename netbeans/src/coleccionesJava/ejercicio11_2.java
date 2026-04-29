/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coleccionesJava;

import java.util.*;

public class ejercicio11_2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        List<Integer> lista = new ArrayList<>();
        
        System.out.println("introduce un numero");
        int n = sc.nextInt();
        
        while (n >= 0) {
            System.out.println("introduce un numero:");
            n = sc.nextInt();
            lista.add(n);
        }
        
        for (int i = 0; i < lista.size(); i ++) {
            if (lista.get(i) % 2 == 0) {
                System.out.println("indice: " + i);
            }
        }
        
    }
    
}
