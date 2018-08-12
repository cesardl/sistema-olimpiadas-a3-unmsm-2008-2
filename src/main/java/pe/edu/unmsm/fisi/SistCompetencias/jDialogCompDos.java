package pe.edu.unmsm.fisi.SistCompetencias;

import pe.edu.unmsm.fisi.clases.Competencia;
import pe.edu.unmsm.fisi.clases.Equipo;
import pe.edu.unmsm.fisi.clases.Metodos;
import javax.swing.JOptionPane;
import java.util.Observable;
import pe.edu.unmsm.fisi.SistEventos.JDialogPartidosPendientes;

public class jDialogCompDos extends javax.swing.JDialog {

    private Competencia c;
    private Observable o;
    private JDialogPartidosPendientes jdpp;
    private int nHome = 0, nAway = 0;

    public jDialogCompDos(Competencia c, JDialogPartidosPendientes jdpp) {
        initComponents();
        this.c = c;
        this.jdpp = jdpp;
        o = new Observable();
        jTextFieldHome.setText(c.getCompetidores().get(0).getPais());
        jTextFieldAway.setText(c.getCompetidores().get(1).getPais());
    }

    public void empezarJuego() {
        Metodos.deshabilitarPanel(jPanelParticipantes);
        String home = jTextFieldHome.getText();
        String away = jTextFieldAway.getText();
        String salida = "";
        while (nHome == nAway) {
            nHome = Metodos.random(5);
            nAway = Metodos.random(5);
            salida = "\tResultado\n\n"
                    + home + " : " + nHome + "\n"
                    + away + " : " + nAway;
        }
        jTextAreaSalida.setText(salida);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jPanelParticipantes = new javax.swing.JPanel();
        jTextFieldHome = new javax.swing.JTextField();
        jLabelVS = new javax.swing.JLabel();
        jTextFieldAway = new javax.swing.JTextField();
        jButtonEmpezar = new javax.swing.JButton();
        jPanelJuego = new javax.swing.JPanel();
        jScrollPane = new javax.swing.JScrollPane();
        jTextAreaSalida = new javax.swing.JTextArea();
        jSplitPane = new javax.swing.JSplitPane();
        jButtonAceptar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanelParticipantes.setBorder(javax.swing.BorderFactory.createTitledBorder("Participantes"));

        jTextFieldHome.setEditable(false);

        jLabelVS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelVS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelVS.setText("VS");

        jTextFieldAway.setEditable(false);

        jButtonEmpezar.setText("Empezar juego");
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
                .addGroup(jPanelParticipantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelParticipantesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextFieldHome, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(jLabelVS, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldAway, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelParticipantesLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jButtonEmpezar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelParticipantesLayout.setVerticalGroup(
            jPanelParticipantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelParticipantesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelParticipantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAway, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelVS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEmpezar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelJuego.setBorder(javax.swing.BorderFactory.createTitledBorder("Juego"));

        jTextAreaSalida.setColumns(20);
        jTextAreaSalida.setEditable(false);
        jTextAreaSalida.setRows(5);
        jScrollPane.setViewportView(jTextAreaSalida);

        javax.swing.GroupLayout jPanelJuegoLayout = new javax.swing.GroupLayout(jPanelJuego);
        jPanelJuego.setLayout(jPanelJuegoLayout);
        jPanelJuegoLayout.setHorizontalGroup(
            jPanelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJuegoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelJuegoLayout.setVerticalGroup(
            jPanelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJuegoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
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
                    .addComponent(jPanelParticipantes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelJuego, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSplitPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
            .addGap(0, 406, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 428, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
    o.addObserver(jdpp);
    Equipo e;
    if (nHome > nAway) {
        System.out.println("home");
        e = c.getCompetidores().get(0);

    } else {
        System.out.println("away");
        e = c.getCompetidores().get(1);
    }
    o.notifyObservers(e);
    jdpp.update(o, e);
    JOptionPane.showMessageDialog(this, "Resultados guardados",
            this.getTitle(), JOptionPane.INFORMATION_MESSAGE);
    this.dispose();
}//GEN-LAST:event_jButtonAceptarActionPerformed

private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
    this.dispose();
}//GEN-LAST:event_jButtonCancelarActionPerformed

private void jButtonEmpezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEmpezarActionPerformed
    empezarJuego();
}//GEN-LAST:event_jButtonEmpezarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEmpezar;
    private javax.swing.JLabel jLabelVS;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanelJuego;
    private javax.swing.JPanel jPanelParticipantes;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JSplitPane jSplitPane;
    private javax.swing.JTextArea jTextAreaSalida;
    private javax.swing.JTextField jTextFieldAway;
    private javax.swing.JTextField jTextFieldHome;
    // End of variables declaration//GEN-END:variables
}
