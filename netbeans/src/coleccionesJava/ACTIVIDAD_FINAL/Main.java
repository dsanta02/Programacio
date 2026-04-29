/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coleccionesJava.ACTIVIDAD_FINAL;

import java.util.*;
import tema7_progObjetos.ejemplo3.listaTamaños;

public class Main {
    
    public static void main(String[] args) {

        List<Videojuego> listaOriginal = new ArrayList<>();

        listaOriginal.add(new Videojuego(205, "The Legend of Zelda", 7.8, "Aventura"));
        listaOriginal.add(new Videojuego(102, "FIFA 24", 5.8, "Deportes"));
        listaOriginal.add(new Videojuego(200, "Elden Ring", 9.5, "SIN_GÉNERO")); 
        listaOriginal.add(new Videojuego(104, "Mario Kart 8", 5.4, "Conducción"));
        listaOriginal.add(new Videojuego(105, "The Sims 4", 5.6, "Simulación"));
        listaOriginal.add(new Videojuego(205, "Zelda Remastered", 5.0, "Aventura"));
        listaOriginal.add(new Videojuego(109, "Animal Crossing", 6.9, "Simulación"));
        listaOriginal.add(new Videojuego(102, "FIFA", -1.0, "SIN_GÉNERO"));
        listaOriginal.add(new Videojuego(115, "Minecraft", -1.0, "SIN_GÉNERO"));
        
        System.out.println("lista de videojuegos: " + listaOriginal);
        
        Set<Videojuego> nuevaCol1 = new TreeSet<>(listaOriginal);
        System.out.println("lista sin juegos repetidos: ");
        System.out.println("ordenada segun el criterio naturtal--");
        System.out.println(nuevaCol1);
        
        System.out.println("el tamaño de la lista es de: " + listaOriginal.size());
        
        mejoraPuntuacion(listaOriginal, 5.2);
        
        System.out.println("lista de videojuegos: " );
        for (Videojuego x : listaOriginal) {
            System.out.println(x);
        }
        
        int sinPuntuacion = contarSinPuntuacion(listaOriginal);
        System.out.println("videojuegos sin puntuacion: " + sinPuntuacion);
        
        Iterator<Videojuego> it = nuevaCol1.iterator();
        
        while (it.hasNext()) {
            Videojuego x = it.next();
            
            if (x.getPuntuacion() < 6) {
                it.remove();
            }
        }
        
        for (Videojuego x : nuevaCol1) {
            System.out.println(x);
        }
        
        Videojuego [] x = listaOriginal.toArray(new Videojuego[0]);
        
        for (Videojuego c : x) {
            System.out.println(c);
        }
        
        List<Videojuego> lista = new ArrayList<>(Arrays.asList(x));
        System.out.println(lista);
        
        List<Videojuego> nuevaCol2 = new ArrayList<>();

            nuevaCol2.add(new Videojuego(102, "FIFA 24", 5.8, "Deportes"));
            nuevaCol2.add(new Videojuego(106, "Fortnite", 7.8, "Battle Royale"));
            nuevaCol2.add(new Videojuego(107, "Hollow Knight", 9.2, "Plataformas"));
            nuevaCol2.add(new Videojuego(109, "Animal Crossing", 6.9, "Simulación"));
            nuevaCol2.add(new Videojuego(115, "Minecraft", 6.8, "SIN_GÉNERO"));
            
            List<Videojuego> primera = new ArrayList<>(listaOriginal);
            primera.addAll(nuevaCol1);
            System.out.println(primera);
            
            List<Videojuego> segunda = new ArrayList<>(listaOriginal);
            segunda.removeAll(nuevaCol1);
            System.out.println(segunda);
            
            List<Videojuego> tercera = new ArrayList<>(listaOriginal);
            tercera.retainAll(nuevaCol2);
            System.out.println(tercera);
            
           Collections.sort(listaOriginal);
           for (Videojuego e : listaOriginal) {
               System.out.println(x);
           }
            
                
    }
    
    public static void mejoraPuntuacion(List<Videojuego> videojuegos, double valor) {

        for (Videojuego x : videojuegos) { //leemos la lista con el for each
            double puntuacion = x.getPuntuacion(); //creamos una variable y le damos el valor de la punt
            
            if (puntuacion > valor && puntuacion < 6) { // si la puntuacion > vslor y < 6
                double nuevaPuntuacion = puntuacion + 0.5; // se crea una nueva puntuacion y se le suma 0.5
                
                if (nuevaPuntuacion > 6) { //si la nueva puntuacion es mayor que 6 se qeuda en 6
                    nuevaPuntuacion = 6;
                }
                
                x.setPuntuacion(nuevaPuntuacion); //aqui asignamos a x. la nueva punuacion
            }
        } 
    }
    
    public static int contarSinPuntuacion (List<Videojuego> x) {
        
        int contador = 0; //creamos contador a 0
        
        for (Videojuego s : x) { // leemos el array 
            
            if (s.getPuntuacion() == -1.0) { // si la puntuacion es por defecto puesto en el 
                contador ++;                 //constructor el contador se suma
            }
        }
        return contador;
    }
}
