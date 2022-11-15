/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package events;

import conversors.IJsonToObject;
import conversors.JsonToObject;
import interfaces.ILoginObserver;
import interfaces.IRegistrarComentarioObserver;
import interfaces.IRegistrarPublicacionObserver;
import interfaces.IRegistrarUsuarioObserver;
import peticiones.Peticion;

/**
 *
 * @author jegav
 */
public class ManejadorEventos {
   
    private static IJsonToObject conversor = new JsonToObject();
    private RegistrarComentarioEvent registrarComentarioEvent;
    private RegistrarPublicacionEvent registrarPublicacionEvent;
    private RegistrarUsuarioEvent registrarUsuarioEvent;
    private LoginEvent loginEvent;
    private static ManejadorEventos manejadorEventos;

    public ManejadorEventos() {
        registrarComentarioEvent = new RegistrarComentarioEvent();
        registrarPublicacionEvent = new RegistrarPublicacionEvent();
        registrarUsuarioEvent = new RegistrarUsuarioEvent();
        loginEvent = new LoginEvent();
    }
    
    public static ManejadorEventos getInstance(){
        if(manejadorEventos == null){
            manejadorEventos = new ManejadorEventos();
        }
        return manejadorEventos;
    }
    
    public void notificarUsuarios(String peticion){
        ManejadorEvento manejadorEvento = loginEvent;
        manejadorEvento.establecerSiguienteManejador(registrarPublicacionEvent);
        manejadorEvento.establecerSiguienteManejador(registrarUsuarioEvent);
                         //.establecerSiguienteManejador(registrarComentarioEvent);
        System.out.println("HOLAAAAAAAAAAAAAAAAAAAAAAAAA");
        manejadorEvento.manejar(peticion);
    }
    
    public void suscribirseRegistrarPublicacion(IRegistrarPublicacionObserver observer){
        registrarPublicacionEvent.suscribirse(observer);
    }
    
    
    public void suscribirseRegistrarComentario(IRegistrarComentarioObserver observer){
        registrarComentarioEvent.suscribirse(observer);
    }
    
    public void suscribirseRegistrarUsuario(IRegistrarUsuarioObserver observer){
        registrarUsuarioEvent.suscribirse(observer);
    }
    
    public void desuscribirseRegistrarUsuario(IRegistrarUsuarioObserver observer){
        registrarUsuarioEvent.desuscribirse(observer);
    }
    
    public void suscribirseLogin(ILoginObserver observer){
        loginEvent.suscribirse(observer);
    }
    
    public void desuscribirseRegistrarPublicacion(IRegistrarPublicacionObserver observer){
        registrarPublicacionEvent.suscribirse(observer);
    }
    
    
    public void desuscribirseRegistrarComentario(IRegistrarComentarioObserver observer){
        registrarComentarioEvent.desuscribir(observer);
    }
    
    public void desuscribirseLogin(ILoginObserver observer){
        loginEvent.desuscribir(observer);
    }

}
