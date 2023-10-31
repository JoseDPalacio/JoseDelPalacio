public class Ave extends Animal{
    //Atributos
    private int envergaduraAla;
    private String tipoVuelo;
    private String colorPluma;
    private String tipoPico;

    //Constructor
    public Ave(int id, String nombre, int edad, String tipoPiel, String tipoAlimentacion, int envergaduraAla, String tipoVuelo, String colorPluma, String tipoPico) {
        super(id, nombre, edad, tipoPiel, tipoAlimentacion);
        this.envergaduraAla = envergaduraAla;
        this.tipoVuelo = tipoVuelo;
        this.colorPluma = colorPluma;
        this.tipoPico = tipoPico;
    }

    //Get Set
    public int getEnvergaduraAla() {
        return envergaduraAla;
    }
    public void setEnvergaduraAla(int envergaduraAla) {
        this.envergaduraAla = envergaduraAla;
    }
    public String getTipoVuelo() {
        return tipoVuelo;
    }
    public void setTipoVuelo(String tipoVuelo) {
        this.tipoVuelo = tipoVuelo;
    }
    public String getColorPluma() {
        return colorPluma;
    }
    public void setColorPluma(String colorPluma) {
        this.colorPluma = colorPluma;
    }
    public String getTipoPico() {
        return tipoPico;
    }
    public void setTipoPico(String tipoPico) {
        this.tipoPico = tipoPico;
    }

    //Metodos
    @Override
    public void saludar() {
        System.out.println("Hola, soy un Ave");
    }
}
