/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import peticiones.PeticionPublicaciones;

/**
 *
 * @author jegav
 */
public interface IConsultarPublicacionesPorHashtagObserver {
    public void onConsultarPublicacionesPorHashtag(PeticionPublicaciones respuesta);
}
