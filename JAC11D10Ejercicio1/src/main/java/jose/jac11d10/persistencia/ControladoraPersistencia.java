/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jose.jac11d10.persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import jose.jac11d10.logica.Voto;
import jose.jac11d10.persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author Usuario
 */
public class ControladoraPersistencia {
    
    VotoJpaController votoJpa = new VotoJpaController();
    
    public void crearVoto(Voto voto){
        votoJpa.create(voto);
    }
    
    public void eliminarVoto(Long id){
        try{
            votoJpa.destroy(id);
        }catch(NonexistentEntityException ex){
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Voto> traerVotos(){
        return votoJpa.findVotoEntities();
    }
    
    public void editarVoto(Voto voto){
        try {
            votoJpa.edit(voto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
