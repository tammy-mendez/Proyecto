/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;
import bean.CategHabitacion;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
/**
 *
 * @author Vladimir
 */
public class VerEstadodeHabitaciones extends javax.swing.JFrame {
    private Connection connection;
    List<List<JButton>> numeroHabitacionesxCategoria= new ArrayList<List<JButton>>(10);
    public static String llamadaCrearReserva="";
    public static String llamadaEditarReserva="";
    

    /**
     * Creates new form VerEstadodeHabitaciones
     */
    public VerEstadodeHabitaciones() {
        initComponents();
        habitacionesLibresxCategoria();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_BuscarRol = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(420, 10000));
        setMinimumSize(new java.awt.Dimension(420, 400));
        setPreferredSize(new java.awt.Dimension(400, 400));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        lbl_BuscarRol.setFont(new java.awt.Font("Corbel", 1, 30)); // NOI18N
        lbl_BuscarRol.setForeground(new java.awt.Color(255, 255, 255));
        lbl_BuscarRol.setText("Disponibilidad");
        jPanel1.add(lbl_BuscarRol);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 50));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(VerEstadodeHabitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerEstadodeHabitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerEstadodeHabitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerEstadodeHabitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame=new VerEstadodeHabitaciones();
                frame.pack();
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
                frame.setTitle("Ver Estado de Habitaciones");
                //frame.setTitle(args[0]);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_BuscarRol;
    // End of variables declaration//GEN-END:variables
    
    
    private List obtenerListaCategorias(){
        EntityManagerFactory fact = Persistence.createEntityManagerFactory("proyectoPU");
        EntityManager ema = fact.createEntityManager();
        Query query = ema.createNamedQuery("CategHabitacion.findAll");
        List<CategHabitacion> categorias = query.getResultList();
        return categorias;
    } 

    private void Conneccion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String BaseDeDatos = "jdbc:mysql://localhost/hotel db?user=root&password=user";
            connection = DriverManager.getConnection(BaseDeDatos);
            if(connection != null){
                System.out.println("Conexion Exitosa!");
            }else{
                System.out.println("Conexion Fallida!");                
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    private void cerrarConexion(){
            try {
                connection.close();
            } catch (SQLException ex) {
                System.out.println("No pudo cerrarse la conexion");
            }
    }
    private void habitacionesLibresxCategoria(){
            List<JButton> numeroHabitacion = new ArrayList<JButton>(10);
            List<CategHabitacion> categorias = obtenerListaCategorias();
            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
            String fechain = null;
            String fechaout = null;
            if (!llamadaCrearReserva.equals("")){
                fechain = sf.format(CrearReserva.jc_checkin.getDate());
                fechaout = sf.format(CrearReserva.jc_checkout.getDate());
            }
            if(!llamadaEditarReserva.equals("")){
                fechain = sf.format(ReservaEditar.jc_checkin.getDate());
                fechaout = sf.format(ReservaEditar.jc_checkout.getDate());
            } 
            String query;
            java.sql.Statement stm;
            java.sql.ResultSet rs = null;
            int px = 30, py = 100;
            int ultimaIteracion = 0;
            int bandera = 0;
            //JOptionPane.showMessageDialog(null, query);

                
            Conneccion();
            try {
                for(int i = 0 ; i < categorias.size(); i++){
                    
                    
                    
                    
                    /*query = "select funcion_hab_libre(" +"'"
                        +fechain+"', "+"'"+fechaout+"', "
                        +Integer.toString(categorias.get(i).getCodigoCategoria())
                        + ") as libre";*/
                    query = "select ha.numero " +
                        "from habitacion ha " +
                        "where ha.codigoCategoria = "+ categorias.get(i).getCodigoCategoria()+
                        " and  ha.numero  not in " +
                            "(select h.numero " +
                            "from habitacion h " +
                            "join reserva r " +
                            "on  h.numero=r.numHabitacion " +
                            "where ((r.checkIn>= '"+fechain+"' and r.checkIn<= '"+fechaout+"' ) or "
                            + "(r.checkOut >= '"+fechain+"' and r.checkOut<= '"+fechaout+"'))"
                            + " and h.numero=ha.numero) order by ha.numero";
                    
                    
                    
                    
                    stm = connection.createStatement();
                    rs = stm.executeQuery(query);
                    
                    final JLabel nombreCategoria = new JLabel(categorias.get(i).getNombre());
                    getContentPane().add(nombreCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints((px-20), (py-20), 90, -1));
                    nombreCategoria.setBorder(BorderFactory.createBevelBorder(5));
                    nombreCategoria.setFont(new Font("Serif", Font.BOLD, 13));
                    
                    final JLabel costoCategoria = new JLabel(Integer.toString(categorias.get(i).getCostoxnoche()));
                    getContentPane().add(costoCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints((px+170), (py-20), 200, -1));
                    nombreCategoria.setBorder(BorderFactory.createBevelBorder(5));
                    
                    JLabel etiquetaCosto = new JLabel("Costo:");
                    getContentPane().add(etiquetaCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints((px+130), (py-20), 200, -1));
                    etiquetaCosto.setFont(new Font("Serif", Font.BOLD, 13));
                    
                    JLabel hb = new JLabel("Sin habitaciones");
                    hb.setForeground(Color.red);
                    getContentPane().add(hb, new org.netbeans.lib.awtextra.AbsoluteConstraints(px, py, 200, -1));
                    
                    while(rs.next()){
                        bandera = 1;
                        final JButton habitacion  = new JButton();
                        final int codCategoria = categorias.get(i).getCodigoCategoria();
                        final int codigoCategoria, numHabitacion;
                        habitacion.addActionListener(new ActionListener() {

                            public void actionPerformed(ActionEvent e) {
                               // CrearReserva.codigoCategoria = codCategoria;
                               // CrearReserva.numHabitacion = Integer.parseInt(habitacion.getText());
                                
                                //CrearReserva.cb_categoriaHabitacion.setSelectedIndex(codCategoria);
                                if(!llamadaCrearReserva.equals("")){
                                    CrearReserva.tf_categoriaHabitacion.setText(nombreCategoria.getText());
                                    CrearReserva.tf_precioCategoria.setText(costoCategoria.getText());
                                    CrearReserva.tf_numeroHabitacion.setText(habitacion.getText());
                                    dispose();
                                }
                                if(!llamadaEditarReserva.equals("")){
                                    ReservaEditar.tf_categoriaHabitacion.setText(nombreCategoria.getText());
                                    ReservaEditar.tf_precioCategoria.setText(costoCategoria.getText());
                                    ReservaEditar.tf_numeroHabitacion.setText(habitacion.getText());
                                    dispose();
                                }
                            }
                        });
                        habitacion.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
                        
                        getContentPane().add(habitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(px, py, 40, -1));
                        
                        /*if(rs.getInt(1) == 0){
                                habitacion.setText("S.H.");
                                habitacion.setEnabled(false);
                                habitacion.setBorderPainted(false);
                                habitacion.setForeground(Color.red);
                                habitacion.setOpaque(false);
                            
                        }else{*/
                            hb.setVisible(false);
                            habitacion.setText(Integer.toString(rs.getInt(1)));
                            habitacion.setForeground(Color.GREEN);
                        //}
                        numeroHabitacion.add(habitacion);
                        px+=50;
                        if (px >= 300){
                            px = 30;
                            py += 25;
                        }
                    }
                    
                            
                    
                    numeroHabitacionesxCategoria.add(numeroHabitacion);
                    ultimaIteracion = i;
                    px = 30;
                    py+=50;
                    
                }
            rs.close();
            } catch (SQLException ex) {
                System.out.println("Algo falló");
            }catch(Exception e){
                System.out.println("Error");
            }
            cerrarConexion();
        
    }
    

}
