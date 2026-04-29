/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coleccionesJava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ejercicio2{
    
    public static void main(String[] args) {
        
        Collection<cliente> tabla = new ArrayList<>();
        
        tabla.add(new cliente("1236564y", 12, "diana"));
        tabla.add(new cliente("1234561y", 22, "maria"));
        tabla.add(new cliente("1263256y", 34, "pedro"));
        tabla.add(new cliente("1232366y", 12, "anuel"));
        tabla.add(new cliente("1234689y", 12, "quevedo"));
        
        
        Iterator<cliente> it = tabla.iterator();
        while (it.hasNext()) {
            cliente c = it.next();
            if (c.getEdad() < 18) {
                it.remove();
            }
        }
        
            for (cliente a : tabla) {
            System.out.println(a);
        }
    
    }
}
