/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.lang.String;

/**
 *
 * @author Clint
 */
public class Recreacionista {
    
  
    private String nombre;
    private String apellido;
    private String cedula;
    //private String fecha;
    private String fecha;
    private String tipo;
    private String fechaS;

    public Recreacionista(String nombre, String apellido, String cedula, String fecha, String tipo, String fechaS) {
        
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.fecha = fecha;
        this.tipo = tipo;
        this.fechaS = fechaS;
    }

    public static Recreacionista crear(String nombre, String apellido, String cedula, String fecha, String tipo, String fechaS) {
        return new Recreacionista(nombre,apellido,cedula,fecha,tipo,fechaS);
        
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

   

    public String getFechaS() {
        return fechaS;
    }

    public void setFechaS(String fechaS) {
        this.fechaS = fechaS;
    }
    
    
    
    
}
