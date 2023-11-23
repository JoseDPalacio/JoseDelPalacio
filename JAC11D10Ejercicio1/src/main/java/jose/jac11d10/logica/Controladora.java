
package jose.jac11d10.logica;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jose.jac11d10.persistencia.ControladoraPersistencia;

public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearVoto(Voto voto){
        controlPersis.crearVoto(voto);
    }
    
    public void eliminarVoto(Long id){
        controlPersis.eliminarVoto(id);
    }
    
    public List<Voto> traerVotos(){
        return controlPersis.traerVotos();
    }
    
    public void editarVoto(Voto voto){
        controlPersis.editarVoto(voto);
    }
    
    public void votar(String partido){
        //condicional para sabes si existe la tabla o no
        if(traerVotos().isEmpty()){
            //si no existe la tabla, la creamos y ponemos todos los candidatos con 0 votos
            List<Voto> votosIniciales = Arrays.asList(new Voto("Partido A", 0),
                    new Voto("Partido B", 0),
                    new Voto("Partido C", 0));
            
            votosIniciales.forEach(v->{
                crearVoto(v);
            });   
        }
        //una vez creada la tabla o si ya existe pasamos a actualizar la cantidad de votos del candidato seleccionado
        Voto voto =traerVotos().stream().filter(v -> v.getPartido().equals(partido)).findFirst().get();
        System.out.println("Antes de votar: "+voto);
                voto.setCantidad(voto.getCantidad()+1);
                editarVoto(voto);
        System.out.println("Despues de votar: "+voto);
    }
}
