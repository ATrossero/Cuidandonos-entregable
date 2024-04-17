package org.example.reacciones;

import org.example.persona.Persona;

public class EsperarNMinutos implements Reaccion {
    private Integer minutosEsperables;
    @Override
    public Void ejecutarReaccion(Persona persona) {
        this.esperarMinutos(this.minutosEsperables);
    }

    private void esperarMinutos(Integer minutosEsperables) {
        //TODO
    }

}
