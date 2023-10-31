public class Pantalon extends Vestimenta{
    //Atributos
    private String estilo;
    private String tipoTejido;

    //Constructor
    public Pantalon(int cod, String nombre, double precio, String marca, int talla, String color, String estilo, String tipoTejido) {
        super(cod, nombre, precio, marca, talla, color);
        this.estilo = estilo;
        this.tipoTejido = tipoTejido;
    }

    //Get Set
    public String getEstilo() {
        return estilo;
    }
    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }
    public String getTipoTejido() {
        return tipoTejido;
    }
    public void setTipoTejido(String tipoTejido) {
        this.tipoTejido = tipoTejido;
    }

    //Metodo
    @Override
    public void mostrarMarca() {
        System.out.println( "Estos pantalones son de marca: "+getMarca());
    }
}
