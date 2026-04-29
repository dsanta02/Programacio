/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7_progObjetos.FormasGeometricas;

/**
 *
 * @author disacr127
 */
public class Circulo extends Forma{
    
    double radio;

    
    public Circulo(double radio, String color ) {
        super (color);
        if (radio < 0) {
            System.out.println("el radio es negativo");
        }
        else {
            this.radio = radio;
        }
        
    }
    
    @Override
    public double calcularArea() {
        return 3.14 * (radio * radio);
    }
    
}
