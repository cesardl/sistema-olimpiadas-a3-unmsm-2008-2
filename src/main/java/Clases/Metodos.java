package Clases;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Window;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.Vector;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Metodos implements Serializable{

    public static Vector cargarData(String archivo) {
        Vector vector = new Vector();
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
            System.out.println("Error: " + ioe);
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
        Component c[] = jPanel.getComponents();
        for (int i = 0; i < c.length; i++) {
            if (c[i] instanceof JScrollPane) {
                JScrollPane jsp = (JScrollPane) c[i];
                jsp.getViewport().getView().setEnabled(false);
            } else {
                c[i].setEnabled(false);
            }
        }
    }

    public static int random(int rango) {
        return (int) Math.round(Math.random() * rango);
    }
}
