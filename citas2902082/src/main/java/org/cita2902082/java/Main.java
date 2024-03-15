package org.cita2902082.java;

import org.cita2902082.java.entitis.Medico;
import org.cita2902082.java.entitis.Usuario;
import org.cita2902082.java.entitis.enums.Especialidad;
import org.cita2902082.java.entitis.enums.TipoIdentificacion;

public class Main {
    public static void main(String[] args) {

        Medico m = new Medico(8724387,
         "umberto",
          "carrillo",
           TipoIdentificacion.TI,
            79854,
             0,
              84374,
               Especialidad.Anestesiología);
   
   System.out.println(m.toString());
    }


}
