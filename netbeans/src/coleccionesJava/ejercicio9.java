/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coleccionesJava;

import java.util.*;

public class ejercicio9 {
    public static void main(String[] args) {

        // 1. Crear listas
        List<String> programacion = new ArrayList<>();
        programacion.add("Ana");
        programacion.add("Luis");
        programacion.add("Marta");
        programacion.add("Carlos");
        programacion.add("Sofía");

        List<String> basesDatos = new ArrayList<>();
        basesDatos.add("Luis");
        basesDatos.add("Pedro");
        basesDatos.add("Ana");
        basesDatos.add("Laura");
        basesDatos.add("David");

        // 2. containsAll
        boolean todosEnProg = programacion.containsAll(basesDatos);
        System.out.println("¿Todos los de BD están en Programación? " + todosEnProg);

        // 3. addAll
        List<String> todosAlumnos = new ArrayList<>();
        todosAlumnos.addAll(programacion);
        todosAlumnos.addAll(basesDatos);

        System.out.println("Todos los alumnos: " + todosAlumnos);

        // 4. removeAll
        todosAlumnos.removeAll(basesDatos);
        System.out.println("Después de removeAll (sin BD): " + todosAlumnos);

        // 5. retainAll
        List<String> comunes = new ArrayList<>();
        comunes.addAll(programacion);
        comunes.retainAll(basesDatos);

        System.out.println("Alumnos en ambas listas: " + comunes);
    }
}
