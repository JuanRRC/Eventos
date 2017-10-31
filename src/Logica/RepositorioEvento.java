/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import BD.DBManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author Clint
 */
public class RepositorioEvento {
    
    int cont =0;    
        private static DBManager database = new DBManager();

    public static void crearEvento ( Eventos eventos) {
        try {
            
            String query = "INSERT INTO eventos(nombre, horaI, horaF, Usuario,descripcion, FechaS) VALUES (?, ? ,? ,?, ?, ?);";
            PreparedStatement sentenciaP = database.open().prepareStatement(query);
           // sentenciaP.setInt(1, recreacionista.getId());
            sentenciaP.setString(1, eventos.getNombre());
            sentenciaP.setString(2, eventos.getHoraI());
            sentenciaP.setString(3, eventos.getHoraF());
            sentenciaP.setString(4, eventos.getUsuario());
            sentenciaP.setString(5, eventos.getDescricion());
            sentenciaP.setString(6, eventos.getFechaS());
          
            sentenciaP.executeUpdate();
            sentenciaP.close();
            database.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    
    public static void cedulas ( Eventos eventos) {
        try {
            
            String query = "select cedula from eventos;";
            PreparedStatement sentenciaP = database.open().prepareStatement(query);
           // sentenciaP.setInt(1, recreacionista.getId());
            sentenciaP.setString(1, eventos.getNombre());
            sentenciaP.setString(2, eventos.getHoraI());
            sentenciaP.setString(3, eventos.getHoraF());
            sentenciaP.setString(4, eventos.getUsuario());
            sentenciaP.setString(5, eventos.getDescricion());
            sentenciaP.setString(6, eventos.getFechaS());
          
            sentenciaP.executeUpdate();
            sentenciaP.close();
            database.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    
    
    public static boolean recorrer(ArrayList<String>lista,String fecha1,String fecha2){
        boolean bandera=true;
        System.out.println("ITERATOR");
        Iterator<String> it = lista.iterator();
        String obj;
        while (it.hasNext()){
            obj = it.next();
            if(fecha1.equals(obj) || fecha2.equals(obj)){
                
                bandera=false;
            }
            System.out.println(obj);
             
        }
        
        return bandera;
    }
    
    public static ArrayList<Eventos> obtenerTodos() {
        ArrayList<Eventos> eventos = new ArrayList<Eventos>();

        try {
            String query = "SELECT * FROM eventos;";
            PreparedStatement sentenciaP = database.open().prepareStatement(query);
            ResultSet resultado = sentenciaP.executeQuery();
//String nombre,String horaI, String horaF, String Usuario,String descripcion,String fechaS
            while (resultado.next()) {
                eventos.add(Eventos.crearE(resultado.getString("nombre"), resultado.getString("horaI"), resultado.getString("horaF"),resultado.getString("Usuario"), resultado.getString("descripcion"), resultado.getString("FechaS")));
            }

            sentenciaP.close();
            database.close();

            return eventos;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return eventos;
    }
    
    
    
}
