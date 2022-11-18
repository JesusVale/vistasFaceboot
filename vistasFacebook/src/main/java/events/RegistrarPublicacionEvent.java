/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package events;

import conversors.IJsonToObject;
import conversors.JsonToObject;
import java.util.ArrayList;
import java.util.List;
import interfaces.IRegistrarPublicacionObserver;
import peticiones.PeticionPublicaciones;

/**
 *
 * @author jegav
 */
public class RegistrarPublicacionEvent implements EventNotifier{
    private List<IRegistrarPublicacionObserver> listeners;
    private static RegistrarPublicacionEvent publicacionEvent;
    private IJsonToObject conversor;
    
    private RegistrarPublicacionEvent() {
        this.listeners = new ArrayList();
        conversor = new JsonToObject();
    }
    
    public static RegistrarPublicacionEvent getInstance(){
        if(publicacionEvent == null){
            publicacionEvent = new RegistrarPublicacionEvent();
        }
        return publicacionEvent;
    }
    
    public void notificarUsuarios(PeticionPublicaciones peticion){
        for(IRegistrarPublicacionObserver listener: listeners){
            listener.onRegistrarPublicacion(peticion);
        }
        
    }
    
    public void suscribirse(IRegistrarPublicacionObserver listener){
        listeners.add(listener);
    }
    
    public void desuscribirse(IRegistrarPublicacionObserver listener){
        listeners.remove(listener);
    }

    @Override
    public void notificar(String mensaje) {
        PeticionPublicaciones peticion = conversor.convertirPeticionPublicaciones(mensaje);
        publicacionEvent.notificarUsuarios(peticion);
    }

}
