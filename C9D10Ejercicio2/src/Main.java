public class Main {
    public static void main(String[] args) {
        Trabajador trabajador1 = new Trabajador("Trabajador 1", 1);
        Trabajador trabajador2 = new Trabajador("Trabajador 2", 2);
        Trabajador trabajador3 = new Trabajador("Trabajador 3", 3);

        try {
            trabajador1.start();
            trabajador1.join();

            trabajador2.start();
            trabajador2.join();

            trabajador3.start();
            trabajador3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
