/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package events;

import interfaces.IRegistrarComentarioListener;
import java.util.ArrayList;
import java.util.List;
import peticiones.Peticion;

/**
 *
 * @author jegav
 */
public class RegistrarComentarioEvent {
    private List<IRegistrarComentarioListener> listeners;
    private static RegistrarComentarioEvent comentarioEvent;
    
    
    private RegistrarComentarioEvent() {
        this.listeners = new ArrayList();
    }
    
    public static RegistrarComentarioEvent getInstance(){
        if(comentarioEvent == null){
            comentarioEvent = new RegistrarComentarioEvent();
        }
        return comentarioEvent;
    }
    
    public void notificarUsuarios(Peticion peticion){
        for(IRegistrarComentarioListener listener: listeners){
            listener.onRegistrarComentario(peticion);
        }
    }
    
    public void suscribe(IRegistrarComentarioListener listener){
        listeners.add(listener);
    }
}
