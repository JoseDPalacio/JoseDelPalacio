public class Sombrero extends Vestimenta{
    //Atributos
    private String tipo;
    private int tamano;

    //Constructor
    public Sombrero(int cod, String nombre, double precio, String marca, int talla, String color, String tipo, int tamano) {
        super(cod, nombre, precio, marca, talla, color);
        this.tipo = tipo;
        this.tamano = tamano;
    }

    //Get Set
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getTamano() {
        return tamano;
    }
    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    //Metodo
    @Override
    public void mostrarMarca() {
        System.out.println( "Este sombrero es de marca: "+getMarca());
    }
}
