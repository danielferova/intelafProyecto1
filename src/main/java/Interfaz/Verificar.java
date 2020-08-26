package Interfaz;


import EntidadesMapeo.CLIENTE;
import NuevosDatos_Entidades.NuevosClientes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danielferova
 */
public class Verificar {
    
    public CLIENTE loginCliente (String codigo){
    NuevosClientes cliente = new NuevosClientes();
    CLIENTE n = cliente.obtenerCliente(codigo);
        return n;
    }
}
