package org.cita2902082.java.entitis;

import java.time.LocalDateTime;

import org.cita2902082.java.entitis.enums.Estado;

public class CitaMedico extends Cita implements IAgendable{

    private String motivo;
    private Medico medico;
    private static Estado estado;
    
    public CitaMedico(LocalDateTime fecha, Paciente paciente, String motivo, Medico medico) {
        super(fecha, estado, paciente);
        this.motivo = motivo;
        this.medico = medico;
        this.estado = estado;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    @Override
    public void agendarCita(LocalDateTime fecha) {
        super.setFecha(fecha);
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'agendarCita'");
    }

    @Override
    public void cancelarCita() {
        this.estado = Estado.Cancelada;
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cancelarCita'");
    }

    @Override
    public void reAsignarCita(LocalDateTime fecha) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'reAsignarCita'");
    }
 
  



}
