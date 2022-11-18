/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistasfacebook;

import comVista.ComunicadorVista;
import comVista.EventListener;
import comVista.IComunicadorVista;
import entidades.Usuario;
import events.LoginEvent;
import events.ManejadorEventos;
import interfaces.ILoginObserver;
import javax.swing.JOptionPane;
import peticiones.PeticionUsuario;

/**
 *
 * @author tonyd
 */
public class Login extends javax.swing.JFrame implements ILoginObserver  {

    private IComunicadorVista comunicadorVista;

    /**
     * Creates new form Registro
     * @param comunicadorVista
     */
    public Login(IComunicadorVista comunicadorVista) {
        initComponents();
        this.comunicadorVista = comunicadorVista;
        LoginEvent.getInstance().suscribirse(this);
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
        lblPassword = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblO = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        btnRegistrate = new javax.swing.JButton();
        btnEntraFacebook = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();
        btnEntraGoogle = new javax.swing.JButton();
        barra1 = new javax.swing.JLabel();
        barra2 = new javax.swing.JLabel();
        rectangulo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Faceboot");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.setMinimumSize(new java.awt.Dimension(910, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPassword.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblPassword.setText("Contraseña");
        jPanel1.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, -1, -1));

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblUsuario.setText("Usuario");
        jPanel1.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, -1, -1));

        lblO.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblO.setText("--------------------------- O ------------------------");
        jPanel1.add(lblO, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 350, 35));

        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 250, 33));

        txtUsuario.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 250, 33));

        btnRegistrate.setBackground(new java.awt.Color(159, 255, 203));
        btnRegistrate.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnRegistrate.setText("¿No tienes cuenta? Registrate");
        btnRegistrate.setToolTipText("");
        btnRegistrate.setBorder(null);
        btnRegistrate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrateActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrate, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 350, 33));

        btnEntraFacebook.setBackground(new java.awt.Color(59, 89, 152));
        btnEntraFacebook.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnEntraFacebook.setForeground(new java.awt.Color(255, 255, 255));
        btnEntraFacebook.setText("Entra con FaceBook");
        jPanel1.add(btnEntraFacebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 350, 35));

        btnIngresar.setBackground(new java.awt.Color(37, 161, 142));
        btnIngresar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("INGRESAR");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 350, 33));

        btnEntraGoogle.setBackground(new java.awt.Color(219, 74, 57));
        btnEntraGoogle.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnEntraGoogle.setForeground(new java.awt.Color(255, 255, 255));
        btnEntraGoogle.setText("Entra con Google");
        jPanel1.add(btnEntraGoogle, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, 350, 35));

        barra1.setBackground(new java.awt.Color(37, 161, 142));
        barra1.setOpaque(true);
        jPanel1.add(barra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 575, 910, 25));

        barra2.setBackground(new java.awt.Color(37, 161, 142));
        barra2.setOpaque(true);
        jPanel1.add(barra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 25));

        rectangulo1.setBackground(new java.awt.Color(159, 255, 203));
        rectangulo1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        rectangulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rectangulo1.setOpaque(true);
        jPanel1.add(rectangulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 500, 390));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 35, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 875, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnRegistrateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrateActionPerformed
        this.dispose();
        LoginEvent.getInstance().desuscribir(this);
        Registro registro = new Registro(comunicadorVista);
        registro.setVisible(true);
    }//GEN-LAST:event_btnRegistrateActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        Usuario usuario = new Usuario(this.txtUsuario.getText(),this.txtPassword.getText());
        comunicadorVista.iniciarSesion(usuario);
    }//GEN-LAST:event_btnIngresarActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        EventListener.getInstance().iniciarListener();
        IComunicadorVista comunicadorVista = new ComunicadorVista();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login(comunicadorVista).setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel barra1;
    private javax.swing.JLabel barra2;
    private javax.swing.JButton btnEntraFacebook;
    private javax.swing.JButton btnEntraGoogle;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnRegistrate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblO;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel rectangulo1;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onLogin(PeticionUsuario peticionUsuario) {
        if(peticionUsuario.getStatus() < 400){
            this.dispose();
            LoginEvent.getInstance().desuscribir(this);
            Muro muro = new Muro(comunicadorVista, peticionUsuario.getUsuario());
            muro.setVisible(true);
        } else{
            JOptionPane.showMessageDialog(this, peticionUsuario.getMensajeError(), "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
    }

}
