public class Producto {
    //Atributos
    private String nombre;
    private double precio;
    private int stock;

    //constructor
    public Producto(String nombre, double precio, int stock) throws InventarioException {
        if (nombre.isEmpty()){
            throw new InventarioException("El campo de nombre no puede estar vacio");
        }
        if (precio<=0.00){
            throw new InventarioException("El precio del producto no puede ser 0 o menos");
        }
        if (stock <0){
            throw new InventarioException("El stock del producto no puede ser menor a 0");
        }
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    //Getter & Setter
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

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                '}';
    }
}
