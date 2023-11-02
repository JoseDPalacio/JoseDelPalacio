import java.time.LocalDate;
import java.time.Period;

//cilindrada y tipoMotor
public class Moto extends Vehiculo implements Combustion {
    //Atributos
    private int cilindrada;
    private String tipoMotor;

    //Constructor
    public Moto(int id, String placa, String marca, String modelo, int fechaFrabicacion, double costo, int cilindrada, String tipoMotor) {
        super(id, placa, marca, modelo, fechaFrabicacion, costo);
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
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
        return "Repostando Moto";
    }

    @Override
    public String toString() {
        return super.toString() +
                "cilindrada: " + cilindrada + '\n'+
                "tipoMotor: " + tipoMotor + '\n';
    }
}
