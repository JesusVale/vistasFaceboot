/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package events;

import eventos.Eventos;
import interfaces.IRegistrarComentarioListener;
import interfaces.IRegistrarPublicacionListener;
import peticiones.Peticion;

/**
 *
 * @author jegav
 */
public class ManejadorEventos {
    private RegistrarComentarioEvent registrarComentarioEvent;
    private RegistrarPublicacionEvent registrarPublicacionEvent;
    public static ManejadorEventos manejadorEventos;

    private ManejadorEventos() {
        this.registrarComentarioEvent = RegistrarComentarioEvent.getInstance();
        this.registrarPublicacionEvent = RegistrarPublicacionEvent.getInstance();
    }
    
    public static ManejadorEventos getInstance(){
        if(manejadorEventos == null){
            manejadorEventos = new ManejadorEventos();
            System.out.println("hola");
        }
        return manejadorEventos;
    } 
    
    public void notificarTodos(Peticion peticion){
        switch(peticion.getEvento()){
            case "Registrar Publicacion":
                registrarPublicacionEvent.notificarUsuarios(peticion);
                break;
            case "Registrar Comentario":
                registrarComentarioEvent.notificarUsuarios(peticion);
                break;
        }
    }
    
    public void suscribeRegistrarPublicacion(IRegistrarPublicacionListener listener){
        registrarPublicacionEvent.suscribe(listener);
    }
    
    public void suscribeComentarioPublicacion(IRegistrarComentarioListener listener){
        registrarComentarioEvent.suscribe(listener);
    }
    
}
