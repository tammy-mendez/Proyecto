/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import bean.AuditoriaSistema;
import bean.Correo;
import bean.Empleado;
import bean.Rol;
import bean.Usuario;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge
 */
public class UsuarioCreate extends javax.swing.JFrame {
   private char[] letras={'a','e','i','o','u','b','c','d','f','g'};
   private int numero;
   private String cadena="";
   private String receptor;
   private String password;// contrasenha del usuario para su acceso al sistema
   private String datos[]=new String[5];
   private int resp;
   

    /**
     * Creates new form UsuarioCreate
     */
    public UsuarioCreate() {
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        EntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("proyectoPU").createEntityManager();
        Query = java.beans.Beans.isDesignTime() ? null : EntityManager.createQuery("SELECT r FROM Rol r");
        List = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : Query.getResultList();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        rolListRenderizar1 = new renderizar.RolListRenderizar();
        empleadoQuery = java.beans.Beans.isDesignTime() ? null : EntityManager.createQuery("SELECT e FROM Empleado e");
        empleadoList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(empleadoQuery.getResultList());
        empleadoListRenderizar1 = new renderizar.EmpleadoListRenderizar();
        entityManager1 = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("proyectoPU").createEntityManager();
        btn_guardar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        list_rol = new javax.swing.JComboBox();
        lbl_passw = new javax.swing.JLabel();
        lbl_codempl = new javax.swing.JLabel();
        lbl_rol = new javax.swing.JLabel();
        tf_passw = new javax.swing.JPasswordField();
        list_empleado = new javax.swing.JComboBox();
        btn_cancelar = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        rolListRenderizar1.setText("rolListRenderizar1");

        empleadoListRenderizar1.setText("empleadoListRenderizar1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        list_rol.setRenderer(rolListRenderizar1);

        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, List, list_rol);
        bindingGroup.addBinding(jComboBoxBinding);

        list_rol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list_rolActionPerformed(evt);
            }
        });

        lbl_passw.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbl_passw.setText("Password:");

        lbl_codempl.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbl_codempl.setText("Codigo Empleado:");

        lbl_rol.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbl_rol.setText("Rol:");

        tf_passw.setEditable(false);
        tf_passw.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_passwFocusLost(evt);
            }
        });

        list_empleado.setRenderer(empleadoListRenderizar1);

        jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, empleadoList, list_empleado);
        bindingGroup.addBinding(jComboBoxBinding);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lbl_rol, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(list_rol, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_passw, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_codempl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(list_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_passw, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_codempl)
                    .addComponent(list_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_passw)
                    .addComponent(tf_passw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(list_rol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_rol))
                .addGap(45, 45, 45))
        );

        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(btn_guardar)
                        .addGap(53, 53, 53)
                        .addComponent(btn_cancelar)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardar)
                    .addComponent(btn_cancelar))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        // TODO add your handling code here:
        resp=  JOptionPane.showConfirmDialog(null,"Desea Registrar un nuevo usuario?", "Confirmar Creación",JOptionPane.YES_NO_OPTION );
        if (resp==JOptionPane.YES_OPTION){
             EntityManagerFactory fact=Persistence.createEntityManagerFactory("proyectoPU");
             EntityManager em=fact.createEntityManager();
             em.getTransaction().begin();
             Usuario u=new Usuario();
             Empleado e=new Empleado();
             //obtenemos el codigo del empleado seleccionado  en la lista
             e=(Empleado) list_empleado.getSelectedItem();
             //verificamos si el empleado ya no tiene una cuenta creada
             Query=EntityManager.createNamedQuery("Usuario.findByCodigoEmpleado");
             Query.setParameter("codigoEmpleado", e.getCodigoEmpleado());
             List<Usuario> usu=Query.getResultList();
             if(usu.size()!=0){
                  JOptionPane.showMessageDialog(null,"El empleado ya tiene una cuenta creada","Error",JOptionPane.ERROR_MESSAGE);
                  return;
             }else{/*
                u.setCodigoEmpleado(e.getCodigoEmpleado());
                u.setPassword(tf_passw.getText());
                Rol r= new Rol();
                r=(Rol) list_rol.getSelectedItem();
                u.setIdRol(r);
                //u.setIdRol(r.getIdRol());
                em.persist(u);
                em.getTransaction().commit();
                em.close();
                //perparamos los datos para el envio del correo electrónico
                datos[0]=e.getEmail();
                datos[1]="Creación de cuenta";
                datos[2]="Su código de usuario es:"+" "+"'"+e.getCodigoEmpleado()+"'" +" "+
                        "y su contraseña de acceso es:"+" "+"'"+u.getPassword()+"'";
                //enviamos el corrreo
                 Correo c=new Correo();
               if(c.enviarCorreo(datos)){
                   JOptionPane.showMessageDialog(null,"Creación Exitosa, sus datos fueron enviados a su email", "Aviso",JOptionPane.INFORMATION_MESSAGE);
                   this.setVisible(false);
               }else{
                    JOptionPane.showMessageDialog(null,"Creación exitosa,sus datos no puedieron ser enviados; verifique su dirrecion de email", "Error",JOptionPane.ERROR_MESSAGE);
               }
                
                 
             }
             
             
=======  */
                 try {
                     u.setCodigoEmpleado(e.getCodigoEmpleado());
                     u.setPassword(tf_passw.getText());
                     Rol r= new Rol();
                     r=(Rol) list_rol.getSelectedItem();
                     u.setIdRol(r);
                     em.persist(u);
                     //registramos los datos necesarios para la auditoria
                     AuditoriaSistema as=new AuditoriaSistema();
                     as.setAccion("Creación");
                     as.setTabla("Usuario");
                     //trabajamos con la fecha
                     Date fecha=new Date();
                     DateFormat formato=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                     as.setFechaHora(formato.parse(formato.format(fecha)));
                     as.setUsuario(LoginView.nombreUsuario);
                     em.persist(as);
                     em.getTransaction().commit();
                     em.close();
                     //perparamos los datos para el envio del correo electrónico
                     datos[0]=e.getEmail();
                     datos[1]="Creación de cuenta";
                     datos[2]="Su código de usuario es:"+" "+"'"+e.getCodigoEmpleado()+"'" +" "+
                             "y su contraseña de acceso es:"+" "+"'"+u.getPassword()+"'";
                     //enviamos el corrreo
                     Correo c=new Correo();
                     if(c.enviarCorreo(datos)){
                         JOptionPane.showMessageDialog(null,"Creación Exitosa, sus datos fueron enviados a su email", "Aviso",JOptionPane.INFORMATION_MESSAGE);
                         this.setVisible(false);
                     }else{
                         JOptionPane.showMessageDialog(null,"Creación exitosa,sus datos no puedieron ser enviados; verifique su dirrecion de email", "Error",JOptionPane.ERROR_MESSAGE);
                     }
                 } catch (ParseException ex) {
                     Logger.getLogger(UsuarioCreate.class.getName()).log(Level.SEVERE, null, ex);
                     }
                }    
             }else{
                    this.setVisible(false);
             }      
//>>>>>>> 7752fa995483bd5e39d468e1005364d798cc101a
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void list_rolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list_rolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_list_rolActionPerformed

    private void tf_passwFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_passwFocusLost
        // TODO add your handling code here:
        for(int i=0;i<3;i++){
            numero=(int)(Math.random()*9+1);
            cadena=cadena+""+numero+""+letras[numero];
        }
        
        tf_passw.setText(cadena);
        System.out.print(cadena);
        
    }//GEN-LAST:event_tf_passwFocusLost

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btn_cancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(final String args[]) {
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
            java.util.logging.Logger.getLogger(UsuarioCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsuarioCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsuarioCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsuarioCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame=new UsuarioCreate();
                frame.setVisible(true);
                frame.setTitle("Registrar Usuario");
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager EntityManager;
    private java.util.List<bean.Rol> List;
    private javax.persistence.Query Query;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_guardar;
    private java.util.List<bean.Empleado> empleadoList;
    private renderizar.EmpleadoListRenderizar empleadoListRenderizar1;
    private javax.persistence.Query empleadoQuery;
    private javax.persistence.EntityManager entityManager1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lbl_codempl;
    private javax.swing.JLabel lbl_passw;
    private javax.swing.JLabel lbl_rol;
    private javax.swing.JComboBox list_empleado;
    private javax.swing.JComboBox list_rol;
    private renderizar.RolListRenderizar rolListRenderizar1;
    private javax.swing.JPasswordField tf_passw;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
