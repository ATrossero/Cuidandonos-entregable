package reaccion;

import persona.Persona;

public class RealizarLlamadaUsuario implements Reaccion {
    @Override
    public Void ejecutarReaccion(Persona persona) {
        this.llamarUsuario(persona);
    }
    public Void llamarUsuario(Persona persona){
        //TODO
    }
}
