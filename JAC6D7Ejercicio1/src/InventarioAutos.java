import java.util.ArrayList;
import java.util.List;

public class InventarioAutos<T extends Auto> {
    //Atributo
    private List<T> autos;

    //Constructor
    public InventarioAutos() {
        this.autos = new ArrayList<>();
    }

    //Metodo de agregar = Set
    public void agregarAuto(T auto) {
        autos.add(auto);
        System.out.println("Auto agregado al inventario");
    }

    //Metodos de buscar
    public List<T> buscarAutoMarca(String marca){
        return autos.stream()
                .filter(p->p.getMarca().equalsIgnoreCase(marca))
                .toList();
    }
    public List<T> buscarAutoAnio(int anio){
        return autos.stream()
                .filter(p->p.getAnio()==anio)
                .toList();
    }

    //Metodo de calcular valor total del inventario
    public double valorTotal(){
        return autos.stream()
                .mapToDouble(Auto::getPrecio)
                .sum();
    }
}
