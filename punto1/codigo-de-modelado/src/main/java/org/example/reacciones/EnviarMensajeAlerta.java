package org.example.reacciones;

import org.example.persona.Persona;

public class EnviarMensajeAlerta implements Reaccion {
    @Override
    public Void ejecutarReaccion(Persona persona) {
        this.enviarMensajeAlerta(persona);
    }
    public Void enviarMensajeAlerta(Persona persona){
        //TODO
    }
}
