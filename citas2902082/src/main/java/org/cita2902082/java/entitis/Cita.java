package org.cita2902082.java.entitis;

import java.time.LocalDateTime;

import org.cita2902082.java.entitis.enums.Estado;

public class Cita {
    protected LocalDateTime fecha;
    protected Estado estado;
    protected Paciente paciente;
    protected Consultorio consultorio;

    
    public Cita(LocalDateTime fecha, Estado estado, Paciente paciente, Consultorio consultorio) {
        this.fecha = fecha;
        this.estado = estado;
        this.paciente = paciente;
        this.consultorio = consultorio;
    }


    public LocalDateTime getFecha() {
        return fecha;
    }


    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }


    public Estado getEstado() {
        return estado;
    }


    public void setEstado(Estado estado) {
        this.estado = estado;
    }


    public Paciente getPaciente() {
        return paciente;
    }


    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }


    public Consultorio getConsultorio() {
        return consultorio;
    }


    public void setConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }
  

    
    
}
