package SistAsistencia;

import Clases.ListaDeportes;
import Principal.jFramePrincipal;
import java.util.Observable;
import java.util.Observer;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

public class jDialogControlAsistencia extends javax.swing.JDialog implements Observer {

    private DefaultComboBoxModel dcbmDeporte;
    private DefaultListModel dlmParticipantes;
    private jFramePrincipal jfp;
    private ListaDeportes listaDeportes;
    private Observable observable;
    private final ModalityType modal = ModalityType.APPLICATION_MODAL;

    public jDialogControlAsistencia(java.awt.Frame parent, ModalityType modal, ListaDeportes ld) {
        super(parent, modal);

        initComponents();

        jfp = (jFramePrincipal) parent;
        listaDeportes = ld;
        dlmParticipantes = new DefaultListModel();
        jListPaises.setModel(dlmParticipantes);
        observable = new Observable();
        llenarComboBox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jPanelAsistentes = new javax.swing.JPanel();
        jLabelDeportes = new javax.swing.JLabel();
        jComboBoxDeportes = new javax.swing.JComboBox();
        jScrollPane = new javax.swing.JScrollPane();
        jListPaises = new javax.swing.JList();
        jButtonMostrar = new javax.swing.JButton();
        jButtonAceptar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonTerminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Control de Asistencia");
        setResizable(false);

        jPanelAsistentes.setBorder(javax.swing.BorderFactory.createTitledBorder("Asistentes"));

        jLabelDeportes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDeportes.setText("Deportes:");

        jScrollPane.setViewportView(jListPaises);

        jButtonMostrar.setText("Mostrar");
        jButtonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAsistentesLayout = new javax.swing.GroupLayout(jPanelAsistentes);
        jPanelAsistentes.setLayout(jPanelAsistentesLayout);
        jPanelAsistentesLayout.setHorizontalGroup(
            jPanelAsistentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAsistentesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAsistentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelAsistentesLayout.createSequentialGroup()
                        .addComponent(jLabelDeportes, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxDeportes, 0, 262, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonMostrar)))
                .addContainerGap())
        );
        jPanelAsistentesLayout.setVerticalGroup(
            jPanelAsistentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAsistentesLayout.createSequentialGroup()
                .addGroup(jPanelAsistentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDeportes)
                    .addComponent(jButtonMostrar)
                    .addComponent(jComboBoxDeportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                .addContainerGap())
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

        jButtonTerminar.setText("Terminar");
        jButtonTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTerminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelAsistentes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jButtonAceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonTerminar)))
                .addContainerGap())
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelAsistentes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonAceptar)
                    .addComponent(jButtonTerminar))
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

private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
    this.dispose();
}//GEN-LAST:event_jButtonCancelarActionPerformed

private void jButtonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarActionPerformed
    String deporte = String.valueOf(jComboBoxDeportes.getSelectedItem()).trim();
    String pais = "";
    dlmParticipantes.clear();
    for (int i = 0; i < listaDeportes.tamanio(); i++) {
        if (listaDeportes.getDeporte(i).getNombre().trim().equals(deporte)) {
            for (int j = 0; j < listaDeportes.getDeporte(i).tamanio(); j++) {
                pais = listaDeportes.getDeporte(i).getEquipo(j).getPais().trim();
                dlmParticipantes.addElement(pais);
            }
            break;
        }
    }
}//GEN-LAST:event_jButtonMostrarActionPerformed

private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
    String titulo = String.valueOf(jComboBoxDeportes.getSelectedItem()).trim();
    int posicion = jComboBoxDeportes.getSelectedIndex();
    jDialogMarcarAsistencia jdc = new jDialogMarcarAsistencia(null, modal, listaDeportes, posicion);
    jdc.setTitle(titulo);
    jdc.setLocationRelativeTo(this);
    jdc.setVisible(true);
}//GEN-LAST:event_jButtonAceptarActionPerformed

private void jButtonTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTerminarActionPerformed
    observable.addObserver(jfp);
    observable.notifyObservers(listaDeportes);
    jfp.update(observable, listaDeportes);
    this.dispose();
}//GEN-LAST:event_jButtonTerminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonMostrar;
    private javax.swing.JButton jButtonTerminar;
    private javax.swing.JComboBox jComboBoxDeportes;
    private javax.swing.JLabel jLabelDeportes;
    private javax.swing.JList jListPaises;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanelAsistentes;
    private javax.swing.JScrollPane jScrollPane;
    // End of variables declaration//GEN-END:variables

    public void llenarComboBox() {
        dcbmDeporte = new DefaultComboBoxModel();
        jComboBoxDeportes.setModel(dcbmDeporte);
        for (int i = 0; i < listaDeportes.tamanio(); i++) {
            dcbmDeporte.addElement(listaDeportes.getDeporte(i).getNombre());
        }
    }

    public void update(Observable o, Object arg) {
        listaDeportes = (ListaDeportes) arg;
    }
}
