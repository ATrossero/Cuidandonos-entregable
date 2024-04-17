package org.example.persona;

import lombok.Getter;
import lombok.Setter;
import org.example.destinos.Destino;

public class Cuidador {
    @Getter
    @Setter
    private Boolean appInstalada; //??????????????????????????????
    private Boolean disponible;
    public Boolean aceptaPedidoCuidado(Persona persona, Destino origen, Destino destino){
        //TODO
    }
}
