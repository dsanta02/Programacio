/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FicherosTexto.HOJA_EJERCICIOS;

import java.util.*;
import java.io.*;

public class ejercicio10_9_v2 {

    public static void main(String[] args) {
        
        BufferedReader in = null;
        
        try {
            in = new BufferedReader(new FileReader("D:\\Users\\disacr127\\Downloads\\jugadores.txt"));
            int contador = 0;
            double sumaEdades = 0;
            double sumaEstatura = 0;
            String linea = in.readLine();
            
            while (linea != null) {
                String [] datos = linea.split(" ");
                String nombre = datos[0];
                int edad = Integer.parseInt(datos[1]);
                double estatura = Double.parseDouble(datos[2]);
                
                System.out.println(nombre);
                
                sumaEdades = sumaEdades + edad;
                sumaEstatura = sumaEstatura + estatura;
                contador ++;
                
                linea = in.readLine();
                
            }
            double mediaEdades = sumaEdades / contador;
            double mediaEstaturas = sumaEstatura / contador;
            
            System.out.println("la media de las edades es: " + mediaEdades);
            System.out.println("la media de las estaturas es: " + mediaEstaturas);
            
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
