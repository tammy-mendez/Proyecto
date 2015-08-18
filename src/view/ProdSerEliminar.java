/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import bean.AuditoriaSistema;
import bean.ProductoServicio;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge
 */
public class ProdSerEliminar extends javax.swing.JFrame {
    private int resp;

    /**
     * Creates new form ProdSerEliminar
     */
    public ProdSerEliminar() {
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
        query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT p FROM ProductoServicio p");
        list = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(query.getResultList());
        panel_eliminarPS = new javax.swing.JPanel();
        lbl_eliminarPS = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        tf_codigoPS = new javax.swing.JTextField();
        lbl_codigoPS1 = new javax.swing.JLabel();
        lbl_nombrePS1 = new javax.swing.JLabel();
        tf_nombrePS = new javax.swing.JTextField();
        tf_costoPS = new javax.swing.JTextField();
        lbl_costoPS1 = new javax.swing.JLabel();
        lbl_categoriaPS1 = new javax.swing.JLabel();
        tf_categoriaPS = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btn_eliminar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_eliminarPS.setBackground(new java.awt.Color(0, 153, 255));
        panel_eliminarPS.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        lbl_eliminarPS.setFont(new java.awt.Font("Corbel", 1, 30)); // NOI18N
        lbl_eliminarPS.setForeground(new java.awt.Color(255, 255, 255));
        lbl_eliminarPS.setText("Eliminar Producto/Servicio");

        javax.swing.GroupLayout panel_eliminarPSLayout = new javax.swing.GroupLayout(panel_eliminarPS);
        panel_eliminarPS.setLayout(panel_eliminarPSLayout);
        panel_eliminarPSLayout.setHorizontalGroup(
            panel_eliminarPSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_eliminarPSLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(lbl_eliminarPS)
                .addGap(31, 31, 31))
        );
        panel_eliminarPSLayout.setVerticalGroup(
            panel_eliminarPSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_eliminarPSLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_eliminarPS)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tf_codigoPS.setEnabled(false);

        lbl_codigoPS1.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        lbl_codigoPS1.setText("Código:");

        lbl_nombrePS1.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        lbl_nombrePS1.setText("Nombre:");

        tf_nombrePS.setEnabled(false);

        tf_costoPS.setEnabled(false);

        lbl_costoPS1.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        lbl_costoPS1.setText("Costo:");

        lbl_categoriaPS1.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        lbl_categoriaPS1.setText("Categoría:");

        tf_categoriaPS.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_nombrePS1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_costoPS1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_codigoPS1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lbl_categoriaPS1)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_nombrePS, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                    .addComponent(tf_costoPS, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_codigoPS, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_categoriaPS))
                .addGap(43, 43, 43))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_codigoPS1)
                    .addComponent(tf_codigoPS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombrePS1)
                    .addComponent(tf_nombrePS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_costoPS1)
                    .addComponent(tf_costoPS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_categoriaPS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_categoriaPS1))
                .addGap(23, 23, 23))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete.png"))); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btn_eliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(23, 23, 23))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(panel_eliminarPS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panel_eliminarPS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_costoPS1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_costoPS1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_costoPS1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO add your handling code here:
             int codigo;
             codigo=Integer.parseInt(tf_codigoPS.getText());
            String valor;
            Date fecha1=new Date();
            String fecha2;
            DateFormat formato1=new SimpleDateFormat("yyyy-MM-dd");
            fecha2=formato1.format(fecha1);
            //verificamos que no se este intentando eliminar un producto o servicio que tiene consumo registrados para 
            //una reserva actual
           query=entityManager.createNativeQuery("SELECT * FROM producto_servicio ps "
                    + "INNER JOIN consumo_pro_ser c "
                    + "on ps.codigoPS = c.codigoPS "
                    +"INNER JOIN reserva r "
                    +"on c.codigoReserva=r.codigoReserva "
                    + "WHERE (r.checkIn<="
                    +"'"+fecha2+"' "
                    +"AND r.checkOut>="
                    +"'"+fecha2+"')"
                    +"AND ps.codigoPS="
                    +codigo, ProductoServicio.class);
            List<ProductoServicio> p=query.getResultList();
            if(!p.isEmpty()){
                JOptionPane.showMessageDialog(null, "Este Producto/Servicios tiene consumos registrados de reservas actuales, no puede eliminar","Error",JOptionPane.ERROR_MESSAGE );
                this.dispose();
                return;
                
            }else{
                   resp=  JOptionPane.showConfirmDialog(null,"Esta seguro que desea eliminar?", "Confirmar Eliminación",JOptionPane.YES_NO_OPTION );
                  if(resp==JOptionPane.YES_OPTION){
                        entityManager.getTransaction().begin();
                        ProductoServicio ps=entityManager.find(ProductoServicio.class, Integer.parseInt(tf_codigoPS.getText()));
                        valor=ps.toString();
                        entityManager.remove(ps);
                        //registramos los datos necesarios para la auditoria
                        AuditoriaSistema as=new AuditoriaSistema();
                        as.setAccion("Eliminación");
                        as.setTabla("Producto/Servicio");
                        as.setAntes(valor);
                        as.setDespues("No hay cambios");
                        //trabajamos con la fecha
                        Date fecha=new Date();
                        DateFormat formato=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                        as.setFechaHora((formato.format(fecha)));
                        as.setUsuario("nadie");
                        entityManager.persist(as);
                        entityManager.getTransaction().commit();
                        entityManager.close();
                        JOptionPane.showMessageDialog(null, "Eliminación Exitosa");
                  }
            }
            this.dispose();
    }//GEN-LAST:event_btn_eliminarActionPerformed

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
            java.util.logging.Logger.getLogger(ProdSerEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProdSerEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProdSerEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProdSerEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame= new ProdSerBuscar();
                frame.setVisible(true);
                frame.setTitle("Buscar Producto/Servicio");
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_eliminar;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbl_categoriaPS1;
    private javax.swing.JLabel lbl_codigoPS1;
    private javax.swing.JLabel lbl_costoPS1;
    private javax.swing.JLabel lbl_eliminarPS;
    private javax.swing.JLabel lbl_nombrePS1;
    private java.util.List list;
    private javax.swing.JPanel panel_eliminarPS;
    private javax.persistence.Query query;
    public static javax.swing.JTextField tf_categoriaPS;
    public static javax.swing.JTextField tf_codigoPS;
    public static javax.swing.JTextField tf_costoPS;
    public static javax.swing.JTextField tf_nombrePS;
    // End of variables declaration//GEN-END:variables
}