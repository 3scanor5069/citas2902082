package org.cita2902082.java.entitis;

import java.time.LocalDateTime;

import org.cita2902082.java.entitis.enums.Estado;

public class Cita {
    private LocalDateTime fecha;
    private Estado estado;
    private Paciente paciente;
    public Cita(LocalDateTime fecha, Estado estado, Paciente paciente) {
        this.fecha = fecha;
        this.estado = estado;
        this.paciente = paciente;
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

    
}
