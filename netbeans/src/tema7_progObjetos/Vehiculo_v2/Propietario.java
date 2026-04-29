/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7_progObjetos.Vehiculo_v2;


public class Propietario {
    String nombre;
    String apellidos;
    String dni;
    String direccion;
    
    public Propietario (String nombre, String apellidos,String dni,String direccion) {
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.dni = dni;
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
        return "nombre: " + nombre +
               "dni: " + dni +
               "apellidos: " + apellidos +
               "direcciom: " + direccion;
    }
    
    
}
