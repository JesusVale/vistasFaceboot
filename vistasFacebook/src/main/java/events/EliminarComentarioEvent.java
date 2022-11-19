/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package events;

import conversors.IJsonToObject;
import conversors.JsonToObject;
import interfaces.IEliminarComentarioObserver;
import java.util.ArrayList;
import java.util.List;
import peticiones.PeticionUsuario;

/**
 *
 * @author tonyd
 */
public class EliminarComentarioEvent {
    private List<IEliminarComentarioObserver> listeners;
    private IJsonToObject conversor;

    public EliminarComentarioEvent() {
        this.listeners = new ArrayList();
        conversor = new JsonToObject();
    }

    public void notificarUsuarios(PeticionUsuario peticionUsuario) {
//        for(IEliminarComentarioObserver listener: listeners){
//            listener.onEliminarComentario(comentarios);
//        }
    }

    public void suscribirse(IEliminarComentarioObserver listener) {
        listeners.add(listener);
    }

    public void desuscribir(IEliminarComentarioObserver listener) {
        listeners.remove(listener);
    }
}
