import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Variable
        Producto producto = null;
        Scanner sc = new Scanner(System.in);
        String nombre;
        double precio;
        int stock;

        try {
            System.out.println("Por favor escriba el nombre del producto");
            nombre= sc.nextLine();
            System.out.println("Por favor escriba el precio del producto");
            precio = sc.nextInt();
            System.out.println("Por favor escriba el stock del producto");
            stock = sc.nextInt();
            producto = new Producto(nombre,precio,stock);
        }catch (InventarioException ie){
            System.err.println("Error!!!: "+ie.getMessage());
        }catch (InputMismatchException ime){
            System.err.println("A ingresado letras en un campo numerico");
        }
    }
}