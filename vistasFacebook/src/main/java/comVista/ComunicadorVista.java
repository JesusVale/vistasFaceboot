/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comVista;

import conversors.IJsonToObject;
import entidades.Usuario;
import eventos.Eventos;

/**
 *
 * @author jegav
 */
public class ComunicadorVista implements IFachadaControlador {

    private ClienteVista clienteVista;
    private IJsonToObject conversor;
    
    public ComunicadorVista(IVistaObservable vistaObservable, String codigo) {
        
        this.clienteVista = new ClienteVista(5000, vistaObservable, codigo);
        new Thread(clienteVista).start();
    }
    
    @Override
    public void registrarUsuario(Usuario usuario) {
        String usuarioStr =  conversor.convertirObjetoString(usuario);
        String[] mensajes = {Eventos.registrarUsuario, usuarioStr};
        clienteVista.enviarMensaje(conversor.convertirObjetoString(mensajes));
    }
    
}
