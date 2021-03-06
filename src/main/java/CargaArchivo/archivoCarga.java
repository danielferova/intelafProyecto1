/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CargaArchivo;

import EntidadesMapeo.CLIENTE;
import EntidadesMapeo.DESCRIPCION_PEDIDO;
import EntidadesMapeo.EMPLEADO;
import EntidadesMapeo.PEDIDO;
import EntidadesMapeo.PRODUCTO;
import EntidadesMapeo.TIEMPO_ENVIO;
import EntidadesMapeo.TIENDA;
import NuevosDatos_Entidades.NuevoTiempo_envio;
import NuevosDatos_Entidades.NuevosClientes;
import NuevosDatos_Entidades.NuevosDescripcionPedido;
import NuevosDatos_Entidades.NuevosEmpleados;
import NuevosDatos_Entidades.NuevosPedidos;
import NuevosDatos_Entidades.NuevosProducto;
import NuevosDatos_Entidades.NuevosTienda;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @author danielferova
 */
public class archivoCarga {

     private ArrayList<String> registrosIgnorados;
/**
 * atributos
 */
    public archivoCarga() {
        registrosIgnorados = new ArrayList<>();
    }
    //metodo para leer mi archivo txt
    public void llamandoArchivo(File archivo) throws FileNotFoundException, IOException
    {
        String cadena;
         try {
        FileReader txt = new FileReader(archivo);
        BufferedReader b = new BufferedReader(txt);
        while((cadena = b.readLine())!=null)
        {
           analizandoDatos(cadena);
            } 
         }
         catch (IOException e) {
            }                
    }
    //metodo para analizar el archivo para reconocer palabras
      public void analizandoDatos (String datos){
        if(datos.contains("TIENDA"))
        {  
            datosTienda(datos);
        }
        else if(datos.contains("TIEMPO"))
            {    
                datosTiempo_envio(datos);
            }
        else if(datos.contains("PRODUCTO"))
            {    
                datosProducto(datos);
            }
        else if(datos.contains("EMPLEADO"))
            {    
                datosEmpleados(datos);
            }
        else if (datos.contains("CLIENTE"))
            {
                datosClientes(datos);
            }
        else if(datos.contains("PEDIDO"))
            {    
                 datosPedido(datos);
            }
        else {
            System.out.println("ERROR, NO HAY DATOS");
        }
    }
    //metodo para cargar datos de la tienda del txt
      public void datosTienda(String datos){
        String [] partes = datos.split(",");
        System.out.println(datos);
        System.out.println("Tabla: "+partes[0]);
        System.out.println("NombreTienda: "+partes[1]);
        System.out.println("Direccion: "+partes[2]);
        System.out.println("IdTienda: "+partes[3]);
        System.out.println("Telefono1"+partes[4]);
        
        TIENDA nuevo = new TIENDA(partes[1],partes[2],partes[3],partes[4]);
        NuevosDatos_Entidades.NuevosTienda llenar = new NuevosTienda();
        llenar.insertarTienda(nuevo);    
        }
      //para cargar datos de empleados del txt 
        public void datosEmpleados(String datos){
        String [] partes = datos.split(",");
        System.out.println(datos);
        System.out.println("Tabla: "+partes[0]);
        System.out.println("NombreEmpleado: "+partes[1]);
        System.out.println("IdEmpleado: "+partes[2]);
        System.out.println("Telefono"+partes[3]);
        System.out.println("DpiEmpleado: "+partes[4]);
        
        EMPLEADO nuevo = new EMPLEADO(partes[1], partes[2], partes[3], partes[4]);
        NuevosDatos_Entidades.NuevosEmpleados llenar = new NuevosEmpleados();
        llenar.registrarEmpleado(nuevo);      
        }
        //metodo para cargar datos ded clientes
          public void datosClientes (String datos){
        String [] partes = datos.split(",");
        Double creditoCompra = Double.parseDouble(partes[4]);
        System.out.println(datos);
        System.out.println("Tabla: "+partes[0]);
        System.out.println("Nombre: "+partes[1]);
        System.out.println("NIT: "+partes[2]);
        System.out.println("Telefono: "+partes[3]);
        System.out.println("Credito de Compra: "+creditoCompra);
        CLIENTE nuevo = new CLIENTE(partes[1], partes[2], partes[3], creditoCompra);
        
        NuevosDatos_Entidades.NuevosClientes llenar = new NuevosClientes();
        llenar.agregarClientes(nuevo);
        }
    //cargar datos del tiempo en le txt
       public void datosTiempo_envio (String datos){
        String [] partes = datos.split(",");
        int tiempoEntreTiendas = Integer.parseInt(partes[3]);
        System.out.println(datos);
        System.out.println("Tabla: "+partes[0]);
        System.out.println("TiendaOrigen: "+partes[1]);
        System.out.println("TiendaDestino: "+partes[2]);
        System.out.println("TiempoDías: "+tiempoEntreTiendas);
        
        TIEMPO_ENVIO nuevo = new TIEMPO_ENVIO ( partes[1], partes[2], tiempoEntreTiendas);
        NuevosDatos_Entidades.NuevoTiempo_envio llenar = new NuevoTiempo_envio();
        llenar.registrarTiempo_envio(nuevo);
        }
       //metodo para cargar datos del producto del txt campos obligatorios
         public void datosProducto(String datos){
        String [] partes = datos.split(",");
        int existencias_cantidad = Integer.parseInt(partes[4]);
        Double precio_producto = Double.parseDouble(partes[5]);
        System.out.println(datos);
        System.out.println("Tabla: "+partes[0]);
        System.out.println("Nombre: "+partes[1]);
        System.out.println("Fabricante: "+partes[2]);
        System.out.println("IdProducto: "+partes[3]);
        System.out.println("Cantidad: "+existencias_cantidad);
        System.out.println("Precio: "+precio_producto);
        System.out.println("IdTienda: "+partes[6]);
  
        PRODUCTO nuevo = new PRODUCTO (partes[1], partes[2], partes[3], existencias_cantidad, precio_producto, partes[6] );
        NuevosDatos_Entidades.NuevosProducto llenar = new NuevosProducto();
        llenar.insertarProducto(nuevo);    
   
        }   
         //metodo para cargar pedidos en el txt los campos obligatorios
           public void datosPedido(String datos){
        String [] partes = datos.split(",");
        int idPedido = Integer.parseInt(partes[1]);
        int cantidadTienda = Integer.parseInt(partes[7]);
        Double total = Double.parseDouble(partes[8]);
        Double anticipoTotal = Double.parseDouble(partes[9]);

        System.out.println(datos);
        System.out.println("Tabla: "+partes[0]);
        System.out.println("IdPedido "+ idPedido);
        System.out.println("TiendaOrigen: "+partes[2]);
        System.out.println("TiendaDestino: "+partes[3]);
        System.out.println("Fecha: "+partes[4]);
        System.out.println("NitCliente: "+ partes[5]);
        System.out.println("IdProductos: "+ partes[6]);
        System.out.println("Cantidad: "+ cantidadTienda);
        System.out.println("Total: "+ total);
        System.out.println("Anticipo: "+ anticipoTotal);
     
        PEDIDO nuevo = new PEDIDO (idPedido, partes[2], partes[3], partes[4], partes[5], partes[6], cantidadTienda, total, anticipoTotal);
        NuevosDatos_Entidades.NuevosPedidos llenar = new NuevosPedidos();
        llenar.registrarPedidos(nuevo);    
       
        }   
}
