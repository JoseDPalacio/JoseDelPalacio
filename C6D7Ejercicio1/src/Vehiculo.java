//id, placa, marca, modelo, año, costo. Establecer un método abstracto para calcular la antigüedad del vehiculo.
public abstract class Vehiculo {
    //Atributos
    private int id;
    private String placa;
    private String marca;
    private String modelo;
    private int fechaFrabicacion;
    private double costo;

    //Constructor
    public Vehiculo(int id, String placa, String marca, String modelo, int fechaFrabicacion, double costo) {
        this.id = id;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.fechaFrabicacion = fechaFrabicacion;
        this.costo = costo;
    }

    //Get
    public int getId() {
        return id;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getFechaFrabicacion() {
        return fechaFrabicacion;
    }

    public double getCosto() {
        return costo;
    }

    //Metodos
    @Override
    public String toString() {
        return  '\n' +
                "placa: " + placa + '\n' +
                "marca: " + marca + '\n' +
                "modelo: " + modelo + '\n' +
                "fechaFrabicacion: " + fechaFrabicacion + '\n' +
                "costo: " + costo + '\n' +
                "antiguedad: " + calcularFechaAntiguedad() + '\n';
    }

    //Metodos Abstractos
    public abstract String calcularFechaAntiguedad();

}
