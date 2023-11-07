import java.time.LocalDate;

public class Reserva {
    //Atributos
    private String nombre;
    private String destino;
    private LocalDate fechaViaje;
    private int cantidadAsiento;
    private int cantidadAsientosDeseado;

    //constructor

    public Reserva(String nombre, String destino, LocalDate fechaViaje, int cantidadAsientosDeseado) throws ReservaInvalidaException {
        if(nombre.isEmpty() || destino.isEmpty()  ){
            throw new ReservaInvalidaException("El campo de nombre y/o destino estan vacios");
        }
        if (fechaViaje.isBefore(LocalDate.now())){
            throw new ReservaInvalidaException("La fecha de reserva no puede ser anterior al dia actual");
        }
        if (cantidadAsientosDeseado<=0){
            throw new ReservaInvalidaException("El numero de asientos no puede ser 0 o inferior");
        }
        this.nombre = nombre;
        this.destino = destino;
        this.fechaViaje = fechaViaje;
        this.cantidadAsiento = 128;
        this.cantidadAsientosDeseado = cantidadAsientosDeseado;
    }

    //Getter & Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDate getFechaViaje() {
        return fechaViaje;
    }

    public void setFechaViaje(LocalDate fechaViaje) {
        this.fechaViaje = fechaViaje;
    }

    public int getCantidadAsiento() {
        return cantidadAsiento;
    }

    public void setCantidadAsiento(int cantidadAsiento) {
        this.cantidadAsiento = cantidadAsiento;
    }

    public int getCantidadAsientosDeseado() {
        return cantidadAsientosDeseado;
    }

    public void setCantidadAsientosDeseado(int cantidadAsientosDeseado) {
        this.cantidadAsientosDeseado = cantidadAsientosDeseado;
    }

    public void reservar() throws ReservaInvalidaException {
        if (this.cantidadAsiento<this.cantidadAsientosDeseado){
            throw new ReservaInvalidaException("No es posible reservar, no hay asientos en el avion suficientes");
        }
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "nombre='" + nombre + '\'' +
                ", destino='" + destino + '\'' +
                ", fechaViaje=" + fechaViaje +
                ", cantidadAsiento=" + cantidadAsiento +
                ", cantidadAsientosDeseado=" + cantidadAsientosDeseado +
                '}';
    }
}
