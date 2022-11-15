/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package comVista;

import entidades.Publicacion;
import entidades.Usuario;

/**
 *
 * @author jegav
 */
public interface IComunicadorVista {
    public void iniciarSesion(Usuario usuario);
    public void registrarUsuario(Usuario usuario);
    public void registrarPublicacion(Publicacion publicacion);
    public void consultarPublicaciones();
    
}
