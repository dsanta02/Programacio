/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7_progObjetos.EjercicioFutbolistas;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Futbolista[] tabla = new Futbolista[5];

        tabla[0] = new Futbolista("111A","Carlos",25,10);
        tabla[1] = new Futbolista("333C","Luis",30,15);
        tabla[2] = new Futbolista("222B","Ana",22,8);
        tabla[3] = new Futbolista("555E","Pedro",28,20);
        tabla[4] = new Futbolista("444D","Marta",24,12);

        // Orden por DNI
        Arrays.sort(tabla);
        System.out.println("Orden por DNI");
        for(Futbolista f : tabla){
            System.out.println(f);
        }

        // Orden por Nombre
        Arrays.sort(tabla, new CompararaPorNombre());
        System.out.println("\nOrden por Nombre");
        for(Futbolista f : tabla){
            System.out.println(f);
        }

        // Orden por Edad
        Arrays.sort(tabla, new CompararPorEdad()); //se pone tabla q es lo quieres ordenar y luego el 
                                                   //el metodo que es como quieres ordenarlo
                                                   //pero tiene que ser con un objeto nuevo
        System.out.println("\nOrden por Edad");
        for(Futbolista f : tabla){
            System.out.println(f);
        }

    }
}
