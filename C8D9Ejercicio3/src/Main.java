import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Variables
        int[] telefonos = new int[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lista para 10 numeros de telefonos");
        try {
            for (int i = 0; i < telefonos.length; i++) {
                System.out.println("Por favor escriba el numero de letefono que desea guardar");
                telefonos[i]=scanner.nextInt();
            }
            System.out.println("Telefonos guardados" +'\n'+
                    "Escriba el indice del numero que quiere ver");
            System.out.println(telefonos[scanner.nextInt()-1]);
        }catch (InputMismatchException ime){
            System.err.println("Error!!: has escrito letras en un campo de numeros");
        }
        catch (ArrayIndexOutOfBoundsException aiobe){
            System.err.println("Error!!: no existe telefono guardado en ese indice");
        }

    }
}