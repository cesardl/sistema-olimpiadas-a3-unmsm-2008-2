package pe.edu.unmsm.fisi.Principal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.edu.unmsm.fisi.SistAsistencia.JDialogControlAsistencia;
import pe.edu.unmsm.fisi.SistEventos.JDialogVerAsistencia;
import pe.edu.unmsm.fisi.SistInscripcion.JDialogCentroInscripciones;
import pe.edu.unmsm.fisi.clases.ListaDeportes;

import javax.swing.*;
import java.awt.Dialog.ModalityType;
import java.awt.*;
import java.io.*;
import java.util.Observable;
import java.util.Observer;

/**
 * Esto la clase que invoca a los otro sistemas. Esta es una ventana observator.
 *
 * @author Cesardl
 */
public class JFramePrincipal extends javax.swing.JFrame implements Observer {

    private static final long serialVersionUID = 8300563018239030485L;

    private static final Logger LOG = LoggerFactory.getLogger(JFramePrincipal.class);

    private ListaDeportes listaDeportes;
    private final ModalityType modal = ModalityType.APPLICATION_MODAL;

    /**
     * Contructor de clase
     */
    public JFramePrincipal() {
        listaDeportes = new ListaDeportes();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jfc = new javax.swing.JFileChooser();
        javax.swing.JPanel jPanel = new javax.swing.JPanel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JMenuBar jMenuBar = new javax.swing.JMenuBar();
        javax.swing.JMenu jMenuArchivo = new javax.swing.JMenu();
        javax.swing.JMenuItem jMenuItemAbrirBD = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItemGuardarBD = new javax.swing.JMenuItem();
        javax.swing.JSeparator jSeparator = new javax.swing.JSeparator();
        javax.swing.JMenuItem jMenuItemSalir = new javax.swing.JMenuItem();
        javax.swing.JMenu jMenuInscripcion = new javax.swing.JMenu();
        javax.swing.JMenuItem jMenuItemCentroInscripciones = new javax.swing.JMenuItem();
        javax.swing.JMenu jMenuAsistencia = new javax.swing.JMenu();
        javax.swing.JMenuItem jMenuItemControlAsistencia = new javax.swing.JMenuItem();
        javax.swing.JMenu jMenuEventos = new javax.swing.JMenu();
        javax.swing.JMenuItem jMenuItemIniciarJuegosOlimpicos = new javax.swing.JMenuItem();
        javax.swing.JMenu jMenuAyuda = new javax.swing.JMenu();
        javax.swing.JMenuItem jMenuItemTemasAyuda = new javax.swing.JMenuItem();
        javax.swing.JSeparator jSeparator1 = new javax.swing.JSeparator();
        javax.swing.JMenuItem jMenuItemAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Juegos Olimpicos");

        jPanel.setBackground(java.awt.Color.white);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesOlimpiadas/olimpiadasLogo.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenuArchivo.setMnemonic('a');
        jMenuArchivo.setText("Archivo");

        jMenuItemAbrirBD.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemAbrirBD.setText("Abrir Base de Datos");
        jMenuItemAbrirBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAbrirBDActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuItemAbrirBD);

        jMenuItemGuardarBD.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemGuardarBD.setText("Guardar Base de Datos");
        jMenuItemGuardarBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGuardarBDActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuItemGuardarBD);
        jMenuArchivo.add(jSeparator);

        jMenuItemSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemSalir.setText("Salir");
        jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuItemSalir);

        jMenuBar.add(jMenuArchivo);

        jMenuInscripcion.setMnemonic('i');
        jMenuInscripcion.setText("Inscripcion");

        jMenuItemCentroInscripciones.setText("Centro de inscripciones");
        jMenuItemCentroInscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCentroInscripcionesActionPerformed(evt);
            }
        });
        jMenuInscripcion.add(jMenuItemCentroInscripciones);

        jMenuBar.add(jMenuInscripcion);

        jMenuAsistencia.setMnemonic('s');
        jMenuAsistencia.setText("Asistencia");

        jMenuItemControlAsistencia.setText("Control de la Asistencia");
        jMenuItemControlAsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemControlAsistenciaActionPerformed(evt);
            }
        });
        jMenuAsistencia.add(jMenuItemControlAsistencia);

        jMenuBar.add(jMenuAsistencia);

        jMenuEventos.setMnemonic('e');
        jMenuEventos.setText("Eventos");

        jMenuItemIniciarJuegosOlimpicos.setText("Iniciar Juegos Olimpicos");
        jMenuItemIniciarJuegosOlimpicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemIniciarJuegosOlimpicosActionPerformed(evt);
            }
        });
        jMenuEventos.add(jMenuItemIniciarJuegosOlimpicos);

        jMenuBar.add(jMenuEventos);

        jMenuAyuda.setMnemonic('u');
        jMenuAyuda.setText("Ayuda");

        jMenuItemTemasAyuda.setText("Temas de ayuda");
        jMenuItemTemasAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTemasAyudaActionPerformed(evt);
            }
        });
        jMenuAyuda.add(jMenuItemTemasAyuda);
        jMenuAyuda.add(jSeparator1);

        jMenuItemAcercaDe.setText("Acerca de");
        jMenuItemAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAcercaDeActionPerformed(evt);
            }
        });
        jMenuAyuda.add(jMenuItemAcercaDe);

        jMenuBar.add(jMenuAyuda);

        setJMenuBar(jMenuBar);

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

        setSize(new java.awt.Dimension(800, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Sale del Sistema
     */
private void jMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirActionPerformed
    LOG.trace(evt.paramString());

    int opc = JOptionPane.showConfirmDialog(this, "Seguro que desea salir",
            this.getTitle(), JOptionPane.YES_NO_OPTION);
    if (opc == 0) {
        System.exit(0);
    }
}//GEN-LAST:event_jMenuItemSalirActionPerformed

    /**
     * informacion de los desarrolladores
     */
private void jMenuItemAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAcercaDeActionPerformed
    LOG.trace(evt.paramString());

    java.awt.EventQueue.invokeLater(() -> {
        JDialogAcercaDe jdad = new JDialogAcercaDe(null, modal);
        jdad.setLocationRelativeTo(null);
        jdad.setVisible(true);
    });
}//GEN-LAST:event_jMenuItemAcercaDeActionPerformed

    /**
     * Abre el centro de inscripciones
     */
private void jMenuItemCentroInscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCentroInscripcionesActionPerformed
    LOG.trace(evt.paramString());

    JDialogCentroInscripciones vci = new JDialogCentroInscripciones(listaDeportes);
    LOG.info("Launching JDialogCentroInscripciones...");
    vci.setModalityType(modal);
    vci.setLocationRelativeTo(this);
    vci.setVisible(true);
}//GEN-LAST:event_jMenuItemCentroInscripcionesActionPerformed

    /**
     * Para poder guardar la base de datos
     */
private void jMenuItemGuardarBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGuardarBDActionPerformed
    LOG.trace(evt.paramString());

    jfc.showSaveDialog(this);
    File f = jfc.getSelectedFile();

    try (FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {

        oos.writeObject(listaDeportes);

    } catch (HeadlessException | IOException e) {
        LOG.error(e.getMessage(), e);
    }
}//GEN-LAST:event_jMenuItemGuardarBDActionPerformed

    /**
     * Para poder abrir la Base de Datos
     */
private void jMenuItemAbrirBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAbrirBDActionPerformed
    LOG.trace(evt.paramString());
    jfc.showOpenDialog(this);
    File f = jfc.getSelectedFile();

    if (f != null) {
        LOG.info("Reading Sports database");
        try (FileInputStream fis = new FileInputStream(f);
                ObjectInputStream ois = new ObjectInputStream(fis)) {

            listaDeportes = (ListaDeportes) ois.readObject();
        } catch (HeadlessException | IOException | ClassNotFoundException e) {
            LOG.error(e.getMessage(), e);
        }
    }
}//GEN-LAST:event_jMenuItemAbrirBDActionPerformed

    /**
     * Abre el Sistema de Control de Asistencia
     */
private void jMenuItemControlAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemControlAsistenciaActionPerformed
    JDialogControlAsistencia vca = new JDialogControlAsistencia(this, modal, listaDeportes);
    LOG.info("Launching JDialogControlAsistencia...");
    vca.setLocationRelativeTo(this);
    vca.setVisible(true);
}//GEN-LAST:event_jMenuItemControlAsistenciaActionPerformed

    /**
     * Temas de Ayuda
     */
private void jMenuItemTemasAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTemasAyudaActionPerformed
    JOptionPane.showMessageDialog(this, "Leer informe",
            this.getTitle(), JOptionPane.INFORMATION_MESSAGE);
}//GEN-LAST:event_jMenuItemTemasAyudaActionPerformed

    /**
     * Inicia el Gestor de los Juegos Olimpicos
     */
private void jMenuItemIniciarJuegosOlimpicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemIniciarJuegosOlimpicosActionPerformed
    JDialogVerAsistencia dialogVerAsistencia = new JDialogVerAsistencia(listaDeportes);
    LOG.info("Launching JDialogVerAsistencia...");
    dialogVerAsistencia.setModalityType(ModalityType.APPLICATION_MODAL);
    dialogVerAsistencia.setLocationRelativeTo(this);
    dialogVerAsistencia.setVisible(true);
}//GEN-LAST:event_jMenuItemIniciarJuegosOlimpicosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser jfc;
    // End of variables declaration//GEN-END:variables

    /**
     * Actualiza la informacion recibida de los otros sistemas, para la lista de
     * deportes
     */
    public void update(Observable o, Object arg) {
        listaDeportes = (ListaDeportes) arg;
    }
}
