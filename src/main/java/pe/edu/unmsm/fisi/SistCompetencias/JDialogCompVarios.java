package pe.edu.unmsm.fisi.SistCompetencias;

import javax.swing.JOptionPane;
import pe.edu.unmsm.fisi.utils.Metodos;

public class JDialogCompVarios extends javax.swing.JDialog {

    public JDialogCompVarios(java.awt.Frame parent, ModalityType modal) {
        super(parent, modal);
        initComponents();
    }

    public void empezarJuego() {
        Metodos.deshabilitarPanel(jPanelParticipantes);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel jPanel = new javax.swing.JPanel();
        jPanelParticipantes = new javax.swing.JPanel();
        javax.swing.JScrollPane jScrollPaneJParticipantes = new javax.swing.JScrollPane();
        javax.swing.JList jListParticipantes = new javax.swing.JList();
        javax.swing.JButton jButtonEmpezar = new javax.swing.JButton();
        javax.swing.JPanel jPanelJuego = new javax.swing.JPanel();
        javax.swing.JScrollPane jScrollPane = new javax.swing.JScrollPane();
        javax.swing.JTextArea jTextAreaSalida = new javax.swing.JTextArea();
        javax.swing.JSplitPane jSplitPane = new javax.swing.JSplitPane();
        javax.swing.JButton jButtonAceptar = new javax.swing.JButton();
        javax.swing.JButton jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelParticipantes.setBorder(javax.swing.BorderFactory.createTitledBorder("Participantes"));

        jListParticipantes.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Peru", "Colombia", "Ecuador", "Chile" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPaneJParticipantes.setViewportView(jListParticipantes);

        jButtonEmpezar.setText("<html>Empezar<br>juego</html>");
        jButtonEmpezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEmpezarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelParticipantesLayout = new javax.swing.GroupLayout(jPanelParticipantes);
        jPanelParticipantes.setLayout(jPanelParticipantesLayout);
        jPanelParticipantesLayout.setHorizontalGroup(
            jPanelParticipantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelParticipantesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneJParticipantes, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addComponent(jButtonEmpezar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelParticipantesLayout.setVerticalGroup(
            jPanelParticipantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelParticipantesLayout.createSequentialGroup()
                .addGroup(jPanelParticipantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelParticipantesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonEmpezar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPaneJParticipantes, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanelJuego.setBorder(javax.swing.BorderFactory.createTitledBorder("Juego"));

        jTextAreaSalida.setEditable(false);
        jTextAreaSalida.setColumns(20);
        jTextAreaSalida.setRows(5);
        jScrollPane.setViewportView(jTextAreaSalida);

        javax.swing.GroupLayout jPanelJuegoLayout = new javax.swing.GroupLayout(jPanelJuego);
        jPanelJuego.setLayout(jPanelJuegoLayout);
        jPanelJuegoLayout.setHorizontalGroup(
            jPanelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJuegoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelJuegoLayout.setVerticalGroup(
            jPanelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJuegoLayout.createSequentialGroup()
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });
        jSplitPane.setLeftComponent(jButtonAceptar);

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jSplitPane.setRightComponent(jButtonCancelar);

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSplitPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanelJuego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelParticipantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelParticipantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelJuego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSplitPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 377, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
    JOptionPane.showMessageDialog(this, "Resultados guardados",
            this.getTitle(), JOptionPane.INFORMATION_MESSAGE);
    this.dispose();
}//GEN-LAST:event_jButtonAceptarActionPerformed

private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
    this.dispose();
}//GEN-LAST:event_jButtonCancelarActionPerformed

private void jButtonEmpezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEmpezarActionPerformed
}//GEN-LAST:event_jButtonEmpezarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanelParticipantes;
    // End of variables declaration//GEN-END:variables
}
