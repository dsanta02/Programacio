/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coleccionesJava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ejercicio2_2 {
    public static void main(String[] args) {
        
        Collection<cliente> cliente = new ArrayList<>();
        
        cliente.add(new cliente("1354361k", 11, "anuel"));
        cliente.add(new cliente("13654361b", 15, "anuel"));
        cliente.add(new cliente("13984633y", 12, "anuel"));
        cliente.add(new cliente("13574365g", 42, "anuel"));
        cliente.add(new cliente("13549847x", 54, "anuel"));
       
        
        Iterator<cliente> it = cliente.iterator();
        
        while (it.hasNext()) {
            cliente a = it.next();
            if (a.getEdad() < 18)  {
                it.remove();
            }
        }
        
        for (cliente e : cliente) {
            System.out.println(e);
        }
                
                
    }
}
