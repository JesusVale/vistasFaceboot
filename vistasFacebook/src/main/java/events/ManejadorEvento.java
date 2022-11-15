/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package events;

/**
 *
 * @author jegav
 */
public abstract class ManejadorEvento {
    
    private ManejadorEvento siguiente;
    
    public abstract boolean manejar(String peticion);
    
    public ManejadorEvento establecerSiguienteManejador(ManejadorEvento manejador){
        this.siguiente = manejador;
        return siguiente;
    }
    
    protected boolean manejarSiguiente(String peticion){
        if(siguiente == null){
            return true;
        }
        return siguiente.manejar(peticion);
    }
    
}
