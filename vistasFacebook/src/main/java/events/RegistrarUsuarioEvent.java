/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package events;

import conversors.IJsonToObject;
import conversors.JsonToObject;
import eventos.Eventos;
import interfaces.IRegistrarPublicacionObserver;
import interfaces.IRegistrarUsuarioObserver;
import java.util.ArrayList;
import java.util.List;
import peticiones.PeticionPublicaciones;
import peticiones.PeticionUsuario;

/**
 *
 * @author jegav
 */
public class RegistrarUsuarioEvent extends ManejadorEvento {
     private List<IRegistrarUsuarioObserver> listeners;
    private IJsonToObject conversor;
    
    public RegistrarUsuarioEvent() {
        this.listeners = new ArrayList();
        conversor = new JsonToObject();
    }
    
    public void notificarUsuarios(PeticionUsuario peticion){
        for(IRegistrarUsuarioObserver listener: listeners){
            listener.onRegistrarUsuario(peticion);
        }
        
    }
    
    public void suscribirse(IRegistrarUsuarioObserver listener){
        listeners.add(listener);
    }
    
    public void desuscribirse(IRegistrarUsuarioObserver listener){
        listeners.remove(listener);
    }

    @Override
    public boolean manejar(String peticion) {
        System.out.println("Lo maneja pub");
        PeticionUsuario peticionUsuario = conversor.convertirPeticionUsuario(peticion);
        if(peticionUsuario.getEvento().equals(Eventos.registrarUsuario)){
            System.out.println("Entro");
            this.notificarUsuarios(peticionUsuario);
            return true;
        }
        return super.manejarSiguiente(peticion);
    }
}
