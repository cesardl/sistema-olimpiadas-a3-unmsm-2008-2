package pe.edu.unmsm.fisi.SistInscripcion;

import pe.edu.unmsm.fisi.clases.Deporte;
import pe.edu.unmsm.fisi.clases.Equipo;
import pe.edu.unmsm.fisi.clases.ListaDeportes;
import pe.edu.unmsm.fisi.clases.ListaPaises;
import pe.edu.unmsm.fisi.Principal.JFramePrincipal;
import java.util.Observable;
import java.util.Observer;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

public class JDialogCentroInscripciones extends javax.swing.JDialog implements Observer {

    private DefaultListModel dlmDelegacion;
    private Observable o;
    private JFramePrincipal vp;
    private JDialogEquipos ventEquipo;
    private JDialogMostrarPorDeporte dmpd;
    private ListaPaises listaPaises;
    private DefaultComboBoxModel dcbmPais;
    private ListaDeportes listaDeportes;

    public JDialogCentroInscripciones(ListaDeportes bd) {
        listaDeportes = bd;
        o = new Observable();
        vp = new JFramePrincipal();
        initComponents();
        this.setTitle("Centro de Inscripciones");
        dlmDelegacion = new DefaultListModel();
        jListDelegacion.setModel(dlmDelegacion);
        listaPaises = new ListaPaises();
        llenarComboBox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JTabbedPane jTabbedPane = new javax.swing.JTabbedPane();
        javax.swing.JPanel jPanel = new javax.swing.JPanel();
        javax.swing.JLabel jLabelPais = new javax.swing.JLabel();
        jComboBoxPais = new javax.swing.JComboBox();
        javax.swing.JButton jButtonEntrar = new javax.swing.JButton();
        javax.swing.JButton jButtonMostrarPorDeporte = new javax.swing.JButton();
        javax.swing.JLabel jLabelLimite = new javax.swing.JLabel();
        javax.swing.JTextField jTextFieldLimite = new javax.swing.JTextField();
        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        javax.swing.JScrollPane jScrollPane2 = new javax.swing.JScrollPane();
        jListDelegacion = new javax.swing.JList();
        javax.swing.JButton jButtonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabelPais.setText("Pais:");

        jComboBoxPais.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxPaisItemStateChanged(evt);
            }
        });
        jComboBoxPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPaisActionPerformed(evt);
            }
        });

        jButtonEntrar.setText("Entrar");
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });

        jButtonMostrarPorDeporte.setText("Mostrar por deporte");
        jButtonMostrarPorDeporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarPorDeporteActionPerformed(evt);
            }
        });

        jLabelLimite.setText("Limite:");

        jTextFieldLimite.setEditable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Delegacion"));

        jScrollPane2.setViewportView(jListDelegacion);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelLimite)
                            .addComponent(jButtonEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(jButtonMostrarPorDeporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldLimite, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(jLabelPais)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxPais, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPais)
                    .addComponent(jComboBoxPais, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jButtonEntrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonMostrarPorDeporte)
                        .addGap(28, 28, 28)
                        .addComponent(jLabelLimite)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldLimite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane.addTab("Seleccionar Pais", jPanel);

        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(522, 522, 522)
                        .addComponent(jButtonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSalir)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed
    ventEquipo = new JDialogEquipos(this, null, (String) jComboBoxPais.getSelectedItem(), listaDeportes);
    ventEquipo.setLocationRelativeTo(this);
    ventEquipo.setModalityType(ModalityType.APPLICATION_MODAL);
    ventEquipo.setVisible(true);
}//GEN-LAST:event_jButtonEntrarActionPerformed

private void jButtonMostrarPorDeporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarPorDeporteActionPerformed
    dmpd = new JDialogMostrarPorDeporte(listaDeportes);
    dmpd.setModalityType(ModalityType.APPLICATION_MODAL);
    dmpd.setLocationRelativeTo(this);
    dmpd.setVisible(true);
}//GEN-LAST:event_jButtonMostrarPorDeporteActionPerformed

private void jComboBoxPaisItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxPaisItemStateChanged

}//GEN-LAST:event_jComboBoxPaisItemStateChanged

private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
    // TODO add your handling code here:
    o.addObserver(vp);
    o.notifyObservers(listaDeportes);
    vp.update(o, listaDeportes);
    this.dispose();
}//GEN-LAST:event_jButtonSalirActionPerformed

private void jComboBoxPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPaisActionPerformed
    // TODO add your handling code here:
    dlmDelegacion.clear();
    Equipo e;
    Deporte d;
    String nombrePais = jComboBoxPais.getSelectedItem().toString().trim();
    for (int i = 0; i < listaDeportes.tamanio(); i++) {
        d = listaDeportes.getDeporte(i);
        for (int j = 0; j < d.tamanio(); j++) {
            e = d.getEquipo(j);
            if (e.getPais().trim().equals(nombrePais)) {
                dlmDelegacion.addElement(e.getDeporte());
            }
        }

    }
}//GEN-LAST:event_jComboBoxPaisActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBoxPais;
    private javax.swing.JList jListDelegacion;
    // End of variables declaration//GEN-END:variables

    public void llenarComboBox() {
        dcbmPais = new DefaultComboBoxModel();
        jComboBoxPais.setModel(dcbmPais);
        for (int i = 0; i < listaPaises.tamaño(); i++) {
            dcbmPais.addElement(listaPaises.getPais(i).getNombre());
        }
    }

    public void update(Observable o, Object arg) {
        ListaDeportes ld = (ListaDeportes) arg;
        this.listaDeportes = ld;
    }
}
