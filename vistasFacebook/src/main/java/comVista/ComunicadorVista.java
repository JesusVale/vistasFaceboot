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
import peticiones.PeticionId;
import peticiones.PeticionPublicacion;
import peticiones.PeticionPublicaciones;
import peticiones.PeticionUsuario;

/**
 * Fachada para Comunicar la vista con el server, Manejo de peticiones de vista
 * @author jegav
 */
public class ComunicadorVista implements IComunicadorVista {
    private IJsonToObject conversor;
    
    public ComunicadorVista() {
        this.conversor = new JsonToObject();
    }    
    
    public void iniciarSesion(Usuario usuario) {
        PeticionUsuario peticionIniciarSesion = new PeticionUsuario(Eventos.Login, usuario);
        String peticion = conversor.convertirObjetoString(peticionIniciarSesion);
        EventListener.getInstance().enviarMensaje(peticion);
    }
    
    @Override
    public void registrarUsuario(Usuario usuario) {
        PeticionUsuario peticionRegistroUsuario = new PeticionUsuario(Eventos.registrarUsuario, usuario);
        String peticion = conversor.convertirObjetoString(peticionRegistroUsuario);
        EventListener.getInstance().enviarMensaje(peticion);
    }
    
    public void registrarPublicacion(Publicacion publicacion) {
        Peticion peticionRegistroPublicacion = new PeticionPublicacion(Eventos.registrarPublicacion, publicacion);
        String peticion = conversor.convertirObjetoString(peticionRegistroPublicacion);
        EventListener.getInstance().enviarMensaje(peticion);
    }
    
    public void consultarPublicaciones(){
        //Peticion peticionConsultarPublicacion = new Peticion(Eventos.consultarPublicaciones);
        //String peticion = conversor.convertirObjetoString(peticionConsultarPublicacion);
        //clienteVista.enviarMensaje(peticion);
    }

    @Override
    public void cosultarUsuarioPorId(Integer id) {
        PeticionId peticionId = new PeticionId(Eventos.consultarUsuarioPorId, id);
        String peticion = conversor.convertirObjetoString(peticionId);
        EventListener.getInstance().enviarMensaje(peticion);
    }
    
}
