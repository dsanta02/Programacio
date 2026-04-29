/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7_progObjetos.EjercicioFutbolistas;

import java.util.Comparator;

public class CompararPorEdad implements Comparator<Futbolista> {
    @Override
    public int compare(Futbolista f1, Futbolista f2) { //obligatorio usar el int compare 
        return Integer.compare(f1.getEdad(), f2.getEdad()); //compara lo0s numeros enteros pero con el 
                                                            //integer loos convierte en objetos 
                                                            //porque asi no los puedes comparar 
    }
}
