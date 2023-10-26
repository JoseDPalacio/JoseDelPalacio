/*
Crear 4 objetos Electrodomestico, 3 creados con los parametros y uno sin parametros, mostrar todos
 */
public class Main {
    public static void main(String[] args) {
        //Variables
        Electrodomestico elec1 = new Electrodomestico(1,"Siemens","asfd123","130W","rojo");
        Electrodomestico elec2 = new Electrodomestico(2,"Sony","fghgu657df","180W","verde");
        Electrodomestico elec3 = new Electrodomestico(3,"Fuyitshu","vbnmnmv-g4","30W","blanco");
        Electrodomestico elec4 = new Electrodomestico();

        System.out.println("Codigo: "+elec1.getCod()+", Marca: "+elec1.getMarca()+", Modelo: "+elec1.getModelo()+", Consumo: "+elec1.getConsumo()+", Color: "+elec1.getColor());
        System.out.println("Codigo: "+elec2.getCod()+", Marca: "+elec2.getMarca()+", Modelo: "+elec2.getModelo()+", Consumo: "+elec2.getConsumo()+", Color: "+elec2.getColor());
        System.out.println("Codigo: "+elec3.getCod()+", Marca: "+elec3.getMarca()+", Modelo: "+elec3.getModelo()+", Consumo: "+elec3.getConsumo()+", Color: "+elec3.getColor());
        System.out.println("Codigo: "+elec4.getCod()+", Marca: "+elec4.getMarca()+", Modelo: "+elec4.getModelo()+", Consumo: "+elec4.getConsumo()+", Color: "+elec4.getColor());

        //Para el Elec4 da todo 'null' y codigo '0' por que no tiene ningun atributo dado
    }
}
