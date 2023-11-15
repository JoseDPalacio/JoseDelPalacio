public class Main {
    public static void main(String[] args) {
        RegistroMascotas registroMascotas = new RegistroMascotas();

        //Agregar mascotas
        registroMascotas.agregarMascota(new Mascota<>(1,"Pepo",5,"perro"));
        registroMascotas.agregarMascota(new Mascota<>(2,"Misufu",3,"gato"));
        registroMascotas.agregarMascota(new Mascota<>(3,"Desdentado",8,"reptil"));
        registroMascotas.agregarMascota(new Mascota<>(4,"Rodolfo",1,"ave"));

        //Buscar mascotas por nombre
        System.out.println("------Busqueda por nombre----------");
        registroMascotas.buscarPorNombre("rodolfo").forEach(System.out::println);

        //Buscar mascota por especie
        System.out.println("------Busqueda por especie----------");
        registroMascotas.buscarPorEspecie("perro").forEach(System.out::println);

        //Cantidad de mascotas registradas
        System.out.println("------Total de mascotas----------");
        registroMascotas.totalRegistros();

        //Generar mascotas aleatorias, hay que expecificar cuantas queremos crear
        System.out.println("----------------");
        registroMascotas.generarMascotasAleatorias(3);
        registroMascotas.getMascotas().stream()
                .filter(m->m.getId()>=30)        //esto es por como esta hecho mi programa, que los aleatorios empiezan con id 30 o superior
                .forEach(System.out::println);
    }
}
