/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NuevosDatos_Entidades;



import EntidadesMapeo.PEDIDO;
import ConexionBD.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *Querys PEDIDOS
 * @author danielferova
 */
public class NuevosPedidos extends Conexion {
     PreparedStatement ps = null;
     PreparedStatement ps1 = null;
     Connection conexion = conectandoBase();
     ResultSet resultSet = null;
     
    //para registrar mis pedidos junto con Descripcion_pedidos
    public boolean registrarPedidos(PEDIDO pedidos){
        
        String sql = "INSERT INTO DESCRIPCION_PEDIDO (Id_Pedido, Fecha, Id_Producto, Cantidad_Tienda, Total_Producto, Anticipo_Total, Estado_Pedido)"
                + "VALUES(?,?,?,?,?,?,?)";
                 //   + "ON DUPLICATE KEY UPDATE Codigo_Pedido=Codigo_Pedido, Total=Total+?,Total_Restante=Total-Anticipo_Total" ;
                 
        String sql1 = "INSERT INTO PEDIDO (Id_Pedido, Tienda_Origen, Tienda_Destino, Fecha, Nit_Cliente, Total, Anticipo_Total, TotalPagar_Pedido, Fecha_Entrega, Estado_Pedido) "
                + "VALUES(?,?,?,?,?,"
                     + "?,?,?,"
                     + "(SELECT ADDDATE(?,(SELECT Tiempoen_Dias FROM TIEMPO WHERE Tienda_Origen=? AND Tienda_Destino=? OR Tienda_Origen=? AND Tienda_Destino=? LIMIT 1))),"
                + "?) ON DUPLICATE KEY UPDATE Id_Pedido = Id_Pedido, TotalPagar_Pedido = Total-Anticipo_Total";
        try {
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, pedidos.getIdPedido());
            ps.setString(2, pedidos.getFecha());
            ps.setString(3, pedidos.getIdProducto());
            ps.setInt(4, pedidos.getCantidadTienda());
            ps.setDouble(5, pedidos.getTotalProducto());
            ps.setDouble(6, pedidos.getAnticipoTotal());
            ps.setString(7,pedidos.getEstadoPedido());
            
            ps.execute();
            
            ps1 = conexion.prepareStatement(sql1);
            ps1.setInt(1, pedidos.getIdPedido());
            ps1.setString(2, pedidos.getTiendaOrigen());
            ps1.setString(3, pedidos.getTiendaDestino());
            ps1.setString(4, pedidos.getFecha());
            ps1.setString(5, pedidos.getNitCliente());
            ps1.setDouble(6, pedidos.getTotal());
            ps1.setDouble(7, pedidos.getAnticipoTotal());
            ps1.setDouble(8, pedidos.getTotalApagar());
            ps1.setString(9, pedidos.getFecha());
            ps1.setString(10, pedidos.getTiendaOrigen());
            ps1.setString(11, pedidos.getTiendaDestino());
            ps1.setString(12, pedidos.getTiendaDestino());
            ps1.setString(13, pedidos.getTiendaOrigen());
            ps1.setString(14, pedidos.getEstadoPedido());
            
            ps1.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(NuevosPedidos.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
   } 
      
