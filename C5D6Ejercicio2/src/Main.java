/*
Crear un objeto vector 9, con 3  pares de zapatos, 3 pantalones, 2 camisetas y 1 sombrero, mostra el mensaje de las marcas
 */
public class Main {
    public static void main(String[] args) {
        //Variables
        Vestimenta[] vestimentas = new Vestimenta[9];
        vestimentas[0] = new Zapato(1,"Q",20.99,"A",39,"negro","piel", "cordones");
        vestimentas[1] = new Zapato(2,"W",30.99,"S",45,"marron","latex", "cremallera");
        vestimentas[2] = new Zapato(3,"E",15.99,"D",26,"blanco","polyester", "velcro");
        vestimentas[3] = new Pantalon(4,"R", 23.99,"F",45,"marron","pesquero", "algodon");
        vestimentas[4] = new Pantalon(5,"T", 43.99,"F",50,"negro","chino", "lino");
        vestimentas[5] = new Pantalon(6,"Y", 13.99,"F",25,"azul","fit", "vaquera");
        vestimentas[6] = new Camiseta(7,"U",16.99,"J",46,"blanco","sin manga","ancho");
        vestimentas[7] = new Camiseta(8,"I",56.99,"K",66,"blanco","larga","estrecho");
        vestimentas[8] = new Sombrero(9,"O", 78.99,"L",47,"negro","fedora",12);

        //Resolucion
        for (int i = 0; i < vestimentas.length; i++) {
            vestimentas[i].mostrarMarca();
        }
    }
}
