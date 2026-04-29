/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciosInterfaces.Vehiculos;


public class VehiculoAnfibio implements Anfibio{
    private String modo = "tierra";
    
    @Override
    public void arrancar() {
        if (modo.equals("tierra")){
            System.out.println("el vehiculo anfibio esta arrancando en modo tierra");
        } else {
            System.out.println("no se puede arrancar en modo agua");
        }
    }
    
    @Override
    public void flotar() {
        if (modo.equals("agua")) {
            System.out.println("el vehiculo esta flotando");
        } else {
            System.out.println("el vehiculo no puede flotar esta en modo tierra");
        }
    }
    
    @Override
    public void cambiarModo(String modo) {
        if (modo.equals("tierra") || modo.equals("agua")) {//se comprueba que el metodo sea agua o tierr 
            this.modo = modo; //guarda el nuevo modo en el atributo del objeto
            System.out.println("Cambiando a modo " + modo);
        } else {
            System.out.println("Modo no válido.");
        }
    }
}
