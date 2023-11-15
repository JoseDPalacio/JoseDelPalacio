import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RegistroMascotas {
   private List<Mascota<?>> mascotas;

   //Constructor
    public RegistroMascotas() {
        this.mascotas= new ArrayList<>();
    }

    public List<Mascota<?>> getMascotas() {
        return mascotas;
    }

    //Metodo Agregar
    public void agregarMascota(Mascota<?> mascota) {
        mascotas.add(mascota);
        System.out.println("Mascota con nombre: '"+mascota.getNombre()+"' agregada");
    }

    //Metodos Buscar
    public List<Mascota<?>> buscarPorNombre(String nombre) {
        return mascotas.stream()
                .filter(m-> m.getNombre().equalsIgnoreCase(nombre))
                .toList();
    }
    public List<Mascota<?>> buscarPorEspecie(String especie) {
        return mascotas.stream()
                .filter(m-> m.getEspecie().equalsIgnoreCase(especie))
                .toList();
    }

    //Metodo de contar total de registros
    public void totalRegistros(){
        System.out.println("Total de mascotas registradas es: "+mascotas.size());
    }

    //Metodo de generar datos aleatorios
    public void generarMascotasAleatorias(int cantidad){
        Random random = new Random();
        List<String> nombres = Arrays.asList("Max","Bella","Luna","Lana","Chachito","Dragjeweled");
        List<String> especies = Arrays.asList("Perro", "Gato", "Reptil", "Ave");
        for (int i=0; i<cantidad;i++){
            agregarMascota(new Mascota<>(((i+cantidad)*10),  //el id de los aleatorios empieza en 30
                    nombres.get(random.nextInt(nombres.size())),
                    random.nextInt(10)+1,
                    especies.get(random.nextInt(especies.size())))
            );
        }
    }
}
