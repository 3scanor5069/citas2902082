package org.cita2902082.java.entitis;

import org.cita2902082.java.entitis.enums.TipoSangre;
import java.time.LocalDateTime;
import org.cita2902082.java.entitis.enums.TipoIdentificacion;

public class Paciente {
    public Integer id;
    public String nombres;
    public String apellidos;
    public TipoIdentificacion tipoIdentificacion;
    public Integer numeroIdentificación;
    public String correoElectronico;
    public Integer celular;
    public LocalDateTime fechaNacimiento;
    public Double altura;
    public Double peso;
    public TipoSangre tipoSangre;
    public char factorRH;

    public Paciente(String nombres, String apellidos, TipoIdentificacion tipoIdentificacion,
            Integer numeroIdentificación, String correoElectronico, Integer celular, LocalDateTime fechaNacimiento,
            Double altura, Double peso, TipoSangre tipoSangre, char factorRH) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroIdentificación = numeroIdentificación;
        this.correoElectronico = correoElectronico;
        this.celular = celular;
        this.fechaNacimiento = fechaNacimiento;
        this.altura = altura;
        this.peso = peso;
        this.tipoSangre = tipoSangre;
        this.factorRH = factorRH;
    }

}
