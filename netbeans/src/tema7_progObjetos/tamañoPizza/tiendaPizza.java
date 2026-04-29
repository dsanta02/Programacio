/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7_progObjetos.tamañoPizza;


public class tiendaPizza {
    public static void main(String[] args) {
        System.out.println("MENU DE PIZZAS");
        for (tomañoPizza pizza : tomañoPizza.values()) {
            System.out.println(pizza.descripcion());
            //usas el for each para recorrer el array con el valor pizza y llamas al metodo descripcion
        }
        tomañoPizza miPizza = tomañoPizza.GRANDE;
        System.out.println("Tu pizza " + miPizza.name()); //el metodo name devuelve el numbre que le pusiste a la variale
        System.out.println("precio: " + miPizza.getPrecio()); //llamamos al metodo preio para que no de el precio de segun que pizza
    }
}
