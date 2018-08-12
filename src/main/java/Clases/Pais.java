package Clases;

import java.io.Serializable;

public class Pais implements Serializable{

    private String nombre;
    private boolean asistio;

    public Pais(String nombre)  {
        this.nombre = nombre;
        asistio = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre)  {
        this.nombre = nombre;
    }

    public boolean isAsistio() {
        return asistio;
    }

    public void setAsistio(boolean asistio) {
        this.asistio = asistio;
    }
}