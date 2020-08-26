/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NuevosDatos_Entidades;

import EntidadesMapeo.EMPLEADO;
import ConexionBD.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danielferova
 */
public class NuevosEmpleados extends Conexion      
{
         PreparedStatement ps = null;
         Connection conexion = conectandoBase();
         ResultSet resultSet = null;
         
    public boolean registrarEmpleado(EMPLEADO empleado) {

        String sql = "INSERT INTO EMPLEADO (Nombre_Empleado, Id_Empleado, Telefono_Empleado, Dpi_Empleado, Nit_Empleado , Correo_Empleado, Direccion_Empleado) VALUES(?,?,?,?,?,?,?)";
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, empleado.getNombreEmpleado());
            ps.setString(2, empleado.getIdEmpleado());
            ps.setString(3, empleado.getTelefonoEmpleado());
            ps.setString(4, empleado.getDpiEmpleado());
            ps.setString(5, empleado.getNitEmpleado());
            ps.setString(6, empleado.getCorreoEmpleado());
            ps.setString(7, empleado.getDireccionEmpleado());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(NuevosEmpleados.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }
    
     public boolean existeEmpleado(String codigo){
         String sql = "SELECT * FROM EMPLEADO WHERE Id_Empleado = ?";
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1,codigo);
            resultSet=ps.executeQuery();
            if(resultSet.next()){
                return true;
            }else{
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("ERROR AL ENCONTRAR EMPLEADO");
            return false;
        }
        
    }
     
     public String llamarNombreEmpleado(String nombre){
        try {
           String sql = "SELECT Id_Empleado FROM EMPLEADO WHERE Nombre_Empleado = ?";
            ps.setString(1, nombre);
            resultSet=ps.executeQuery();
            if(resultSet.next()){
                return resultSet.getString(1);
            }else{
                return null;
            }
        } catch (SQLException e) {
            System.out.println("ERROR");
            return null;
        }
    }
     
     public EMPLEADO obtenerEmpleado(){
         EMPLEADO empleado = null;
            Conexion conexion = new Conexion();
        PreparedStatement ps = null;
        
        ResultSet rs = conexion.getTabla("SELECT * FROM EMPLEADO LIMIT 1");
        try{
            while (rs.next()){
                empleado = new EMPLEADO(rs.getString("Nombre_Empleado"), rs.getString("Id_Empleado"), rs.getString("Telefono_Empleado"), rs.getString("Dpi_Empleado"));
            }
        }catch(Exception e){
            
        }
              return empleado;  
     }
     
      public ArrayList<String> llamarNombreEmpleado(){
        ArrayList<String> nombres = new ArrayList<>();
        try {
            ps=conexion.prepareStatement("SELECT Nombre_Empleado FROM EMPLEADO");
            resultSet=ps.executeQuery();
            while(resultSet.next()){
                nombres.add(resultSet.getString(1));
            }
            return nombres;
        } catch (SQLException e) {
            System.out.println("ERROR");
            return null;
        }
    }
}
