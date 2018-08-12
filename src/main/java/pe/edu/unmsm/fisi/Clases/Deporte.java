package pe.edu.unmsm.fisi.Clases;

import java.io.Serializable;
import java.util.ArrayList;

public class Deporte implements Serializable {

    int limiteDeportistas;
    private String nombre;
    private int numeroCupos;
    private ArrayList<Equipo> listaEquipos;

    public Deporte(String nombre, int numeroCupos, int limiteDeportistas) {
        this.nombre = nombre;
        this.numeroCupos = numeroCupos;
        listaEquipos = new ArrayList<Equipo>();
        this.limiteDeportistas = limiteDeportistas;
    }

    public ArrayList<Equipo> getListaEquipos() {
        return listaEquipos;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroCupos() {
        return numeroCupos;
    }

    public void setNumeroCupos(int numeroCupos) {
        this.numeroCupos = numeroCupos;
    }

    public int tamanio() {
        return listaEquipos.size();
    }

    public boolean agregarEquipo(Equipo e) {
        boolean agregado = false;
        if (listaEquipos.size() < numeroCupos) {
            agregado = true;
            listaEquipos.add(e);
        }
        return agregado;
    }

    public void eliminarEquipo(Equipo e) {
        listaEquipos.remove(e);
    }

    public void eliminarEquipo(String nombrePais) {
        for (int i = 0; i < listaEquipos.size(); i++) {
            if (listaEquipos.get(i).getPais().equals(nombrePais)) {
                listaEquipos.remove(i);
            }
        }
    }

    public Equipo getEquipo(String nombrePais) {
        Equipo e = null;
        for (int i = 0; i < listaEquipos.size(); i++) {
            if (listaEquipos.get(i).getPais().equals(nombrePais)) {
                e = listaEquipos.get(i);
            }
        }
        return e;
    }

    public Equipo getEquipo(int index) {
        Equipo e = listaEquipos.get(index);
        return e;
    }
}
