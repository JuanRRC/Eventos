/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import BD.DBManager;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Clint
 */
public class Repositorios {
    
        int cont =0;    
        private static DBManager database = new DBManager();

    public static void crear ( Recreacionista recreacionista) {
        try {
            
            String query = "INSERT INTO recreadores(cedula, nombre, apellido, fechaN, tipo, fechaS) VALUES (?, ? ,? ,?, ?, ?);";
            PreparedStatement sentenciaP = database.open().prepareStatement(query);
           // sentenciaP.setInt(1, recreacionista.getId());
            sentenciaP.setString(1, recreacionista.getCedula());
            sentenciaP.setString(2, recreacionista.getNombre());
            sentenciaP.setString(3, recreacionista.getApellido());
            sentenciaP.setString(4, recreacionista.getFecha());
            sentenciaP.setString(5, recreacionista.getTipo());
            sentenciaP.setString(6, recreacionista.getFechaS());
          
            sentenciaP.executeUpdate();
            sentenciaP.close();
            database.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    
    
    
    
    
}
