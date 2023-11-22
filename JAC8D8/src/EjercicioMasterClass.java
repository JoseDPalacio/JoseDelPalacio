import Logica.Vehiculo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EjercicioMasterClass {
    public static void main(String[] args) {
        //Crear Lista de vehiculos y cargarla con vehiculos
        List<Vehiculo> vehiculos = Arrays.asList(
                new Vehiculo("Ford", "Fiesta", 1000),
                new Vehiculo("Ford", "Focus", 1200),
                new Vehiculo("Ford", "Explorer", 2500),
                new Vehiculo("Fiat", "Uno", 500),
                new Vehiculo("Fiat", "Cronos", 1000),
                new Vehiculo("Fiat", "Torino", 1250),
                new Vehiculo("Chevrolet", "Aveo", 1250),
                new Vehiculo("Chevrolet", "Spin", 2500),
                new Vehiculo("Toyota", "Corolla", 1200),
                new Vehiculo("Toyota", "Fortuner", 3000),
                new Vehiculo("Renault", "Logan", 950));

        //ordenar por precio de menor a mayor
        vehiculos.sort(Comparator.comparingInt(Vehiculo::getCosto));
        System.out.println("Lista ordenada de menor a mayor");
        mostrarLista(vehiculos);

        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");

        //ordenar por marca y precio
        vehiculos.sort(Comparator.comparing(Vehiculo::getMarca)
                .thenComparingInt(Vehiculo::getCosto));
        System.out.println("Lista por marca y precio");
        mostrarLista(vehiculos);

        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");

        //Filtros
        //Filtro para menor igual a 1000
        List<Vehiculo> menoresIguales1000 = vehiculos.stream()
                .filter(v -> v.getCosto() <=1000)
                .toList();
        System.out.println("Lista de vehiculos solo menores iguales a 1000");
        mostrarLista(menoresIguales1000);

        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");

        //Filtro para mayor a 1000
        List<Vehiculo> mayor1000= vehiculos.stream()
                .filter(v -> v.getCosto()>1000)
                .toList();
        System.out.println("Lista de vehiculos solo mayores a 1000");
        mostrarLista(mayor1000);

        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");

        //Precio medio
        double promedio = vehiculos.stream()
                .mapToDouble(Vehiculo::getCosto)
                .average()
                .orElse(0.00);
        System.out.println("Precio medio es: "+promedio);
    }

    public static void mostrarLista(List<Vehiculo> lista) {
        lista.forEach(vehiculo -> {
            System.out.println("-----------------------------------" + '\n' +
                    vehiculo);
        });
    }
}
