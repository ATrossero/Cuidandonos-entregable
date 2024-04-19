package persona;

import destinos.CalculadoraDeTiempo;
import destinos.Destino;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Persona {

     private String nombreYapellido;
     private Integer edad;
     private Enum sexo;
     private String direccion;
     private Boolean esCuidador;
     private Boolean esTranseunte;
     private ModoDeUsuario modoActual;


     /*public Void comenzar(Destino origen, Destino destino){


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

    }*/

    public Void actualizarModo(ModoDeUsuario modoActual){
        //TODO
        return null;
    }
    public Void cambiarDeModo(){return null;}



}