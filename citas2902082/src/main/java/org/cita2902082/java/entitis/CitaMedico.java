package org.cita2902082.java.entitis;

import java.time.LocalDateTime;

import org.cita2902082.java.entitis.enums.Estado;

public class CitaMedico extends Cita implements IAgendable {

    private String motivo;
    private Medico medico;
    private static Estado estado;

    public CitaMedico(LocalDateTime fecha, Estado estado, Paciente paciente, Consultorio consultorio, String motivo,
            Medico medico) {
        super(fecha, estado, paciente, consultorio);
        this.motivo = motivo;
        this.medico = medico;
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

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        CitaMedico.estado = estado;
    }


    @Override
    public void agendarCita(LocalDateTime fecha) {
        super.setFecha(fecha);
    }

    @Override
    public void cancelarCita() {
        System.out.println("CITA DE ENFERMERIA CANCELADA");
    }

    @Override
    public void reAsignarCita(LocalDateTime fecha) {
        super.setFecha(fecha);
    }

    public void actualizarCita(CitaMedico cancelarCita) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actualizarCita'");
    }

}
