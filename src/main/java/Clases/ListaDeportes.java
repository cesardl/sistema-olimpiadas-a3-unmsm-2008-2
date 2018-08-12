package Clases;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Vector;

public class ListaDeportes implements Serializable{

    private ArrayList<Deporte> listaDeportes;

    public ListaDeportes() {
        listaDeportes = new ArrayList<Deporte>();
        String dir = System.getProperty("user.dir");
        File fDeporte = new File(dir + "//src//Extras//deportes.obj");
        File fTamañoEquipo = new File(dir + "//src//Extras//tamañoEquipo.obj");
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
                int tamañoEquipo = Integer.parseInt(vTamañoEquipo.get(i).toString().trim());
                listaDeportes.add(new Deporte((String)vDeporte.get(i), 16, tamañoEquipo));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
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
        for (int i = 0; i < listaDeportes.size(); i++) {
            if (listaDeportes.get(i).getNombre().equals(nombreDeporte)) {
                d = listaDeportes.get(i);
            }
        }
        return d;
    }
    
    public void setDeporte(Deporte d, int pos) {
        listaDeportes.add(pos, d);
    }
}
