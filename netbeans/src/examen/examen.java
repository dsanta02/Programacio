/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

import java.util.Arrays;
import java.util.Scanner;

public class examen {
    public static void main(String[] args) {
        double[] precios = llenaPrecios();
        muestraDatosPrecio(precios);
        System.out.println("mostras precios ordenados de menir a mayor");
        System.out.println(Arrays.toString(precios));
        


    }

    static double[] llenaPrecios() {  
        Scanner sc = new Scanner(System.in);
        double[] precios = new double[6];
        for (int i = 0; i < precios.length; i ++){
            double valores;
            do {
                System.out.println("escriba los valores de precio");
                    valores = sc.nextDouble();
                if (valores <= 0) {
                    System.out.println("escribe un valor mayor que 0");
                }    
            } while (valores <= 0 );
            precios[i] = valores;  
        }
        return precios;
    }
    

    static void muestraDatosPrecio (double[] precios){
        Arrays.sort(precios);
        
    }
}