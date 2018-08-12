package pe.edu.unmsm.fisi.SistInscripcion;

import pe.edu.unmsm.fisi.clases.Deporte;
import pe.edu.unmsm.fisi.clases.Deportista;
import pe.edu.unmsm.fisi.clases.Equipo;
import pe.edu.unmsm.fisi.clases.ListaDeportes;
import pe.edu.unmsm.fisi.clases.ListaPaises;
import java.util.Observable;
import java.util.Observer;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class jDialogEquipos extends javax.swing.JDialog implements Observer {

    private jDialogCentroInscripciones vci;
    private Observable o;
    private DefaultTableModel dtmEquipo;
    private DefaultComboBoxModel dcbmDeporte;
    private DefaultComboBoxModel dcbmPais;
    private jDialogDeportista ventEditar;
    private jDialogMostrarPorDeporte dmpd;
    private Equipo equipoTemporal;
    private ListaDeportes listaDeportes;
    private ListaPaises listaPaises;
    private Deporte deporteTemporal;
    private int inscritosIni,  inscritos,  limite,  edicion;
    private boolean guardado,  modificado;

    public jDialogEquipos(jDialogCentroInscripciones vci, String deporte, String pais, ListaDeportes listaDeportes) {
        o = new Observable();
        this.listaDeportes = listaDeportes;
        listaPaises = new ListaPaises();
        this.vci = vci;
        if (System.getProperty("os.name").contains("Windows")) {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception ex) {
            }
        }
        initComponents();

        dtmEquipo = (DefaultTableModel) jTableParticipantes.getModel();
        jTableParticipantes.setModel(dtmEquipo);
        llenarComboBox();
        jButtonAgregar.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jButtonEliminar.setEnabled(false);
        jButtonGuardar.setEnabled(false);
        verificarDatosEntrada(deporte, pais);
        modificado = false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jlabelDeporte = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableParticipantes = new javax.swing.JTable();
        jButtonAgregar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jLabelLimiteDeportistas = new javax.swing.JLabel();
        jTextFieldLimiteDeportistas = new javax.swing.JTextField();
        jLabelPais = new javax.swing.JLabel();
        jComboBoxPais = new javax.swing.JComboBox();
        jButtonMostrar = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jTextFieldInscritos = new javax.swing.JTextField();
        jLabelInscritos = new javax.swing.JLabel();
        jComboBoxDeporte = new javax.swing.JComboBox();
        jButtonAceptar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Equipos");
        setResizable(false);

        jPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Equipo"));

        jlabelDeporte.setText("Deporte:");

        jTableParticipantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableParticipantes.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableParticipantes);

        jButtonAgregar.setText("Agregar");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });

        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jLabelLimiteDeportistas.setText("Limite Deportistas:");

        jTextFieldLimiteDeportistas.setEditable(false);

        jLabelPais.setText("Pais:");

        jButtonMostrar.setText("Mostrar");
        jButtonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarActionPerformed(evt);
            }
        });

        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jTextFieldInscritos.setEditable(false);

        jLabelInscritos.setText("Inscritos:");

        jComboBoxDeporte.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxDeporteItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldLimiteDeportistas, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(jButtonEliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(jButtonGuardar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(jTextFieldInscritos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(jLabelInscritos, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelLimiteDeportistas, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addComponent(jButtonEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addComponent(jButtonAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(jLabelPais)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxPais, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlabelDeporte)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxDeporte, 0, 284, Short.MAX_VALUE))
                    .addComponent(jButtonMostrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPais)
                    .addComponent(jComboBoxPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabelDeporte)
                    .addComponent(jComboBoxDeporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jButtonMostrar)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jButtonAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelInscritos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(jTextFieldInscritos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelLimiteDeportistas, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldLimiteDeportistas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)))
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonAceptar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
    if (inscritos < limite) {
        modificado = true;
        String deporte = equipoTemporal.getDeporte();
        String pais = equipoTemporal.getPais();
        int posDeporte = jComboBoxDeporte.getSelectedIndex();
        jDialogDeportista ventanaDeportista = new jDialogDeportista(this, deporte, pais, null, posDeporte);
        ventanaDeportista.setTitle("Nuevo deportista");
        ventanaDeportista.setModalityType(ModalityType.APPLICATION_MODAL);
        ventanaDeportista.setLocationRelativeTo(this);
        ventanaDeportista.setVisible(true);
    } else {
        JOptionPane.showMessageDialog(this, "Equipo completo", "Error", JOptionPane.ERROR_MESSAGE);
    }
}//GEN-LAST:event_jButtonAgregarActionPerformed

private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
    edicion = jTableParticipantes.getSelectedRow();

    if (edicion == -1) {
        JOptionPane.showMessageDialog(this, "Seleccione un deportista",
                this.getTitle(), JOptionPane.ERROR_MESSAGE);
    } else {
        modificado = true;
        Deportista d = equipoTemporal.getDeportista(edicion);
        String deporte = (String) jComboBoxDeporte.getSelectedItem();
        String pais = (String) jComboBoxDeporte.getSelectedItem();
        int posDeporte = jComboBoxDeporte.getSelectedIndex();
        ventEditar = new jDialogDeportista(this, deporte, pais, d, posDeporte);
        ventEditar.setTitle("Editar Deportista");
        ventEditar.setModalityType(ModalityType.APPLICATION_MODAL);
        ventEditar.setLocationRelativeTo(this);
        ventEditar.setVisible(true);
    }
}//GEN-LAST:event_jButtonEditarActionPerformed

private void jButtonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarActionPerformed
    mostrarEquipo();
}//GEN-LAST:event_jButtonMostrarActionPerformed

private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
    JOptionPane.showMessageDialog(this, "Se guardaron los datos",
            this.getTitle(), JOptionPane.INFORMATION_MESSAGE);
    guardar();
    guardado = true;
}//GEN-LAST:event_jButtonGuardarActionPerformed

private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
    if (modificado == true) {
        int opcion = JOptionPane.showConfirmDialog(this,
                "Ha modificado la base de datos, ¿desea guardar los cambios?",
                "Guardando cambios", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (opcion == JOptionPane.YES_OPTION) {
            jButtonGuardarActionPerformed(null);
            o.addObserver(vci);
            o.notifyObservers(listaDeportes);
            vci.update(o, listaDeportes);
            this.dispose();
        } else if (opcion == JOptionPane.NO_OPTION) {
            this.dispose();
        }
    } else {
        this.dispose();
    }
}//GEN-LAST:event_jButtonAceptarActionPerformed

private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
    int eliminar = jTableParticipantes.getSelectedRow();
    if (eliminar == -1) {
        JOptionPane.showMessageDialog(this, "Seleccione un deportista", this.getTitle(), JOptionPane.ERROR_MESSAGE);
    } else {
        modificado = true;
        dtmEquipo.removeRow(eliminar);
        equipoTemporal.eliminarDeportista(eliminar);
    }
}//GEN-LAST:event_jButtonEliminarActionPerformed

private void jComboBoxDeporteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxDeporteItemStateChanged
    jButtonMostrar.setEnabled(true);
}//GEN-LAST:event_jComboBoxDeporteItemStateChanged

private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
    this.dispose();
}//GEN-LAST:event_jButtonCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonMostrar;
    private javax.swing.JComboBox jComboBoxDeporte;
    private javax.swing.JComboBox jComboBoxPais;
    private javax.swing.JLabel jLabelInscritos;
    private javax.swing.JLabel jLabelLimiteDeportistas;
    private javax.swing.JLabel jLabelPais;
    private javax.swing.JPanel jPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableParticipantes;
    private javax.swing.JTextField jTextFieldInscritos;
    private javax.swing.JTextField jTextFieldLimiteDeportistas;
    private javax.swing.JLabel jlabelDeporte;
    // End of variables declaration//GEN-END:variables

    public void mostrarEquipo() {
        if (inscritosIni != inscritos) {
            if (guardado == false) {
                int i = JOptionPane.showConfirmDialog(this,
                        "Ha editado al equipo de " + equipoTemporal.getDeporte() + ", ¿desea guardar los cambios?", "Advertencia", JOptionPane.YES_NO_OPTION);
                if (i == JOptionPane.YES_OPTION) {
                    guardar();
                }
            }
        }
        String nombreDeporte = jComboBoxDeporte.getSelectedItem().toString();
        String nombrePais = jComboBoxPais.getSelectedItem().toString();
        deporteTemporal = listaDeportes.getDeporte(nombreDeporte);
        equipoTemporal = deporteTemporal.getEquipo(nombrePais);
        if (equipoTemporal == null) {
            equipoTemporal = new Equipo(nombrePais, nombreDeporte);
        }
        llenarTabla(equipoTemporal);
        jButtonAgregar.setEnabled(true);
        jButtonEliminar.setEnabled(true);
        jButtonEditar.setEnabled(true);
        jButtonGuardar.setEnabled(true);
        limite = equipoTemporal.getLimiteDeportistas();
        inscritos = equipoTemporal.tamaño();
        inscritosIni = equipoTemporal.tamaño();
        jTextFieldInscritos.setText(inscritos + "");
        jTextFieldLimiteDeportistas.setText(limite + "");
        jButtonMostrar.setEnabled(false);
        guardado = false;
    }

    public void verificarDatosEntrada(String deporte, String pais) {
        if (pais == null) {
            jComboBoxDeporte.setSelectedItem(deporte);
            jComboBoxDeporte.setEnabled(false);
        } else if (deporte == null) {
            jComboBoxPais.setSelectedItem(pais);
            jComboBoxPais.setEnabled(false);
        }
    }

    public void llenarComboBox() {
        dcbmDeporte = new DefaultComboBoxModel();
        dcbmPais = new DefaultComboBoxModel();
        jComboBoxDeporte.setModel(dcbmDeporte);
        jComboBoxPais.setModel(dcbmPais);
        for (int i = 0; i < listaDeportes.tamanio(); i++) {
            dcbmDeporte.addElement(listaDeportes.getDeporte(i).getNombre());
        }
        for (int i = 0; i < listaPaises.tamaño(); i++) {
            dcbmPais.addElement(listaPaises.getPais(i).getNombre());
        }
    }

    private void guardar() {
        modificado = true;
        deporteTemporal.eliminarEquipo(equipoTemporal.getPais());
        boolean agregado = deporteTemporal.agregarEquipo(equipoTemporal);
        if (agregado == false) {
            int opcion = JOptionPane.showConfirmDialog(this,
                    "La lista de participantes de " + equipoTemporal.getDeporte() + " está completa\n " +
                    "si quiere inscribir a un equipo de esta delegación, tendrá\n" +
                    "que verificar que queden cupos en el deporte seleccionado.\n" +
                    "Desea ver la lista de paises inscritos por deporte",
                    "Error",
                    JOptionPane.YES_NO_CANCEL_OPTION);
            if (opcion == JOptionPane.YES_OPTION) {
                dmpd = new jDialogMostrarPorDeporte(listaDeportes);
                dmpd.setModalityType(ModalityType.APPLICATION_MODAL);
                dmpd.setLocationRelativeTo(this);
                dmpd.setVisible(true);
            }
        }
    }

    public void llenarTabla(Equipo e) {
        dtmEquipo.setRowCount(0);
        Vector fila;
        int i = 0;
        while (i < e.tamaño()) {
            fila = new Vector();
            fila.add(e.getDeportista(i).getCodigo());
            fila.add(e.getDeportista(i).getNombres() + " " + e.getDeportista(i).getApellidos());
            dtmEquipo.addRow(fila);
            fila = null;
            i++;
        }
    }

    public void update(Observable o, Object arg) {
        Object[] args = (Object[]) arg;
        Deportista deportista = (Deportista) args[0];
        String tipo = (String) args[1];
        if (tipo.equals("Nuevo deportista")) {
            Vector fila = new Vector();
            fila.add(deportista.getCodigo());
            fila.add(deportista.getNombres() + " " + deportista.getApellidos());
            dtmEquipo.addRow(fila);
            equipoTemporal.agregarDeportista(deportista);
            inscritos++;
            jTextFieldInscritos.setText(inscritos + "");
        } else {
            equipoTemporal.eliminarDeportista(edicion);
            dtmEquipo.removeRow(edicion);
            Vector fila = new Vector();
            fila.add(deportista.getCodigo());
            fila.add(deportista.getNombres() + " " + deportista.getApellidos());
            dtmEquipo.addRow(fila);
            equipoTemporal.agregarDeportista(deportista);
        }
    }
}
