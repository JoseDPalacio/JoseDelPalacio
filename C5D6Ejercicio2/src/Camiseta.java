public class Camiseta extends Vestimenta{
    //Atributos
    private String manga;
    private String cuello;

    //Constructor
    public Camiseta(int cod, String nombre, double precio, String marca, int talla, String color, String manga, String cuello) {
        super(cod, nombre, precio, marca, talla, color);
        this.manga = manga;
        this.cuello = cuello;
    }

    //GEt Set
    public String getManga() {
        return manga;
    }
    public void setManga(String manga) {
        this.manga = manga;
    }
    public String getCuello() {
        return cuello;
    }
    public void setCuello(String cuello) {
        this.cuello = cuello;
    }

    //Metodo
    @Override
    public void mostrarMarca() {
        System.out.println( "Estas camisetas son de marca: "+getMarca());
    }
}
