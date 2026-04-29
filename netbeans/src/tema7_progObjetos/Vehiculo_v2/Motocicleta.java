/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7_progObjetos.Vehiculo_v2;


public class Motocicleta extends Vehiculo{
    
    private int cilindrada;
    
        public Motocicleta(String marca, String modelo, int anio, int cilindrada) {
        super (marca, modelo, anio);
        
        this.cilindrada = cilindrada;
        
    }
        
     @Override
     public double calcularImpuesto() {
         return 0.3 * anio *50;
     }
        
}
