package org.cita2902082.java.entitis;

import org.cita2902082.java.entitis.enums.Especialidad;
import org.cita2902082.java.entitis.enums.TipoIdentificacion;

public class Medico {
    public Integer id;
    public String nombres;
    public String apellidos;
    public TipoIdentificacion tipoIdentificacion;
    public Integer numeroIdentificación;
    public Integer registroMedico;
    public Especialidad especialidad;

    public Medico(String nombres, String apellidos, TipoIdentificacion tipoIdentificacion, Integer numeroIdentificación,
            Integer registroMedico, Especialidad especialidad) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroIdentificación = numeroIdentificación;
        this.registroMedico = registroMedico;
        this.especialidad = especialidad;
    }

}
