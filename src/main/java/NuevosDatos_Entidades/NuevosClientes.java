/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NuevosDatos_Entidades;

import EntidadesMapeo.CLIENTE;
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
public class NuevosClientes extends Conexion {
        PreparedStatement ps = null;
        Connection conexion = conectandoBase();
        ResultSet resultSet = null;
    //metodo para registrar o agregar clientes con los campos de nustra base de datos
     public boolean agregarClientes(CLIENTE clientes){
        String sql = "INSERT INTO CLIENTE (Nombre_Cliente, Nit_cliente, Telefono_Cliente, Credito_Compra, Dpi_Cliente, Correo_Cliente, Direccion_Cliente) VALUES(?,?,?,?,?,?,?)";
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, clientes.getNombreCliente());
            ps.setString(2, clientes.getNitCliente());
            ps.setString(3, clientes.getTelefonoCliente());
            ps.setDouble(4, clientes.getCreditoCompra());
            ps.setString(5, clientes.getDpiCliente());
            ps.setString(6, clientes.getCorreoCliente());
            ps.setString(7, clientes.getDireccionCliente());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(NuevosClientes.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    //metodo para ver a nuestro cliente por medio de NIT
      public boolean existeCliente (String nit){
         String sql = "SELECT * FROM CLIENTE WHERE Nit_Cliente = ?";
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1,nit);
            resultSet = ps.executeQuery();
            if(resultSet.next()){
                return true;
            }else{
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("NO SE ENCONTRO");
            return false;
        }   
    }
      //metodo para llamar al cliente por medio de su NIT
       public CLIENTE obtenerCliente(String codigo){
        String query = "SELECT * FROM CLIENTE WHERE Nit_Cliente = ?";
        CLIENTE cliente = null;
                
        Connection conexion = null;
        PreparedStatement obtener = null;
        ResultSet rs  = null;
        
        try {
            
            obtener = conexion.prepareStatement(query);
            obtener.setString(1, codigo);
            rs = obtener.executeQuery();
            if(rs.next()){
             cliente = new CLIENTE (rs.getString("Nombre_Empleado"), rs.getString("Nit_Cliente"), rs.getString("Telefono_Cliente"),rs.getDouble("Credito_Compra"),rs.getString("Dpi_Cliente"),rs.getString("Correo_CLiente"),rs.getString("Direccion_Cliente"));
              }
        } catch (SQLException ex) {
            Logger.getLogger(NuevosClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        return cliente;
    
    }
}
