/*
1- Crear un objeto de mamifero, ave y reptil, usra el metodo saludar
2- Crear objeto animal y asignarselo a mamifero
3- Modificar el metodo saludar de public a private
 */
public class Main {
    public static void main(String[] args) {
        //Variables
        Mamifero mamifero = new Mamifero(1,"QWERTY",5,"pelaje","Hervivoro",4,"Viviparo","gris", "Estepa");
        Ave ave = new Ave(2,"ASDFG",3,"plumaje","insectivoro",12,"bajo","azulGrana", "picudo");
        Reptil reptil = new Reptil(3,"ZXCVB", 6,"escamas","carnivoro",45,"fina","no veneno","prado");

        //Resolucion 1
        mamifero.saludar();
        ave.saludar();
        reptil.saludar();

        //Resolucion 2
        //mamifero = new Animal(1, "UIOP", 5, "Peludo","carnivoro");
        //Da error, pide que se castee a tipo Mamifero, o que se cambie la variable 'mamifero' a tipo Animal, o animal a Mamifero

        //Resolucion 3
        //Da error, dice que el metodo no esta implementado o sobreescrito
    }
}
