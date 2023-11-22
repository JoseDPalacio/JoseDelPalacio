/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jose.jac11ejerciciointegrador.persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import jose.jac11ejerciciointegrador.logica.Equipo;
import jose.jac11ejerciciointegrador.logica.Partido;
import jose.jac11ejerciciointegrador.persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author Usuario
 */
public class ControladoraPersistencia {
    EquipoJpaController ejc = new EquipoJpaController();
    PartidoJpaController pjc = new PartidoJpaController();
    
    //Controladora Equipo
    public void crearEquipo(Equipo e) {
        ejc.create(e);
    }

    public List<Equipo> verEquipos() {
        return ejc.findEquipoEntities();
    }

    public void editarEquipo(Equipo e) {
        try {
            ejc.edit(e);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarEquipo(Long id) {
        try {
            ejc.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
    }
    
    //Controladora Partidos
    public void crearPartido(Partido p) {
        pjc.create(p);
    }

    public List<Partido> verPartidos() {
        return pjc.findPartidoEntities();
    }

    public void editarPartido(Partido p) {
        try {
            pjc.edit(p);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarPartido(Long id) {
        try {
            pjc.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
    }
}
