/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FicherosTexto.HOJA_EJERCICIOS;

import java.io.*;
import java.util.*;

public class ejercicio10_6 {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("introduce tu edad y tu estatura: ");
        int edad = sc.nextInt();
        double estatuta = sc.nextDouble();
        
        System.out.println("edad: " + edad);
        System.out.println("estatura: " + estatuta);
        
        sc.close();
    }
    
}
