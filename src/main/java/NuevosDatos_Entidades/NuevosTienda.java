/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NuevosDatos_Entidades;


import EntidadesMapeo.TIENDA;
import ConexionBD.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danielferova
 */
public class NuevosTienda extends Conexion{
    
     public boolean insertarTienda(TIENDA tienda){

        PreparedStatement ps = null;
        Connection conexion = conectandoBase();

        String sql = "INSERT INTO TIENDA (Nombre_Tienda, Direccion_Tienda, Id_Tienda, Telefono_1, Telefono_2, Correo_Tienda, Horario_Tienda) VALUES(?,?,?,?,?,?,?)";
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, tienda.getNombreTienda());
            ps.setString(2, tienda.getDireccionTienda());
            ps.setString(3, tienda.getIdTienda());
            ps.setString(4, tienda.getTelefono1());
            ps.setString(5, tienda.getTelefono2());
            ps.setString(6, tienda.getCorreoTienda());
            ps.setString(7, tienda.getHorarioTienda());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(NuevosTienda.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }
     
    public TIENDA llamarTienda(){
        TIENDA llamar = null;
        Conexion conexion = new Conexion();
        PreparedStatement ps = null;
        
        ResultSet rs = conexion.getTabla("SELECT * FROM TIENDA LIMIT 1");
        try{
            while (rs.next()){
                llamar = new TIENDA(rs.getString("Nombre_Tienda"), rs.getString("Direccion_Tienda"), rs.getString("Id_Tienda"), rs.getString("Telefono_1"));
            }
        }catch(Exception e){
            
        }
              return llamar;  
    }
   }
    

