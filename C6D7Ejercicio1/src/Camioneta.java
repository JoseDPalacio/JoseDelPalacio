import java.time.LocalDate;
import java.time.Period;

//capacidadTanque y consumoCombustible
public class Camioneta extends Vehiculo implements Combustion{
    //Atributos
    private int capacidadTanque;
    private double consumoCombustible;

    //Constructor
    public Camioneta(int id, String placa, String marca, String modelo, int fechaFrabicacion, double costo, int capacidadTanque, double consumoCombustible) {
        super(id, placa, marca, modelo, fechaFrabicacion, costo);
        this.capacidadTanque = capacidadTanque;
        this.consumoCombustible = consumoCombustible;
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
    public String recargarCombustible() {
        return "Repostando Camioneta";
    }

    @Override
    public String toString() {
        return super.toString() +
                "capacidadTanque: " + capacidadTanque + '\n'+
                "consumoCombustible: " + consumoCombustible +'\n';
    }
}
