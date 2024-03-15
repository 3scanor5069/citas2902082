package org.cita2902082.java.entitis;

import org.cita2902082.java.entitis.enums.TipoSangre;
import java.time.LocalDateTime;
import org.cita2902082.java.entitis.enums.TipoIdentificacion;

public class Paciente {
    private Integer id;
    private String nombres;
    private String apellidos;
    private TipoIdentificacion tipoIdentificacion;
    private Integer numeroIdentificación;
    private String correoElectronico;
    private Integer celular;
    private LocalDateTime fechaNacimiento;
    private Double altura;
    private Double peso;
    private TipoSangre tipoSangre;
    private char factorRH;

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
