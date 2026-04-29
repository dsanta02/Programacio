/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coleccionesJava;

import java.util.*;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        Collection<Integer> positivo = new ArrayList<>();
        Collection<Integer> negativos = new ArrayList<>();
        
        int num = 1;
        
        while (num != 0) {
            System.out.println("introduce un numero: ");
            num = sc.nextInt();
            if (num > 0) {
                positivo.add(num);
            } else if (num < 0){
                negativos.add(num);
            }
        }
        System.out.println("lista positivos: ");
        System.out.println(positivo);
        System.out.println("lista negativos" );
        System.out.println(negativos);
        
        int sumaPos = 0;
        int sumaNeg = 0;
        
        for (Integer e : positivo) {
            sumaPos = sumaPos + e;
        }
        
        for (Integer e : negativos) {
            sumaNeg = sumaNeg + e;
        }
        
        System.out.println("suma de positivos: " + sumaPos);
        System.out.println("suma de nagativos: " + sumaNeg);
        
        Iterator<Integer> it = positivo.iterator();
        
        while (it.hasNext()) {
            int t = it.next();
            if (t < 10 || t > 10) {
                it.remove();
            }
        }
        
        for (Integer e : positivo) {
            System.out.println(e);
        }
        
        Iterator<Integer> it1 = negativos.iterator();
        
        while (it1.hasNext()) {
            int t = it1.next();
            if (t < 10 || t > 10) {
                it1.remove();
            }
        }
        
        for (Integer e : negativos) {
            System.out.println(e);
        }        
        
    }
}
