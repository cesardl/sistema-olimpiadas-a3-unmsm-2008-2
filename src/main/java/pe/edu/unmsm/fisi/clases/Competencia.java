package pe.edu.unmsm.fisi.clases;

import java.util.ArrayList;
import java.util.Collections;

public class Competencia {

    private ArrayList<Equipo> competidores;

    /**
     * Contructor cuando juegen varios
     */
    public Competencia(ArrayList<Equipo> competidores) {
        this.competidores = competidores;
    }

    /**
     * Constructor cuando juegen dos
     */
    public Competencia(Equipo e1, Equipo e2) {
        competidores = new ArrayList<>();
        competidores.add(e1);
        competidores.add(e2);
    }

    /**
     * Devuelve competidores
     */
    public ArrayList<Equipo> getCompetidores() {
        return competidores;
    }

    /**
     * Dosordena
     */
    public ArrayList<Equipo> calcularGanadores() {
        ArrayList<Equipo> ganadores = (ArrayList<Equipo>) competidores.clone();
        Collections.shuffle(ganadores);
        return ganadores;
    }
}
