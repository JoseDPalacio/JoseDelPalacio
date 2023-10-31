import java.util.Scanner;
//Compañero Sol Lereah y Óscar Cuenca Martín
//para evitar dividir por cero se puede hacer que en la segundad lectura de número pedir que no ingresen un cero

public class Main {
    public static void main(String[] args) {
        //variables
        int num1, num2;
        int suma, resta, multi;
        double divi;
        Scanner sc = new Scanner(System.in);

        //Lectura
        System.out.println("Por favor escriba el primer número");
        num1 = sc.nextInt();

        System.out.println("Por favor escriba el segundo número");
        num2 = sc.nextInt();

        //Resultado
        suma = num1+num2;
        System.out.println("La suma es: "+suma);

        resta = num1-num2;
        System.out.println("La resta es: "+resta);

        multi = num1*num2;
        System.out.println("La multiplicacion es: "+multi);

        divi = (double) num1/num2;
        System.out.println("La division es: "+divi);
    }
}
