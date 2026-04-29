/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7_progObjetos.tamañoPizza;


public enum tomañoPizza {
    PEQUEÑO(20.00),
    MEDIANO(25.50),
    GRANDE(32.00),
    FAMILIAR(40.00);
    
    private final double precio;
    //creas la variable precio y con private y final dices si es privado etc...
    
    private tomañoPizza(double precio) {
    this.precio = precio;
    } //se usa para guardar el valor dentro de cada pequeño, grande , mediano, familiar
    
    public double getPrecio() {
        return precio;
        } 
    //con esto perites que puedan llamar al precio es decir que lo puedaqn consultar
    
    public String descripcion() {
        return this.name() + " - €" + String.format("%.2f", precio);
    }
}

