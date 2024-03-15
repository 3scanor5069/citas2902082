package org.cita2902082.java.entitis;

import java.time.LocalDateTime;

public class CitaEnfermero extends Cita implements IAgendable{

    private String procedimiento;
    private Enfermero enfermero;

    public CitaEnfermero(LocalDateTime fecha, Paciente paciente, String procedimiento, Enfermero enfermero) {
        super(fecha, paciente);
        this.procedimiento = procedimiento;
        this.enfermero = enfermero;
    }

    public String getProcedimiento() {
        return procedimiento;
    }

    public void setProcedimiento(String procedimiento) {
        this.procedimiento = procedimiento;
    }

    public Enfermero getEnfermero() {
        return enfermero;
    }

    public void setEnfermero(Enfermero enfermero) {
        this.enfermero = enfermero;
    }

    @Override
    public void agendarCita(LocalDateTime fecha) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'agendarCita'");
    }

    @Override
    public void cancelarCita() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cancelarCita'");
    }

    @Override
    public void reAsignarCita(LocalDateTime fecha) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'reAsignarCita'");
    }
 


}
