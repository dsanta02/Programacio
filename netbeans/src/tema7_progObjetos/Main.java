/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7_progObjetos;


public class Main {
    public static void main(String[] args) {

        Caja caja1 = new Caja(200, 100, 50, Unidad.cm);  //creamos un caj1 y le metemos los valores
        
        caja1.setEtiqueta("Paquete frágil para Juan Pérez Madrid"); //con el setter se modifica o asigma valoer
                                                                    //a un atributo del texto
                                                                    //es donde si paso los 30 lo trunca
        System.out.println(caja1.toString());
        System.out.println("Volumen: " + caja1.getVolume() + " m3"); //codigo para la slida del programa
    }
    
}
