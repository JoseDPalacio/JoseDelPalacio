import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Variables
        Reserva reserva = null;
        Scanner sc = new Scanner(System.in);
        String nombre, destino, fechaViaje;
        int cantidadAsientosDeseados;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        //Lectura y recogida
        System.out.println("Por favor escriba su nombre");
        nombre = sc.nextLine();

        System.out.println("Por favor escriba su destino");
        destino= sc.nextLine();

        System.out.println("Por favor escriba la fecha del viaje(formato: dd/MM/yyyy)");
        fechaViaje = sc.nextLine();

        System.out.println("Por favor escriba cuantos asientos desea reservar");
        cantidadAsientosDeseados = sc.nextInt();

        try {
            reserva = new Reserva(nombre, destino, LocalDate.parse(fechaViaje,formatter),cantidadAsientosDeseados);
            reserva.reservar();
        } catch (ReservaInvalidaException e) {
            System.err.println("Error!!!: "+e.getMessage());
        }
        System.out.println(reserva);
    }
}