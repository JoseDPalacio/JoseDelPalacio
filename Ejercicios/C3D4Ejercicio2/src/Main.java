import java.util.Scanner;

/*
Vector 5 de objetos Persona, mostrarlos solo nombre y edad, cambiar el nombre de 2 de ellos mostrando el antes y el despues, mostrar unicamente a los mayores de 30
 */
public class Main {
    public static void main(String[] args) {
        //Variables
        Scanner sc = new Scanner(System.in);
        String nuevoNombre;
        int id;
        Persona[] personas = new Persona[5];
        Persona persona1 = new Persona(1,"Q",28,"Calle Q", 123456);
        Persona persona2 = new Persona(2,"W",16,"Calle W", 456789);
        Persona persona3 = new Persona(3,"E",39,"Calle E", 789123);
        Persona persona4 = new Persona(4,"R",105,"Calle R", 456852);
        Persona persona5 = new Persona(5,"T",45,"Calle T", 159357);

        personas[0]=persona1;
        personas[1]=persona2;
        personas[2]=persona3;
        personas[3]=persona4;
        personas[4]=persona5;

        //Mostrar
        for (Persona listapersonas: personas) {
            System.out.println("Nombre: "+listapersonas.getNombre()+", Edad: "+listapersonas.getEdad());
        }

        //Modificar nombre
        System.out.println("Ahora vamos a modificar el nombre de 2 personas");
        for (int i = 0; i < 2; i++) {
            System.out.println("Por favor escriba el ID de la persona que quiere cambiar:");
            id = sc.nextInt()-1;
            System.out.println("A seleccionado a: "+personas[id].getNombre());
            System.out.println("Por favor escriba el nuevo nombre:");
            sc.nextLine(); //sentencia para limpiar el buffer de escritura
            nuevoNombre = sc.nextLine();
            personas[id].setNombre(nuevoNombre);
            System.out.println("La persona con ID: "+personas[id].getId()+", su nuevo nombre es: "+personas[id].getNombre());
        }

        //Mostrar solo a los >=30
        for (Persona listapersonas: personas) {
            if (listapersonas.getEdad()>=30){
                System.out.println("Nombre: "+listapersonas.getNombre()+", Edad: "+listapersonas.getEdad());
            }
        }
    }
}
