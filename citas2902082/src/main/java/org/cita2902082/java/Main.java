package org.cita2902082.java;

import java.time.LocalDateTime;


import org.cita2902082.java.entitis.CitaMedico;
import org.cita2902082.java.entitis.Consultorio;
import org.cita2902082.java.entitis.Enfermero;
import org.cita2902082.java.entitis.Medico;
import org.cita2902082.java.entitis.Paciente;
import org.cita2902082.java.entitis.enums.Especialidad;
import org.cita2902082.java.entitis.enums.Estado;
import org.cita2902082.java.entitis.enums.TipoIdentificacion;

public class Main {
    public static void main(String[] args) {

        Medico m = new Medico(8724387,
                "umberto",
                "carrillo",
                TipoIdentificacion.TI,
                79854,
                84374,
                null, Especialidad.Anestesiología);

        Medico e = new Medico(265654,
                "Anastacio",
                "Figueroa",
                TipoIdentificacion.CC,
                646684,
                435615,
                null, Especialidad.Ginegología);

    Paciente paciente11 = new Paciente (87364587, "arjemiro",
         "zuñiga", TipoIdentificacion.CC,
          8743658,
           "arjemiro24@gmail.com",
            984379843, 20/06/2000, 1.72,
             70, "B","+");
        
     Paciente p1 = new Paciente(123456789, "Manuela", "Gómez", TipoIdentificacion.CE,
             123456789, "manuela.gomez@email.com",
             312345678, 15/8/1990, 1.65,
             55, "A", "-");

    Paciente p2 = new Paciente(1029384756, "Santiago", "Pérez", TipoIdentificacion.CE,
             1029384756, "santiago.perez@email.com",
             300123457, 01/01/2015, 1.40,
             40, "O", "+");

    Paciente p3 = new Paciente(123456789, "John", "Smith", TipoIdentificacion.PPT,
             1234532, "john.smith@email.com",
             1234567890, 04/07/1980, 1.80,
             80, "AB", "+");

    Paciente p4 = new Paciente(987654321, "Ana", "Martínez", TipoIdentificacion.CC,
             987654321, "ana.martinez@email.com",
             31098765, 22/11/1975, 1.60,
             60, "A", "-");



    Enfermero enfermero1 = new Enfermero(123456, "Juan", "Pérez", TipoIdentificacion.CC, 123456789l);

    Enfermero enfermero2 = new Enfermero(587576, "María", "Gómez", TipoIdentificacion.RG, 987654321L);

    Enfermero enfermero3 = new Enfermero(123456, "Ana", null, TipoIdentificacion.PPT, 1234567L);

  Consultorio Consultorio3 = new Consultorio("papapappa", 1);


        CitaMedico grp = new CitaMedico(LocalDateTime.of(2024, 06, 15, 12, 00, 00), Estado.Agendada, p1,
         Consultorio3, "gripe", e);

         CitaMedico escop = new CitaMedico(LocalDateTime.of(2024, 07, 16, 13, 00, 00), Estado.Agendada, paciente11,
         Consultorio3, "escopolamina", m);
         


       System.out.println("fecha: " + grp.getFecha() + " Paciente: "+ grp.getPaciente().getNombres() + " " + grp.getPaciente().getApellidos() + " Medico: " + grp.getMedico().getNombre() + " " + grp.getMedico().getApellidos());

      
CitaMedico cancelarCita = escop;
cancelarCita.setEstado(Estado.Cancelada);
       
System.out.println("Estado Cita: " + escop.getEstado());



    
    }



}
