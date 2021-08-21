package AulaNove;

public class AnimalMain {
    public static void main (String[] Args){

        Animal animal = AnimalBuilder.criaAnimal("Gato", "Snow", "Persa", "Miau", 4);

        System.out.println(animal.getSom());
    }
}
