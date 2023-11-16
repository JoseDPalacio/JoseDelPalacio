import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Crear directorio principal
        Directorio directorioPrincipal = new Directorio("Principal");

        //Crear las listas de subdirectorios y ficheros del directorio principal
        List<Directorio> subDirectoriosPrincipal = Arrays.asList(
                new Directorio("Subdirectorio-1"),          //Subdirectorio1 directorios y archivos
                new Directorio("Subdirectorio-2"),          //Subdirectorio2 solo archivos
                new Directorio("Subdirectorio-3")           //vacio
        );
        List<String> archivosPrincipal = Arrays.asList(
                "Archivo-Principal-1",
                "Archivo-Principal-2",
                "Archivo-Principal-3",
                "Archivo-Principal-4"
        );
        //Cargar directorios y archivos a principal
        directorioPrincipal.setSubdirectorios(subDirectoriosPrincipal);
        directorioPrincipal.setArchivos(archivosPrincipal);

        //Crear directorios y archivos para los subDiretorios1
        List<Directorio> subSubDirectorio1 = Arrays.asList(
                new Directorio("Sub-Subdirectorio-1-1"),
                new Directorio("Sub-Subdirectorio-1-2")
        );
        List<String> archivosSubDirectorio1 = Arrays.asList(
                "Archivo-SubDirectorio1-1",
                "Archivo-SubDirectorio1-2"
        );
        //Cargar directorios y archivos a subDirectorio1
        directorioPrincipal.getSubdirectorios().get(0).setSubdirectorios(subSubDirectorio1);
        directorioPrincipal.getSubdirectorios().get(0).setArchivos(archivosSubDirectorio1);

        //Crear archivos para los subDiretorios
        List<String> archivosSubDirectorio2 = Arrays.asList(
                "Archivo-SubDirectorio2-1",
                "Archivo-SubDirectorio2-2",
                "Archivo-SubDirectorio2-3"
        );
        directorioPrincipal.getSubdirectorios().get(1).setArchivos(archivosSubDirectorio2);

        //System.out.println(directorioPrincipal);
        directorioPrincipal.mostrarEstructura(0);
    }
}
