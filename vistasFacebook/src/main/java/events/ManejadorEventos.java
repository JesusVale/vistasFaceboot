/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package events;

import comVista.IVistaObservable;
import conversors.IJsonToObject;
import conversors.JsonToObject;
import eventos.Eventos;
import interfaces.IRegistrarComentarioListener;
import interfaces.IRegistrarPublicacionListener;
import peticiones.Peticion;

/**
 *
 * @author jegav
 */
public class ManejadorEventos {
   
    private static IJsonToObject conversor = new JsonToObject();
    
    public static void notificarTodos(Peticion peticion, IVistaObservable vista){
        if(peticion.getEvento().equals(Eventos.registrarPublicacion)){
            IRegistrarPublicacionListener irpl = (IRegistrarPublicacionListener) vista;
            irpl.onRegistrarPublicacion(conversor.convertirPublicacion(peticion.getInfo()));
        } else if(peticion.getEvento().equals(Eventos.registrarComentario)){
            IRegistrarComentarioListener ircl = (IRegistrarComentarioListener) vista;
            ircl.onRegistrarComentario(conversor.convertirComentario(peticion.getInfo()));
        }
    }
    
    
}
