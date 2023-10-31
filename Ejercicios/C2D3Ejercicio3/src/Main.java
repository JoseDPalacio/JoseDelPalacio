import java.util.Scanner;

/*
vector  que almacena las las temperaturas max de la semana y muestra la temp max promedio
 */
public class Main {
    public static void main(String[] args) {
        //Variables
        double[] temperaturas = new double[7];
        double tempMax = 0;
        double tempMaxPromedio;
        Scanner sc = new Scanner(System.in);

        //Lectura
        for(int i=0; i<temperaturas.length; i++){
            System.out.println("Por favor ingrese la temperatura maxiam de ese dia");
            temperaturas[i]=sc.nextDouble();
        }

        //Resolucion
        for(int i=0; i<temperaturas.length; i++){
            tempMax+=temperaturas[i];
        }

        //Reslutado
        tempMaxPromedio = tempMax/temperaturas.length;
        System.out.println("La temperatura maxima promedio de la semana fue: "+tempMaxPromedio);
    }
}