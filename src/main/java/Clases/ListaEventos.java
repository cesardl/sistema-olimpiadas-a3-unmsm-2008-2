package Clases;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Vector;

public class ListaEventos {

    ArrayList<Evento> listaEventos;
    
    public ListaEventos(ListaDeportes listaDeportes) {
        listaEventos = new ArrayList<Evento>();
        String nombre;
        ArrayList<Equipo> listaEquipos;
        String dir = System.getProperty("user.dir");
        File fEpc = new File(dir + "//src//Extras//equiposPorCompetencia.obj");
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
        } catch (Exception e) {
            e.printStackTrace();
        }    
    }

    public int tamanio(){
        return listaEventos.size();
    }

    public Evento get(String deporte){
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
