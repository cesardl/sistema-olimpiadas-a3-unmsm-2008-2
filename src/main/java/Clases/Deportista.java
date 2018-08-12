package Clases;

import java.io.Serializable;

public class Deportista implements Serializable{

    private String nombres = "";
    private String apellidos = "";
    private Boolean sexo = true;
    private Integer talla = 0;
    private Integer peso = 0;
    private Fecha nacimiento = null;
    private String deporte = "";
    private String pais = "";
    private String codigo = "";

    public Deportista() {
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Boolean getSexo() {
        return sexo;
    }

    public void setSexo(Boolean sexo) {
        this.sexo = sexo;
    }

    public Integer getTalla() {
        return talla;
    }

    public void setTalla(Integer talla) {
        this.talla = talla;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Fecha getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Fecha nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
