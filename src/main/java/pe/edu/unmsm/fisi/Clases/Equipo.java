package pe.edu.unmsm.fisi.Clases;

import java.io.Serializable;
import java.util.ArrayList;

public class Equipo implements Serializable {

    private ArrayList<Deportista> equipo;
    private String pais;
    private String deporte;
    private int limiteDeportistas;
    private boolean asistio;

    public Equipo(String pais, String deporte) {
        this.equipo = new ArrayList<Deportista>();
        this.pais = pais;
        this.deporte = deporte;
        calcularLimiteDeportistas(deporte);
    }

    public void calcularLimiteDeportistas(String deporte) {
        ListaDeportes l = new ListaDeportes();
        Deporte d = l.getDeporte(deporte);
        this.limiteDeportistas = d.limiteDeportistas;
    }

    public int getLimiteDeportistas() {
        return limiteDeportistas;
    }

    public void agregarDeportista(Deportista d) {
        this.equipo.add(d);
    }

    public void eliminarDeportista(Deportista d) {
        this.equipo.remove(d);
    }

    public void eliminarDeportista(int posicion) {
        this.equipo.remove(posicion);
    }

    public Deportista getDeportista(int pos) {
        return equipo.get(pos);
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public boolean isAsistio() {
        return asistio;
    }

    public void setAsistio(boolean asistio) {
        this.asistio = asistio;
    }

    public int tamaño() {
        return equipo.size();
    }
}
