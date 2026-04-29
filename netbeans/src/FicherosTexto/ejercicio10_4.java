/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FicherosTexto;

import java.io.*;

public class ejercicio10_4 {

    public static void main(String[] args) {

        BufferedReader in = null;
        String linea;
        double suma = 0;
        int contador = 0;

        try {
            in = new BufferedReader(new FileReader("D:\\Users\\disacr127\\Downloads\\numerosReales.txt"));

            while ((linea = in.readLine()) != null) {
                String[] subcadenas = linea.split(" ");

                for (int i = 0; i < subcadenas.length; i++) {
                    suma += Double.valueOf(subcadenas[i]);
                    contador++;
                }
            }

            double media = suma / contador;
            System.out.println("suma: " + suma + "\tmedia: " + media);

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
