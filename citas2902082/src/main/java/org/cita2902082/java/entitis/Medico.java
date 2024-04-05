package org.cita2902082.java.entitis;

import org.cita2902082.java.entitis.enums.Especialidad;
import org.cita2902082.java.entitis.enums.TipoIdentificacion;

public class Medico extends Usuario {
    
    private Integer registroMedico;
    private Especialidad especialidad;
    
    public Medico(Integer id, String nombre, String apellidos, TipoIdentificacion tipoIdentificacion,
            Integer numeroIdentificaion, long numeroIdentificacion, Integer registroMedico, Especialidad especialidad) {
        super(id, nombre, apellidos, tipoIdentificacion, numeroIdentificacion);
        this.registroMedico = registroMedico;
        this.especialidad = especialidad;
    }
    public Integer getRegistroMedico() {
        return registroMedico;
    }
    public void setRegistroMedico(Integer registroMedico) {
        this.registroMedico = registroMedico;
    }
    public Especialidad getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
    @Override
    public String toString() {
        return "Medico [nombre=" + nombre + ", apellidos=" + apellidos + ", especialidad=" + especialidad + "]";
    }
   
}
