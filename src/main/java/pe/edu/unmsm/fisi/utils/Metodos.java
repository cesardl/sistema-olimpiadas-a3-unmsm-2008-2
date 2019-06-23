package pe.edu.unmsm.fisi.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class Metodos {

    private static final Logger LOG = LoggerFactory.getLogger(Metodos.class);

    public static Vector cargarData(final String archivo) {
        Vector<String> vector = new Vector<>();
        try {
            File file = new File(archivo);
            BufferedReader br = new BufferedReader(new FileReader(file));
            String str = br.readLine();
            while (file.canRead() && str != null) {
                vector.addElement(str);
                str = br.readLine();
            }
            br.close();
        } catch (IOException ioe) {
            LOG.error("Error: {}", ioe.getMessage(), ioe);
        }
        return vector;
    }

    public static void centrarVentana(Window ventana) {
        int wf = ventana.getSize().width;
        int hf = ventana.getSize().height;
        Dimension d = ventana.getToolkit().getScreenSize();
        ventana.setLocation((d.width - wf) / 2, (d.height - hf) / 2);
    }

    public static void deshabilitarPanel(JPanel jPanel) {
        Component[] components = jPanel.getComponents();
        for (Component c : components) {
            if (c instanceof JScrollPane) {
                JScrollPane jsp = (JScrollPane) c;
                jsp.getViewport().getView().setEnabled(false);
            } else {
                c.setEnabled(false);
            }
        }
    }

    public static int random(int rango) {
        return (int) Math.round(Math.random() * rango);
    }

    public static int deStringInteger(String cadena) {
        try {
            return Integer.parseInt(cadena);
        } catch (NumberFormatException nfe) {
            return -1;
        }
    }
}
