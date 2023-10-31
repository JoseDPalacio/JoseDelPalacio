public class Electrodomestico {
    //Atributos
    private int cod;
    private String marca;
    private String modelo;
    private String consumo;
    private String color;

    //Constructor

    public Electrodomestico() {
    }

    public Electrodomestico(int cod, String marca, String modelo, String consumo, String color) {
        this.cod = cod;
        this.marca = marca;
        this.modelo = modelo;
        this.consumo = consumo;
        this.color = color;
    }

    //Get

    public int getCod() {
        return cod;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getConsumo() {
        return consumo;
    }

    public String getColor() {
        return color;
    }
}
