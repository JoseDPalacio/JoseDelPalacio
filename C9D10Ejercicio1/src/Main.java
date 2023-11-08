public class Main {
    public static void main(String[] args) {
        Agente agente1 = new Agente("Agente 1","cliente 1");

        Agente agente2 = new Agente("Agente 2","cliente 2");

        agente1.start();
        agente2.start();
    }
}
