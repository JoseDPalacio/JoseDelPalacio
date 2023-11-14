import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Lista de empleados
        List<Empleado> empleados = Arrays.asList(
                new Empleado("Alfonso", 23000,"Desarrollador"),
                new Empleado("Josefina", 28000,"Desarrollador"),
                new Empleado("Rodolfo", 35000, "Gerente"),
                new Empleado("Adolfo", 33000,"Gerente"),
                new Empleado("Marta", 22000,"Analista"),
                new Empleado("Marcelo", 24000, "Analista")
        );

        //Filtro de salario
        System.out.println("------------Filtro-------------");
        empleados.stream()
                .filter(e -> e.getSalario()>24000)
                .forEach(System.out::println);

        //Agrupar empleados por categoria y calcula el salario promedio
        System.out.println("------Salario promedio------");
        Map<String, Double> cantidadCategoria = empleados.stream()
                .collect(Collectors.groupingBy(Empleado::getCategoria, Collectors.averagingInt(Empleado::getSalario)));
        System.out.println(cantidadCategoria);

        //Empleado con el salario mas alto
        Empleado empleado = empleados.stream()
                .max(Comparator.comparing(Empleado::getSalario))
                .orElseThrow();
        System.out.println("El empleado con el salario mas alto es: "+empleado.getNombre());
    }
}
