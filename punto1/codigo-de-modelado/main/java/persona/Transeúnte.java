package persona;

import destinos.Destino;
import reaccion.Reaccion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Transeúnte {
    public Void cambiarDeModo(Persona persona){
        //TODO
        return null;
    }
    public Void cambiarReaccion(Reaccion reaccion){
        //TODO
        return null;
    }
    public List<Cuidador> solicitarCuidadores(){
        //TODO
        return null;
    }
    public Void llegueBien(){
        //TODO
        this.setRecibeNotificaciones(true);
        this.notificarFinalizadoDeCuidado(cuidadoresActuales);
        this.cuidadoresActuales= Collections.emptyList();
    }
    public Boolean confirmarCuidadores(Destino origen, Destino destino){
        //TODO
        List<Cuidador> cuidadoresDisponibles = this.solicitarCuidadores();
        List<Cuidador> list = new ArrayList<>();
        for (Cuidador cuidador : cuidadoresDisponibles) {
            if (cuidador.aceptaPedidoCuidado(this, origen, destino)) {
                list.add(cuidador);
            }
        }
        cuidadoresDisponibles = list;
        // metodo que indique si algun cuidador acepto (si ningun cuidador pudo aceptar, [if]
        if (list.isEmpty()){
            //Cancela pedido
            //Throw exception "Ningun cuidador aceptó el pedido"
        }
        this.cuidadoresActuales.addAll(list);

    }

    public Void pedirCuidado(Destino origen, Destino destino){
        this.confirmarCuidadores(origen,destino);
        this.comenzar(origen,destino);
    }

}
