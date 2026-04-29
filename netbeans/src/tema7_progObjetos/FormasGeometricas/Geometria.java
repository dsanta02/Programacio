/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7_progObjetos.FormasGeometricas;

/**
 *
 * @author disacr127
 */
public class Geometria {
    
    Forma[] forma;
    Circulo circulo;
    Rectangulo rectangulo;
    Triangulo triangulo;
    
    public Geometria () {
        
        forma = new Forma[3];
        
        circulo = new Circulo(5 , "rojo");
        rectangulo = new Rectangulo(4, 6 , "verde");
        triangulo = new Triangulo (2, 5 , "azul");
        
        forma [0] = circulo;
        forma [1] = rectangulo;
        forma [2] = triangulo;
    }
    
    public void mostrarForma() {
        for (Forma f : forma) {
            System.out.println(f.mostrarTipo());
            System.out.println("area: " + f.calcularArea());
            System.out.println(f.color);
        }
    }
}
