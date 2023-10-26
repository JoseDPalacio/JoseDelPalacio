import java.util.Scanner;
//Compañero Óscar Cuenca Matrín

/*
Matriz de reserva de butacas, la matriz es el mapa de las butacas de 5x5, 'O' esta vacia 'X' ocupada, el encargado decide cuando finaliza, siempre tiene que mostrar el mapa antes de seleccionar
 */
public class Main {
    public static void main(String[] args) {
        //Variables
        String[][] mapaButacas = new String[5][5];
        int fila, columna;
        String centinela = "continuar";
        Scanner sc = new Scanner(System.in);

        //Mapa butacas sinreservar
        //recorer fila
        for (int i = 0; i < mapaButacas.length; i++) {
            //Recorrer columna
            for (int j = 0; j < mapaButacas.length; j++) {
                mapaButacas[i][j] = "O";
            }
        }
        //bucle para hacer el llenado de las reservas
        do {
            //Mostrar mapa
            for (int i = 0; i < mapaButacas.length; i++) {
                //Recorrer columna
                for (int j = 0; j < mapaButacas.length; j++) {
                    System.out.print("[" + mapaButacas[i][j] + "]");
                }
                System.out.println();
            }

            //Lectura
            System.out.println("Por favor elija fila");
            fila = sc.nextInt()-1;
            System.out.println("Por favor eliga columna");
            columna = sc.nextInt()-1;

            //Resolucion
            if (mapaButacas[fila][columna].equals("O")){
                mapaButacas[fila][columna]="X";
                System.out.println("Ya te hemos reservado la butaca");
            }else {
                System.out.println("La butaca ya esta reservada, por favor seleccione otra butaca");
            }


            System.out.println("Escriba 'final' para terminar");
            sc.nextLine();
            centinela = sc.nextLine();
        }while (!centinela.equals("final"));

        //Mostrar mapa
        System.out.println("Mapa final de butacas");
        for (int i = 0; i < mapaButacas.length; i++) {
            //Recorrer columna
            for (int j = 0; j < mapaButacas.length; j++) {
                System.out.print("[" + mapaButacas[i][j] + "]");
            }
            System.out.println();
        }
    }
}