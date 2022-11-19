/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package comVista;

import entidades.Comentario;
import entidades.Publicacion;
import entidades.Usuario;

/**
 *
 * @author jegav
 */
public interface IComunicadorVista {
    public void iniciarSesion(Usuario usuario);
    public void registrarUsuario(Usuario usuario);
    public void EditarUsuario(Usuario usuario);
    public void registrarPublicacion(Publicacion publicacion);
    public void consultarPublicaciones();
    public void cosultarUsuarioPorId(Integer id);
    public void eliminarUsuario(Usuario usuario);
    public void eliminarPublicacion(Publicacion publicacion);
    public void eliminarComentario(Comentario comentario);
    
}
