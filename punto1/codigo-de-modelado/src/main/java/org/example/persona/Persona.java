package org.example.persona;

import lombok.Getter;
import lombok.Setter;
import org.example.destinos.CalculadoraDeTiempo;
import org.example.destinos.Destino;
import org.example.reacciones.Reaccion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Persona {

    @Getter private String nombreYapellido;
    @Getter private Integer edad;
    @Getter private Enum sexo;
    @Getter private String direccion;
    @Getter @Setter private Boolean recibeNotificaciones;
    @Getter private Reaccion reaccionElegida;
    @Getter  List<Cuidador> cuidadoresActuales;
    @Getter @Setter private Boolean esCuidador;

    public Void cambiarReaccion(Reaccion nuevaReaccion){
        this.setReaccion(nuevaReaccion);
    }

    public List <Cuidador> solicitarCuidadores(){
        //Devuelve cuidadores disponibles en el momento
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
    public Void comenzar(Destino origen, Destino destino){
        //TODO

        Integer tiempoTranscurrido = 0;
        calculadoraDeTiempo = new CalculadoraDeTiempo();
        Integer tiempoAproximado = calculadoraDeTiempo.calcularTiempo(origen,destino);
        //calculadoraDeTiempo es un objeto que maneja la “Distance Matrix API” de Google
        this.setRecibeNotificaciones(false); //
        this.notificarComienzoCuidado(cuidadoresActuales);
        while(tiempoTranscurrido <= tiempoAproximado){
            //mostrar opcion de seleccionar llegueBien()
            //esperarMinuto();
            //sumarMinuto(this.tiempoTranscurrido);
        }
        if(tiempoTranscurrido > tiempoAproximado) {
            this.reaccionElegida.ejecutarReaccion(this);
        }

    }
    public Void llegueBien(){
        //TODO
        this.setRecibeNotificaciones(true);
        this.notificarFinalizadoDeCuidado(cuidadoresActuales);
        this.cuidadoresActuales= Collections.emptyList();
    }

    public Void pedirCuidado(Destino origen, Destino destino){
        this.confirmarCuidadores(origen,destino);
        this.comenzar(origen,destino);
    }

}