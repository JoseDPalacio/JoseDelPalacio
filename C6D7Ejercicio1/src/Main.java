import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Variables
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Auto(1, "1234FJH", "Ford", "Mondeo", 2010, 30000.00, 56, 400));
        vehiculos.add(new Auto(2, "5678GRE", "Opel", "Astra", 2019, 35000.00, 60, 200));
        vehiculos.add(new Camioneta(1, "7894EDR", "Toyota", "Hilux", 2020, 55000.00, 75 , 6.6));
        vehiculos.add(new Camioneta(2, "8522DER", "Ford", "Ranger", 2023, 85000.00, 80, 8.6));
        vehiculos.add(new Moto(1, "4567KOI", "Honda", "VFR800", 2020, 24999.99,800, "Cuatro tiempos"));
        vehiculos.add(new Moto(2, "2342ERW", "Aprilia", "RS", 1997, 14990.99, 250, "Dos tiempos"));

        //Resultado
        for (Vehiculo vehiculo: vehiculos){
            System.out.print(vehiculo);
            //Obtenemos los vehiculos electricos
            if(vehiculo instanceof Electrico){
                System.out.println(((Electrico) vehiculo).cargarEnergia());
            }
            else{
                System.out.println(((Combustion)vehiculo).recargarCombustible());
            }
        }
    }
}
