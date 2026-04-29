/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioTema5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ejercicioX_ficha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("escriba la longitud del array");

        int n = sc.nextInt();
    
        int [] t = rellenaPare(n, 12);
        System.out.println("Array: " + Arrays.toString(t));
    }
    
    static int[] rellenaPare(int longitud, int fin) {
        int [] t = new int [longitud];
        for (int i = 0; i < t.length; i ++) {
            t [i] = (int)(Math.random() * fin +1);
        }
        
        Arrays.sort(t);
        return t;   
    }

}
