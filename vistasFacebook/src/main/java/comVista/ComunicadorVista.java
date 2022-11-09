/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comVista;

import conversors.IJsonToObject;
import conversors.JsonToObject;
import peticiones.Peticion;
import entidades.Usuario;
import eventos.Eventos;

/**
 * Fachada para Comunicar la vista con el server, Manejo de peticiones de vista
 * @author jegav
 */
public class ComunicadorVista implements IComunicadorVista {

    private ClienteVista clienteVista; /* Comunicación directa con el server */
    private IJsonToObject conversor;
    
    public ComunicadorVista(IVistaObservable vistaObservable) {
        this.conversor = new JsonToObject();
        this.clienteVista = new ClienteVista(5000, vistaObservable);
        new Thread(clienteVista).start(); /* El cliente(Vista) va a estar constantemente esperando una respuesta por medio del hilo */
    }
    
    @Override
    public void registrarUsuario(Usuario usuario) {
        String usuarioStr =  conversor.convertirObjetoString(usuario);
        Peticion peticionRegistroUsuario = new Peticion(Eventos.registrarUsuario, usuarioStr);
        String peticion = conversor.convertirObjetoString(peticionRegistroUsuario);
        clienteVista.enviarMensaje(peticion);
    }
    
}
