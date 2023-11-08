public class Agente extends Thread {
    //Atributos
    private String nombreAgente;
    private String nombreCliente;
    //private String registro;

    public Agente(String nombreAgente, String nombreCliente) {
        this.nombreAgente = nombreAgente;
        this.nombreCliente = nombreCliente;
    }

    @Override
    public void run() {
        recibirLlamada();
        gestionarConsulta();
        registrar();
    }

    public void recibirLlamada(){
        System.out.println(this.nombreCliente+" esta llamando al agente: "+this.nombreAgente);
    }
    public void gestionarConsulta(){
        System.out.println(this.nombreAgente+": Gestionando consulta de "+this.nombreCliente);
    }
    public void registrar(){
        System.out.println(this.nombreAgente+": Registrando la llamada de "+this.nombreCliente);
    }
}
