import java.util.Scanner;

/*
Condinioal de mayoria de eda para un local
 */
public class Main {
    public static void main(String[] args) {
        //Variables
        int edad;
        Scanner sc = new Scanner(System.in);

        //Lectura
        System.out.println("Por favor ingrese su edad");
        edad = sc.nextInt();

        //Resultado
        if (edad>=18){
            System.out.println("Eres mayor de edad, puedes pasar al evento");
        } else {
            System.out.println("Eres menor de edad, no puedes pasr al evento");
        }
    }
}