/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NuevosDatos_Entidades;


import EntidadesMapeo.TIEMPO_ENVIO;
import ConexionBD.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danielferova
 */
public class NuevoTiempo_envio extends Conexion{
    
    PreparedStatement ps = null;
    Connection conexion = conectandoBase();
    
    public boolean registrarTiempo_envio(TIEMPO_ENVIO tiempo){
        String sql = "INSERT INTO TIEMPO ( Tienda_Origen, Tienda_Destino, Tiempoen_Dias ) VALUES(?,?,?)";
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, tiempo.getTiendaOrigen());
            ps.setString(2, tiempo.getTiendaDestino());
            ps.setInt(3, tiempo.getTiempoenDias());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(NuevoTiempo_envio.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
