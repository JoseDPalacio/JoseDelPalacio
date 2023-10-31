import java.util.Scanner;

/*
bucle para un comercio para ingresar precio de productos y mostrar el total de lo que debe
 */
public class Main {
    public static void main(String[] args) {
        //Variables
        double precioIngresado;
        double precioTotal = 0;
        Scanner sc = new Scanner(System.in);

        //Lectura
        System.out.println("Ingrese el precio del primer producto");
        precioIngresado = sc.nextDouble();

        //Resolucion
        while (precioIngresado>=0){
            precioTotal += precioIngresado;
            System.out.println("Ingrese otro precio o -1 para finalizar");
            precioIngresado = sc.nextDouble();
        }

        //Resultado
        System.out.println("El Precio total es: "+precioTotal);
    }
}