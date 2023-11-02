import java.util.Collection;

//código, nombre, marca, tipo, precio costo, precio venta, cantidad en stock.
public class Producto {
    //Atributos
    private int id;
    private String nombre;
    private String marca;
    private String tipo;
    private double precioCosto;
    private double precioVenta;
    private int stock;

    //Constructor
    public Producto(int id, String nombre, String marca, String tipo, double precioCosto, double precioVenta, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.tipo = tipo;
        this.precioCosto = precioCosto;
        this.precioVenta = precioVenta;
        this.stock = stock;
    }

    //Get Set
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(double precioCosto) {
        this.precioCosto = precioCosto;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    //Metodos
    public double devolverPrecioVenta(){
        return this.precioVenta;
    }
}
