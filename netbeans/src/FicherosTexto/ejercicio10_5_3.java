/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FicherosTexto;

import java.io.*;
import java.util.*;

public class ejercicio10_5_3 {

    public static void main(String[] args) {
        BufferedReader in = null;
        //flujo de texto
        try {
            in = new BufferedReader(new FileReader("D:\\Users\\disacr127\\Downloads\\numerosReales2 6.txt"));
            double suma = 0.0;
            String linea = in.readLine();
            while (linea != null) {
                Scanner sc = new Scanner(linea).useLocale(Locale.US);
                suma = suma + sc.nextDouble();
                linea = in.readLine();
            }
            System.out.println("suma: " + suma);
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
