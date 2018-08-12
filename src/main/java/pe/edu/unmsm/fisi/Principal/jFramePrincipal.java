package pe.edu.unmsm.fisi.Principal;

import pe.edu.unmsm.fisi.SistInscripcion.jDialogCentroInscripciones;
import pe.edu.unmsm.fisi.Clases.ListaDeportes;
import pe.edu.unmsm.fisi.SistAsistencia.jDialogControlAsistencia;
import pe.edu.unmsm.fisi.SistEventos.JDialogVerAsistencia;
import java.awt.Dialog.ModalityType;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 * Esto la clase que invoca a los otro sistemas.
 * Esta es una ventana observaor.
 */
public class jFramePrincipal extends javax.swing.JFrame implements Observer {

    private ListaDeportes listaDeportes;
    private final ModalityType modal = ModalityType.APPLICATION_MODAL;

    /**
     * Contructor de clase
     */
    public jFramePrincipal() {
        if (System.getProperty("os.name").contains("Windows")) {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception ex) {
            }
        }
        listaDeportes = new ListaDeportes();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jfc = new javax.swing.JFileChooser();
        jPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuArchivo = new javax.swing.JMenu();
        jMenuItemAbrirBD = new javax.swing.JMenuItem();
        jMenuItemGuardarBD = new javax.swing.JMenuItem();
        jSeparator = new javax.swing.JSeparator();
        jMenuItemSalir = new javax.swing.JMenuItem();
        jMenuInscripcion = new javax.swing.JMenu();
        jMenuItemCentroInscripciones = new javax.swing.JMenuItem();
        jMenuAsistencia = new javax.swing.JMenu();
        jMenuItemControlAsistencia = new javax.swing.JMenuItem();
        jMenuEventos = new javax.swing.JMenu();
        jMenuItemIniciarJuegosOlimpicos = new javax.swing.JMenuItem();
        jMenuAyuda = new javax.swing.JMenu();
        jMenuItemTemasAyuda = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        jMenuItemAcercaDe = new javax.swing.JMenuItem();

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
    try {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                jDialogAcercaDe jdad = new jDialogAcercaDe(null, modal);
                jdad.setLocationRelativeTo(null);
                jdad.setVisible(true);
            }
        });
    } catch (Exception e) {
    }
}//GEN-LAST:event_jMenuItemAcercaDeActionPerformed

    /**
     * Abre el centro de inscripciones
     */
private void jMenuItemCentroInscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCentroInscripcionesActionPerformed
    if (listaDeportes == null) {
        listaDeportes = new ListaDeportes();
    }
    jDialogCentroInscripciones vci = new jDialogCentroInscripciones(listaDeportes);
    vci.setModalityType(modal);
    vci.setLocationRelativeTo(this);
    vci.setVisible(true);
}//GEN-LAST:event_jMenuItemCentroInscripcionesActionPerformed

    /**
     * Para poder guardar la base de datos
     */
private void jMenuItemGuardarBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGuardarBDActionPerformed
    try {
        jfc.showSaveDialog(this);
        File f = jfc.getSelectedFile();
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(listaDeportes);
        oos.close();
    } catch (Exception e) {
    }
}//GEN-LAST:event_jMenuItemGuardarBDActionPerformed

    /**
     * Para poder abrir la Base de Datos
     */
private void jMenuItemAbrirBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAbrirBDActionPerformed
    try {
        jfc.showOpenDialog(this);
        File f = jfc.getSelectedFile();
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        listaDeportes = (ListaDeportes) ois.readObject();
        ois.close();
    } catch (Exception e) {
    }
}//GEN-LAST:event_jMenuItemAbrirBDActionPerformed

    /**
     * Abre el Sistema de Control de Asistencia
     */
private void jMenuItemControlAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemControlAsistenciaActionPerformed
    jDialogControlAsistencia vca = new jDialogControlAsistencia(this, modal, listaDeportes);
    vca.setLocationRelativeTo(this);
    vca.setVisible(true);
}//GEN-LAST:event_jMenuItemControlAsistenciaActionPerformed

    /**
     * Abre el Sistema de Control de Competencias
     */
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
    dialogVerAsistencia.setModalityType(ModalityType.APPLICATION_MODAL);
    dialogVerAsistencia.setLocationRelativeTo(this);
    dialogVerAsistencia.setVisible(true);
}//GEN-LAST:event_jMenuItemIniciarJuegosOlimpicosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenuArchivo;
    private javax.swing.JMenu jMenuAsistencia;
    private javax.swing.JMenu jMenuAyuda;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuEventos;
    private javax.swing.JMenu jMenuInscripcion;
    private javax.swing.JMenuItem jMenuItemAbrirBD;
    private javax.swing.JMenuItem jMenuItemAcercaDe;
    private javax.swing.JMenuItem jMenuItemCentroInscripciones;
    private javax.swing.JMenuItem jMenuItemControlAsistencia;
    private javax.swing.JMenuItem jMenuItemGuardarBD;
    private javax.swing.JMenuItem jMenuItemIniciarJuegosOlimpicos;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JMenuItem jMenuItemTemasAyuda;
    private javax.swing.JPanel jPanel;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JFileChooser jfc;
    // End of variables declaration//GEN-END:variables

    /**
     * Actualiza la informacion recibida de los otros sistemas,
     * para la lista de deportes
     */
    public void update(Observable o, Object arg) {
        listaDeportes = (ListaDeportes) arg;
    }
}
