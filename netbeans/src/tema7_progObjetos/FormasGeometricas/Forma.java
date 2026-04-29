/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7_progObjetos.FormasGeometricas;


public abstract class Forma{
    
    String color;
    
    public Forma (String color) {
        this.color = color;
    }
    
    public abstract double calcularArea();

    public String mostrarTipo() {
        return "Soy un " + getClass().getSimpleName();
    }
}
