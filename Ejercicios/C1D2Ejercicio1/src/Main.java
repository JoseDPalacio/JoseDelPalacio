import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Varianles
        String nombre;
        Scanner sc = new Scanner(System.in);

        System.out.println("Hola, bienvenido al sistema");

        //Lectura
        System.out.println("Por favor escriba su nombre");
        nombre = sc.nextLine();

        //Resultado
        System.out.println("Hola "+nombre+", bienvenido al sistema");
    }
}
