package pe.edu.unmsm.fisi.clases;

import java.io.Serializable;
import java.util.ArrayList;

public class Deporte implements Serializable {

    private static final long serialVersionUID = -5356081773263584263L;

    private String nombre;
    private int numeroCupos;
    private ArrayList<Equipo> listaEquipos;
    private int limiteDeportistas;

    public Deporte(String nombre, int numeroCupos, int limiteDeportistas) {
        this.nombre = nombre;
        this.numeroCupos = numeroCupos;
        listaEquipos = new ArrayList<>();
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

    public int teamsSize() {
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
        for (Equipo listaEquipo : listaEquipos) {
            if (listaEquipo.getPais().equals(nombrePais)) {
                e = listaEquipo;
            }
        }
        return e;
    }

    public Equipo getEquipo(int index) {
        return listaEquipos.get(index);
    }

    public int getLimiteDeportistas() {
        return limiteDeportistas;
    }

    public void setLimiteDeportistas(int limiteDeportistas) {
        this.limiteDeportistas = limiteDeportistas;
    }
}
