public class Mascota <T>{
    //Atributos
    private int id;
    private String nombre;
    private int edad;
    private String especie;

    //Constructor
    public Mascota(int id, String nombre, int edad, String especie) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
    }

    //Getter & Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public String toString() {
        System.out.println("---------------");
        return "id: " + id + '\n'+
                "nombre: " + nombre + '\n' +
                "edad: " + edad + '\n'+
                "especie: " + especie;
    }
}
