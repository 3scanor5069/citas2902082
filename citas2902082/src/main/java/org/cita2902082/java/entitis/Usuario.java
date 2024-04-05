package org.cita2902082.java.entitis;

import org.cita2902082.java.entitis.enums.TipoIdentificacion;

public  abstract class Usuario {
    protected Integer id;
    protected String nombre;
    protected String apellidos;
    protected TipoIdentificacion tipoIdentificacion;
    protected long numeroIdentificacion;

    
    
 

    public Usuario(Integer id, String nombre, String apellidos, TipoIdentificacion tipoIdentificacion,
            long numeroIdentificacion) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroIdentificacion = numeroIdentificacion;
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



    public long getNumeroIdentificacion() {
        return numeroIdentificacion;
    }


    public void setNumeroIdentificacion(long numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }


    @Override
    public String toString() {
        return "Usuario [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", tipoIdentificacion="
                + tipoIdentificacion + ", numeroIdentificaion=" 
                + numeroIdentificacion + "]";
    }

    //definir metodo toString
    
}
