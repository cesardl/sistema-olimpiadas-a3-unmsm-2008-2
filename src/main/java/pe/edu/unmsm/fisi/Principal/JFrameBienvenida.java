package pe.edu.unmsm.fisi.Principal;

import java.awt.Dialog.ModalityType;
import javax.swing.JOptionPane;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.edu.unmsm.fisi.splash.JDialogSplash;

public class JFrameBienvenida extends javax.swing.JFrame {

    private static final Logger LOG = LoggerFactory.getLogger(JFrameBienvenida.class);

    private String id;
    private String pass;

    public JFrameBienvenida() {
        initComponents();

        id = "fisi";
        pass = "algoritmica";

        pe.edu.unmsm.fisi.utils.Metodos.centrarVentana(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel jPanel = new javax.swing.JPanel();
        javax.swing.JLabel jLabelUser = new javax.swing.JLabel();
        javax.swing.JLabel jLabelPsw = new javax.swing.JLabel();
        javax.swing.JLabel jLabelImagen = new javax.swing.JLabel();
        jTextFieldUser = new javax.swing.JTextField();
        jPasswordFieldPswd = new javax.swing.JPasswordField();
        javax.swing.JButton jButtonAceptar = new javax.swing.JButton();
        javax.swing.JButton jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Juegos Olimpicos");
        setResizable(false);

        jPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabelUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelUser.setText("User ID:");

        jLabelPsw.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPsw.setText("Password:");

        jLabelImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesOlimpiadas/antorcha1.jpg"))); // NOI18N
        jLabelImagen.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextFieldUser.setText("fisi");
        jTextFieldUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUserActionPerformed(evt);
            }
        });

        jPasswordFieldPswd.setText("algoritmica");
        jPasswordFieldPswd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldPswdActionPerformed(evt);
            }
        });

        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabelPsw, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelUser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordFieldPswd, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                            .addComponent(jTextFieldUser, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                        .addComponent(jButtonAceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancelar))
                    .addComponent(jLabelImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUser)
                    .addComponent(jTextFieldUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPsw)
                    .addComponent(jPasswordFieldPswd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonAceptar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
    aceptar();
}//GEN-LAST:event_jButtonAceptarActionPerformed

private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
    LOG.trace(evt.paramString());
    System.exit(0);
}//GEN-LAST:event_jButtonCancelarActionPerformed

private void jPasswordFieldPswdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldPswdActionPerformed
    LOG.trace(evt.paramString());
    aceptar();
}//GEN-LAST:event_jPasswordFieldPswdActionPerformed

private void jTextFieldUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUserActionPerformed
    LOG.trace(evt.paramString());
    aceptar();
}//GEN-LAST:event_jTextFieldUserActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField jPasswordFieldPswd;
    private javax.swing.JTextField jTextFieldUser;
    // End of variables declaration//GEN-END:variables

    private boolean SecuenciaValidacion() {
        String cuenta = jTextFieldUser.getText().trim();
        String contrasenia = new String(jPasswordFieldPswd.getPassword());

        JDialogSplash jDialogSplash = new JDialogSplash(this, ModalityType.APPLICATION_MODAL);
        jDialogSplash.setLocationRelativeTo(this);
        jDialogSplash.setVisible(true);

        if (cuenta.equals(id) && contrasenia.equals(pass)) {
            LOG.info("Logging successful");
            return true;
        } else {
            LOG.info("Logging failed");
            return false;
        }
    }

    public void aceptar() {
        String ID = jTextFieldUser.getText();
        String PASS = new String(jPasswordFieldPswd.getPassword());
        if (ID.trim().length() != 0 || PASS.length() != 0) {
            if (SecuenciaValidacion()) {
                JOptionPane.showMessageDialog(this, "Bienvenido!!!",
                        this.getTitle(), JOptionPane.INFORMATION_MESSAGE);
                LOG.debug("Opening JFramePrincipal");
                JFramePrincipal vPrincipal = new JFramePrincipal();
                vPrincipal.setLocationRelativeTo(this);
                vPrincipal.setVisible(true);

                this.dispose();
            } else {
                limpiar();
                JOptionPane.showMessageDialog(this, "No ha podido iniciar sesion\n"
                        + "la cuenta o la contrasenia son incorrectos",
                        this.getTitle(), JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese valores",
                    this.getTitle(), JOptionPane.WARNING_MESSAGE);
        }
    }

    private void limpiar() {
        jTextFieldUser.setText("");
        jPasswordFieldPswd.setText("");
        jTextFieldUser.requestFocus();
        this.repaint();
    }
}
