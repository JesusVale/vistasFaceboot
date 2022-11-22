/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistasfacebook;

import comVista.ComunicadorVista;
import comVista.IComunicadorVista;
import entidades.Publicacion;
import entidades.Usuario;
import events.ManejadorEventos;
import events.RegistrarPublicacionEvent;
import interfaces.IRegistrarPublicacionObserver;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.commons.io.IOUtils;
import peticiones.Peticion;
import peticiones.PeticionPublicacion;
import peticiones.PeticionPublicaciones;
import utils.ConversorLocalDateToCalendar;

/**
 *
 * @author tonyd
 */
public class FrmPublicacionPrueba extends javax.swing.JFrame implements IRegistrarPublicacionObserver {

    private IComunicadorVista comunicadorVista;
    private Usuario usuario;
    private byte[] buffer;

    /**
     * Creates new form FrmPublicacionPrueba
     *
     * @param comunicadorVista
     */
    public FrmPublicacionPrueba(IComunicadorVista comunicadorVista) {
        initComponents();
        this.comunicadorVista = comunicadorVista;
        RegistrarPublicacionEvent.getInstance().suscribirse(this);
        //ManejadorEventos.getInstance().suscribirseRegistrarPublicacion(this);
    }

    public FrmPublicacionPrueba(Usuario usuario, IComunicadorVista comunicadorVista) {
        initComponents();
        this.usuario = usuario;
        this.comunicadorVista = comunicadorVista;
        RegistrarPublicacionEvent.getInstance().suscribirse(this);
        //ManejadorEventos.getInstance().suscribirseRegistrarPublicacion(this);
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
        lbltitulo = new javax.swing.JLabel();
        barra1 = new javax.swing.JLabel();
        barra2 = new javax.swing.JLabel();
        lblContenido = new javax.swing.JLabel();
        lblNombreImagen = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtContenido = new javax.swing.JTextArea();
        btnImagen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrar Publicación");

        jPanel1.setBackground(new java.awt.Color(241, 250, 238));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbltitulo.setBackground(new java.awt.Color(255, 255, 255));
        lbltitulo.setFont(new java.awt.Font("Amarillo", 2, 24)); // NOI18N
        lbltitulo.setForeground(new java.awt.Color(255, 255, 255));
        lbltitulo.setText("Registrar Publicación");
        jPanel1.add(lbltitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 350, 70));

        barra1.setBackground(new java.awt.Color(37, 161, 142));
        barra1.setOpaque(true);
        jPanel1.add(barra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 910, 60));

        barra2.setBackground(new java.awt.Color(37, 161, 142));
        barra2.setOpaque(true);
        jPanel1.add(barra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 60));

        lblContenido.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblContenido.setForeground(new java.awt.Color(0, 0, 0));
        lblContenido.setText("Contenido:");
        jPanel1.add(lblContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        lblNombreImagen.setBackground(new java.awt.Color(255, 255, 255));
        lblNombreImagen.setForeground(new java.awt.Color(0, 0, 0));
        lblNombreImagen.setOpaque(true);
        jPanel1.add(lblNombreImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 620, 35));

        btnGuardar.setBackground(new java.awt.Color(37, 161, 142));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Publicar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 470, 180, 35));

        btnCancelar.setBackground(new java.awt.Color(37, 161, 142));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 470, 180, 35));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        txtContenido.setBackground(new java.awt.Color(255, 255, 255));
        txtContenido.setColumns(20);
        txtContenido.setRows(5);
        jScrollPane1.setViewportView(txtContenido);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 830, 220));

        btnImagen.setBackground(new java.awt.Color(37, 161, 142));
        btnImagen.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnImagen.setForeground(new java.awt.Color(255, 255, 255));
        btnImagen.setText("Adjuntar Imagen");
        btnImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImagenActionPerformed(evt);
            }
        });
        jPanel1.add(btnImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 180, 35));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Calendar fecha = Calendar.getInstance();
        Publicacion nuevaPublicacion = new Publicacion(usuario.getId(), fecha, txtContenido.getText(), null);
        comunicadorVista.registrarPublicacion(nuevaPublicacion);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
        //ManejadorEventos.getInstance().desuscribirseRegistrarPublicacion(this);
        RegistrarPublicacionEvent.getInstance().desuscribirse(this);
        Muro m = new Muro(comunicadorVista, usuario);
        m.setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImagenActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

        FileNameExtensionFilter imgFilter = new FileNameExtensionFilter("JPG & GIF Images", "jpg", "gif");
        fileChooser.setFileFilter(imgFilter);

        int result = fileChooser.showOpenDialog(this);

        if (result != JFileChooser.CANCEL_OPTION) {

            String archivo = fileChooser.getSelectedFile().getAbsolutePath();
            File file = new File(archivo);

            if (file == null) {
                this.lblNombreImagen.setText("...");
            } else {
                try {
                    FileInputStream is = new FileInputStream(file);
                    buffer = IOUtils.toByteArray(is);//new byte[(int)fileName.length()];
                    this.lblNombreImagen.setText(file.getAbsolutePath());
                    is.close();
                    IOUtils.write(buffer, new FileOutputStream(archivo));
                } catch (Exception e) {
                    Logger.getLogger(FrmPublicacionPrueba.class.getName()).log(Level.SEVERE, null, e);
                }
            }
        }
    }//GEN-LAST:event_btnImagenActionPerformed

//    /**
//     * @param args the command line arguments
//     */
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
//            java.util.logging.Logger.getLogger(FrmPublicacionPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FrmPublicacionPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FrmPublicacionPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FrmPublicacionPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FrmPublicacionPrueba().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel barra1;
    private javax.swing.JLabel barra2;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnImagen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblContenido;
    private javax.swing.JLabel lblNombreImagen;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JTextArea txtContenido;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onRegistrarPublicacion(PeticionPublicacion peticionPublicacion) {
        
        if (peticionPublicacion.getStatus() < 400) {
            JOptionPane.showMessageDialog(this, "Se registro la publicación correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo registrar la publicacion", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
