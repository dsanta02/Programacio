/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciosInterfaces.Vehiculos2;

/**
 *
 * @author disacr127
 */
public class VehiculoAnfibio implements Vehiculo, Navegable{
    String modo = "tierra";
    
    @Override //sobreescrimos arrancar para que cuando sea tierra salga sus textos+
    public void arrancar()  {
        if (modo.equals("tierra")) {
            System.out.println("el vehiculo esta en modo tierra");
        } else {
            System.out.println("no se puede arrancar");
        }
    }
    
    @Override //lo mismo que arrancar cuando es de agua pone flotar 
    public void flotar() {
        if(modo.equals("agua")) {
            System.out.println("el vehiculo esta arrancando en modo agua");
        } else {
            System.out.println("no se pùede arrancar");
        }
    }
    
    void cambiarModo(String modo) { //selecciona el metodo que queremos 
        if (modo.equals("tierra") || modo.equals("agua")) {
            System.out.println("el coche esta arrancando");
            this.modo = modo;
            System.out.println("cambiando modo a " + modo);
        } else {
            System.out.println("modo. NO VALIDO");
        } 
    }
}
