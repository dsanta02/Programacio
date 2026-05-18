/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog_bd.EJERCICIO_14_10_AMPLIADO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.*;
import static prog_bd.EJERCICIO_14_10_AMPLIADO.Main.connextion;
import java.sql.*;

public class Alumno {
    
    private int num;
    private String nombre;
    private Date fecha;
    private double media;
    private String curso;

    public Alumno(int id) {
        this.num = id;
    }

    public Alumno(int id, String nombre, Date fecha, double media, String curso) {
        this.num = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.media = media;
        this.curso = curso;
    }

    public int getId() {
        return num;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public double getMedia() {
        return media;
    }

    public String getCurso() {
        return curso;
    }

    public void setId(int id) {
        this.num = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Alumno{" + "id=" + num + ", nombre=" + nombre + ", fecha=" + fecha + ", media=" + media + ", curso=" + curso + '}';
    }
    
        void create() {
        
        String sql = "INSERT INTO ALUMNOS2 VALUES (?,?,?,?,?)";
        ResultSet rs;
        try (
                Connection con = connextion();
                PreparedStatement sentencia = con.prepareStatement(sql)
                ){
            
            sentencia.setInt(1, this.num);
            sentencia.setString(2, this.nombre);
            sentencia.setDate(3, new java.sql.Date(this.fecha.getTime()));
            sentencia.setDouble(4, this.media);
            sentencia.setString(5, curso);
            
            sentencia.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
    }
        
        void read() {
            
            ResultSet rs;
            String sql = "SELECT * FROM ALUMNOS2 WHERE NUM = ?";
            
            try (
                    Connection con = connextion();
                    PreparedStatement sentencia = con.prepareStatement(sql)
                    ){
                
                sentencia.setInt(1, this.num);
                
                sentencia.executeQuery();
                
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            
        }
    
}
