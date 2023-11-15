import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        Evento evento = new Evento("A", LocalDate.of(2023,11,13), "B");
//        System.out.println(evento);

        //Lista de eventos
        List<Evento> eventos = Arrays.asList(
                new Evento("Dentista", LocalDate.of(2023, 9, 13), "cita"),
                new Evento("Clase", LocalDate.of(2023, 10, 21), "reunion"),
                new Evento("Medico", LocalDate.of(2023, 10, 21), "cita"),
                new Evento("Exposicon", LocalDate.of(2023, 11, 23), "Conferencia")
        );

        //Filtrar para una fecha expecifica
        System.out.println("------------Filtro-------------");
        eventos.stream()
                .filter(e -> e.getFecha().equals(LocalDate.of(2023, 10, 21)))
                .forEach(System.out::println);

        //Agrupar y contar los eventos con la misma categoria
        System.out.println("------Agrupar y contar------");
        Map<String, Long> cantidadEventos = eventos.stream()
                .collect(Collectors.groupingBy(Evento::getCategoria, Collectors.counting()));
        System.out.println(cantidadEventos);

        //Encontrar evento mas proximo
        System.out.println("------Encrontrar evento------");
        Evento evento = eventos.stream().min(Comparator.comparing(Evento::getFecha))
                .get();
        System.out.println(evento);
    }
}
