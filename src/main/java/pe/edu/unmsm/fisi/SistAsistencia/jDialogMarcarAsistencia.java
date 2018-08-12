package pe.edu.unmsm.fisi.SistAsistencia;

import pe.edu.unmsm.fisi.clases.Deporte;
import pe.edu.unmsm.fisi.clases.ListaDeportes;
import java.util.Observable;
import javax.swing.table.DefaultTableModel;

public class jDialogMarcarAsistencia extends javax.swing.JDialog {

    private DefaultTableModel dtmParticipantes;
    private jDialogControlAsistencia jdca;
    private ListaDeportes listaDeportes;
    private Observable observable;
    private int posicion;

    public jDialogMarcarAsistencia(java.awt.Frame parent, ModalityType modal, ListaDeportes ld, int posicion) {
        super(parent, modal);
        initComponents();

        jdca = new jDialogControlAsistencia(parent, modal, ld);
        observable = new Observable();
        listaDeportes = ld;
        dtmParticipantes = (DefaultTableModel) jTableParticipantes.getModel();
        jTableParticipantes.setModel(dtmParticipantes);
        this.posicion = posicion;
        mostrarDatosTabla(listaDeportes, this.posicion);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jPanelParticipantes = new javax.swing.JPanel();
        jScrollPane = new javax.swing.JScrollPane();
        jTableParticipantes = new javax.swing.JTable();
        jButtonAceptar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelParticipantes.setBorder(javax.swing.BorderFactory.createTitledBorder("Participantes"));

        jTableParticipantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pais", "Asistio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableParticipantes.getTableHeader().setReorderingAllowed(false);
        jScrollPane.setViewportView(jTableParticipantes);

        javax.swing.GroupLayout jPanelParticipantesLayout = new javax.swing.GroupLayout(jPanelParticipantes);
        jPanelParticipantes.setLayout(jPanelParticipantesLayout);
        jPanelParticipantesLayout.setHorizontalGroup(
            jPanelParticipantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 387, Short.MAX_VALUE)
            .addGroup(jPanelParticipantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelParticipantesLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanelParticipantesLayout.setVerticalGroup(
            jPanelParticipantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 268, Short.MAX_VALUE)
            .addGroup(jPanelParticipantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelParticipantesLayout.createSequentialGroup()
                    .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                    .addContainerGap()))
        );

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelParticipantes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(jButtonAceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCancelar)))
                .addContainerGap())
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelParticipantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
    capturarDatosTabla();//GEN-LAST:event_jButtonAceptarActionPerformed
        observable.addObserver(jdca);
        observable.notifyObservers(listaDeportes);
        jdca.update(observable, listaDeportes);
        this.dispose();
    }

private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
    this.dispose();
}//GEN-LAST:event_jButtonCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanelParticipantes;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTable jTableParticipantes;
    // End of variables declaration//GEN-END:variables

    public void mostrarDatosTabla(ListaDeportes ld, int pos) {
        Deporte d = ld.getDeporte(pos);
        dtmParticipantes.setRowCount(0);
        for (int i = 0; i < d.tamanio(); i++) {
            Object[] rowData = {
                d.getEquipo(i).getPais(),
                d.getEquipo(i).isAsistio()
            };
            dtmParticipantes.addRow(rowData);
        }
    }

    public void capturarDatosTabla() {
        Deporte d = listaDeportes.getDeporte(posicion);
        for (int i = 0; i < dtmParticipantes.getRowCount(); i++) {
            boolean b = Boolean.parseBoolean(String.valueOf(dtmParticipantes.getValueAt(i, 1)));
            d.getEquipo(i).setAsistio(b);
        }
    }
}
