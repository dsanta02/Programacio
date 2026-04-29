/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7_progObjetos.ejercicio7_10.maquinaria;

/**
 *
 * @author disacr127
 */
public class mecanico {
    String nombre;
    String tel;
    enum especialidad {frenos, hidraulica, electricidad, motor} //crea con la variable enum los tipos que puede tener de especialida
    especialidad especial; // le asignas el valor enum(especialidad que puede tener el mecanico) a especialidad
    
    private mecanico (String nombre, String tel, String especial ) {
        this.nombre = nombre;
        this.tel = tel;
        this.especial = especialidad.valueOf(especial); //utilizamos el valueOf para que especial pase a enumerado 
    }
}
