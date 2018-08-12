package pe.edu.unmsm.fisi.SistInscripcion;

import pe.edu.unmsm.fisi.clases.Deportista;
import pe.edu.unmsm.fisi.clases.Fecha;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Observable;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class JDialogDeportista extends javax.swing.JDialog {

    private Observable o;
    private DefaultComboBoxModel dcbmDeporte;
    private DefaultComboBoxModel dcbmPais;
    private JDialogEquipos ventanaEquipo;
    private Deportista d;
    private int posDeporte;

    public JDialogDeportista(JDialogEquipos ventanaEquipo, String deporte,
            String pais, Deportista deportista, int posDeporte) {
        this.ventanaEquipo = ventanaEquipo;
        this.posDeporte = posDeporte;
        o = new Observable();
        d = deportista;
        initComponents();
        llenarComboBox();
        jComboBoxDeporte.setSelectedItem(deporte);
        jComboBoxDeporte.setEnabled(false);
        jComboBoxPais.setSelectedItem(pais);
        jComboBoxPais.setEnabled(false);
        mostrarDeportista();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.ButtonGroup buttonGroupSexo = new javax.swing.ButtonGroup();
        javax.swing.JPanel jPanelPrincipal = new javax.swing.JPanel();
        javax.swing.JPanel jPanelDatosPersonales = new javax.swing.JPanel();
        javax.swing.JLabel jLabelNombre = new javax.swing.JLabel();
        javax.swing.JLabel jLabelApellido = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldApellido = new javax.swing.JTextField();
        javax.swing.JLabel jLabelSexo = new javax.swing.JLabel();
        jRadioButtonMasculino = new javax.swing.JRadioButton();
        javax.swing.JLabel jLabelTalla = new javax.swing.JLabel();
        jTextFieldPeso = new javax.swing.JTextField();
        jTextFieldTalla = new javax.swing.JTextField();
        javax.swing.JLabel jLabelPeso = new javax.swing.JLabel();
        javax.swing.JLabel jLabelCm = new javax.swing.JLabel();
        javax.swing.JLabel jLabelKg = new javax.swing.JLabel();
        jRadioButtonFemenino = new javax.swing.JRadioButton();
        javax.swing.JLabel jLabelFecha = new javax.swing.JLabel();
        javax.swing.JLabel jLabelAño = new javax.swing.JLabel();
        jComboBoxAño = new javax.swing.JComboBox();
        javax.swing.JLabel jLabelMes = new javax.swing.JLabel();
        jComboBoxMes = new javax.swing.JComboBox();
        javax.swing.JLabel jLabelDia = new javax.swing.JLabel();
        jComboBoxDia = new javax.swing.JComboBox();
        javax.swing.JLabel jLabelPais = new javax.swing.JLabel();
        javax.swing.JLabel jLabelDeporte = new javax.swing.JLabel();
        jComboBoxPais = new javax.swing.JComboBox();
        jComboBoxDeporte = new javax.swing.JComboBox();
        javax.swing.JPanel jPanelCodigo = new javax.swing.JPanel();
        javax.swing.JLabel jLabelCodigo = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jButtonGenerar = new javax.swing.JButton();
        javax.swing.JSplitPane jSplitPane = new javax.swing.JSplitPane();
        javax.swing.JButton jButtonGuardar = new javax.swing.JButton();
        javax.swing.JButton jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nuevo Deportista");
        setResizable(false);

        jPanelDatosPersonales.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Personales:"));

        jLabelNombre.setText("Nombres:");

        jLabelApellido.setText("Apellidos:");

        jLabelSexo.setText("Sexo:");

        buttonGroupSexo.add(jRadioButtonMasculino);
        jRadioButtonMasculino.setSelected(true);
        jRadioButtonMasculino.setText("Masculino");

        jLabelTalla.setText("Talla:");

        jLabelPeso.setText("Peso:");

        jLabelCm.setText("cm");

        jLabelKg.setText("Kg");

        buttonGroupSexo.add(jRadioButtonFemenino);
        jRadioButtonFemenino.setText("Femenino");

        jLabelFecha.setText("Fecha de Nacimiento:");

        jLabelAño.setText("Año:");

        jLabelMes.setText("Mes:");

        jLabelDia.setText("Dia:");

        jLabelPais.setText("Pais:");

        jLabelDeporte.setText("Deporte:");

        javax.swing.GroupLayout jPanelDatosPersonalesLayout = new javax.swing.GroupLayout(jPanelDatosPersonales);
        jPanelDatosPersonales.setLayout(jPanelDatosPersonalesLayout);
        jPanelDatosPersonalesLayout.setHorizontalGroup(
            jPanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosPersonalesLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDatosPersonalesLayout.createSequentialGroup()
                        .addComponent(jLabelAño)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxAño, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelMes)
                        .addGap(3, 3, 3)
                        .addComponent(jComboBoxMes, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelDia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxDia, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDatosPersonalesLayout.createSequentialGroup()
                        .addGroup(jPanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelApellido)
                            .addComponent(jLabelNombre))
                        .addGap(59, 59, 59)
                        .addGroup(jPanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDatosPersonalesLayout.createSequentialGroup()
                        .addGroup(jPanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelSexo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelDatosPersonalesLayout.createSequentialGroup()
                                .addGroup(jPanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelDatosPersonalesLayout.createSequentialGroup()
                                        .addComponent(jLabelTalla)
                                        .addGap(79, 79, 79)
                                        .addGroup(jPanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jTextFieldPeso, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldTalla, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRadioButtonMasculino, javax.swing.GroupLayout.Alignment.LEADING)))
                                    .addComponent(jLabelPeso))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCm)
                                    .addComponent(jLabelKg))))
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonFemenino))
                    .addComponent(jLabelFecha)
                    .addGroup(jPanelDatosPersonalesLayout.createSequentialGroup()
                        .addGroup(jPanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPais)
                            .addComponent(jLabelDeporte))
                        .addGap(62, 62, 62)
                        .addGroup(jPanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxDeporte, 0, 233, Short.MAX_VALUE)
                            .addComponent(jComboBoxPais, 0, 233, Short.MAX_VALUE))))
                .addGap(34, 34, 34))
        );
        jPanelDatosPersonalesLayout.setVerticalGroup(
            jPanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosPersonalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelApellido)
                    .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSexo)
                    .addComponent(jRadioButtonFemenino)
                    .addComponent(jRadioButtonMasculino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTalla)
                    .addComponent(jTextFieldTalla, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCm))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPeso)
                    .addComponent(jTextFieldPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelKg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelFecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMes)
                    .addComponent(jLabelAño)
                    .addComponent(jComboBoxDia, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDia)
                    .addComponent(jComboBoxMes, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPais)
                    .addComponent(jComboBoxPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDeporte)
                    .addComponent(jComboBoxDeporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanelCodigo.setBorder(javax.swing.BorderFactory.createTitledBorder("Código"));

        jLabelCodigo.setText("Código:");

        jTextFieldCodigo.setEnabled(false);

        jButtonGenerar.setText("Generar");
        jButtonGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGenerarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCodigoLayout = new javax.swing.GroupLayout(jPanelCodigo);
        jPanelCodigo.setLayout(jPanelCodigoLayout);
        jPanelCodigoLayout.setHorizontalGroup(
            jPanelCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCodigoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabelCodigo)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonGenerar)
                .addGap(37, 37, 37))
        );
        jPanelCodigoLayout.setVerticalGroup(
            jPanelCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCodigoLayout.createSequentialGroup()
                .addGroup(jPanelCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodigo)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGenerar))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        jSplitPane.setLeftComponent(jButtonGuardar);

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jSplitPane.setRightComponent(jButtonCancelar);

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanelCodigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelDatosPersonales, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jSplitPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelDatosPersonales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSplitPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
    if (deStringInteger(jTextFieldTalla.getText()) == -1
            || deStringInteger(jTextFieldPeso.getText()) == -1) {
        JOptionPane.showMessageDialog(this, "ingrese correctamente los datos",
                "Error", JOptionPane.ERROR_MESSAGE);
    } else {
        Object[] args = new Object[2];
        String tipo = this.getTitle();
        d = new Deportista();
        d.setCodigo(jTextFieldCodigo.getText());
        d.setNombres(jTextFieldNombre.getText());
        d.setApellidos(jTextFieldApellido.getText());
        boolean sexo = jRadioButtonMasculino.isSelected() ? true : false;
        d.setSexo(sexo);
        d.setTalla(deStringInteger(jTextFieldTalla.getText()));
        d.setPeso(Integer.parseInt(jTextFieldPeso.getText()));

        int dia = Integer.parseInt(String.valueOf(jComboBoxDia.getSelectedItem()));
        int mes = jComboBoxMes.getSelectedIndex();
        int anio = Integer.parseInt(String.valueOf(jComboBoxAño.getSelectedItem()));
        d.setNacimiento(new Fecha(dia, mes, anio));
        d.setDeporte(String.valueOf(jComboBoxDeporte.getSelectedItem()));
        d.setPais(String.valueOf(jComboBoxPais.getSelectedIndex()));
        args[0] = d;
        args[1] = tipo;
        o.addObserver(ventanaEquipo);
        o.notifyObservers(args);
        ventanaEquipo.update(o, args);
        this.dispose();
    }
}//GEN-LAST:event_jButtonGuardarActionPerformed

private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
    this.dispose();
}//GEN-LAST:event_jButtonCancelarActionPerformed

private void jButtonGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGenerarActionPerformed
    String str1 = "", str2 = "";
    if (posDeporte < 10) {
        str1 = 0 + String.valueOf(posDeporte + 1);
    } else {
        str1 = String.valueOf(posDeporte + 1);
    }
    int r = (int) Math.round(Math.random() * 1000);
    if (r < 10) {
        str2 = 0 + 0 + String.valueOf(r);
    } else if (r >= 10 && r <= 99) {
        str2 = 0 + String.valueOf(r);
    } else if (r >= 100) {
        str2 = String.valueOf(r);
    }
    str1 = str1 + "000";
    jTextFieldCodigo.setText(str1 + str2);
    jButtonGenerar.setEnabled(false);
}//GEN-LAST:event_jButtonGenerarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGenerar;
    private javax.swing.JComboBox jComboBoxAño;
    private javax.swing.JComboBox jComboBoxDeporte;
    private javax.swing.JComboBox jComboBoxDia;
    private javax.swing.JComboBox jComboBoxMes;
    private javax.swing.JComboBox jComboBoxPais;
    private javax.swing.JRadioButton jRadioButtonFemenino;
    private javax.swing.JRadioButton jRadioButtonMasculino;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPeso;
    private javax.swing.JTextField jTextFieldTalla;
    // End of variables declaration//GEN-END:variables

    public int deStringInteger(String cadena) {
        try {
            return Integer.parseInt(cadena);
        } catch (NumberFormatException nfe) {
            return -1;
        }
    }

    public void llenarComboBox() {
        dcbmDeporte = new DefaultComboBoxModel();
        dcbmPais = new DefaultComboBoxModel();
        jComboBoxDeporte.setModel(dcbmDeporte);
        jComboBoxPais.setModel(dcbmPais);
        for (int i = 2000; i > 1900; i--) {
            jComboBoxAño.addItem(new String("" + i + ""));
        }
        for (int i = 1; i < 32; i++) {
            jComboBoxDia.addItem(new String("" + i + ""));

        }
        String dir = System.getProperty("user.dir");
        File fileDeporte = new File(dir + "//src//Extras//deportes.obj");
        File filePais = new File(dir + "//src//Extras//paises.obj");
        File fileMes = new File(dir + "//src//Extras//meses.obj");
        try {
            FileInputStream fisDeporte = new FileInputStream(fileDeporte);
            FileInputStream fisPais = new FileInputStream(filePais);
            FileInputStream fisMes = new FileInputStream(fileMes);
            ObjectInputStream oisDeporte = new ObjectInputStream(fisDeporte);
            ObjectInputStream oisPais = new ObjectInputStream(fisPais);
            ObjectInputStream oisMes = new ObjectInputStream(fisMes);
            Vector vDeporte = (Vector) oisDeporte.readObject();
            Vector vPais = (Vector) oisPais.readObject();
            Vector vMes = (Vector) oisMes.readObject();
            for (int i = 0; i < vDeporte.size(); i++) {
                dcbmDeporte.addElement(vDeporte.get(i));
            }
            for (int i = 0; i < vPais.size(); i++) {
                dcbmPais.addElement(vPais.get(i));
            }
            for (int i = 0; i < vMes.size(); i++) {
                jComboBoxMes.addItem(vMes.get(i));
            }
        } catch (Exception ex) {
        }
    }

    public void mostrarDeportista() {
        if (d != null) {
            jTextFieldCodigo.setText(d.getCodigo());
            jTextFieldNombre.setText(d.getNombres());
            jTextFieldPeso.setText(String.valueOf(d.getPeso()));
            jTextFieldApellido.setText(d.getApellidos());
            jTextFieldTalla.setText(d.getTalla().toString());
            jComboBoxDia.setSelectedItem(String.valueOf(d.getNacimiento().getDia()).trim());
            jComboBoxMes.setSelectedItem(String.valueOf(d.getNacimiento().getMes()).trim());
            jComboBoxAño.setSelectedItem(String.valueOf(d.getNacimiento().getAño()).trim());
            if (d.getSexo()) {
                jRadioButtonMasculino.setSelected(true);
            } else {
                jRadioButtonFemenino.setSelected(true);
            }
        }
    }
}
