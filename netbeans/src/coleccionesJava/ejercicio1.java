/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coleccionesJava;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ejercicio1 {
    public static void main(String[] args) {

        // 1. Declarar colección
        Collection<String> alumnos = new ArrayList<>(); //se crea una coleccione de tipo String de Arrays

        //su implementacion mas usada es la de ArrayList o lade linkedList
        
        // 2. Añadir alumnos
        alumnos.add("Ana"); 
        alumnos.add("Luis");
        alumnos.add("Marta");
        alumnos.add("Carlos");
        alumnos.add("Ana");

        // 3. Mostrar info
        System.out.println("Número de elementos: " + alumnos.size());
        System.out.println("¿Está vacía?: " + alumnos.isEmpty());

        // 4. Comprobar existencia
        System.out.println("¿Existe Marta?: " + alumnos.contains("Marta"));
        System.out.println("¿Existe Pedro?: " + alumnos.contains("Pedro"));

        // 5. Eliminar Luis
        alumnos.remove("Luis");

        // 6. Mostrar contenido
        System.out.println("Colección (toString): " + alumnos.toString());

        System.out.println("Colección (for-each):");
        for (String alumno : alumnos) {
            System.out.println(alumno);
        }
        
        System.out.println("----------------------------------------");
        
        Iterator<String> it = alumnos.iterator(); //iterator es un OBJETO que se usa oara recorrer 
        //aqui crear el iterador e it va recorrienedo la coleccion
        //it.hasNext() = true es que qedan elementos
        //it.next devueleve el siguiente elemento
        //t.remove elimina el ultimo next 
        
        while (it.hasNext()) { //mientras se recorra la coleccion
            System.out.println(it.next()); // que muestre el siguiente
        }
        
        eliminaAlumno(alumnos, "marta");
        
        for (String alumno : alumnos) {
            System.out.println(alumno);
        }
        
        alumnos.clear();
        
        System.out.println("esta vacia? " + alumnos.isEmpty());
        
        
    }
    
        static void eliminaAlumno(Collection<String> alumnos, String nombre) {
        Iterator<String> it = alumnos.iterator();

        while (it.hasNext()) { //mientras se reorra la coleccion 
            if (it.next().equals(nombre)) { //si el siguente es igual a el nombre 
                it.remove(); // lo borra 
            }
        }
    }
    
}