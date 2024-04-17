package org.example.reacciones;

import org.example.persona.Persona;

public class RealizarLlamadaPolicia implements Reaccion {
    @Override
    public Void ejecutarReaccion(Persona persona) {
        this.llamarPolicia();
    }
    public Void llamarPolicia(){
        //TODO
    }
}
