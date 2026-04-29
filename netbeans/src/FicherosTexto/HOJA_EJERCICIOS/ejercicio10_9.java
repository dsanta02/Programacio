/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FicherosTexto.HOJA_EJERCICIOS;

import java.util.*;
import java.io.*;

public class ejercicio10_9 {

    public static void main(String[] args) {
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader("D:\\Users\\disacr127\\Downloads\\jugadores.txt"));
            int contador = 0;
            int sumaEdad = 0;
            double sumaEstatura = 0;
            String linea = in.readLine();
            
            while (linea != null) {
                Scanner s = new Scanner(linea).useLocale(Locale.US);
                String nombre = s.next();
                int edad = s.nextInt();
                double estatura = s.nextDouble();
                
                System.out.println(nombre);
                sumaEdad = sumaEdad + edad;
                sumaEstatura = sumaEstatura + estatura;
                contador ++;
                
                linea = in.readLine();
            }
            
            double mediaEdades = (double)sumaEdad / contador;
            double mediaEstatura = sumaEstatura / contador;
            System.out.println("la media de edades es: " + mediaEdades);
            System.out.println("la media de de las estaturas es: " + mediaEstatura);
            
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
