/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio18_ficha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int [] tabla = new int[6];
            
            for (int i= 0; i < tabla.length; i ++) {
            
            System.out.println("escriba los valores de la tabla ");
            
            tabla[i] = sc.nextInt();
            
            }
            
            System.out.println(Arrays.toString(tablaPares(tabla)));
            
            System.out.println(Arrays.toString(tablaInpares(tabla)));
     
        }
    
    static int[]tablaPares (int[] t) {
        
        int[] pares = new int[0];
        
        for (int e : t) {
            if (e % 2 == 0) {
                pares = Arrays.copyOf(pares, pares.length + 1);
                pares[pares.length -1] = e;
            }
        }
        return pares;
    }
    
    static int[] tablaInpares (int[] t) {
        
        int [] inpares = new int [0];
        for (int e : t) {
            if (e % 2!= 0) {
               inpares = Arrays.copyOf(inpares, inpares.length +1);
               inpares[inpares.length -1] = e; 
            }
        }
        
        return inpares;
    }
    
    
 
}
