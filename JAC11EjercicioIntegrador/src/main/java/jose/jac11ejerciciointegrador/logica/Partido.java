
package jose.jac11ejerciciointegrador.logica;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Partido implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fecha;
    
    
    @ManyToOne
    @JoinColumn(name = "equipoloca_id")
    private Equipo equipo1;
    @ManyToOne
    @JoinColumn(name = "equipovisitante_id")
    private Equipo equipo2;
    
    private String resultado;

    public Partido() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Equipo getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    
    
}
