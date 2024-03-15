package org.cita2902082.java.entitis;

import java.time.LocalDateTime;

public interface IAgendable {

    public void agendarCita(LocalDateTime fecha);
    public void cancelarCita();
    public void reAsignarCita(LocalDateTime fecha);


}
