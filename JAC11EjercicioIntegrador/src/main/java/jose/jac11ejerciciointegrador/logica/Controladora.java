/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jose.jac11ejerciciointegrador.logica;

import java.util.List;
import jose.jac11ejerciciointegrador.persistencia.ControladoraPersistencia;

/**
 *
 * @author Usuario
 */
public class Controladora {
    ControladoraPersistencia cp = new ControladoraPersistencia();
    
    //Equipo
    public void crearEquipo (Equipo e){
        cp.crearEquipo(e);
    }
    
    public List<Equipo> verEquipos(){
        return cp.verEquipos();
    }
    
    public List<Equipo> verEquiposId(Long id){
        return verEquipos().stream().filter(e->e.getId()==id).toList();
    }
    
    public void editarEquipo(Equipo e){
        cp.editarEquipo(e);
    }
    
    public void eliminarEquipo(Long id){
        cp.eliminarEquipo(id);
    }
    
    
    //Partido
    public void crearPartido(Partido p){
        cp.crearPartido(p);
    }
    public List<Partido> verPartidos(){
        return cp.verPartidos();
    }
    public void editarPartido(Partido p){
        cp.editarPartido(p);
    }
    public void eliminarPartido(Long id){
       cp.eliminarPartido(id);
    }
}
