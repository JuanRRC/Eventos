/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Clint
 */
public class Eventos {
    
    private String nombre;
    private String horaI;
    private String horaF;
    private String Usuario;
    private String descricion;
    private String fechaS;

    public Eventos(String nombre,String horaI, String horaF, String Usuario,String descripcion,String fechaS) {
        this.nombre = nombre;
       
        this.descricion=descripcion;
        this.horaI = horaI;
        this.horaF = horaF;
        this.Usuario = Usuario;
        this.fechaS=fechaS;
    }

    public static Eventos crearE(String nombre,String horaI, String horaF, String Usuario,String descripcion,String fechaS) {
        return new Eventos(nombre,horaI,horaF,Usuario,descripcion,fechaS);
        
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getDescricion() {
        return descricion;
    }

    public void setDescricion(String descricion) {
        this.descricion = descricion;
    }

    
    
    public String getHoraI() {
        return horaI;
    }

    public void setHoraI(String horaI) {
        this.horaI = horaI;
    }

    public String getHoraF() {
        return horaF;
    }

    public void setHoraF(String horaF) {
        this.horaF = horaF;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getFechaS() {
        return fechaS;
    }

    public void setFechaS(String fechaS) {
        this.fechaS = fechaS;
    }
    
    
    
}
