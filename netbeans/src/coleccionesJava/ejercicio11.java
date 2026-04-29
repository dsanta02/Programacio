/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coleccionesJava;

import java.util.*;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();
        
        int n;
        System.out.println("introduce un numero: ");
        n = sc.nextInt();
        
        while (n >= 0) {
            lista.add(n);
            System.out.println("introduce un numero: ");
            n = sc.nextInt();
        }
        
        System.out.println(lista);
        
        for (int i = 0; i < lista.size(); i ++) {
            if (lista.get(i)% 2 == 0) {
                System.out.println(" " + i);
            }
        }
        
    }
}
