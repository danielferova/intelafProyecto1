/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NuevosDatos_Entidades;

import EntidadesMapeo.PRODUCTO;
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
public class NuevosProducto extends Conexion{
    
     public boolean insertarProducto(PRODUCTO producto){

        PreparedStatement ps = null;
        Connection conexion = conectandoBase();

        String sql = "INSERT INTO PRODUCTO (Nombre_Producto, Fabricante_Producto, Id_Producto, Existencias_Cantidad, Precio_Producto, Id_Tienda, Descripcion_Producto, Garantia_Producto) VALUES(?,?,?,?,?,?,?,?)";
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, producto.getNombreProducto());
            ps.setString(2, producto.getFabricanteProducto());
            ps.setString(3, producto.getIdProducto());
            ps.setInt(4, producto.getExistenciasCantidad());
            ps.setDouble(5, producto.getPrecioProducto());
            ps.setString(6, producto.getIdTienda());
            ps.setString(7, producto.getDescripcionProducto());
            ps.setInt(8, producto.getGarantiaProducto());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(NuevosProducto.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }
    
    
    
}
