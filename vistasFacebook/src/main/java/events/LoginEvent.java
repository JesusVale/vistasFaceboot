/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package events;

import conversors.IJsonToObject;
import conversors.JsonToObject;
import eventos.Eventos;
import interfaces.ILoginObserver;
import java.util.ArrayList;
import java.util.List;
import peticiones.PeticionUsuario;

/**
 *
 * @author jegav
 */
public class LoginEvent extends ManejadorEvento {
    private List<ILoginObserver> listeners;
    private IJsonToObject conversor;
    
    public LoginEvent() {
        this.listeners = new ArrayList();
        conversor = new JsonToObject();
    }

    public void notificarUsuarios(PeticionUsuario peticion){

        List<ILoginObserver> copiaListeners = new ArrayList(listeners);
        for(ILoginObserver listener: copiaListeners){
            listener.onLogin(peticion);
        }
    }
    
    public void suscribirse(ILoginObserver listener){
        listeners.add(listener);
    }
    
    public void desuscribir(ILoginObserver listener){
        listeners.remove(listener);
    }

    @Override
    public boolean manejar(String peticion) {
        System.out.println("Lo maneja Login");
        PeticionUsuario peticionUsuario = conversor.convertirPeticionUsuario(peticion);
        if(peticionUsuario.getEvento().equals(Eventos.Login)){
            this.notificarUsuarios(peticionUsuario);
            return true;
        }
        return super.manejarSiguiente(peticion);
    }
}
