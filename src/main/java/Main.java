

import CargaArchivo.archivoCarga;
import EntidadesMapeo.EMPLEADO;
import Interfaz.IngresarUsuario;
import Interfaz.InicioIntelaf;
import Interfaz.inicioArchivo;
import ConexionBD.Conexion;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danielferova
 */
public class Main {
    public static void main(String[] args) throws SQLException{
        IngresarUsuario usuario = new IngresarUsuario();
        EMPLEADO empleado =usuario.verificarEstadoBD();
        System.out.println("Funciona");  
        
        if(empleado == null){
        inicioArchivo llamandoArchivo = new inicioArchivo();
        llamandoArchivo.setVisible(true);  
        }else{
            InicioIntelaf iniciar = new InicioIntelaf();
            iniciar.setVisible(true);
        }
       Conexion bd= new Conexion();
       bd.conectandoBase();   
    } 
}
