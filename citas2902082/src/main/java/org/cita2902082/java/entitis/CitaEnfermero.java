package org.cita2902082.java.entitis;

import java.time.LocalDateTime;

import org.cita2902082.java.entitis.enums.Estado;

public class CitaEnfermero extends Cita implements IAgendable{

    public CitaEnfermero(LocalDateTime fecha, Estado estado, Paciente paciente, Consultorio consultorio) {
        super(fecha, estado, paciente, consultorio);
        //TODO Auto-generated constructor stub
    }

    private String procedimiento;
    private Enfermero enfermero;


   

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
 


}
