/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package events;

import eventos.Eventos;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jegav
 */
public class ManejadorEventos {

    private static ManejadorEventos manejadorEventos;
    private static Map<String, EventNotifier> eventsNotifier;

    private ManejadorEventos() {
        eventsNotifier = new HashMap();
        eventsNotifier.put(Eventos.registrarUsuario, RegistrarUsuarioEvent.getInstance());
        eventsNotifier.put(Eventos.registrarPublicacion, RegistrarPublicacionEvent.getInstance());
        eventsNotifier.put(Eventos.Login, LoginEvent.getInstance());
        eventsNotifier.put(Eventos.consultarUsuarioPorId, ConsultarUsuarioEvent.getInstance());
        eventsNotifier.put(Eventos.consultarPublicaciones, ConsultarPublicacionesEvent.getInstance());
    }
    
    public static ManejadorEventos getInstance(){
        if(manejadorEventos == null){
            manejadorEventos = new ManejadorEventos();
        }
        return manejadorEventos;
    }
    
    public EventNotifier get(String evento){
         return eventsNotifier.get(evento);
    }
    
    
}
