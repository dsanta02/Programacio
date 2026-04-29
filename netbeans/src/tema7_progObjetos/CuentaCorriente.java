/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7_progObjetos;

/**
 *
 * @author disacr127
 */

//static = el mismo vzalor para todo
public class CuentaCorriente {
    String dni;
    public String nombre;
    private Double saldo;
    static private String nombreBanco = "Banco de JAVA";
    

    CuentaCorriente (String dni, String nombre, String nombreBanco) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = 0.0;
        
   }
    
    CuentaCorriente (String dni, Double saldo) {
        this.dni = dni;
        this.nombre = "sin asigar";
        this.saldo = saldo;
    }
    
    CuentaCorriente (String dni, String nombre, Double saldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = saldo;
    }
    
    // set permite asignar un valor a un aributo 
    // get devuelve el atributo
    // get y set son idependientes uno del otro
    
    static void setBanco(String nuevoNombre) {
        nombreBanco = nuevoNombre;
    }
    static String getBanco() {
        return nombreBanco;
    }
    
    
    void Ingresar (double cantidad) {
        this.saldo += cantidad;
    }
    
    void sacarDinero (double cantidad) {
        if (cantidad >= saldo) {
        this.saldo -= cantidad;
        }else System.out.println("Error: saldo insuficioente");

    }
    
    void mostrarCuenta () {
        System.out.println("----informacion de la cuenta----");
        System.out.println("nombre " + nombre);
        System.out.println("nombre " +  dni);
        System.out.println("saldo- " + saldo);
        System.out.println("nombre del bamco - " + nombreBanco);
    }
    
    // set permite asignar un valor a un aributo 
    // get devuelve el atributo
    
    

}
