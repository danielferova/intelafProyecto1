/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;


import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;



/**
 *
 * @author danielferova
 */
public class EmpleadosMenu extends javax.swing.JFrame {
      String imagen =  "intelaf1.png";
    /**
     * MI menu empleados
     */
    public EmpleadosMenu() {
        initComponents();
        this.setLocationRelativeTo(null);
        //this.getContentPane().setBackground(Color.ORANGE);
        cargarIcono(imagen);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JPanel();
        intelaf = new javax.swing.JLabel();
        nombreEmpleado = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        name = new javax.swing.JLabel();
        menu = new javax.swing.JMenuBar();
        verDatos = new javax.swing.JMenu();
        verEmpleado = new javax.swing.JMenuItem();
        verCliente = new javax.swing.JMenuItem();
        verTienda = new javax.swing.JMenuItem();
        verProducto = new javax.swing.JMenuItem();
        verTiempo = new javax.swing.JMenuItem();
        editarDatos = new javax.swing.JMenu();
        editarEmpleado = new javax.swing.JMenuItem();
        editarCLiente = new javax.swing.JMenuItem();
        editarInventarioProducto = new javax.swing.JMenuItem();
        editarTiempoTienda = new javax.swing.JMenuItem();
        ingresar = new javax.swing.JMenu();
        registroEmpleado = new javax.swing.JMenuItem();
        registroCliente = new javax.swing.JMenuItem();
        registroTienda = new javax.swing.JMenuItem();
        registroProducto = new javax.swing.JMenuItem();
        registroTiempoTiendas = new javax.swing.JMenuItem();
        generarVenta = new javax.swing.JMenu();
        realizarVenta = new javax.swing.JMenuItem();
        realizarPedido = new javax.swing.JMenuItem();
        exportarReportes = new javax.swing.JMenu();
        reportePedidoPorLlegarTienda = new javax.swing.JMenuItem();
        reportePedidoLlegoTienda = new javax.swing.JMenuItem();
        reportePedidoAtrasado = new javax.swing.JMenuItem();
        reportePedidoRuta = new javax.swing.JMenuItem();
        reporteComprasCliente = new javax.swing.JMenuItem();
        reportePedidoCliente = new javax.swing.JMenuItem();
        reporteProductoPopular = new javax.swing.JMenuItem();
        reportePedidoModaTienda = new javax.swing.JMenuItem();
        reporteNoVendido = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Empleado");
        setBackground(new java.awt.Color(254, 254, 254));
        setForeground(new java.awt.Color(102, 255, 51));

        escritorio.setBackground(new java.awt.Color(255, 130, 0));
        escritorio.setForeground(new java.awt.Color(255, 164, 51));

        intelaf.setText("Icono");

        nombreEmpleado.setBackground(new java.awt.Color(254, 254, 254));
        nombreEmpleado.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        nombreEmpleado.setForeground(new java.awt.Color(1, 1, 1));

        salir.setBackground(new java.awt.Color(1, 1, 1));
        salir.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        salir.setForeground(new java.awt.Color(254, 254, 254));
        salir.setText("SALIR");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                .addGap(79, 503, Short.MAX_VALUE)
                .addComponent(intelaf, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(452, 452, 452))
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(nombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(intelaf, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, Short.MAX_VALUE)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
        );

        name.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        name.setForeground(new java.awt.Color(1, 1, 1));
        name.setText("EMPLEADO");

        menu.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N

        verDatos.setBackground(new java.awt.Color(254, 254, 254));
        verDatos.setForeground(new java.awt.Color(1, 1, 1));
        verDatos.setText("VER DATOS");
        verDatos.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N

        verEmpleado.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        verEmpleado.setText("Empleados");
        verEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verEmpleadoActionPerformed(evt);
            }
        });
        verDatos.add(verEmpleado);

        verCliente.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        verCliente.setText("Clientes");
        verCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verClienteActionPerformed(evt);
            }
        });
        verDatos.add(verCliente);

        verTienda.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        verTienda.setText("Tienda");
        verTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verTiendaActionPerformed(evt);
            }
        });
        verDatos.add(verTienda);

        verProducto.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        verProducto.setText("Productos");
        verProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verProductoActionPerformed(evt);
            }
        });
        verDatos.add(verProducto);

        verTiempo.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        verTiempo.setText("Tiempo Tiendas");
        verTiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verTiempoActionPerformed(evt);
            }
        });
        verDatos.add(verTiempo);

        menu.add(verDatos);

        editarDatos.setBackground(new java.awt.Color(254, 254, 254));
        editarDatos.setForeground(new java.awt.Color(1, 1, 1));
        editarDatos.setText("EDITAR");
        editarDatos.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N

        editarEmpleado.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        editarEmpleado.setText("Empleados");
        editarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarEmpleadoActionPerformed(evt);
            }
        });
        editarDatos.add(editarEmpleado);

        editarCLiente.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        editarCLiente.setText("CLientes");
        editarCLiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarCLienteActionPerformed(evt);
            }
        });
        editarDatos.add(editarCLiente);

        editarInventarioProducto.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        editarInventarioProducto.setText("Inventario");
        editarInventarioProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarInventarioProductoActionPerformed(evt);
            }
        });
        editarDatos.add(editarInventarioProducto);

        editarTiempoTienda.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        editarTiempoTienda.setText("Tiempo Tiendas");
        editarTiempoTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarTiempoTiendaActionPerformed(evt);
            }
        });
        editarDatos.add(editarTiempoTienda);

        menu.add(editarDatos);

        ingresar.setBackground(new java.awt.Color(254, 254, 254));
        ingresar.setForeground(new java.awt.Color(1, 1, 1));
        ingresar.setText("INGRESAR NUEVOS DATOS");
        ingresar.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N

        registroEmpleado.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        registroEmpleado.setText("Ingresar Empleado");
        registroEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroEmpleadoActionPerformed(evt);
            }
        });
        ingresar.add(registroEmpleado);

        registroCliente.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        registroCliente.setText("Ingresar Cliente");
        registroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroClienteActionPerformed(evt);
            }
        });
        ingresar.add(registroCliente);

        registroTienda.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        registroTienda.setText("Ingresar Tienda");
        registroTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroTiendaActionPerformed(evt);
            }
        });
        ingresar.add(registroTienda);

        registroProducto.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        registroProducto.setText("Ingresar Producto");
        registroProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroProductoActionPerformed(evt);
            }
        });
        ingresar.add(registroProducto);

        registroTiempoTiendas.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        registroTiempoTiendas.setText("Ingresar Tiempo Tiendas");
        registroTiempoTiendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroTiempoTiendasActionPerformed(evt);
            }
        });
        ingresar.add(registroTiempoTiendas);

        menu.add(ingresar);

        generarVenta.setBackground(new java.awt.Color(254, 254, 254));
        generarVenta.setForeground(new java.awt.Color(1, 1, 1));
        generarVenta.setText("VENTAS");
        generarVenta.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N

        realizarVenta.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        realizarVenta.setText("Nueva Venta");
        realizarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                realizarVentaActionPerformed(evt);
            }
        });
        generarVenta.add(realizarVenta);

        realizarPedido.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        realizarPedido.setText("Pedidos");
        realizarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                realizarPedidoActionPerformed(evt);
            }
        });
        generarVenta.add(realizarPedido);

        menu.add(generarVenta);

        exportarReportes.setBackground(new java.awt.Color(254, 254, 254));
        exportarReportes.setForeground(new java.awt.Color(1, 1, 1));
        exportarReportes.setText("REPORTES");
        exportarReportes.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N

        reportePedidoPorLlegarTienda.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        reportePedidoPorLlegarTienda.setText("Llegará a la Tienda");
        reportePedidoPorLlegarTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportePedidoPorLlegarTiendaActionPerformed(evt);
            }
        });
        exportarReportes.add(reportePedidoPorLlegarTienda);

        reportePedidoLlegoTienda.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        reportePedidoLlegoTienda.setText("Está en  la Tienda");
        reportePedidoLlegoTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportePedidoLlegoTiendaActionPerformed(evt);
            }
        });
        exportarReportes.add(reportePedidoLlegoTienda);

        reportePedidoAtrasado.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        reportePedidoAtrasado.setText("Pedido de Entrega Atrasada");
        reportePedidoAtrasado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportePedidoAtrasadoActionPerformed(evt);
            }
        });
        exportarReportes.add(reportePedidoAtrasado);

        reportePedidoRuta.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        reportePedidoRuta.setText("Pedido en Ruta");
        reportePedidoRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportePedidoRutaActionPerformed(evt);
            }
        });
        exportarReportes.add(reportePedidoRuta);

        reporteComprasCliente.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        reporteComprasCliente.setText("Compra por CLiente");
        reporteComprasCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporteComprasClienteActionPerformed(evt);
            }
        });
        exportarReportes.add(reporteComprasCliente);

        reportePedidoCliente.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        reportePedidoCliente.setText("Pedido por CLiente");
        reportePedidoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportePedidoClienteActionPerformed(evt);
            }
        });
        exportarReportes.add(reportePedidoCliente);

        reporteProductoPopular.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        reporteProductoPopular.setText("Lo más Vendido Tiempo");
        reporteProductoPopular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporteProductoPopularActionPerformed(evt);
            }
        });
        exportarReportes.add(reporteProductoPopular);

        reportePedidoModaTienda.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        reportePedidoModaTienda.setText("Lo más Vendido Tienda");
        reportePedidoModaTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportePedidoModaTiendaActionPerformed(evt);
            }
        });
        exportarReportes.add(reportePedidoModaTienda);

        reporteNoVendido.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        reporteNoVendido.setText("Jamás Vendido");
        reporteNoVendido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporteNoVendidoActionPerformed(evt);
            }
        });
        exportarReportes.add(reporteNoVendido);

        menu.add(exportarReportes);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(name)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(name)
                .addGap(5, 5, 5)
                .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public JLabel getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(JLabel nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }
   
    private void registroTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroTiendaActionPerformed

      IngresarTienda registrarTienda = new IngresarTienda();
      escritorio.removeAll();
      escritorio.updateUI();
      escritorio.add(registrarTienda);
      registrarTienda.show();
    }//GEN-LAST:event_registroTiendaActionPerformed

    private void registroProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroProductoActionPerformed
      IngresarProducto registrarProducto = new IngresarProducto();
      escritorio.removeAll();
      escritorio.updateUI();
      escritorio.add(registrarProducto);
      registrarProducto.show();
      
    }//GEN-LAST:event_registroProductoActionPerformed

    private void registroEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroEmpleadoActionPerformed
      IngresarEmpleados registrarEmpleado = new IngresarEmpleados();
      escritorio.removeAll();
      escritorio.updateUI();
      escritorio.add(registrarEmpleado);
      registrarEmpleado.show();
    }//GEN-LAST:event_registroEmpleadoActionPerformed

    private void registroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroClienteActionPerformed

      IngresarClientes registrarCliente = new IngresarClientes();
      escritorio.removeAll();
      escritorio.updateUI();
      escritorio.add(registrarCliente);
      registrarCliente.show();
    }//GEN-LAST:event_registroClienteActionPerformed

    private void registroTiempoTiendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroTiempoTiendasActionPerformed
      IngresarTiempo registrarTiempoTienda = new IngresarTiempo();
      escritorio.removeAll();
      escritorio.updateUI();
      escritorio.add(registrarTiempoTienda);
      registrarTiempoTienda.show();
    }//GEN-LAST:event_registroTiempoTiendasActionPerformed

    private void verTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verTiendaActionPerformed
      VerTiendas verTienda1 = new VerTiendas();
      escritorio.removeAll();
      escritorio.updateUI();
      escritorio.add(verTienda1);
      verTienda1.show();
    }//GEN-LAST:event_verTiendaActionPerformed

    private void verProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verProductoActionPerformed
      VerProductos verProducto1 = new VerProductos();
      escritorio.removeAll();
      escritorio.updateUI();
      escritorio.add(verProducto1);
      verProducto1.show();
    }//GEN-LAST:event_verProductoActionPerformed

    private void verEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verEmpleadoActionPerformed
      VerEmpleados verEmpleado1 = new VerEmpleados();
      escritorio.removeAll();
      escritorio.updateUI();
      escritorio.add(verEmpleado1);
      verEmpleado1.show();
    }//GEN-LAST:event_verEmpleadoActionPerformed

    private void verClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verClienteActionPerformed
      VerClientes verCliente1 = new VerClientes();
      escritorio.removeAll();
      escritorio.updateUI();
      escritorio.add(verCliente1);
      verCliente1.show();
    }//GEN-LAST:event_verClienteActionPerformed

    private void verTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verTiempoActionPerformed
      VerTiempoEnvio verTiempoTienda1 = new VerTiempoEnvio();
      escritorio.removeAll();
      escritorio.updateUI();
      escritorio.add(verTiempoTienda1);
      verTiempoTienda1.show();
    }//GEN-LAST:event_verTiempoActionPerformed

    private void editarTiempoTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarTiempoTiendaActionPerformed
 
    }//GEN-LAST:event_editarTiempoTiendaActionPerformed

    private void editarInventarioProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarInventarioProductoActionPerformed
  
      
    }//GEN-LAST:event_editarInventarioProductoActionPerformed

    private void realizarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realizarVentaActionPerformed
       
    }//GEN-LAST:event_realizarVentaActionPerformed

    private void realizarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realizarPedidoActionPerformed
        // TODO add your handling code here:
      NuevosPedidos nuevoPedido = new NuevosPedidos();
      escritorio.removeAll();
      escritorio.updateUI();
      escritorio.add(nuevoPedido);
      nuevoPedido.show();
        
    }//GEN-LAST:event_realizarPedidoActionPerformed

    private void reportePedidoPorLlegarTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportePedidoPorLlegarTiendaActionPerformed
    
      escritorio.removeAll();
      escritorio.updateUI();
     
    }//GEN-LAST:event_reportePedidoPorLlegarTiendaActionPerformed

    private void editarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarEmpleadoActionPerformed
      
      escritorio.removeAll();
      escritorio.updateUI();
    
    }//GEN-LAST:event_editarEmpleadoActionPerformed

    private void editarCLienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarCLienteActionPerformed
   
      escritorio.removeAll();
      escritorio.updateUI();
      
    }//GEN-LAST:event_editarCLienteActionPerformed

    private void reportePedidoLlegoTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportePedidoLlegoTiendaActionPerformed
    
      escritorio.removeAll();
      escritorio.updateUI();
     
    }//GEN-LAST:event_reportePedidoLlegoTiendaActionPerformed

    private void reportePedidoAtrasadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportePedidoAtrasadoActionPerformed
     // Reporte_Atrasados reporteAtrasado = new Reporte_Atrasados();
      escritorio.removeAll();
      escritorio.updateUI();
      //escritorio.add(reporteAtrasado);
      //reporteAtrasado.show();
          }//GEN-LAST:event_reportePedidoAtrasadoActionPerformed

    private void reportePedidoRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportePedidoRutaActionPerformed
     
      escritorio.removeAll();
      escritorio.updateUI();
     
    }//GEN-LAST:event_reportePedidoRutaActionPerformed

    private void reporteComprasClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporteComprasClienteActionPerformed
     
      escritorio.removeAll();
      escritorio.updateUI();
     
    }//GEN-LAST:event_reporteComprasClienteActionPerformed

    private void reportePedidoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportePedidoClienteActionPerformed
      
      escritorio.removeAll();
      escritorio.updateUI();
      
    }//GEN-LAST:event_reportePedidoClienteActionPerformed

    private void reporteProductoPopularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporteProductoPopularActionPerformed
      ;
      escritorio.removeAll();
      escritorio.updateUI();
    
    }//GEN-LAST:event_reporteProductoPopularActionPerformed

    private void reportePedidoModaTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportePedidoModaTiendaActionPerformed
       
      escritorio.removeAll();
      escritorio.updateUI();
      
    }//GEN-LAST:event_reportePedidoModaTiendaActionPerformed

    private void reporteNoVendidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporteNoVendidoActionPerformed
      //Reporte_No_Vendido reporteJamasVendido = new Reporte_No_Vendido(); 
      escritorio.removeAll();
      escritorio.updateUI();
     // escritorio.add(reporteJamasVendido);
      //reporteJamasVendido.show();
    }//GEN-LAST:event_reporteNoVendidoActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

  public void cargarIcono(String NombreImagen)
    {
       ImageIcon imageIcon = new ImageIcon(getClass().getClassLoader().getResource(NombreImagen));
        ImageIcon imageIconFinal = new ImageIcon(imageIcon.getImage().getScaledInstance(intelaf.getWidth(), intelaf.getHeight(), Image.SCALE_DEFAULT));
        intelaf.setIcon(imageIconFinal);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem editarCLiente;
    private javax.swing.JMenu editarDatos;
    private javax.swing.JMenuItem editarEmpleado;
    private javax.swing.JMenuItem editarInventarioProducto;
    private javax.swing.JMenuItem editarTiempoTienda;
    private javax.swing.JPanel escritorio;
    private javax.swing.JMenu exportarReportes;
    private javax.swing.JMenu generarVenta;
    private javax.swing.JMenu ingresar;
    public javax.swing.JLabel intelaf;
    private javax.swing.JMenuBar menu;
    private javax.swing.JLabel name;
    private javax.swing.JLabel nombreEmpleado;
    private javax.swing.JMenuItem realizarPedido;
    private javax.swing.JMenuItem realizarVenta;
    private javax.swing.JMenuItem registroCliente;
    private javax.swing.JMenuItem registroEmpleado;
    private javax.swing.JMenuItem registroProducto;
    private javax.swing.JMenuItem registroTiempoTiendas;
    private javax.swing.JMenuItem registroTienda;
    private javax.swing.JMenuItem reporteComprasCliente;
    private javax.swing.JMenuItem reporteNoVendido;
    private javax.swing.JMenuItem reportePedidoAtrasado;
    private javax.swing.JMenuItem reportePedidoCliente;
    private javax.swing.JMenuItem reportePedidoLlegoTienda;
    private javax.swing.JMenuItem reportePedidoModaTienda;
    private javax.swing.JMenuItem reportePedidoPorLlegarTienda;
    private javax.swing.JMenuItem reportePedidoRuta;
    private javax.swing.JMenuItem reporteProductoPopular;
    private javax.swing.JButton salir;
    private javax.swing.JMenuItem verCliente;
    private javax.swing.JMenu verDatos;
    private javax.swing.JMenuItem verEmpleado;
    private javax.swing.JMenuItem verProducto;
    private javax.swing.JMenuItem verTiempo;
    private javax.swing.JMenuItem verTienda;
    // End of variables declaration//GEN-END:variables
}
