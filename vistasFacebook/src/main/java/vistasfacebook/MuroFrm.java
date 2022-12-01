/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistasfacebook;

import comVista.IComunicadorVista;
import entidades.Publicacion;
import entidades.Usuario;
import events.ConsultarPublicacionesEvent;
import events.ConsultarPublicacionesPorHashtagEvent;
import events.EliminarPublicacionEvent;
import events.RegistrarPublicacionEvent;
import interfaces.IConsultarPublicacionesObserver;
import interfaces.IConsultarPublicacionesPorHashtagObserver;
import interfaces.IEliminarPublicacionObserver;
import interfaces.IRegistrarPublicacionObserver;
import java.util.List;
import javax.swing.JOptionPane;
import peticiones.PeticionPublicacion;
import peticiones.PeticionPublicaciones;
import utils.CustomScrollbar;

/**
 *
 * @author jegav
 */
public class MuroFrm extends javax.swing.JFrame implements IRegistrarPublicacionObserver,
                                                           IConsultarPublicacionesObserver,
                                                           IEliminarPublicacionObserver, 
                                                           IConsultarPublicacionesPorHashtagObserver {

    private IComunicadorVista comunicadorVista;
    private Usuario usuario;

    /**
     * Creates new form MuroFrm
     */
    public MuroFrm(IComunicadorVista comunicadorVista, Usuario usuario) {
        initComponents();
        this.cancelarBusquedaBtn.setVisible(false);
        scrollPublicaciones.setVerticalScrollBar(new CustomScrollbar());
        this.scrollPublicaciones.getVerticalScrollBar().setUnitIncrement(25);
        buscarEtiquetaBtn.setIcon(new javax.swing.ImageIcon("src\\main\\java\\imagenes\\buscarPorEtiqueta.png"));
        RegistrarPublicacionEvent.getInstance().suscribirse(this);
        ConsultarPublicacionesEvent.getInstance().suscribirse(this);
        EliminarPublicacionEvent.getInstance().suscribirse(this);
        ConsultarPublicacionesPorHashtagEvent.getInstance().suscribirse(this);
        this.publicacionesTxt.setAlignmentX(CENTER_ALIGNMENT);
        this.comunicadorVista = comunicadorVista;
        this.usuario = usuario;
        comunicadorVista.consultarPublicaciones();
        this.scrollPublicaciones.setViewportView(this.publicacionesTxt);
        //publicacionesTxt.setEditable(false);
        scrollPublicaciones.setSize(655, 504);
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
        buscarEtiquetaBtn = new javax.swing.JButton();
        cancelarBusquedaBtn = new javax.swing.JButton();
        botonCrearPublicacion = new javax.swing.JButton();
        btnNotificar = new javax.swing.JButton();
        btnEditarPerfil = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        scrollPublicaciones = new javax.swing.JScrollPane();
        publicacionesTxt = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        principalPanel.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(37, 161, 142));

        buscarEtiquetasTxt.setPreferredSize(new java.awt.Dimension(80, 22));

        buscarEtiquetaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarEtiquetaBtnActionPerformed(evt);
            }
        });

        cancelarBusquedaBtn.setBackground(new java.awt.Color(255, 153, 153));
        cancelarBusquedaBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cancelarBusquedaBtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelarBusquedaBtn.setText("Cancelar");
        cancelarBusquedaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBusquedaBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(buscarEtiquetasTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscarEtiquetaBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelarBusquedaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(buscarEtiquetasTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(buscarEtiquetaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cancelarBusquedaBtn)))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        botonCrearPublicacion.setText("Publicacion");
        botonCrearPublicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearPublicacionActionPerformed(evt);
            }
        });

        btnNotificar.setText("Notificacion");
        btnNotificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotificarActionPerformed(evt);
            }
        });

        btnEditarPerfil.setText("Editar Perfil");
        btnEditarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPerfilActionPerformed(evt);
            }
        });

        jButton1.setText("Historial Notificaciones");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        scrollPublicaciones.setBackground(new java.awt.Color(255, 255, 255));
        scrollPublicaciones.setBorder(null);
        scrollPublicaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        scrollPublicaciones.setViewportView(publicacionesTxt);

        publicacionesTxt.setBackground(new java.awt.Color(255, 255, 255));
        publicacionesTxt.setForeground(new java.awt.Color(255, 255, 255));
        publicacionesTxt.setLayout(new javax.swing.BoxLayout(publicacionesTxt, javax.swing.BoxLayout.Y_AXIS));
        scrollPublicaciones.setViewportView(publicacionesTxt);

        javax.swing.GroupLayout principalPanelLayout = new javax.swing.GroupLayout(principalPanel);
        principalPanel.setLayout(principalPanelLayout);
        principalPanelLayout.setHorizontalGroup(
            principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(principalPanelLayout.createSequentialGroup()
                .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(principalPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(botonCrearPublicacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNotificar, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalPanelLayout.createSequentialGroup()
                        .addGap(0, 36, Short.MAX_VALUE)
                        .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEditarPerfil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(71, 71, 71)
                .addComponent(scrollPublicaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        principalPanelLayout.setVerticalGroup(
            principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(principalPanelLayout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(botonCrearPublicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(btnNotificar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(btnEditarPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 85, Short.MAX_VALUE))
                    .addGroup(principalPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollPublicaciones)
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
        ConsultarPublicacionesPorHashtagEvent.getInstance().desuscribirse(this);
        FrmPublicacionPrueba pantallaCrearPublicacion = new FrmPublicacionPrueba(usuario, comunicadorVista);
        pantallaCrearPublicacion.setVisible(true);
    }//GEN-LAST:event_botonCrearPublicacionActionPerformed

    private void btnEditarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPerfilActionPerformed
        this.dispose();
        RegistrarPublicacionEvent.getInstance().desuscribirse(this);
        ConsultarPublicacionesEvent.getInstance().desuscribirse(this);
        EliminarPublicacionEvent.getInstance().desuscribirse(this);
        ConsultarPublicacionesPorHashtagEvent.getInstance().desuscribirse(this);
        EditarPerfil editarPerfil = new EditarPerfil(comunicadorVista, usuario);
        editarPerfil.setVisible(true);

//        int eliminarUsuario = JOptionPane.showConfirmDialog(null, "¿Estas seguro de eliminar tu cuenta de forma permanente?");
//        if (eliminarUsuario == 0) {
//            comunicadorVista.eliminarUsuario(usuario);
//            RegistrarPublicacionEvent.getInstance().desuscribirse(this);
//            ConsultarPublicacionesEvent.getInstance().desuscribirse(this);
//            EliminarPublicacionEvent.getInstance().desuscribirse(this);
//            Login login = new Login(comunicadorVista);
//            login.setVisible(true);
//            this.dispose();
//        }
    }//GEN-LAST:event_btnEditarPerfilActionPerformed

    private void btnNotificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotificarActionPerformed
        this.dispose();
        RegistrarPublicacionEvent.getInstance().desuscribirse(this);
        ConsultarPublicacionesEvent.getInstance().desuscribirse(this);
        EliminarPublicacionEvent.getInstance().desuscribirse(this);
        MensajePrivado mensajePrivado = new MensajePrivado(usuario, comunicadorVista);
        mensajePrivado.setVisible(true);
    }//GEN-LAST:event_btnNotificarActionPerformed

    private void cancelarBusquedaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBusquedaBtnActionPerformed
        comunicadorVista.consultarPublicaciones();
        this.cancelarBusquedaBtn.setVisible(false);
    }//GEN-LAST:event_cancelarBusquedaBtnActionPerformed

    private void buscarEtiquetaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarEtiquetaBtnActionPerformed
        comunicadorVista.consultarPublicacionesPorEtiqueta(this.buscarEtiquetasTxt.getText());
    }//GEN-LAST:event_buscarEtiquetaBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        RegistrarPublicacionEvent.getInstance().desuscribirse(this);
        ConsultarPublicacionesEvent.getInstance().desuscribirse(this);
        EliminarPublicacionEvent.getInstance().desuscribirse(this);
        ConsultarPublicacionesPorHashtagEvent.getInstance().desuscribirse(this);
        HistorialNotificacionesFrm historialNotificaciones = new HistorialNotificacionesFrm(usuario, comunicadorVista);
        historialNotificaciones.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public void actualizarMuro(List<Publicacion> publicaciones) {

        //this.publicacionesTxt.setText("");
        this.publicacionesTxt.removeAll();
        for (Publicacion publicacion : publicaciones) {
            this.publicacionesTxt.add(new PublicacionPanel(publicacion, usuario, comunicadorVista), 0);
            this.publicacionesTxt.repaint();
            this.publicacionesTxt.revalidate();
//            this.publicacionesTxt.insertComponent(new PublicacionPanel(publicacion, usuario, comunicadorVista));

        }
        
    }

    public void actualizarMuro(Publicacion publicacion) {
        this.publicacionesTxt.add(new PublicacionPanel(publicacion, usuario, comunicadorVista), 0);
        this.publicacionesTxt.repaint();
        this.publicacionesTxt.revalidate();
        //this.publicacionesTxt.insertComponent(new PublicacionPanel(publicacion, usuario, comunicadorVista));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCrearPublicacion;
    private javax.swing.JButton btnEditarPerfil;
    private javax.swing.JButton btnNotificar;
    private javax.swing.JButton buscarEtiquetaBtn;
    private javax.swing.JTextField buscarEtiquetasTxt;
    private javax.swing.JButton cancelarBusquedaBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel principalPanel;
    private javax.swing.JPanel publicacionesTxt;
    private javax.swing.JScrollPane scrollPublicaciones;
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
    }

    @Override
    public void onConsultarPublicacionesPorHashtag(PeticionPublicaciones respuesta) {
        if(respuesta.getStatus()>=400){
            JOptionPane.showMessageDialog(this, respuesta.getMensajeError(), "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }else{
            this.actualizarMuro(respuesta.getPublicaciones());
            this.cancelarBusquedaBtn.setVisible(true);
        }
    }

}
