/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7_progObjetos.ejemplo3;

public class principal {
    public static void main(String[] args) {
        System.out.println("tamaños disponibles");
        listaTamaños[] misTamaños = listaTamaños.values(); // obtenemos los valores de la lista de tamaños en un array
        //para crear la variable se hace de tipo listaTamaño que es como se el metodo creado antes
        
//        for (int i = 0; i < misTamaños.length; i ++) {
//            System.out.println("- " + misTamaños[i]);
//        }
        
        //utilizamos un for normal para recorrerlo
        
        for (listaTamaños tamaño : listaTamaños.values()) {
            System.out.println("- " + tamaño);
        }
        
        // con el for each mucho mas facil y sencillo 
    }
}
