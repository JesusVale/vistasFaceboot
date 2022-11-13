/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comVista;

import conversors.IJsonToObject;
import conversors.JsonToObject;
import entidades.Publicacion;
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
        this.clienteVista = new ClienteVista(6000, vistaObservable);
        new Thread(clienteVista).start(); /* El cliente(Vista) va a estar constantemente esperando una respuesta por medio del hilo */
    }

    public void iniciarSesion(Usuario usuario) {
        String usuarioStr =  conversor.convertirObjetoString(usuario);
        Peticion peticionIniciarSesion = new Peticion(Eventos.Login, usuarioStr);
        String peticion = conversor.convertirObjetoString(peticionIniciarSesion);
        clienteVista.enviarMensaje(peticion);
    }
    
    @Override
    public void registrarUsuario(Usuario usuario) {
        String usuarioStr =  conversor.convertirObjetoString(usuario);
        Peticion peticionRegistroUsuario = new Peticion(Eventos.registrarUsuario, usuarioStr);
        String peticion = conversor.convertirObjetoString(peticionRegistroUsuario);
        clienteVista.enviarMensaje(peticion);
    }
    
    public void registrarPublicacion(Publicacion publicacion) {
        String publicacionStr = conversor.convertirObjetoString(publicacion);
        Peticion peticionRegistroPublicacion = new Peticion(Eventos.registrarPublicacion, publicacionStr);
        String peticion = conversor.convertirObjetoString(peticionRegistroPublicacion);
        clienteVista.enviarMensaje(peticion);
    }
    
    public void suscribirseRegistrarPublicacion(){
        Peticion peticionRegistrarComentario = new Peticion(Eventos.suscribirseRegistrarPublicacion, "");
        String peticion = conversor.convertirObjetoString(peticionRegistrarComentario);
        clienteVista.enviarMensaje(peticion);
    }
    
    public void suscribirseRegistrarComentario(){
        Peticion peticionRegistrarComentario = new Peticion(Eventos.suscribirseRegistrarComentario, "");
        String peticion = conversor.convertirObjetoString(peticionRegistrarComentario);
        clienteVista.enviarMensaje(peticion);
    }
    
}
