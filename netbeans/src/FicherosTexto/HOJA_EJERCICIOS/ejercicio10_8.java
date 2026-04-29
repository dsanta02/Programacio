/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FicherosTexto.HOJA_EJERCICIOS;

import java.util.*;
import java.io.*;

public class ejercicio10_8 {

    public static void main(String[] args) {
        FileInputStream in = null;
        try {
            in = new FileInputStream("D:\\Users\\disacr127\\Downloads\\ENTEROS.txt");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        Scanner s = new Scanner (in);
        int contador = 0;
        int suma = 0;
        while (s.hasNext()) {
            int n = s.nextInt();
            suma = suma + n;
            contador ++;
        }
        
        double media = (double)suma / contador;
        System.out.println("la suma es: " + suma);
        System.out.println("el contador es: " + contador);
        System.out.println("la media es: " + media);
        
    }
}
