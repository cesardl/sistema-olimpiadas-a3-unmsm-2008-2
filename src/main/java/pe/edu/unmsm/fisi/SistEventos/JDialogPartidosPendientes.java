package pe.edu.unmsm.fisi.SistEventos;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.edu.unmsm.fisi.SistCompetencias.JDialogCompDos;
import pe.edu.unmsm.fisi.clases.Competencia;
import pe.edu.unmsm.fisi.clases.Equipo;
import pe.edu.unmsm.fisi.clases.Evento;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class JDialogPartidosPendientes extends javax.swing.JDialog implements Observer {

    private static final long serialVersionUID = -9106047795783474844L;

    private static final Logger LOG = LoggerFactory.getLogger(JDialogPartidosPendientes.class);

    private Evento evento;
    private ArrayList<Competencia> listaCompetencias;
    private ArrayList<Equipo> clasificados;
    private DefaultListModel dlm;
    private int partida = 0;
    private boolean cuartos = false;
    private boolean semi = false;
    private boolean fin = false;

    public JDialogPartidosPendientes(Evento evento) {
        this.evento = evento;
        this.dlm = new DefaultListModel();
        clasificados = new ArrayList<>();
        initComponents();
        jTextFieldDeporte.setText(evento.getNombreDeporte());
        jListPartidosPendientes.setModel(dlm);
        this.listaCompetencias = evento.getListaCompetencias();
        llenarLista();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel jPanel2 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        jTextFieldDeporte = new javax.swing.JTextField();
        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        jListPartidosPendientes = new javax.swing.JList();
        jButtonJugar = new javax.swing.JButton();
        javax.swing.JButton jButtonMostrarResultados = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Deporte:");

        jTextFieldDeporte.setEditable(false);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Partidos Pendientes"));

        jScrollPane1.setViewportView(jListPartidosPendientes);

        jButtonJugar.setText("Jugar");
        jButtonJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonJugarActionPerformed(evt);
            }
        });

        jButtonMostrarResultados.setText("Mostrar Resultados");
        jButtonMostrarResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarResultadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(30, 30, 30)
                        .addComponent(jTextFieldDeporte))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonJugar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonMostrarResultados))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldDeporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jButtonMostrarResultados)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonJugar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonJugarActionPerformed
        Competencia c;
        if (cuartos == true) {
            cuartos = false;
            for (int i = 0; i < 8; i = i + 2) {
                c = new Competencia(clasificados.get(i), clasificados.get(i + 1));
                listaCompetencias.add(c);
            }
            for (int i = 8; i < 12; i++) {
                String s1 = listaCompetencias.get(i).getCompetidores().get(0).getPais();
                String s2 = listaCompetencias.get(i).getCompetidores().get(1).getPais();
                dlm.addElement(s1 + " vs " + s2);
            }
        }
        if (semi == true) {
            semi = false;
            for (int i = 0; i < 4; i = i + 2) {
                c = new Competencia(clasificados.get(i + 8), clasificados.get(i + 9));
                listaCompetencias.add(c);
            }
            for (int i = 12; i < 14; i++) {
                String s1 = listaCompetencias.get(i).getCompetidores().get(0).getPais();
                String s2 = listaCompetencias.get(i).getCompetidores().get(1).getPais();
                dlm.addElement(s1 + " vs " + s2);
            }
        }
        if (fin == true) {
            fin = false;
            for (int i = 0; i < 2; i = i + 2) {
                c = new Competencia(clasificados.get(i + 12), clasificados.get(i + 13));
                listaCompetencias.add(c);
            }
            String s1 = listaCompetencias.get(14).getCompetidores().get(0).getPais();
            String s2 = listaCompetencias.get(14).getCompetidores().get(1).getPais();
            dlm.addElement(s1 + " vs " + s2);
            jButtonJugar.setEnabled(false);
        }
        JDialogCompDos compDos = new JDialogCompDos(listaCompetencias.get(partida), this);
        compDos.setModalityType(ModalityType.APPLICATION_MODAL);
        compDos.setTitle(this.getTitle());
        compDos.setLocationRelativeTo(this);
        compDos.setVisible(true);
}//GEN-LAST:event_jButtonJugarActionPerformed

private void jButtonMostrarResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarResultadosActionPerformed
    JDialogResultados resultados = new JDialogResultados(null, null, -1);
    resultados.setModalityType(ModalityType.APPLICATION_MODAL);
    resultados.setLocationRelativeTo(this);
    resultados.setTitle(this.getTitle());
    resultados.setVisible(true);
}//GEN-LAST:event_jButtonMostrarResultadosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonJugar;
    private javax.swing.JList jListPartidosPendientes;
    private javax.swing.JTextField jTextFieldDeporte;
    // End of variables declaration//GEN-END:variables

    private void llenarLista() {
        for (int i = 0; i < 8; i++) {
            String s1 = listaCompetencias.get(i).getCompetidores().get(0).getPais();
            String s2 = listaCompetencias.get(i).getCompetidores().get(1).getPais();
            dlm.addElement(s1 + " vs " + s2);
        }
    }

    public void update(Observable o, Object arg) {
        Equipo eq = (Equipo) arg;
        LOG.debug("[OBSERVABLE] updating country: {}, sport: {}", eq.getPais(), eq.getDeporte());
        clasificados.add(eq);
        dlm.remove(0);
        partida++;
        if (partida == 8) {
            cuartos = true;
        }
        if (partida == 12) {
            semi = true;
        }
        if (partida == 14) {
            fin = true;
        }
    }
}
