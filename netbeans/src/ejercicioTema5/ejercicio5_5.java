/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioTema5;

import java.util.Arrays;
import java.util.Scanner;
public class ejercicio5_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("introduce el valor del quie quiere introducir");
        int valor = sc.nextInt();
        
        int[] tabla = new int[10];
        
        tabla = rellenaArray();
        
         System.out.println("su Array generado aleatoriamete es " + Arrays.toString(tabla));
         
        int[] tabla2 = insertarOrdenado(tabla, valor);
        
        System.out.println("Array nuevo" + Arrays.toString(tabla2));
        
        
    }
    
     static int[] insertarOrdenado(int t[ ], int nuevo) {
         int indice = Arrays.binarySearch(t, nuevo);
         if (indice < 0) {
             indice = -1 * indice -1;
         }
         int[] copia = new int[t.length + 1];
         
         int elementosAcopiar = indice;
         
         System.arraycopy(t, 0, copia, 0, indice);
         
         System.arraycopy(t, indice, copia, indice +1, t.length - indice);
         
         copia[indice] = nuevo; 
         
         return copia;
         
        }
     
     static int[] rellenaArray () {
         int[] tabla = new int[10];
         
         for (int i = 0; i < tabla.length; i++) {
         tabla[i] = (int) (Math.random()*1000);
        }
         Arrays.sort(tabla);
         return tabla;
     }
 
}
