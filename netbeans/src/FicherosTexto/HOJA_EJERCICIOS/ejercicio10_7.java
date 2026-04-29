/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FicherosTexto.HOJA_EJERCICIOS;

import java.util.*;
import java.io.*;

public class ejercicio10_7 {
    public static void main(String[] args) {
        BufferedReader in = null;

        try {
            in = new BufferedReader(new FileReader("D:\\Users\\disacr127\\Downloads\\numerosReales2 6.txt"));
            double suma = 0.0;
            String linea = in.readLine();
            
            while (linea != null) {
                Scanner s = new Scanner(linea).useLocale(Locale.US);
                suma = suma + s.nextDouble();
                linea = in.readLine();
            }
            
            System.out.println("la suma es: " + suma);
                
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        
        }
    }    
}
