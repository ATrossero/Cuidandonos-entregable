package reaccion;

import persona.Persona;

public class RealizarLlamadaPolicia implements Reaccion {
    @Override
    public Void ejecutarReaccion(Persona persona) {
        this.llamarPolicia();
    }
    public Void llamarPolicia(){
        //TODO
    }
}
