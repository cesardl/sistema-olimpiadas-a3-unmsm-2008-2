package pe.edu.unmsm.fisi.SistInscripcion;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.edu.unmsm.fisi.clases.Deporte;
import pe.edu.unmsm.fisi.clases.ListaDeportes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class JDialogMostrarPorDeporte extends javax.swing.JDialog {

    private static final long serialVersionUID = -1181046584108969131L;

    private static final Logger LOG = LoggerFactory.getLogger(JDialogMostrarPorDeporte.class);

    private DefaultListModel<String> dlmParticipantes;
    private ListaDeportes listaDeportes;

    /**
     * Constructor de la clase jDialogMostrarPorDeporte
     */
    public JDialogMostrarPorDeporte(ListaDeportes listaDeportes) {
        initComponents();
        this.listaDeportes = listaDeportes;
        dlmParticipantes = new DefaultListModel<>();
        jListParticipantes.setModel(dlmParticipantes);
        llenarComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        javax.swing.JMenuItem jMenuItemEliminar = new javax.swing.JMenuItem();
        javax.swing.JPanel jPanel = new javax.swing.JPanel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        jComboBoxDeporte = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        jTextFieldInscritos = new javax.swing.JTextField();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        jTextFieldCupos = new javax.swing.JTextField();
        javax.swing.JButton jButtonAceptar = new javax.swing.JButton();
        javax.swing.JPanel jPanelInscritos = new javax.swing.JPanel();
        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        jListParticipantes = new javax.swing.JList<>();

        jMenuItemEliminar.setText("Eliminar");
        jMenuItemEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEliminarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItemEliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Deportes");

        jLabel1.setText("Seleccione Deporte:");

        jComboBoxDeporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDeporteActionPerformed(evt);
            }
        });

        jLabel2.setText("Inscritos:");

        jTextFieldInscritos.setEditable(false);

        jLabel3.setText("Cupos Totales:");

        jTextFieldCupos.setEditable(false);

        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });

        jPanelInscritos.setBorder(javax.swing.BorderFactory.createTitledBorder("Inscritos"));

        jListParticipantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jListParticipantesMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jListParticipantes);

        javax.swing.GroupLayout jPanelInscritosLayout = new javax.swing.GroupLayout(jPanelInscritos);
        jPanelInscritos.setLayout(jPanelInscritosLayout);
        jPanelInscritosLayout.setHorizontalGroup(
            jPanelInscritosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInscritosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelInscritosLayout.setVerticalGroup(
            jPanelInscritosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInscritosLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldInscritos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldCupos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jButtonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(10, 10, 10)
                        .addComponent(jComboBoxDeporte, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelInscritos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxDeporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelInscritos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldInscritos, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldCupos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonAceptar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxDeporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDeporteActionPerformed
        LOG.trace(evt.paramString());
        dlmParticipantes.clear();
        int pos = jComboBoxDeporte.getSelectedIndex();
        Deporte d = listaDeportes.getDeporte(pos);
        for (int i = 0; i < d.teamsSize(); i++) {
            dlmParticipantes.addElement(d.getEquipo(i).getPais());
        }
        jTextFieldInscritos.setText(String.valueOf(d.teamsSize()));
        jTextFieldCupos.setText(String.valueOf(d.getNumeroCupos()));
    }//GEN-LAST:event_jComboBoxDeporteActionPerformed

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        LOG.trace(evt.paramString());
        this.dispose();
}//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jListParticipantesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListParticipantesMouseReleased
        LOG.trace(evt.paramString());
        if (evt.getButton() == MouseEvent.BUTTON3) {
            JList temp = (JList) evt.getSource();
            Point p = evt.getPoint();
            temp.setSelectedIndex(temp.locationToIndex(p));
            LOG.debug("Selected index: {}", temp.getSelectedIndex());
            if (evt.isPopupTrigger()) {
                jPopupMenu1.setLocation(evt.getLocationOnScreen());

                this.setVisible(true);
                jPopupMenu1.setVisible(true);
            }
        }
    }//GEN-LAST:event_jListParticipantesMouseReleased

    private void jMenuItemEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEliminarActionPerformed
        LOG.trace(evt.paramString());
        JOptionPane.showMessageDialog(this, "lol");
    }//GEN-LAST:event_jMenuItemEliminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxDeporte;
    private javax.swing.JList<String> jListParticipantes;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JTextField jTextFieldCupos;
    private javax.swing.JTextField jTextFieldInscritos;
    // End of variables declaration//GEN-END:variables

    private void llenarComboBox() {
        DefaultComboBoxModel<String> dcbmDeporte = new DefaultComboBoxModel<>();
        jComboBoxDeporte.setModel(dcbmDeporte);
        for (int i = 0; i < listaDeportes.size(); i++) {
            dcbmDeporte.addElement(listaDeportes.getDeporte(i).getNombre().trim());
        }
    }

}
