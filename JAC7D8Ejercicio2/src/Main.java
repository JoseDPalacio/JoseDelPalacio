import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Frase de bienvenia
        System.out.println("Bienvenido a la aplicación de organización de tareas.");
        int respuest =1;
        //Lista de Clase Tarea para almacenar todas las tareas que se crearan para luego mostrar por pantalla
        List<Tarea> tareasPrincipales = new ArrayList<>();

        while (respuest==1){
            //Creacion de la tarea principal, que englobara las demas tareas que tiene dentro
            System.out.println("Ingrese el nombre de la tarea principal: ");
            String nombrePrincipal = scanner.nextLine();
            Tarea principal = new Tarea(nombrePrincipal);
            //añadimos los objetos Tarea a una lista para mostrar
            tareasPrincipales.add(principal);
            agregarTareas(principal,scanner);
            System.out.println("Desea seguir creando listas principales? Pulse 1 para Si, 2 para No:");
            respuest = scanner.nextInt();
            scanner.nextLine();
        }


        //Llamado para mostrar todas las listas de tareas principales y sus subtareas
        tareasPrincipales.forEach(t-> t.mostrarEstructura(0));
    }

    // Método recursivo para agregar tareas
    private static void agregarTareas(Tarea tareaPadre, Scanner scanner) {
        int respuesta;

        do {
            System.out.println("¿Desea agregar una subtarea a '" + tareaPadre.getNombre() + "'? Pulse 1 para Si, 2 para No: ");
            respuesta = scanner.nextInt();

            if (respuesta==1) {
                scanner.nextLine();
                System.out.println("Ingrese el nombre de la subtarea: ");
                String nombreSubtarea = scanner.nextLine();
                Tarea nuevaSubtarea = new Tarea(nombreSubtarea);
                tareaPadre.getSubtareas().add(nuevaSubtarea);

                // Llamada recursiva para agregar subtareas a la nueva subtarea
                agregarTareas(nuevaSubtarea, scanner);
            }
        }while (respuesta==1);

    }
}
