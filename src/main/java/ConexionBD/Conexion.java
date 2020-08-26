/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danielferova
 */
public class Conexion {
    Connection conexion = null;
    PreparedStatement preparedStatement = null;
    private final String driver = "com.mysql.jdbc.Driver";
    private final String user = "ferova";
    private final String password = "defo1412guate";
    private final String url = "jdbc:mysql://localhost:3306/intelafProyecto";
    
        public Connection conectandoBase() {
        try {
            conexion = (Connection) DriverManager.getConnection(url, user, password);
                        if(conexion != null){
                System.out.println("Conexion establecida");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al conectar" + ex);
        }
        return conexion;
    }    
    //metodo encargado de salir de la base de datos
    public void desconectarDB(){
        conexion = null;
        if(conexion == null){
            System.out.println("Conexion terminada");
        }
    }
  
      public ResultSet getTabla(String consulta) {
        Connection c = conectandoBase();
        Statement st;
        ResultSet datos = null;
        try {
            st = c.createStatement();
            datos = st.executeQuery(consulta);
        } catch (Exception e) {
        }
        return datos;
    }
}


