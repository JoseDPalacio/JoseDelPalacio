
package jose.jac11d10.logica;

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
    
    public Map<String, Integer> contarVotos(){
        Map<String, Integer> votosPartido = new HashMap<>();
        
        traerVotos().forEach(v->{
            String partido = v.getPartido();
            int cantidad = v.getCantidad();
            // Si el partido ya está en el mapa, sumar los votos, si no, agregarlo al mapa
            votosPartido.merge(partido, cantidad, Integer::sum);
        });
        
        return votosPartido;
    }
}
