package pe.edu.unmsm.fisi.clases;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.ArrayList;
import java.util.Vector;

public class ListaEventos {

    private static final Logger LOG = LoggerFactory.getLogger(ListaEventos.class);

    ArrayList<Evento> listaEventos;

    public ListaEventos(ListaDeportes listaDeportes) {
        listaEventos = new ArrayList<>();
        String nombre;
        ArrayList<Equipo> listaEquipos;
        String dir = System.getProperty("user.dir");
        File fEpc = new File(dir + "//src//main//resources//Extras//equiposPorCompetencia.obj");
        try {
            FileInputStream fisEpc = new FileInputStream(fEpc);
            ObjectInputStream oisEpc = new ObjectInputStream(fisEpc);
            Vector vEpc = (Vector) oisEpc.readObject();
            oisEpc.close();
            for (int i = 0; i < listaDeportes.tamanio(); i++) {
                nombre = listaDeportes.getDeporte(i).getNombre();
                int epc = Integer.parseInt(vEpc.get(i).toString().trim());
                listaEquipos = listaDeportes.getDeporte(i).getListaEquipos();
                listaEventos.add(new Evento(nombre, listaEquipos, epc));
            }
        } catch (IOException | ClassNotFoundException | NumberFormatException e) {
            LOG.error(e.getMessage(), e);
        }
    }

    public int tamanio() {
        return listaEventos.size();
    }

    public Evento get(String deporte) {
        Evento e = null;
        for (int i = 0; i < listaEventos.size(); i++) {
            if (listaEventos.get(i).getNombreDeporte().equals(deporte)) {
                e = listaEventos.get(i);
            }
        }
        return e;
    }

    public Evento get(int posDeporte) {
        return listaEventos.get(posDeporte);
    }

}
