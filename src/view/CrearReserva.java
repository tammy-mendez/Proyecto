/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import bean.AuditoriaSistema;
import bean.CategHabitacion;
import bean.Cliente;
import bean.Habitacion;
import bean.Reserva;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import static view.ReservaEditar.tf_cedulaCliente;
import view.VerEstadodeHabitaciones;

/**
 *
 * @author Vladimir
 */
public class CrearReserva extends javax.swing.JFrame {
    private Connection connection;
    //SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    //public static int codigoCategoria = 0;
    //public static int numHabitacion = 0;
    /**
     * Creates new form CrearReserva
     */
    public CrearReserva() {
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
        categHabitacionQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM CategHabitacion c");
        categHabitacionList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : categHabitacionQuery.getResultList();
        clienteQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM Cliente c");
        clienteList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : clienteQuery.getResultList();
        clienteListRenderizar1 = new renderizar.ClienteListRenderizar();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_cantidadPersonas = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_montoAbonado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jc_checkin = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jc_checkout = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tf_montoTotal = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tf_precioCategoria = new javax.swing.JTextField();
        tf_numeroHabitacion = new javax.swing.JTextField();
        btn_calcularMonto = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        tf_categoriaHabitacion = new javax.swing.JTextField();
        tf_cedulaCliente = new javax.swing.JTextField();
        btn_registrarcliente = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btn_registrar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        panel_CrearReserva = new javax.swing.JPanel();
        lbl_BuscarRol = new javax.swing.JLabel();

        clienteListRenderizar1.setText("clienteListRenderizar1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setText("Cédula Cliente:");

        jLabel3.setText("Cant Personas:");

        tf_cantidadPersonas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_cantidadPersonasKeyTyped(evt);
            }
        });

        jLabel4.setText("Monto Abonado:");

        tf_montoAbonado.setText("0");
        tf_montoAbonado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_montoAbonadoFocusLost(evt);
            }
        });
        tf_montoAbonado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_montoAbonadoKeyTyped(evt);
            }
        });

        jLabel1.setText("Check In:");

        jLabel5.setText("Check Out:");

        jc_checkout.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jc_checkoutFocusLost(evt);
            }
        });

        jLabel6.setText("Categoría Hab:");

        jLabel7.setText("N° Habitación:");

        jLabel8.setText("Monto Total:");

        tf_montoTotal.setEnabled(false);

        jLabel11.setText("Precio de Cat:");

        tf_precioCategoria.setEnabled(false);

        tf_numeroHabitacion.setEnabled(false);
        tf_numeroHabitacion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_numeroHabitacionFocusLost(evt);
            }
        });

        btn_calcularMonto.setText("Calcular Monto Total");
        btn_calcularMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcularMontoActionPerformed(evt);
            }
        });

        btn_buscar.setText("Buscar Habitación");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        tf_categoriaHabitacion.setEnabled(false);

        tf_cedulaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_cedulaClienteActionPerformed(evt);
            }
        });
        tf_cedulaCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_cedulaClienteFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(34, 34, 34))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel6)
                                .addComponent(jLabel11)))
                        .addGap(28, 28, 28)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .addComponent(tf_numeroHabitacion)
                    .addComponent(tf_precioCategoria)
                    .addComponent(tf_cantidadPersonas, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tf_categoriaHabitacion)
                    .addComponent(tf_cedulaCliente))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jc_checkout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jc_checkin, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                    .addComponent(tf_montoAbonado, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_calcularMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_montoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_calcularMonto, jc_checkin, jc_checkout, tf_montoAbonado, tf_montoTotal});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jc_checkin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jc_checkout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_montoAbonado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf_montoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_calcularMonto)
                .addGap(40, 40, 40))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_cedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_cantidadPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_categoriaHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tf_precioCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tf_numeroHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_buscar)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btn_registrarcliente.setText("Registrar Cliente");
        btn_registrarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarclienteActionPerformed(evt);
            }
        });

        btn_registrar.setText("Registrar");
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(btn_registrar)
                .addGap(77, 77, 77)
                .addComponent(btn_cancelar)
                .addContainerGap(165, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_registrar)
                    .addComponent(btn_cancelar))
                .addContainerGap())
        );

        panel_CrearReserva.setBackground(new java.awt.Color(0, 153, 255));
        panel_CrearReserva.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        lbl_BuscarRol.setFont(new java.awt.Font("Corbel", 1, 30)); // NOI18N
        lbl_BuscarRol.setForeground(new java.awt.Color(255, 255, 255));
        lbl_BuscarRol.setText("Registrar Reserva");

        javax.swing.GroupLayout panel_CrearReservaLayout = new javax.swing.GroupLayout(panel_CrearReserva);
        panel_CrearReserva.setLayout(panel_CrearReservaLayout);
        panel_CrearReservaLayout.setHorizontalGroup(
            panel_CrearReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_CrearReservaLayout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(lbl_BuscarRol)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_CrearReservaLayout.setVerticalGroup(
            panel_CrearReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_CrearReservaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_BuscarRol)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panel_CrearReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_registrarcliente)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_CrearReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_registrarcliente)
                .addGap(13, 13, 13)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        // TODO add your handling code here:
        java.util.Date fecha = new Date();
        //JOptionPane.showConfirmDialog(null, fecha);
        if ((jc_checkin.getDate() != null) 
                && (jc_checkout.getDate() != null) 
                && !tf_montoTotal.getText().equals("")
                && !tf_cantidadPersonas.getText().equals("")
                && !tf_numeroHabitacion.getText().equals("")
                && !tf_numeroHabitacion.getText().equals(""))
                        {
           if(jc_checkin.getDate().before(jc_checkout.getDate())                
                   && Integer.parseInt(tf_montoAbonado.getText()) < Integer.parseInt(tf_montoTotal.getText())
             //      &&jc_checkin.getDate().after(fecha)
             //      &&jc_checkin.getDate().after(fecha)
                   ){
                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                String dIN = format.format(jc_checkin.getDate());
                String dOUT = format.format(jc_checkout.getDate());
                Date dateIn = null;
                Date dateOut = null;
                try {
                    dateIn = format.parse(dIN);
                    dateOut = format.parse(dOUT);
                } catch (ParseException ex) {
                    System.out.println("Formateo de fechas fallido");
                }
                
                Habitacion habitacion = new Habitacion();
                Cliente cliente = obtenerCliente();
                int respuesta = JOptionPane.showConfirmDialog(null, "¿Confirma el registro?");
                if (respuesta == JOptionPane.YES_OPTION){

                    EntityManagerFactory fact = Persistence.createEntityManagerFactory("proyectoPU");
                    EntityManager ema = fact.createEntityManager();
                    Reserva reserva = new Reserva();
                    ema.getTransaction().begin();
                    reserva.setCantPersonas(Integer.parseInt(tf_cantidadPersonas.getText()));

                    reserva.setCheckIn(dateIn);
                    reserva.setCheckOut(dateOut);
                    //reserva.setCheckOut(format.parse(format.format(jc_checkout.toString())));
                    reserva.setCodigoCliente(cliente);
                    if (tf_montoAbonado.getText().equals(""))
                        reserva.setMontoAbonado(0);
                    else
                        reserva.setMontoAbonado(Integer.parseInt(tf_montoAbonado.getText()));
                    
                    reserva.setMontoTotal(Integer.parseInt(tf_montoTotal.getText()));
                    //consulta para obtener habitacion
                    Query query = ema.createNamedQuery("Habitacion.findByNumero");
                    query.setParameter("numero", Integer.parseInt(tf_numeroHabitacion.getText()));
                    habitacion = (Habitacion)query.getSingleResult();
                    reserva.setNumHabitacion(habitacion);
                    ema.persist(reserva);
                    ema.flush();
                    //creacion de auditoria de sistema
                    AuditoriaSistema as=new AuditoriaSistema();
                    as.setAccion("Inserción");
                    as.setTabla("Reserva");
                    as.setAntes(reserva.toString());
                    as.setDespues("No hay cambios");
                    //trabajamos con la fecha
                    DateFormat formato=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                    as.setFechaHora(formato.format(fecha));
                    as.setUsuario(LoginView.nombreUsuario);
                    ema.persist(as);
                    ema.flush();
                    ema.getTransaction().commit();
                    ema.close();
                    JOptionPane.showMessageDialog(null, "Registro Exitoso");
                    this.dispose();
                }
                else{
                    this.dispose();
                }
           }else{
                     JOptionPane.showMessageDialog(null, "Datos Invalidos o Incompletos "
                   + "impiden el registro");             
           }
        }
        else{
        JOptionPane.showMessageDialog(null, "Datos Invalidos o Incompletos "
                   + "impiden el registro");  
     }
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void btn_registrarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarclienteActionPerformed
        // TODO add your handling code here:
        JFrame frame=new ClienteCreate();
        frame.setVisible(true);
        frame.setTitle("Registar Cliente");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btn_registrarclienteActionPerformed

    private void tf_numeroHabitacionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_numeroHabitacionFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tf_numeroHabitacionFocusLost

    private void tf_cantidadPersonasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_cantidadPersonasKeyTyped
        // TODO add your handling code here:
             char ch=evt.getKeyChar();
             if(!Character.isDigit(ch)){
                   getToolkit().beep();
                    evt.consume();
            }
    }//GEN-LAST:event_tf_cantidadPersonasKeyTyped

    private void tf_montoAbonadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_montoAbonadoKeyTyped
        // TODO add your handling code here:
        char ch=evt.getKeyChar();
             if(!Character.isDigit(ch)){
                   getToolkit().beep();
                    evt.consume();
            }
    }//GEN-LAST:event_tf_montoAbonadoKeyTyped

    private void jc_checkoutFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jc_checkoutFocusLost
        // TODO add your handling code here:
        //no acciona
        JOptionPane.showMessageDialog(null, "Algo paso");
        if (jc_checkin.getDate().after(jc_checkout.getDate()))
                JOptionPane.showMessageDialog(null, jc_checkin.getDate());
    }//GEN-LAST:event_jc_checkoutFocusLost

    private void btn_calcularMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcularMontoActionPerformed
        // TODO add your handling code here:
        java.util.Date fecha = new Date();
        if(jc_checkin.getDate() != null && jc_checkout.getDate() != null && !tf_cantidadPersonas.getText().equals("")){
            if (jc_checkin.getDate().before(jc_checkout.getDate())
                   // &&jc_checkin.getDate().after(fecha)
                   //&&jc_checkout.getDate().after(fecha)
                    ){
                final long MILLSECS_PER_DAY = 24 * 60 * 60 * 1000;
                long cantidadPersonas = Integer.parseInt(tf_cantidadPersonas.getText());
                long precioxnoche = Integer.parseInt(tf_precioCategoria.getText());
                long cantidadDias = (jc_checkout.getDate().getTime() - jc_checkin.getDate().getTime())/MILLSECS_PER_DAY;
                long precioTotal = cantidadPersonas * precioxnoche * cantidadDias;
                tf_montoTotal.setText(Long.toString(precioTotal));
            }else{
                JOptionPane.showMessageDialog(null, "Fecha de checkin posterior a checkout");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Datos sin especificar");
        }
    }//GEN-LAST:event_btn_calcularMontoActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        tf_numeroHabitacion.setText("");
        tf_categoriaHabitacion.setText("");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        java.util.Date fecha = new Date();
        //JOptionPane.showMessageDialog(null, auxIn.equals(auxOut));
        try {
            fecha = obtenerFechaDia();
        } catch (ParseException ex) {
            System.out.println("Problemas con fechas");
        }
        if ((jc_checkin.getDate() != null) 
                && (jc_checkout.getDate() != null)){ 
            if( (jc_checkin.getDate().before(jc_checkout.getDate()))
                && (fecha.before(jc_checkin.getDate()))
                && (fecha.before(jc_checkout.getDate()))
                    ){
                    String auxIn = format.format(jc_checkin.getDate());
                    String auxOut = format.format(jc_checkout.getDate());
                    if(!auxIn.equals(auxOut)){
                        verEstadosHabitaciones();
                    }
                    //creación de ventana
                    else{
                        JOptionPane.showMessageDialog(null, "Fechas Iguales");
                    }
                    
                    
            }
            else{
                JOptionPane.showMessageDialog(null, "Fechas Invalidas");
            }
        }
        else{
                JOptionPane.showMessageDialog(null, "Fechas Invalidas");  
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void tf_montoAbonadoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_montoAbonadoFocusLost
        // TODO add your handling code here
        tf_montoAbonado.setText("0");
    }//GEN-LAST:event_tf_montoAbonadoFocusLost

    private void tf_cedulaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_cedulaClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_cedulaClienteActionPerformed

    private void tf_cedulaClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_cedulaClienteFocusLost
        // TODO add your handling code here:
        Cliente cliente = obtenerCliente();
        int respuesta  = 0;
        if (cliente == null){
            respuesta = JOptionPane.showConfirmDialog(null, "Cliente Inexistente ¿Desea "
                    + "registrarlo en el sistema?");
            if (respuesta == JOptionPane.YES_OPTION){
                JFrame frame=new ClienteCreate();
                frame.setVisible(true);
                frame.setTitle("Registar Cliente");
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                ClienteCreate.llamadaCrearReserva = "Invocado";
                ClienteCreate.tf_cedula.setText(tf_cedulaCliente.getText());
            }else{
                tf_cedulaCliente.setText("");
                tf_cedulaCliente.requestFocus();
            }
        }
        
    }//GEN-LAST:event_tf_cedulaClienteFocusLost

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
            java.util.logging.Logger.getLogger(CrearReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame=new CrearReserva();
                frame.pack();
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
                
                //frame.setTitle(args[0]);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
        });
    }
    private void verEstadosHabitaciones(){
        JFrame ventana = new VerEstadodeHabitaciones();
        ventana.setLocationRelativeTo(null);
        ventana.setTitle("Ver Estado de Habitaciones");
        ventana.setVisible(true);
                    

        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_calcularMonto;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JButton btn_registrarcliente;
    private java.util.List<bean.CategHabitacion> categHabitacionList;
    private javax.persistence.Query categHabitacionQuery;
    private java.util.List<bean.Cliente> clienteList;
    private renderizar.ClienteListRenderizar clienteListRenderizar1;
    private javax.persistence.Query clienteQuery;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static com.toedter.calendar.JDateChooser jc_checkin;
    public static com.toedter.calendar.JDateChooser jc_checkout;
    private javax.swing.JLabel lbl_BuscarRol;
    private javax.swing.JPanel panel_CrearReserva;
    private javax.swing.JTextField tf_cantidadPersonas;
    public static javax.swing.JTextField tf_categoriaHabitacion;
    public static javax.swing.JTextField tf_cedulaCliente;
    private javax.swing.JTextField tf_montoAbonado;
    private javax.swing.JTextField tf_montoTotal;
    public static javax.swing.JTextField tf_numeroHabitacion;
    public static javax.swing.JTextField tf_precioCategoria;
    // End of variables declaration//GEN-END:variables

    private Date obtenerFechaDia() throws ParseException{
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date fecha = new Date();
            /*int anho = fecha.get(Calendar.YEAR);
            int mes = fecha.get(Calendar.MONTH + 1);
            int dia = fecha.get(Calendar.DAY_OF_MONTH);
            String fechaActual = Integer.toString(anho) +"-"+Integer.toString(mes)
                    +"-"+Integer.toString(dia);
            */        
            return format.parse(format.format(fecha));
    }
    private Cliente obtenerCliente() {
         clienteQuery = entityManager.createNamedQuery("Cliente.findByCedula");
         clienteQuery.setParameter("cedula", tf_cedulaCliente.getText());
         Cliente cliente = null;
         try{
            cliente = (Cliente)clienteQuery.getSingleResult();
            System.out.println(cliente);
         }catch(javax.persistence.NoResultException e){
             System.out.println(cliente);
         }
         return cliente;
     }
    
}
