/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FicherosTexto;

import java.io.*;

import java.util.Scanner;

public class ejercicio10_2_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce nombre, edad y estatura (ej: Juan 20 1.75):");

        String linea = sc.nextLine();
        String[] datos = linea.split(" ");

        String nombre = datos[0]; // no se convierte
        int edad = Integer.parseInt(datos[1]);
        double estatura = Double.parseDouble(datos[2]);

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Estatura: " + estatura);
    }
}
