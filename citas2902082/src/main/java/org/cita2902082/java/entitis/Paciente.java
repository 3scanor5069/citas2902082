package org.cita2902082.java.entitis;

import org.cita2902082.java.entitis.enums.TipoIdentificacion;

public class Paciente {
    private Integer id;
    private String nombres;
    private String apellidos;
    private TipoIdentificacion tipoIdentificacion;
    private Integer numeroIdentificacion;
    private String correoElectronico;
    private Integer celular;
    private int fechaNacimiento;
    private Double altura;
    private int peso;
    private String tipoSangre;
    private String factorRH;

    public Paciente(Integer id, String nombres, String apellidos, TipoIdentificacion tipoIdentificacion,
            Integer numeroIdentificacion, String correoElectronico, Integer celular, int i,
            Double altura, int j, String string, String string2) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroIdentificacion = numeroIdentificacion;
        this.correoElectronico = correoElectronico;
        this.celular = celular;
        this.fechaNacimiento = i;
        this.altura = altura;
        this.peso = j;
        this.tipoSangre = string;
        this.factorRH = string2;
    }

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
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

    public Integer getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(Integer numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public Integer getCelular() {
        return celular;
    }

    public void setCelular(Integer celular) {
        this.celular = celular;
    }

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getFactorRH() {
        return factorRH;
    }

    public void setFactorRH(String factorRH) {
        this.factorRH = factorRH;
    }

    public Paciente(int id2, String nombres2, String apellidos2, TipoIdentificacion ti, int numeroIdentificacion2,
			String correoElectronico2, int celular2, String string, double altura2, int j, String string2,
			String string22) {
		//TODO Auto-generated constructor stub
	}

    public Paciente(String string, String string2, String string3, TipoIdentificacion ppt, String string4, int i,
            String string5, double d, int j, String string6, String string7) {
        //TODO Auto-generated constructor stub
    }


    

}
