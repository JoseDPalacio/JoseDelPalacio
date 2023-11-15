public class Main {
    public static void main(String[] args) {
        //Crear inventario de autos
        InventarioAutos<Auto> inventarioAutos = new InventarioAutos<>();
        inventarioAutos.agregarAuto(new Auto("Kia", "Sport",2015, 20000.00));
        inventarioAutos.agregarAuto(new Auto("Toyota", "Corolla",2019, 30000.00));
        inventarioAutos.agregarAuto(new Auto("Mercedes", "Clase-c",2014, 45000.00));
        inventarioAutos.agregarAuto(new Auto("Kia", "Niro",2018, 27000.00));
        inventarioAutos.agregarAuto(new Auto("Toyota", "Supra",2013, 15000.00));
        inventarioAutos.agregarAuto(new Auto("Mercedes", "Clase-a",2023, 65000.00));

        //Buscar
        inventarioAutos.buscarAutoMarca("kia").forEach(System.out::println);
        inventarioAutos.buscarAutoAnio(2019).forEach(System.out::println);

        //Valor Total del inventario
        double total = inventarioAutos.valorTotal();
        System.out.println("--------------");
        System.out.println("El valor total del inventario es: "+total);
    }
}
