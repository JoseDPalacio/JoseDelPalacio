public class Estudiante {
    private int id;
    private String nombre;
    private int edad;
    private int calificacion;

    public Estudiante(int id, String nombre, int edad, int calificacion) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.calificacion = calificacion;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getCalificacion() {
        return calificacion;
    }

    @Override
    public String toString() {
        return "nombre: " + nombre + '\n' +
                "edad: " + edad + '\n' +
                "calificacion: "+ calificacion;
    }
}
