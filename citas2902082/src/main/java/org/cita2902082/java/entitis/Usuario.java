package org.cita2902082.java.entitis;

import org.cita2902082.java.entitis.enums.TipoIdentificacion;

public  abstract class Usuario {
    protected Integer id;
    protected String nombre;
    protected String apellidos;
    protected TipoIdentificacion tipoIdentificacion;
    protected Integer numeroIdentificaion;
    protected long numeroIdentificación;
    
    
    public Usuario(Integer id, String nombre, String apellidos, TipoIdentificacion tipoIdentificacion,
            Integer numeroIdentificaion, long numeroIdentificación) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroIdentificaion = numeroIdentificaion;
        this.numeroIdentificación = numeroIdentificación;
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellidos() {
        return apellidos;
    }


    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }


    public TipoIdentificacion getTipoIdentificacion() {
        return tipoIdentificacion;
    }


    public void setTipoIdentificacion(TipoIdentificacion tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }


    public Integer getNumeroIdentificaion() {
        return numeroIdentificaion;
    }


    public void setNumeroIdentificaion(Integer numeroIdentificaion) {
        this.numeroIdentificaion = numeroIdentificaion;
    }


    public long getNumeroIdentificación() {
        return numeroIdentificación;
    }


    public void setNumeroIdentificación(long numeroIdentificación) {
        this.numeroIdentificación = numeroIdentificación;
    }


    @Override
    public String toString() {
        return "Usuario [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", tipoIdentificacion="
                + tipoIdentificacion + ", numeroIdentificaion=" + numeroIdentificaion + ", numeroIdentificación="
                + numeroIdentificación + "]";
    }

    //definir metodo toString
    
}
