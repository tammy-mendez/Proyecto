/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import bean.AuditoriaSistema;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JFrame;

/**
 *
 * @author Jorge
 */
public class MenuRecepcionista extends javax.swing.JFrame {
     public static int opcion=0;

    /**
     * Creates new form MenuRecepcionista
     */
    public MenuRecepcionista() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        menu_cliente = new javax.swing.JMenu();
        mItem_crearC = new javax.swing.JMenuItem();
        mItem_editarC = new javax.swing.JMenuItem();
        mItem_eliminarC = new javax.swing.JMenuItem();
        mItem_buscarC = new javax.swing.JMenuItem();
        menu_salir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menu_cliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menu_cliente.setText("Administrar Clientes");
        menu_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_clienteActionPerformed(evt);
            }
        });

        mItem_crearC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon-student.png"))); // NOI18N
        mItem_crearC.setText("Registrar Cliente");
        mItem_crearC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItem_crearCActionPerformed(evt);
            }
        });
        menu_cliente.add(mItem_crearC);

        mItem_editarC.setText("Editar Cliente");
        mItem_editarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItem_editarCActionPerformed(evt);
            }
        });
        menu_cliente.add(mItem_editarC);

        mItem_eliminarC.setText("Eliminar Cliente");
        mItem_eliminarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItem_eliminarCActionPerformed(evt);
            }
        });
        menu_cliente.add(mItem_eliminarC);

        mItem_buscarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        mItem_buscarC.setText("Buscar Cliente");
        mItem_buscarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItem_buscarCActionPerformed(evt);
            }
        });
        menu_cliente.add(mItem_buscarC);

        jMenuBar1.add(menu_cliente);

        menu_salir.setText("Salir");
        menu_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_salirMouseClicked(evt);
            }
        });
        jMenuBar1.add(menu_salir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 276, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_clienteActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_menu_clienteActionPerformed

    private void mItem_crearCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItem_crearCActionPerformed
        // TODO add your handling code here:
        String args[]=new String[1];
        args[0]="Registrar Cliente";
        ClienteCreate.main(args);
    }//GEN-LAST:event_mItem_crearCActionPerformed

    private void mItem_eliminarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItem_eliminarCActionPerformed
        // TODO add your handling code here:
         opcion=2;
        String args[]=new String[1];
        args[0]="Buscar Cliente";
        ClienteBuscar.main(args);
    }//GEN-LAST:event_mItem_eliminarCActionPerformed

    private void mItem_editarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItem_editarCActionPerformed
        // TODO add your handling code here:
        opcion=1;
        String args[]=new String[1];
        args[0]="Buscar Cliente";
        ClienteBuscar.main(args);
    }//GEN-LAST:event_mItem_editarCActionPerformed

    private void mItem_buscarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItem_buscarCActionPerformed
        // TODO add your handling code here:
         opcion=3;
        String args[]=new String[1];
        args[0]="Buscar Cliente";
        ClienteBuscar.main(args);
    }//GEN-LAST:event_mItem_buscarCActionPerformed

    private void menu_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_salirMouseClicked
        // TODO add your handling code here:
           EntityManagerFactory fact=Persistence.createEntityManagerFactory("proyectoPU");
            EntityManager ema= fact.createEntityManager();
            ema.getTransaction().begin();
            //registramos los datos necesarios para la auditoria
            AuditoriaSistema as=new AuditoriaSistema();
            as.setAccion("Cerro Sesion");
            as.setTabla("Ninguna");
            //trabajamos con la fecha
            Date fecha=new Date();
            DateFormat formato=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
            as.setFechaHora(formato.format(fecha));
            as.setUsuario(LoginView.nombreUsuario);
            ema.persist(as);
            ema.getTransaction().commit();
            ema.close();
            this.setVisible(false);
            String args[]=new String[1];
            args[0]="Ingreso al sistema";
            LoginView.main(args);
                                  
    }//GEN-LAST:event_menu_salirMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuRecepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuRecepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuRecepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuRecepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame=new MenuRecepcionista();
                frame.setTitle("Menu Recepcionista");
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mItem_buscarC;
    private javax.swing.JMenuItem mItem_crearC;
    private javax.swing.JMenuItem mItem_editarC;
    private javax.swing.JMenuItem mItem_eliminarC;
    private javax.swing.JMenu menu_cliente;
    private javax.swing.JMenu menu_salir;
    // End of variables declaration//GEN-END:variables
}
