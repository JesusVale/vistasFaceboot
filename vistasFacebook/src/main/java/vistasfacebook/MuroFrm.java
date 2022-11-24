/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistasfacebook;

import comVista.IComunicadorVista;
import entidades.Publicacion;
import entidades.Usuario;
import events.ConsultarComentariosEvent;
import events.ConsultarPublicacionesEvent;
import events.EliminarPublicacionEvent;
import events.RegistrarPublicacionEvent;
import interfaces.IConsultarComentariosObserver;
import interfaces.IConsultarPublicacionesObserver;
import interfaces.IEliminarPublicacionObserver;
import interfaces.IEliminarUsuarioObserver;
import interfaces.IRegistrarPublicacionObserver;
import java.awt.ComponentOrientation;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import peticiones.PeticionComentarios;
import peticiones.PeticionPublicacion;
import peticiones.PeticionPublicaciones;

/**
 *
 * @author jegav
 */
public class MuroFrm extends javax.swing.JFrame implements IRegistrarPublicacionObserver, IConsultarPublicacionesObserver, IEliminarPublicacionObserver{

    private IComunicadorVista comunicadorVista;
    private Usuario usuario;

    /**
     * Creates new form MuroFrm
     */
    public MuroFrm(IComunicadorVista comunicadorVista, Usuario usuario) {
        initComponents();
        RegistrarPublicacionEvent.getInstance().suscribirse(this);
        ConsultarPublicacionesEvent.getInstance().suscribirse(this);
        EliminarPublicacionEvent.getInstance().suscribirse(this);
        this.comunicadorVista = comunicadorVista;
        this.usuario = usuario;
        comunicadorVista.consultarPublicaciones();
        this.jScrollPane1.setViewportView(this.publicacionesTxt);
        publicacionesTxt.setEditable(false);
        jScrollPane1.setSize(655, 504);
        publicacionesTxt.setSize(655, 504);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        principalPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        buscarEtiquetasTxt = new javax.swing.JTextField();
        botonCrearPublicacion = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnEliminarPerfil = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        publicacionesTxt = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        principalPanel.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(37, 161, 142));

        buscarEtiquetasTxt.setPreferredSize(new java.awt.Dimension(80, 22));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(buscarEtiquetasTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(563, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(buscarEtiquetasTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        botonCrearPublicacion.setText("Publicacion");
        botonCrearPublicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearPublicacionActionPerformed(evt);
            }
        });

        jButton3.setText("jButton3");

        btnEliminarPerfil.setText("Eliminar Perfil");
        btnEliminarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPerfilActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setViewportView(publicacionesTxt);

        publicacionesTxt.setEditable(false);
        publicacionesTxt.setBackground(new java.awt.Color(255, 255, 255));
        publicacionesTxt.setBorder(null);
        publicacionesTxt.setAutoscrolls(false);
        publicacionesTxt.setDropMode(javax.swing.DropMode.INSERT);
        publicacionesTxt.setMaximumSize(new java.awt.Dimension(655, 504));
        publicacionesTxt.setMinimumSize(new java.awt.Dimension(655, 504));
        publicacionesTxt.setPreferredSize(new java.awt.Dimension(655, 504));
        jScrollPane1.setViewportView(publicacionesTxt);

        javax.swing.GroupLayout principalPanelLayout = new javax.swing.GroupLayout(principalPanel);
        principalPanel.setLayout(principalPanelLayout);
        principalPanelLayout.setHorizontalGroup(
            principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(principalPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonCrearPublicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        principalPanelLayout.setVerticalGroup(
            principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(principalPanelLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(botonCrearPublicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 135, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonCrearPublicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearPublicacionActionPerformed
        this.dispose();
        RegistrarPublicacionEvent.getInstance().desuscribirse(this);
        ConsultarPublicacionesEvent.getInstance().desuscribirse(this);
        EliminarPublicacionEvent.getInstance().desuscribirse(this);
        FrmPublicacionPrueba pantallaCrearPublicacion = new FrmPublicacionPrueba(usuario, comunicadorVista);
        pantallaCrearPublicacion.setVisible(true);
    }//GEN-LAST:event_botonCrearPublicacionActionPerformed

    private void btnEliminarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPerfilActionPerformed
        int ea = JOptionPane.showConfirmDialog(null, "¿Estas seguro de eliminar tu cuenta de forma permanente?");
        if(ea==0){
            comunicadorVista.eliminarUsuario(usuario);
            RegistrarPublicacionEvent.getInstance().desuscribirse(this);
            ConsultarPublicacionesEvent.getInstance().desuscribirse(this);
            EliminarPublicacionEvent.getInstance().desuscribirse(this);
            Login login = new Login(comunicadorVista);
            login.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnEliminarPerfilActionPerformed

    public void actualizarMuro(List<Publicacion> publicaciones) {

        this.publicacionesTxt.setText("");
        for (Publicacion publicacion : publicaciones) {

            this.publicacionesTxt.insertComponent(new PublicacionPanel(publicacion, usuario, comunicadorVista));

        }
    }

    public void actualizarMuro(Publicacion publicacion) {
//        this.publicacionesTxt.insertComponent(new PublicacionPanel(publicacion, usuario, comunicadorVista));
    }

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MuroFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MuroFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MuroFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MuroFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MuroFrm().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCrearPublicacion;
    private javax.swing.JButton btnEliminarPerfil;
    private javax.swing.JTextField buscarEtiquetasTxt;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel principalPanel;
    private javax.swing.JTextPane publicacionesTxt;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onRegistrarPublicacion(PeticionPublicacion peticionPublicacion) {
        actualizarMuro(peticionPublicacion.getPublicacion());
    }

    @Override
    public void onConsultarPublicaciones(PeticionPublicaciones peticionPublicaciones) {
        actualizarMuro(peticionPublicaciones.getPublicaciones());
    }

    @Override
    public void onEliminarPublicacion(PeticionPublicaciones respuesta) {
        comunicadorVista.consultarPublicaciones();
        System.out.println("waza emotiza insana");
    }

}
