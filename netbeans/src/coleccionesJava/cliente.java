/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coleccionesJava;


public class cliente {
    
    String dni;
    int edad;
    String nombre;

    public cliente(String dni, int edad, String nombre) {
        this.dni = dni;
        this.edad = edad;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "cliente{" + "dni=" + dni + ", edad=" + edad + ", nombre=" + nombre + '}';
    }

    public int getEdad() {
        return edad;
    }
    
    
    
}
