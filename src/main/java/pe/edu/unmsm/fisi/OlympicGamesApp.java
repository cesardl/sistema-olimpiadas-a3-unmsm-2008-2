/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.unmsm.fisi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.edu.unmsm.fisi.Principal.JFrameBienvenida;

import javax.swing.*;

/**
 * @author Cesardl
 */
public class OlympicGamesApp {

    private static final Logger LOG = LoggerFactory.getLogger(OlympicGamesApp.class);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (System.getProperty("os.name").contains("Windows")) {
            try {
                LOG.debug("Setting look and feel");
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex) {
                LOG.error(ex.getMessage(), ex);
            }
        }
        LOG.info("Launching application...");
        javax.swing.SwingUtilities.invokeLater(() -> new JFrameBienvenida().setVisible(true));
    }
}
