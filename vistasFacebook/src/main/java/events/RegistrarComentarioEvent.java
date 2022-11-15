/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package events;

import conversors.IJsonToObject;
import conversors.JsonToObject;
import entidades.Comentario;
import eventos.Eventos;
import java.util.ArrayList;
import java.util.List;
import peticiones.Peticion;
import interfaces.IRegistrarComentarioObserver;
import peticiones.PeticionUsuario;

/**
 *
 * @author jegav
 */
public class RegistrarComentarioEvent extends ManejadorEvento{
    private List<IRegistrarComentarioObserver> listeners;
    private IJsonToObject conversor;
    
    public RegistrarComentarioEvent() {
        this.listeners = new ArrayList();
        conversor = new JsonToObject();
    }

    public void notificarUsuarios(PeticionUsuario peticionUsuario){;
//        for(IRegistrarComentarioObserver listener: listeners){
//            listener.onRegistrarComentario(comentarios);
//        }
    }
    
    public void suscribirse(IRegistrarComentarioObserver listener){
        listeners.add(listener);
    }
    
    public void desuscribir(IRegistrarComentarioObserver listener){
        listeners.remove(listener);
    }

    @Override
    public boolean manejar(String peticion) {
        System.out.println("Lo maneja Com");
//        PeticionUsuario peticionUsuario = conversor.convertirPeticionUsuario(peticion);
//        if(peticionUsuario != null){
//            this.notificarUsuarios(peticionUsuario);
//            return true;
//        }
//        return super.manejarSiguiente(peticion);
        return true;
    }
}
