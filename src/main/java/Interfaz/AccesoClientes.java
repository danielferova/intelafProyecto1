/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import ConexionBD.Conexion;
import EntidadesMapeo.CLIENTE;
import InterfazClientes.ClientesMenu;
import NuevosDatos_Entidades.NuevosClientes;
import java.awt.Color;
import java.awt.Image;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/**
 *
 * @author danielferova
 */
public class AccesoClientes extends javax.swing.JFrame {
    
    String Icono =  "logo2.png";
    

    /**
     * Creates new form Inicio
     */
    public AccesoClientes() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.ORANGE);
        cargarIcono(Icono);
        nuevosClientes = new NuevosClientes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        intelaf = new javax.swing.JLabel();
        nitC = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        accederC = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sesion");
        setBackground(new java.awt.Color(0, 255, 51));
        setForeground(new java.awt.Color(102, 255, 51));

        intelaf.setText("jLabel3");

        nitC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nitCActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(251, 241, 241));
        jLabel2.setText("NIT CLIENTE:");

        accederC.setBackground(new java.awt.Color(5, 0, 0));
        accederC.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        accederC.setForeground(new java.awt.Color(245, 235, 235));
        accederC.setText("ACCEDER");
        accederC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accederCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(accederC, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(intelaf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nitC, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(147, 147, 147))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(intelaf, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nitC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(accederC, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nitCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nitCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nitCActionPerformed

   
    
    private void accederCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accederCActionPerformed
        //Para poder ingresar la contraseña, el id_Empleado
        
        String codigo =nitC.getText();
        Verificar usuario = new Verificar();
        CLIENTE cliente = usuario.loginCliente(codigo);
        if(cliente != null)
        {
            JOptionPane.showMessageDialog(null, "BIENVENIDO");
            
        ClientesMenu accesarAlMenu = new ClientesMenu();
        accesarAlMenu.setVisible(true);
        this.setVisible(false);   
        
        }
        else if(nitC.getText()==""){
            JOptionPane.showMessageDialog(null, "Ingrese su NIT");
            
        }
        else{
            JOptionPane.showMessageDialog(null, "ERROR NIT incorrecto");
        
        }
        
       
    }//GEN-LAST:event_accederCActionPerformed

     public void cargarIcono(String NombreImagen)
    {
        ImageIcon imageIcon = new ImageIcon(getClass().getClassLoader().getResource(NombreImagen));
        ImageIcon imageIconFinal = new ImageIcon(imageIcon.getImage().getScaledInstance(intelaf.getWidth(), intelaf.getHeight(), Image.SCALE_DEFAULT));
        intelaf.setIcon(imageIconFinal);
    }
    

      NuevosClientes nuevosClientes; 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accederC;
    private javax.swing.JLabel intelaf;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField nitC;
    // End of variables declaration//GEN-END:variables
}
