import java.util.ArrayList;
import java.util.List;

public class Directorio {
    //Atributos
    private String nombre;
    private List<Directorio> subdirectorios;
    private List<String> archivos;

    //Constructor
    public Directorio(String nombre) {
        this.nombre = nombre;
        this.subdirectorios = new ArrayList<>();
        this.archivos = new ArrayList<>();
    }

    //Getter & Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Directorio> getSubdirectorios() {
        return subdirectorios;
    }

    public void setSubdirectorios(List<Directorio> subdirectorios) {
        this.subdirectorios = subdirectorios;
    }

    public List<String> getArchivos() {
        return archivos;
    }

    public void setArchivos(List<String> archivos) {
        this.archivos = archivos;
    }

    //Metodo para mostrar cortesia de Alberto Bonilla modificado
    public void mostrarEstructura(int nivel) {
        //Imprimir espacios para representar la estructura
        for (int i = 0; i < nivel; i++) {
            System.out.print("          ");
        }
        // Imprimir el nombre de la tarea con el carácter ascii
        System.out.println("\u2514\u2500\u2500> Directorio: " + nombre);

        // Imprimir archivos en este nivel
        for (String archivo : archivos) {
            for (int i = 0; i <= nivel; i++) {
                System.out.print("          ");
            }
            System.out.println("\u2514\u2500\u2500> Archivo: " + archivo);
        }

        // Recorrer las subtareas recursivamente
        for (Directorio directorio : subdirectorios) {
            directorio.mostrarEstructura(nivel + 1);
        }
    }

}
