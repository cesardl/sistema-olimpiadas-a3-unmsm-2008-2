package Clases;

import java.io.Serializable;

public class Fecha implements Serializable{

    private Integer año;
    private Integer mes;
    private Integer dia;

    public Fecha(Integer dia, Integer mes, Integer año) {
    }

    public Fecha() {
        año = 1583;
        mes = 1;
        dia = 1;
    }

    public Integer getAño() {
        return año;
    }

    public void setAño(Integer año) {
        this.año = año;
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    @Override
    public String toString() {
        return getDia() + " / " + getMes() + " / " + getAño();
    }
}
