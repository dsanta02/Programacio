/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coleccionesJava;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ejercicio1_2 {
    
    public static void main(String[] args) {
        
        Collection<String> alumno = new ArrayList<>();
        
        alumno.add("maria");
        alumno.add("pedro");
        alumno.add("alejandro");
        alumno.add("raquel");
        
        System.out.println("numero de elementos: " + alumno.size());
        System.out.println("esta vacia: " + alumno.isEmpty());
        
        System.out.println("existe Marta en la lista: " + alumno.contains("Marta"));
        System.out.println("contine a pedro en la lista: " + alumno.contains("pedro"));
        
        System.out.println(alumno.toString());
        
        alumno.remove("raquel");
        
        
        for (String p : alumno) {
            System.out.println(p);
        }
        
        System.out.println("----------------------------------------------------");
        
        Iterator<String> it = alumno.iterator();
        
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        
        eliminaAlumnos(alumno, "maria");
        
        alumno.clear();
        
        System.out.println("-----------------------------");
        
        System.out.println("tabla limpia");
        for (String p : alumno) {
            System.out.println(p);
        }
        
    }
    
    static void eliminaAlumnos (Collection<String> alumnos, String nombre) {
        
        Iterator<String> it = alumnos.iterator();
        
        while (it.hasNext()) {
            if (it.next().equals(nombre)) {
                it.remove();
            }
        }
    }
    
}
