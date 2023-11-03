package org.ejercicio.persistencia;

import org.ejercicio.logica.Platillo;

import java.util.List;

public class ControladoraPersistencia {

    PlatilloJpaController platilloJpa =new PlatilloJpaController();

    //Metodo insert
    public void crearPlatillo(Platillo platillo){
        platilloJpa.create(platillo);
    }

    //Metodo delete
    public void eliminarPlatillo(Long id){
        platilloJpa.destroy(id);
    }

    public void editarPlatillo(Platillo platillo){
        platilloJpa.edit(platillo);
    }

    public List<Platillo> listarPlatillos(){
        return platilloJpa.findPlatilloEntities();
    }
}
