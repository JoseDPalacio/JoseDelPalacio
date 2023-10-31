public class Zapato extends Vestimenta{
    //Atributos
    private String material;
    private String tipoCierre;

    //Constructor
    public Zapato(int cod, String nombre, double precio, String marca, int talla, String color, String material, String tipoCierre) {
        super(cod, nombre, precio, marca, talla, color);
        this.material = material;
        this.tipoCierre = tipoCierre;
    }

    //Get Set
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public String getTipoCierre() {
        return tipoCierre;
    }
    public void setTipoCierre(String tipoCierre) {
        this.tipoCierre = tipoCierre;
    }

    //Metodo
    @Override
    public void mostrarMarca() {
        System.out.println( "Estos zapatos son de marca: "+getMarca());
    }
}
