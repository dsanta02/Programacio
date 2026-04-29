/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FicherosTexto.HOJA_EJERCICIOS;

import java.util.*;
import java.io.*;

public class ejercicio10_13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el nombre del fichero:");
        String nombre = sc.nextLine();

        if (nombre.isEmpty()) {
            nombre = "prueba.txt";
        }

        BufferedReader in = null;

        try {
            in = new BufferedReader(new FileReader(nombre));

            System.out.println(in.readLine());

        } catch (IOException e) {
            System.out.println(e.getMessage());

        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
