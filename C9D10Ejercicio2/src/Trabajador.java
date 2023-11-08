public class Trabajador extends Thread{
    //Atributos
    private String nombre;
    private int idfuncion;

    public Trabajador(String nombre, int idfuncion) {
        this.nombre = nombre;
        this.idfuncion = idfuncion;
    }

    @Override
    public void run() {
        switch (idfuncion) {
            case 1 -> ensamblar();
            case 2 -> comprobar();
            case 3 -> embalar();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private void ensamblar(){
        System.out.println(this.nombre+" esta ensamblando el producto");
    }
    private void comprobar(){
        System.out.println(this.nombre+" esta realizando los controles de calidad");
    }
    private void embalar(){
        System.out.println(this.nombre+" esta embalando el producto");
    }
}
