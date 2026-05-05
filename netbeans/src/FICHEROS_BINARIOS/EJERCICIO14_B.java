/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FICHEROS_BINARIOS;

import java.io.*;

public class EJERCICIO14_B{

    public static void main(String[] args) throws ClassNotFoundException {

        int[] array = {4, 5, 2, 45, 66, 3, 22, 26};

        guardarArray("numeros2.dat", array);

        procesar();

        exportarFichero(array);
    }


    static void guardarArray(String fichero, int[] array) {

        try (ObjectOutputStream out =
                     new ObjectOutputStream(new FileOutputStream(fichero))) {

            for (int num : array) {
                out.writeInt(num);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


    static void procesar() {

        try (ObjectInputStream in =
                     new ObjectInputStream(new FileInputStream("numeros2.dat"));
             ObjectOutputStream pares =
                     new ObjectOutputStream(new FileOutputStream("pares2.dat"));
             ObjectOutputStream impares =
                     new ObjectOutputStream(new FileOutputStream("impares2.dat"))) {

            while (true) {

                try {
                    int num = in.readInt();

                    if (num % 2 == 0) {
                        System.out.println(num + " - PAR");
                        pares.writeInt(num);
                    } else {
                        System.out.println(num + " - IMPAR");
                        impares.writeInt(num);
                    }

                } catch (EOFException e) {
                    return; 
                }
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


    static void exportarFichero() {

        try (BufferedWriter out = new BufferedWriter(new FileWriter("numerosGen.txt"));
                ObjectInputStream in = new ObjectInputStream(new FileInputStream("numerosGen.dat"))) {

            while (true) {
                
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}


//Diferencia entre versión A y B (resumen corto)
//
//Versión A:
//Se guarda el array completo → writeObject()
//Se lee completo → readObject()
//Se recorre con for
//Versión B:
//Se guarda número a número → writeInt()
//Se lee uno a uno → readInt()
//Se usa while(true) porque no se sabe cuántos hay (fin con EOFException)