/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7_progObjetos.FormasGeometricas;


public class Triangulo extends Forma{
    double base;
    double altura;
    
    public Triangulo (double base, double altura , String color) {
        super(color);
        this.altura = altura;
        this.base = base;
        
    }
    
    @Override
    public double calcularArea() {
        
        if (base < 0 && altura < 0) {
            System.out.println("base y altura negativo");
        }
        
        return base * altura;
    }
}
