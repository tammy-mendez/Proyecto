

package view;

import bean.Usuario;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Vladimir
 */
public class UsuarioBuscar extends javax.swing.JFrame {
     private int id;
     private String iden;
     private int cantidad;
     private int nombre;
     private char ch;
     private String nombreRol;
    /**
     * Creates new form UsuarioBuscar
     */
    public UsuarioBuscar() {
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

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("proyectoPU").createEntityManager();
        query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT u FROM Usuario u");
        list = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(query.getResultList());
        usuarioListRenderizar1 = new renderizar.UsuarioListRenderizar();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        list_filtros = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        tf_valor = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        masterTableUsuario = new javax.swing.JTable();
        panel_BuscarUsuario = new javax.swing.JPanel();
        lbl_BuscarUsuario = new javax.swing.JLabel();
        btn_cancelar = new javax.swing.JButton();

        usuarioListRenderizar1.setText("usuarioListRenderizar1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setForeground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel1.setText("Buscar por:");

        list_filtros.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Codigo Empleado", "Codigo Rol", "Rol", "Empleado" }));

        jLabel2.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel2.setText("Valor:");

        tf_valor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_valorKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_valorKeyTyped(evt);
            }
        });

        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/zoom.png"))); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(list_filtros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(btn_buscar)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(list_filtros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(tf_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, list, masterTableUsuario);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigoEmpleado}"));
        columnBinding.setColumnName("Codigo Empleado");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idRol.idRol}"));
        columnBinding.setColumnName("Id Rol");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idRol.nombre}"));
        columnBinding.setColumnName("Rol");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        masterTableUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                masterTableUsuarioMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(masterTableUsuario);

        panel_BuscarUsuario.setBackground(new java.awt.Color(0, 153, 255));
        panel_BuscarUsuario.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        lbl_BuscarUsuario.setFont(new java.awt.Font("Corbel", 1, 30)); // NOI18N
        lbl_BuscarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lbl_BuscarUsuario.setText("Buscar Usuario");

        javax.swing.GroupLayout panel_BuscarUsuarioLayout = new javax.swing.GroupLayout(panel_BuscarUsuario);
        panel_BuscarUsuario.setLayout(panel_BuscarUsuarioLayout);
        panel_BuscarUsuarioLayout.setHorizontalGroup(
            panel_BuscarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_BuscarUsuarioLayout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(lbl_BuscarUsuario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_BuscarUsuarioLayout.setVerticalGroup(
            panel_BuscarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_BuscarUsuarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_BuscarUsuario)
                .addContainerGap())
        );

        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete.png"))); // NOI18N
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
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(panel_BuscarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_cancelar)
                .addGap(279, 279, 279))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(panel_BuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btn_cancelar)
                .addGap(21, 21, 21))
        );

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
                // TODO add your handling code here:
       // TODO add your handling code here:
         if (tf_valor.getText().length()==0){
            JOptionPane.showMessageDialog(null,"Ingrese algún valor para efectuar la búsqueda", "Advertencia",JOptionPane.ERROR_MESSAGE);
            return;
        }
 else{
         if (list_filtros.getSelectedItem()=="Codigo Empleado"){
            id=Integer.parseInt(tf_valor.getText());
            query = entityManager.createNamedQuery( "Usuario.findByCodigoEmpleado");
            query.setParameter("codigoEmpleado",id);
            List<Usuario> r = query.getResultList();
            if (r.size()==0){
                JOptionPane.showMessageDialog(null,"Identificación inexistente", "Error",JOptionPane.ERROR_MESSAGE);
                 tf_valor.setText(null);
                 return;
            }
            list.clear();
            list.addAll(r);
        }
         else if (list_filtros.getSelectedItem()=="Codigo Rol"){
            id=Integer.parseInt(tf_valor.getText());
            query = entityManager.createNativeQuery( "SELECT * FROM usuario u "
                    + "INNER JOIN rol r "
                    + "on u.idRol = r.idRol "
                    + "WHERE r.idRol = "
                    +id, Usuario.class);
            List<Usuario> r = query.getResultList();
          
            if (r.size()==0){
                JOptionPane.showMessageDialog(null,"Identificación inexistente", "Error",JOptionPane.ERROR_MESSAGE);
                 tf_valor.setText(null);
                 return;
            }
            list.clear();
            list.addAll(r);            
         }
         else if (list_filtros.getSelectedItem()=="Rol"){
            query = entityManager.createNativeQuery( "SELECT * FROM usuario u "
                    + "INNER JOIN rol r "
                    + "on u.idRol = r.idRol "
                    + "WHERE r.nombre LIKE "
                    +"'%"+tf_valor.getText()+"%'", Usuario.class);
            List<Usuario> r = query.getResultList();
            if (r.isEmpty()){
                 JOptionPane.showMessageDialog(null, "Nombre inexistente","Error",JOptionPane.ERROR_MESSAGE );
                 tf_valor.setText(null);
                  return;
            }
            list.clear();
            list.addAll(r);

          
         }
    
           
    }
      
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void tf_valorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_valorKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_tf_valorKeyPressed

    private void masterTableUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masterTableUsuarioMouseClicked
        // TODO add your handling code here:
          int iden2;
          switch (MenuAdminSist.opcion){
          case 1:
                 cantidad=masterTableUsuario.getSelectedRow();
                 id=(Integer) masterTableUsuario.getValueAt(cantidad, 0);
                 if (masterTableUsuario.getValueAt(cantidad, 1) != null && masterTableUsuario.getValueAt(cantidad, 1).toString().trim().length() != 0){
                    nombre=(Integer)masterTableUsuario.getValueAt(cantidad, 1); 
                 }else {
                    nombre = (Integer)null;
                 } 
                 iden=Integer.toString(id);
                 query=entityManager.createNamedQuery("Usuario.findByCodigoEmpleado");
                 query.setParameter("codigoEmpleado", id);
                 List<Usuario> u=query.getResultList();
                 JFrame frame=new EditarUsuario();
                 EditarUsuario.tf_idEmpleado.setText(iden);
                 EditarUsuario.list_roles.setSelectedItem(u.get(0).getIdRol());
                 frame.setVisible(true);
                 frame.setTitle("Editar Usuario");
                 frame.setLocationRelativeTo(null);
                 frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                 this.setVisible(false);
                 break;
          case 2:
              
                 cantidad=masterTableUsuario.getSelectedRow();
                 id=(Integer) masterTableUsuario.getValueAt(cantidad, 0);
                 iden=Integer.toString(id);
                 JFrame frame2=new EliminarUsuario();
                 EliminarUsuario.tf_idEmpleado.setText(iden);
                 EliminarUsuario.tf_nombreRol.setText(masterTableUsuario.getValueAt(cantidad, 2).toString());
                 frame2.setVisible(true);
                 frame2.setTitle("Eliminar Usuario");
                 frame2.setLocationRelativeTo(null);
                 frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                 this.setVisible(false);
                 break;

          case 3:
              break;
      }

    }//GEN-LAST:event_masterTableUsuarioMouseClicked

    private void tf_valorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_valorKeyTyped
        // TODO add your handling code here:
       if (list_filtros.getSelectedItem()=="Codigo Empleado" || 
                list_filtros.getSelectedItem()=="Codigo Rol"){
             ch=evt.getKeyChar();
             if(!Character.isDigit(ch)){
                   getToolkit().beep();
                    evt.consume();
            }
         }
        else{
              ch=evt.getKeyChar();
             if(Character.isDigit(ch)){
                   getToolkit().beep();
                    evt.consume();
              }
         }
    }//GEN-LAST:event_tf_valorKeyTyped

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(final String  args[]) {
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
            java.util.logging.Logger.getLogger(UsuarioBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsuarioBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsuarioBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsuarioBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame=new UsuarioBuscar();
                frame.pack();
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
                frame.setTitle("Buscar usuario");
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);   
            }
            /* setTitle(args[0]);*/
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cancelar;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_BuscarUsuario;
    private java.util.List<bean.Usuario> list;
    private javax.swing.JComboBox list_filtros;
    private javax.swing.JTable masterTableUsuario;
    private javax.swing.JPanel panel_BuscarUsuario;
    private javax.persistence.Query query;
    private javax.swing.JTextField tf_valor;
    private renderizar.UsuarioListRenderizar usuarioListRenderizar1;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
