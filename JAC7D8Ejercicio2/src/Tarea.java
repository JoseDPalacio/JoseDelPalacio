import java.util.ArrayList;
import java.util.List;

public class Tarea {
    //Atributos
    private String nombre;
    private List<Tarea> subtareas;

    public Tarea(String nombre) {
        this.nombre = nombre;
        this.subtareas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Tarea> getSubtareas() {
        return subtareas;
    }

    public void setSubtareas(List<Tarea> subtareas) {
        this.subtareas = subtareas;
    }

    //Metodo mostrar cortesia de Alberto Bonilla
    public void mostrarEstructura(int nivel) {
        //Imprimir espacios para representar la estructura
        for (int i = 0; i < nivel; i++) {
            System.out.print("       ");
        }
        //Imprimir el nombre de la tarea con el carácter ascii
        System.out.println("\u2514\u2500\u2500> " + nombre);

        //Recorrer las subtareas recursivamente
        for (Tarea subtarea : subtareas) {
            subtarea.mostrarEstructura(nivel + 1);
        }
    }
}
