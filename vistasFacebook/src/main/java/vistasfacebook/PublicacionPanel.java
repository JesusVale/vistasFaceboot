/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vistasfacebook;

import comVista.IComunicadorVista;
import entidades.Publicacion;
import entidades.Usuario;
import events.ConsultarUsuarioEvent;
import interfaces.IConsultarUsuarioObserver;
import java.awt.Image;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;

import peticiones.PeticionUsuario;

/**
 *
 * @author jegav
 */
public class PublicacionPanel extends javax.swing.JPanel implements IConsultarUsuarioObserver {

    private Publicacion publicacion;
    private Usuario usuario;
    private IComunicadorVista comunicadorVista;
    /**
     * Creates new form PublicacionPanel
     */
    public PublicacionPanel(Publicacion publicacion, IComunicadorVista comunicadorVista) {
        initComponents();
        this.setSize(655, 532);
        this.comunicadorVista = comunicadorVista;
        this.publicacion = publicacion;
        ConsultarUsuarioEvent.getInstance().suscribirse(this);
        comunicadorVista.cosultarUsuarioPorId(publicacion.getUsuario());
        
        
    }
    
    public PublicacionPanel() {
        initComponents();
        
    }

    private void llenarPanel(){
        this.nombreLbl.setText(usuario.getNombre());
        this.descripcionLbl.setText(publicacion.getTexto());
        SimpleDateFormat fechaFormat = new SimpleDateFormat("dd/MM/yyyy");
        String fecha = fechaFormat.format(publicacion.getFechaCreacion().getTime());
        this.fechaLbl.setText(fecha);

        Image imagenPublicacion = new ImageIcon(publicacion.getImagen()).getImage();
        System.out.println(imagenPublicacion);
        System.out.println(publicacion.getImagen());
        Image imagenEscalada = imagenPublicacion.getScaledInstance(534, 239, Image.SCALE_SMOOTH);
        this.imageLbl.setIcon(new ImageIcon(imagenEscalada));
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
        nombreLbl = new javax.swing.JLabel();
        descripcionLbl = new javax.swing.JLabel();
        fechaLbl = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        imageLbl = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(655, 532));

        jPanel1.setBackground(new java.awt.Color(241, 250, 238));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setPreferredSize(new java.awt.Dimension(655, 512));

        nombreLbl.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 18)); // NOI18N
        nombreLbl.setText("Nombre Usuario");

        descripcionLbl.setText("Hola Soy Una Publicacion");

        fechaLbl.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        fechaLbl.setText("19/11/2022");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Comentarios");

        jButton1.setText("Enviar");

        jLabel3.setText("Nombre Usuario");

        jLabel4.setText("Yo opino que opinar es necesario porque tengo un pensamiento");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(248, 248, 248))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(imageLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fechaLbl)
                    .addComponent(nombreLbl)
                    .addComponent(descripcionLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(nombreLbl)
                .addGap(4, 4, 4)
                .addComponent(fechaLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(descripcionLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(imageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel descripcionLbl;
    private javax.swing.JLabel fechaLbl;
    private javax.swing.JLabel imageLbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel nombreLbl;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onConsultarUsuario(PeticionUsuario peticionUsuario) {
        if(publicacion.getUsuario() == peticionUsuario.getUsuario().getId()){
            this.usuario = peticionUsuario.getUsuario();
            llenarPanel();
        }
    }
}
