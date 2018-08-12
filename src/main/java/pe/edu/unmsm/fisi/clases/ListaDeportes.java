package pe.edu.unmsm.fisi.clases;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.ArrayList;
import java.util.Vector;

public class ListaDeportes implements Serializable {

    private static final long serialVersionUID = -3648330891224887362L;

    private static final Logger LOG = LoggerFactory.getLogger(ListaDeportes.class);

    private ArrayList<Deporte> listaDeportes;

    public ListaDeportes() {
        listaDeportes = new ArrayList<>();
        String dir = System.getProperty("user.dir");
        File fDeporte = new File(dir + "//src//main//resources//Extras//deportes.obj");
        File fTamañoEquipo = new File(dir + "//src//main//resources//Extras//tamañoEquipo.obj");
        try {
            FileInputStream fisDeporte = new FileInputStream(fDeporte);
            FileInputStream fisTamañoEquipo = new FileInputStream(fTamañoEquipo);
            ObjectInputStream oisDeporte = new ObjectInputStream(fisDeporte);
            ObjectInputStream oisTamañoEquipo = new ObjectInputStream(fisTamañoEquipo);
            Vector vDeporte = (Vector) oisDeporte.readObject();
            Vector vTamañoEquipo = (Vector) oisTamañoEquipo.readObject();
            oisDeporte.close();
            oisTamañoEquipo.close();
            for (int i = 0; i < vDeporte.size(); i++) {
                int teamSize = Integer.parseInt(vTamañoEquipo.get(i).toString().trim());
                listaDeportes.add(new Deporte((String) vDeporte.get(i), 16, teamSize));
            }
        } catch (IOException | ClassNotFoundException | NumberFormatException ex) {
            LOG.error(ex.getMessage(), ex);
        }
    }

    public Deporte getDeporte(int pos) {
        return listaDeportes.get(pos);
    }

    public int tamanio() {
        return listaDeportes.size();
    }

    public Deporte getDeporte(String nombreDeporte) {
        Deporte d = null;
        for (Deporte listaDeporte : listaDeportes) {
            if (listaDeporte.getNombre().equals(nombreDeporte)) {
                d = listaDeporte;
            }
        }
        return d;
    }

    public void setDeporte(Deporte d, int pos) {
        listaDeportes.add(pos, d);
    }
}
