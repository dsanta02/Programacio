/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FicherosTexto;

import java.util.*;
import java.io.*;

public class ejercicio10_6 {

    public static void main(String[] args) {
        FileInputStream flujo = null;   //ESTO SIEMPRE CUANDO HAYA UN FLUJO DE ENTRADA
        try {
            flujo = new FileInputStream("D:\\Users\\disacr127\\Downloads\\ENTEROS.txt");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        Scanner s = new Scanner(flujo);
        int contador = 0;
        int suma = 0;
        while (s.hasNext()) { //    CON ESTO LEEMOS EL FLUJO MIENTRAS S....
            int n = s.nextInt();    // A N LE DAMOS EL VALOR DE LOS VALORES DE EL SCANNER
            suma = suma + n;
            contador ++;
        }
        
        double media = (double)suma / contador;
        System.out.println("la suma es: " + suma);
        System.out.println("el contador es: " + contador);
        System.out.println("y la media es: " + media);
    }
    
}
