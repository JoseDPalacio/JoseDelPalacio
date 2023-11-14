import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Evento {
    //Atributos
    private String nombre;
    private LocalDate fecha;
    private String categoria;

    public Evento(String nombre, LocalDate fecha, String categoria) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaFormateada = fecha.format(formato);

        System.out.println("-------------------------");

        return "nombre: " + nombre + '\n' +
                "fecha: " + fechaFormateada + '\n' +
                "categoria: " + categoria;
    }
}
