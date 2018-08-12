package pe.edu.unmsm.fisi.splash;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import java.awt.*;

public class Cargar extends Thread {

    private static final Logger LOG = LoggerFactory.getLogger(Cargar.class);

    private DefaultBoundedRangeModel modelo;
    private JDialog ventana;

    public Cargar(JProgressBar jpb, Window ventana) {
        modelo = new DefaultBoundedRangeModel(0, 0, 0, 100);
        jpb.setModel(modelo);
        this.ventana = (JDialog) ventana;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i <= modelo.getMaximum(); i++) {
                sleep(75);
                modelo.setValue(i);
            }
        } catch (InterruptedException ex) {
            LOG.error(ex.getMessage(), ex);
        }
        ventana.dispose();
    }
}
