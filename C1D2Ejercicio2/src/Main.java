//Compañero Sol Lereah y Óscar Cuenca Martin
//EL programa se rompe  porque  no puede convertir el tipo de dato. Esto se genera en todas las situaciones debido a que Java es un lenguaje fuertemente tipado y no puede convertir el tipo de dato una vez asignado

public class Main {
    public static void main(String[] args) {
        //Varibles
        int entero = 5;
        double numero = 5.4;
        boolean condicional = true;
        String palabra = "hola";

        System.out.println("Esto es una variable tipo entero: "+entero);
        System.out.println("Esto es una variable de tipo double: "+numero);
        System.out.println("Esto es una variable de tipo boolean: "+condicional);
        System.out.println("Esto es una variable de tipo string: "+palabra);

        //Variables pero mal
        int ent = "hola";
        String palabra1 = 25;
        String palabra2 = 25.5;

    }
}
