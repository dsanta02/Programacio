/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioTema5;

/**
 *
 * @author disacr127
 */
import java.util.Scanner;
public class ejercicio5_3_sinCorregir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca un numero");
        int n = sc.nextInt();
        int[] numeros = new int[n]; //creamos el array para almacenar informacion de int (enteros) nombre del array = un nuevo array con n(valor que hemos pedidoantes) posiciones 
            for (int i = 0; i < n; i++){//usamos para que solo se repita n las veces que ha dicho el usuario
            System.out.println("escribe el otro numero");
            numeros[i] = sc.nextInt();//numeros[i] posicion 0 como indica el int i en el for y con el sc.next le asignamos el valor que ha pedidio el usuario 
            } 
    //la parte de arriba del cofigo se encarga de pedir un numero n y luego pida los n numeros que ha puesto antes el usuario ej si pone 6 pide 6
            int sumaPositivos = 0, contadorPositivos = 0;
            int sumaNegativos = 0, contadorNegativos = 0;
            int contadorCeros = 0;
     //iniciamos contadores y sumadore para clasificar los numeros contadores en el enunciado                    
        for (int num : numeros) { // recorrer todos los elemntos y lo guarda en la variable num que acabas de crear . para cada numero en el array numero 
            if (num > 0) {
                sumaPositivos += num;
                contadorPositivos++;
            } else if (num > 0) {
                sumaNegativos += num;
                contadorNegativos ++;
            } else {
                contadorCeros++;
            }
        }
        
        if (contadorPositivos > 0 ) {
            double mediaPositivos = (double) sumaPositivos / contadorPositivos;
            System.out.println("resultado de las medias es: " + mediaPositivos);
        } else {
            System.out.println("no se han introducisdo numero positivos");
        }
        
        if (contadorNegativos > 0 ) {
            double mediaNegativos = (double) sumaNegativos/contadorNegativos;
            System.out.println("la media de los numeros negativos es de: " + mediaNegativos);
        }else  {
            System.out.println("No se han introducido numeros negativos");
        }
        System.out.println("la cantidad de ceros introducidos es de: " + contadorCeros);
        
        
    
    }
    
}
