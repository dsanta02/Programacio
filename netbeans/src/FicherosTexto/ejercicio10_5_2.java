/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FicherosTexto;

import java.util.*;
import java.io.*;

public class ejercicio10_5_2 {
    //SIN SCANNER !!!!!!!!!!

    public static void main(String[] args) {

        BufferedReader in = null; //creamos in q es un lector del archivo

        try {
            in = new BufferedReader(new FileReader("D:\\Users\\disacr127\\Downloads\\numerosReales2 6.txt"));
            //habrimos el archivo como en colecciones
            double suma = 0;
            String linea = in.readLine(); //guarda la primera linea del archivo 

            while (linea != null) { //mientras el archiva no sea nulo 

                // convertir directamente la línea a double
                suma = suma +  Double.parseDouble(linea); //convertimos linea en double

                linea = in.readLine(); // avanzamos a la siguiente linea del archivo 
            }

            System.out.println("suma = " + suma);

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
// LECTURA VERTICAL 
//String linea = in.readLine();
//
//while (linea != null) {
//    suma += Double.parseDouble(linea);
//    linea = in.readLine();
//}