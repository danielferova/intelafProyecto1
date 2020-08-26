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
}
