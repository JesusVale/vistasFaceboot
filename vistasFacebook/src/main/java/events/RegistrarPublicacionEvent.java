/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package events;

import conversors.IJsonToObject;
import conversors.JsonToObject;
import entidades.Publicacion;
import eventos.Eventos;
import java.util.ArrayList;
import java.util.List;
import peticiones.Peticion;
import interfaces.IRegistrarPublicacionObserver;
import peticiones.PeticionPublicacion;
import peticiones.PeticionPublicaciones;

/**
 *
 * @author jegav
 */
public class RegistrarPublicacionEvent extends ManejadorEvento {
    private List<IRegistrarPublicacionObserver> listeners;
    private static RegistrarPublicacionEvent publicacionEvent;
    private IJsonToObject conversor;
    
    public RegistrarPublicacionEvent() {
        this.listeners = new ArrayList();
        conversor = new JsonToObject();
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
    public boolean manejar(String peticion) {
        System.out.println("Lo maneja pub");
        PeticionPublicaciones peticionPublicacion = conversor.convertirPeticionPublicaciones(peticion);
        if(peticionPublicacion.getEvento().equals(Eventos.registrarPublicacion)){
            System.out.println("Entro");
            this.notificarUsuarios(peticionPublicacion);
            return true;
        }
        return super.manejarSiguiente(peticion);
    }
}
