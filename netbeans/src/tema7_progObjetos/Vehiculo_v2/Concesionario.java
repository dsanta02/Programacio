/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7_progObjetos.Vehiculo_v2;


public class Concesionario {
    String nombre;
    String direccion;
    Vehiculo[] vehiculo;
    
    public Concesionario (String nombre,String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.vehiculo = new Vehiculo[10];
    }
    
    public void agregaVehiculo(Vehiculo v) {
        for(int i = 0; i < vehiculo.length; i ++) {
            if (vehiculo[i] == null) { //si hay un espacio libre
                vehiculo[i] = v;
                System.out.println("vehiculo agregado");
                return;
            } 
        }
        
        System.out.println("No hay espacio libre");
    }
    
    public void listarVehiculos () {
        System.out.println("vehisulos en el concesionario " + nombre);
        for(int i = 0; i < vehiculo.length ; i ++) {
            System.out.println(vehiculo[i]);
        }
    }
    
}
