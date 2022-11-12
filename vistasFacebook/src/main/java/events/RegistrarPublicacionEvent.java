/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package events;

import interfaces.IRegistrarPublicacionListener;
import java.util.ArrayList;
import java.util.List;
import peticiones.Peticion;

/**
 *
 * @author jegav
 */
public class RegistrarPublicacionEvent {
    private List<IRegistrarPublicacionListener> listeners;
    private static RegistrarPublicacionEvent publicacionEvent;
    
    
    private RegistrarPublicacionEvent() {
        this.listeners = new ArrayList();
    }
    
    public static RegistrarPublicacionEvent getInstance(){
        if(publicacionEvent == null){
            publicacionEvent= new RegistrarPublicacionEvent();
        }
        return publicacionEvent;
    } 
    
    public void notificarUsuarios(Peticion peticion){
        for(IRegistrarPublicacionListener listener: listeners){
            //listener.onRegistrarPublicacion(peticion);
        }
    }
    
    public void suscribe(IRegistrarPublicacionListener listener){
        listeners.add(listener);
    }
}
