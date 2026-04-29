/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7_progObjetos.EjercicioFutbolistas;

/**
 *
 * @author disacr127
 */
public class Futbolista implements Comparable<Futbolista>{

    private String dni;
    private String nombre;
    private int edad;
    private int goles;

    // Constructor
    public Futbolista(String dni, String nombre, int edad, int goles){
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.goles = goles;
    }

    // Getters
    public String getDni(){
        return dni;
    }

    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    // toString
    public String toString(){
        return dni + " " + nombre + " " + edad + " " + goles;
    }

    // equals basado en DNI
    public boolean equals(Object o){ // es la forma original de equals
        Futbolista f = (Futbolista) o; //lo que hacemos es q le damos valor a f de futbolista casteadolo
        return this.dni.equals(f.dni); // aqui comparas el dni actual con el nuevo
    }

    // Comparable (orden por DNI)
    public int compareTo(Futbolista f){
        return this.dni.compareTo(f.dni);
    }
}
