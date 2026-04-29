/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7_progObjetos.EjercicioFutbolistas;

import java.util.Comparator;

public class CompararaPorNombre implements Comparator<Futbolista>{ //esta clase compara objeto futbolista
    @Override
    public int compare (Futbolista f1, Futbolista f2) { //compara 2 tipos de futbolistas y es obligatorio
        return f1.getNombre().compareTo(f2.getNombre()); //compara los nombres con los getter 
    }
}
