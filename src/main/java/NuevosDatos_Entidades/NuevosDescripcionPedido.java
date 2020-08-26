
package NuevosDatos_Entidades;


import EntidadesMapeo.DESCRIPCION_PEDIDO;
import ConexionBD.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class NuevosDescripcionPedido extends Conexion {
    
         PreparedStatement ps = null;
         Connection conexion = conectandoBase();
         ResultSet resultSet = null;

    //inicio metodos para usar en el importador de datos
    public void registrarDescripcion_Pedido (DESCRIPCION_PEDIDO subPedido){
        String sql = "INSERT INTO DESCRIPCION_PEDIDO (Id_pedido, Id_Producto, Cantidad_Tienda, Total_Producto) VALUES (?,?,?,?)";
        try {
            //registrado pedido
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, subPedido.getIdPedido());
            ps.setString(2, subPedido.getIdProducto());
            ps.setInt(3, subPedido.getCantidadTienda());
            ps.setDouble(4, subPedido.getTotalProducto());
            ps.execute();            
            System.out.println("REGISTRO DESCRIPCION PEDIDO CREADO CON EXITO!");
        } catch (SQLException e) {
            System.out.println("ERROR AL INTENTAR REGISTRAR DESCRIPCION PEDIDO");
        }
    }
    //fin metodos para usar en el importador de datos
}
