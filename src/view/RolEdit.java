/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * RolEdit.java
 *
 * Created on 10/07/2015, 07:31:00 PM
 */

package view;

import bean.AuditoriaSistema;
import bean.Rol;
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
public class RolEdit extends javax.swing.JFrame {
    private int resp;
    private char ch;
    private int limite=45;

    /** Creates new form RolEdit */
    public RolEdit() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("proyectoPU").createEntityManager();
        query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT r FROM Rol r");
        list = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : query.getResultList();
        btn_guardar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        tf_nombre = new javax.swing.JTextField();
        lbl_identi = new javax.swing.JLabel();
        lbl_nombre = new javax.swing.JLabel();
        tf_identi = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("frameRolEdit"); // NOI18N

        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        btn_guardar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btn_guardarKeyTyped(evt);
            }
        });

        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        tf_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_nombreKeyTyped(evt);
            }
        });

        lbl_identi.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbl_identi.setText("Identificación:");

        lbl_nombre.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbl_nombre.setText("Nombre:");

        tf_identi.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_identi)
                    .addComponent(lbl_nombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_nombre)
                    .addComponent(tf_identi, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_identi)
                    .addComponent(tf_identi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_nombre)
                    .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(btn_guardar)
                        .addGap(56, 56, 56)
                        .addComponent(btn_cancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancelar)
                    .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        // TODO add your handling code here:
        String antes;
        String despues;
        if (tf_nombre.getText().length()==0){
            JOptionPane.showMessageDialog(null,"Ingrese algún valor para el campo nombre", "Advertencia",JOptionPane.ERROR_MESSAGE);
            return;
        }else{
                query=entityManager.createNamedQuery("Rol.findByNombre");
                query.setParameter("nombre",tf_nombre.getText().toLowerCase());
                List<Rol> rol= query.getResultList();
                if(rol.size()>=1){//comprueba si ya existe un rol con el mismo nombre
                    JOptionPane.showMessageDialog(null,"Ya existe un rol con el mismo nombre", "Aviso",JOptionPane.ERROR_MESSAGE);
                    return;
                }else{
                        resp=  JOptionPane.showConfirmDialog(null,"Desea guardar los cambios?", "Confirmar Modificación",JOptionPane.YES_NO_OPTION );
                        if (resp==JOptionPane.YES_OPTION){
                            entityManager.getTransaction().begin();
                            //registramos el nombre del rol antes de que se cambie
                            query=entityManager.createNamedQuery("Rol.findByIdRol");
                            query.setParameter("idRol",Integer.parseInt(tf_identi.getText()));
                            List<Rol> rl=query.getResultList();
                            antes=tf_identi.getText()+"-"+rl.get(0).getNombre()+" ";
                            //hacemos el merge, el cambio
                            Rol r=new Rol();
                            r.setIdRol(Integer.parseInt(tf_identi.getText()));
                            r.setNombre(tf_nombre.getText().toLowerCase());//convertir a minuscula
                            entityManager.merge(r);
                            entityManager.flush();
                            //guardamos los cambios
                            despues=" "+r.getIdRol()+"-"+r.getNombre();
                            //registramos los datos necesarios para la auditoria
                             AuditoriaSistema as=new AuditoriaSistema();
                             as.setAccion("Modificación");
                             as.setTabla("Rol");
                             as.setValores(antes+"to"+despues);
                             //trabajamos con la fecha
                              Date fecha=new Date();
                              DateFormat formato=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                              as.setFechaHora(formato.format(fecha));    
                              as.setUsuario(LoginView.nombreUsuario);
                              entityManager.persist(as);
                              entityManager.getTransaction().commit();
                              entityManager.close();
                            JOptionPane.showMessageDialog(null, "Modificación Exitosa");    
                         }else{
                            this.setVisible(false);
                        }
                    }
            }
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_guardarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_guardarKeyTyped
        // TODO add your handling code here:
         
    }//GEN-LAST:event_btn_guardarKeyTyped

    private void tf_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_nombreKeyTyped
        // TODO add your handling code here:
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

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btn_cancelarActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(final String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame= new RolBuscar();
                frame.pack();
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
               
               
     
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_guardar;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_identi;
    private javax.swing.JLabel lbl_nombre;
    private java.util.List<bean.Rol> list;
    private javax.persistence.Query query;
    public static javax.swing.JTextField tf_identi;
    public static javax.swing.JTextField tf_nombre;
    // End of variables declaration//GEN-END:variables

}
