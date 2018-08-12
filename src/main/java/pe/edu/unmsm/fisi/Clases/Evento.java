package pe.edu.unmsm.fisi.Clases;

import java.util.ArrayList;
import java.util.Collections;

public class Evento {

    private String nombreDeporte;
    private int equiposPorCompetencia;
    private ArrayList<Equipo> paisesParticipantes;
    private ArrayList<Competencia> listaCompetencias;


    public Evento(String nombreDeporte, ArrayList<Equipo> paisesParticipantes, int equiposPorCompetencia) {
        this.nombreDeporte = nombreDeporte;
        this.paisesParticipantes = paisesParticipantes;
        this.equiposPorCompetencia = equiposPorCompetencia;
        listaCompetencias = new ArrayList<Competencia>();
    }

    public int getEquiposPorCompetencia() {
        return equiposPorCompetencia;
    }

    public ArrayList<Competencia> getListaCompetencias() {
        return listaCompetencias;
    }

    public void setListaCompetencias(ArrayList<Competencia> listaCompetencias) {
        this.listaCompetencias = listaCompetencias;
    }

    public ArrayList<Equipo> getPaisesParticipantes() {
        return paisesParticipantes;
    }

    public void CalcularPartidosProgramados() {
        Competencia c;
        if (paisesParticipantes != null)
            Collections.shuffle(paisesParticipantes);
        for (int i = 0; i < paisesParticipantes.size(); i = i + 2) {
            c = new Competencia(paisesParticipantes.get(i), paisesParticipantes.get(i + 1));
            listaCompetencias.add(c);
        }
    }

    public String getNombreDeporte() {
        return nombreDeporte;
    }


}