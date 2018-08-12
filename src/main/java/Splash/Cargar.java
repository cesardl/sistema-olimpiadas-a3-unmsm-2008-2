package Splash;

import java.awt.Window;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultBoundedRangeModel;
import javax.swing.JDialog;
import javax.swing.JProgressBar;

public class Cargar extends Thread {

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
            Logger.getLogger(Cargar.class.getName()).log(Level.SEVERE, null, ex);
        }
        ventana.dispose();
    }
}
