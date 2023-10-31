public class Vestimenta {
    //Atributos
    private int cod;
    private String nombre;
    private double precio;
    private String marca;
    private int talla;
    private String color;

    //Cosntructor
    public Vestimenta(int cod, String nombre, double precio, String marca, int talla, String color) {
        this.cod = cod;
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.talla = talla;
        this.color = color;
    }

    //Get Set
    public int getCod() {
        return cod;
    }
    public void setCod(int cod) {
        this.cod = cod;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getTalla() {
        return talla;
    }
    public void setTalla(int talla) {
        this.talla = talla;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    //Metodos
    public void mostrarMarca(){
        System.out.println("Vestimenta generica");
    }

}
