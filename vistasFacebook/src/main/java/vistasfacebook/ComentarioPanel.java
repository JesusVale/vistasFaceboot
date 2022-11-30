/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vistasfacebook;

import entidades.Comentario;
import entidades.Usuario;
import java.text.SimpleDateFormat;

/**
 *
 * @author jegav
 */
public class ComentarioPanel extends javax.swing.JPanel {

    Comentario comentario;
    Usuario usuario;

    /**
     * Creates new form ComentarioPanel
     */
    public ComentarioPanel(Comentario comentario) {
        initComponents();
        this.comentario = comentario;
        llenarComentarios();
    }

    private void llenarComentarios() {
        this.usuarioTxt.setText(comentario.getUsuario().getNombre());
        SimpleDateFormat fechaFormat = new SimpleDateFormat("dd/MM/yyyy");
        String fecha = fechaFormat.format(comentario.getFechaPublicacion().getTime());
        this.lblFecha.setText(fecha);
        this.comentarioTxt.setText(comentario.getContenido());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usuarioTxt = new javax.swing.JLabel();
        comentarioTxt = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();

        setBackground(new java.awt.Color(241, 250, 238));
        setPreferredSize(new java.awt.Dimension(599, 124));

        usuarioTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        usuarioTxt.setText("Nombre Usuario");

        comentarioTxt.setText("Hola soy un comentario");

        lblFecha.setText("22/13/22");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usuarioTxt)
                            .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(comentarioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(usuarioTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comentarioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel comentarioTxt;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel usuarioTxt;
    // End of variables declaration//GEN-END:variables
}
