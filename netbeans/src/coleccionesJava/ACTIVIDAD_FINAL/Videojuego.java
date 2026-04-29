/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coleccionesJava.ACTIVIDAD_FINAL;

import java.util.*;

public class Videojuego implements Comparable<Videojuego>{
    
    private int codigo;
    private String titulo;
    private double puntuacion;
    private String genero;

    public Videojuego(int codigo, String titulo, double puntuacion, String genero) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.puntuacion = puntuacion;
        this.genero = genero;
    }

    public Videojuego(int codigo, String titulo) {
        this.codigo = 0;
        this.titulo = "Sin_genero";
        this.puntuacion = puntuacion;
        this.genero = genero;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getPuntuacion() {
        return puntuacion;
    }

    public String getGenero() {
        return genero;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPuntuacion(double puntuacion) {
        this.puntuacion = puntuacion;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Videojuego{" + "codigo=" + codigo + ", titulo=" + titulo + ", puntuacion=" + puntuacion + ", genero=" + genero + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Videojuego other = (Videojuego) obj;
        return this.codigo == other.codigo;
    }

    @Override
    public int compareTo(Videojuego o) {
        return Integer.compare(this.codigo, o.codigo);
    }

    




    
    
    
    
    
}
