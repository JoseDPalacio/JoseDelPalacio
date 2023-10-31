public class Reptil extends Animal{
    //Atributos
    private int longitud;
    private String tipoEscama;
    private String tipoVeneno;
    private String Habitat;

    //Constructor
    public Reptil(int id, String nombre, int edad, String tipoPiel, String tipoAlimentacion, int longitud, String tipoEscama, String tipoVeneno, String habitat) {
        super(id, nombre, edad, tipoPiel, tipoAlimentacion);
        this.longitud = longitud;
        this.tipoEscama = tipoEscama;
        this.tipoVeneno = tipoVeneno;
        Habitat = habitat;
    }

    //Get Set
    public int getLongitud() {
        return longitud;
    }
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    public String getTipoEscama() {
        return tipoEscama;
    }
    public void setTipoEscama(String tipoEscama) {
        this.tipoEscama = tipoEscama;
    }
    public String getTipoVeneno() {
        return tipoVeneno;
    }
    public void setTipoVeneno(String tipoVeneno) {
        this.tipoVeneno = tipoVeneno;
    }
    public String getHabitat() {
        return Habitat;
    }
    public void setHabitat(String habitat) {
        Habitat = habitat;
    }

    //Metodos
    @Override
    public void saludar() {
        System.out.println("Hola, soy un reptil");
    }
}
