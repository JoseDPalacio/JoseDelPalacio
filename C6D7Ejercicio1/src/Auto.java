import java.time.LocalDate;
import java.time.Period;

// capacidadBateria (en mah) y autonomia (en hs)
public class Auto extends Vehiculo implements Electrico{
    //Atributos
    private double capacidadBateria;
    private double autonomia;

    //Constructor
    public Auto(int id, String placa, String marca, String modelo, int fechaFrabicacion, double costo, double capacidadBateria, double autonomia) {
        super(id, placa, marca, modelo, fechaFrabicacion, costo);
        this.capacidadBateria = capacidadBateria;
        this.autonomia = autonomia;
    }

    //Metodo extends
    @Override
    public String calcularFechaAntiguedad() {
        LocalDate fechaFabricacion = LocalDate.of(getFechaFrabicacion(), 1, 1);
        LocalDate fechaActual = LocalDate.now();
        Period antiguedad = Period.between(fechaFabricacion, fechaActual);
        return antiguedad.getYears() + " años de antigüedad"; // calculamos la antiguedad del vehículo
    }

    //Metodo de implements
    @Override
    public String cargarEnergia() {
        return "recargando auto electrico";
    }

    @Override
    public String toString() {
        return super.toString() +
                "capacidadBateria: " + capacidadBateria + '\n'+
                "autonomia: " + autonomia + '\n';
    }
}
