package org.ejercicio;

import org.ejercicio.logica.Platillo;
import org.ejercicio.persistencia.ControladoraPersistencia;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo!!!");

        ControladoraPersistencia contoladora = new ControladoraPersistencia();

        //Objetos platillos
        Platillo platillo1 = new Platillo(1L, "pizza", "simple", 10.59);
        Platillo platillo2 = new Platillo(2L, "macarrones", "compleja", 20.56);
        Platillo platillo3 = new Platillo(3L, "arroz", "simple", 15.53);

        //insert
        System.out.println("Vamos a insertar los platillos");
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
        contoladora.crearPlatillo(platillo1);
        contoladora.crearPlatillo(platillo2);
        contoladora.crearPlatillo(platillo3);

        //delete
        System.out.println("Vamos a eliminar el primer platillo");
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
        contoladora.eliminarPlatillo(platillo1.getId());

        //update
        System.out.println("Vamos a actualizar el nombre del segundo platillo");
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
        platillo2.setNombre("Espaguetis");
        contoladora.editarPlatillo(platillo2);

        //select
        System.out.println("Vamos a mostrar todos los platillos");
        List<Platillo> platillos = contoladora.listarPlatillos();
        System.out.println("---------------------------------------");
        for (Platillo platillo : platillos) {
            System.out.println(platillo);
            System.out.println("---------------------------------------");
        }


    }
}
