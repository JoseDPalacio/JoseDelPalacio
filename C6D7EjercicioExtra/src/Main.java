import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        //Variables
        double maxVenta, minCosto;
        int idPvMax, idPcMin;
        Producto producto1 = new Producto(1, "D", "lenovo", "laptop", 250.99, 350.99, 100);
        Producto producto2 = new Producto(2, "L", "dyson", "aspiradora", 220.99, 550.99, 500);
        Producto producto3 = new Producto(3, "C", "siemens", "secadora", 450.99, 650.99, 10);
        Producto producto4 = new Producto(4, "Q", "btis", "auriculares", 150.99, 199.99, 180);
        Producto producto5 = new Producto(5, "W", "Sony", "tv", 250.99, 450.99, 300);
        Producto producto6 = new Producto(6, "E", "benq", "pantalla", 50.99, 99.99, 1000);
        Producto producto7 = new Producto(7, "R", "parasonic", "estereo", 300.99, 340.99, 250);
        Producto producto8 = new Producto(8, "T", "fuyitsu", "a/c", 255.99, 330.99, 130);
        Producto producto9 = new Producto(9, "Y", "hp", "laptop", 250.99, 390.99, 15);
        Producto producto10 = new Producto(10, "U", "nintendo", "switch", 150.99, 200.99, 140);
        ArrayList<Producto> productos = new ArrayList<>();

        //Guardar productos
        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
        productos.add(producto4);
        productos.add(producto5);
        productos.add(producto6);
        productos.add(producto7);
        productos.add(producto8);
        productos.add(producto9);
        productos.add(producto10);


        //Determinar el producto con mayor precio de venta
        Producto producto = Collections.max(productos, new Comparator<Producto>() {
            @Override
            public int compare(Producto o1, Producto o2) {
                return Double.compare(o1.getPrecioVenta(), o2.getPrecioVenta());
            }
        });
        maxVenta = producto.getPrecioVenta();
        idPvMax = producto.getId();
        System.out.println(idPvMax + " " + maxVenta);

        //Determinar el producto con menor precio de costo
        producto = Collections.min(productos, new Comparator<Producto>() {
            @Override
            public int compare(Producto o1, Producto o2) {
                return Double.compare(o1.getPrecioVenta(), o2.getPrecioVenta());
            }
        });
        minCosto = producto.getPrecioCosto();
        idPcMin = producto.getId();
        System.out.println(idPcMin + " " + minCosto);

        //Borrar el producto en la posicion 5 del arraylist
        productos.remove(4);

        //Determinar el producto con mayor stock, quitarle 3 y mostrarlo actualizado
        producto = Collections.max(productos, new Comparator<Producto>() {
            @Override
            public int compare(Producto o1, Producto o2) {
                return Integer.compare(o1.getStock(), o2.getStock());
            }
        });
        System.out.println(producto.getStock());
        producto.setStock(producto.getStock()-3);
        System.out.println(producto.getStock());
    }
}
