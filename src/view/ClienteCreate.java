/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import bean.AuditoriaSistema;
import bean.Cliente;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge
 */
public class ClienteCreate extends javax.swing.JFrame {
    private char ch;
    private int resp;

    /**
     * Creates new form ClienteCreate
     */
    public ClienteCreate() {
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

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("proyectoPU").createEntityManager();
        query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM Cliente c");
        list = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(query.getResultList());
        jPanel1 = new javax.swing.JPanel();
        tf_apellido = new javax.swing.JTextField();
        tf_telef = new javax.swing.JTextField();
        lbl_apellido = new javax.swing.JLabel();
        tf_email = new javax.swing.JTextField();
        lbl_direccion = new javax.swing.JLabel();
        lbl_cedula = new javax.swing.JLabel();
        lbl_ruc = new javax.swing.JLabel();
        tf_ruc = new javax.swing.JTextField();
        tf_cedula = new javax.swing.JTextField();
        lbl_email = new javax.swing.JLabel();
        tf_direccion = new javax.swing.JTextField();
        lbl_nombre = new javax.swing.JLabel();
        lbl_telef = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btn_cancelar = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lbl_registrarC = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tf_apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_apellidoKeyTyped(evt);
            }
        });

        tf_telef.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_telefKeyTyped(evt);
            }
        });

        lbl_apellido.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbl_apellido.setText("Apellido:");

        tf_email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_emailKeyTyped(evt);
            }
        });

        lbl_direccion.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbl_direccion.setText("Dirección:");

        lbl_cedula.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbl_cedula.setText("Cedula:");

        lbl_ruc.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbl_ruc.setText("RUC:");

        tf_ruc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_rucActionPerformed(evt);
            }
        });
        tf_ruc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_rucFocusLost(evt);
            }
        });
        tf_ruc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_rucKeyTyped(evt);
            }
        });

        tf_cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_cedulaActionPerformed(evt);
            }
        });
        tf_cedula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_cedulaFocusLost(evt);
            }
        });
        tf_cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_cedulaKeyTyped(evt);
            }
        });

        lbl_email.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbl_email.setText("Email:");

        tf_direccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_direccionKeyTyped(evt);
            }
        });

        lbl_nombre.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbl_nombre.setText("Nombre:");

        lbl_telef.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbl_telef.setText("Teléfono:");

        tf_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nombreActionPerformed(evt);
            }
        });
        tf_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_nombreKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_ruc)
                            .addComponent(lbl_cedula))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_cedula)
                            .addComponent(tf_ruc)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_nombre)
                            .addComponent(lbl_apellido))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_nombre)
                            .addComponent(tf_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_telef)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tf_telef, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_email)
                            .addComponent(lbl_direccion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_email, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_direccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cedula)
                    .addComponent(tf_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_email)
                    .addComponent(tf_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_ruc)
                    .addComponent(tf_ruc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_direccion)
                    .addComponent(tf_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombre)
                    .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_telef)
                    .addComponent(tf_telef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_apellido)
                    .addComponent(tf_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete.png"))); // NOI18N
        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btn_guardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(btn_cancelar)
                .addGap(34, 34, 34))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_cancelar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btn_guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        lbl_registrarC.setFont(new java.awt.Font("Corbel", 1, 30)); // NOI18N
        lbl_registrarC.setForeground(new java.awt.Color(255, 255, 255));
        lbl_registrarC.setText("Registrar Cliente");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_registrarC)
                .addGap(163, 163, 163))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_registrarC)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_cedulaActionPerformed

    private void tf_rucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_rucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_rucActionPerformed

    private void tf_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nombreActionPerformed

    private void tf_cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_cedulaKeyTyped
        // TODO add your handling code here:
        int limite=11;
        if(tf_cedula.getText().length()==limite){
            getToolkit().beep();
            evt.consume(); //se le ignora

        }
    }//GEN-LAST:event_tf_cedulaKeyTyped

    private void tf_rucKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_rucKeyTyped
        // TODO add your handling code here:
        int limite=45;
         if(tf_ruc.getText().length()==limite){
            getToolkit().beep();
            evt.consume(); //se le ignora

        }
    }//GEN-LAST:event_tf_rucKeyTyped

    private void tf_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_nombreKeyTyped
        // TODO add your handling code here:
        int limite=45;
        if(tf_nombre.getText().length()==limite){
            getToolkit().beep();
            evt.consume(); //se le ignora

        }
        ch=evt.getKeyChar();
        if(Character.isDigit(ch)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_tf_nombreKeyTyped

    private void tf_apellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_apellidoKeyTyped
        // TODO add your handling code here:
         int limite=45;
        if(tf_apellido.getText().length()==limite){
            getToolkit().beep();
            evt.consume(); //se le ignora

        }
        ch=evt.getKeyChar();
        if(Character.isDigit(ch)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_tf_apellidoKeyTyped

    private void tf_emailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_emailKeyTyped
        // TODO add your handling code here:
        int limite=45;
        if(tf_email.getText().length()==limite){
            getToolkit().beep();
            evt.consume(); //se le ignora

        }
    }//GEN-LAST:event_tf_emailKeyTyped

    private void tf_direccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_direccionKeyTyped
        // TODO add your handling code here:
        int limite=45;
        if(tf_direccion.getText().length()==limite){
            getToolkit().beep();
            evt.consume(); //se le ignora

        }
    }//GEN-LAST:event_tf_direccionKeyTyped

    private void tf_telefKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_telefKeyTyped
        // TODO add your handling code here:
        int limite=10;
        if(tf_telef.getText().length()==limite){
            getToolkit().beep();
            evt.consume(); //se le ignora

        }
        ch=evt.getKeyChar();
        if(!Character.isDigit(ch)){
            getToolkit().beep();
            evt.consume();
        }
        
    }//GEN-LAST:event_tf_telefKeyTyped

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void tf_cedulaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_cedulaFocusLost
        // TODO add your handling code here:
      
      
    }//GEN-LAST:event_tf_cedulaFocusLost

    private void tf_rucFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_rucFocusLost
        // TODO add your handling code here:
      
    }//GEN-LAST:event_tf_rucFocusLost

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        // TODO add your handling code here:
       
        if(tf_cedula.getText().length()==0 || tf_nombre.getText().length()==0
             || tf_apellido.getText().length()==0 || tf_email.getText().length()==0
              || tf_direccion.getText().length()==0 || tf_telef.getText().length()==0  ){
             JOptionPane.showMessageDialog(null,"No se permiten campos con valores nulos", "Error",JOptionPane.ERROR_MESSAGE);
             return;    
        }else{
                query=entityManager.createNamedQuery("Cliente.findByCedula");
                query.setParameter("cedula", tf_cedula.getText());
                List<Cliente> cli=query.getResultList();
                if(cli.size()>=1){
                    JOptionPane.showMessageDialog(null,"El número de cedula ya ha sido registrado", "Error",JOptionPane.ERROR_MESSAGE);
                    tf_cedula.setText(null);
                    return;
                 }
                 if(tf_ruc.getText().length()!=0){
                    query=entityManager.createNamedQuery("Cliente.findByRuc");
                    query.setParameter("ruc", tf_ruc.getText().toLowerCase());
                    List<Cliente> cl=query.getResultList();
                    if(cl.size()>=1){
                         JOptionPane.showMessageDialog(null,"El número de RUC ya ha sido registrado", "Error",JOptionPane.ERROR_MESSAGE);
                         return;
                     }  
                 } 
               resp=  JOptionPane.showConfirmDialog(null,"Desea Registrar un nuevo Cliente?", "Confirmar Creación",JOptionPane.YES_NO_OPTION );
               if (resp==JOptionPane.YES_OPTION){
                   entityManager.getTransaction().begin();
                   Cliente c=new Cliente();
                   c.setCedula(tf_cedula.getText());
                   c.setRuc(tf_ruc.getText().toLowerCase());
                   c.setNombre(tf_nombre.getText().toLowerCase());
                   c.setApellido(tf_apellido.getText().toLowerCase());
                   c.setTelefono(Integer.parseInt(tf_telef.getText()));
                   c.setDireccion(tf_direccion.getText().toLowerCase());
                   c.setEmail(tf_email.getText().toLowerCase());
                   entityManager.persist(c);
                   entityManager.flush();
                   //registramos los datos necesarios para la auditoria
                    AuditoriaSistema as=new AuditoriaSistema();
                    as.setAccion("Inserción");
                    as.setTabla("Cliente");
                    as.setAntes(c.toString());
                    as.setDespues("No hay cambios");
                    //trabajamos con la fecha
                    Date fecha=new Date();
                    DateFormat formato=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                    as.setFechaHora(formato.format(fecha));
                    as.setUsuario(LoginView.nombreUsuario);  
                    entityManager.persist(as);
                    entityManager.getTransaction().commit();
                    JOptionPane.showMessageDialog(null,"Creación exitosa", "Confirmación",JOptionPane.INFORMATION_MESSAGE);
                     tf_cedula.setText(null);
                     tf_ruc.setText(null);
                     tf_nombre.setText(null);
                     tf_apellido.setText(null);
                     tf_telef.setText(null);
                     tf_direccion.setText(null);
                     tf_email.setText(null);
               }else{
                   this.setVisible(false);
               }
        }
    }//GEN-LAST:event_btn_guardarActionPerformed

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
            java.util.logging.Logger.getLogger(ClienteCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame=new ClienteCreate();
                frame.setTitle("Registrar Cliente");
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_guardar;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbl_apellido;
    private javax.swing.JLabel lbl_cedula;
    private javax.swing.JLabel lbl_direccion;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_registrarC;
    private javax.swing.JLabel lbl_ruc;
    private javax.swing.JLabel lbl_telef;
    private java.util.List<bean.Cliente> list;
    private javax.persistence.Query query;
    private javax.swing.JTextField tf_apellido;
    private javax.swing.JTextField tf_cedula;
    private javax.swing.JTextField tf_direccion;
    private javax.swing.JTextField tf_email;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_ruc;
    private javax.swing.JTextField tf_telef;
    // End of variables declaration//GEN-END:variables
}
