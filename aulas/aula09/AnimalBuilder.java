package AulaNove;

public class AnimalBuilder {

    public static Animal criaAnimal(String tipo, String nome, String raca, String som, Integer qtdPatas) {
        if (tipo.equals("Gato")) {
            return new Gato(nome, raca, som, qtdPatas);
        }

        if (tipo.equals("Cachorro")) {
            return new Cachorro(nome, raca, som, qtdPatas);
        }

        if (tipo.equals("Jacare")) {
            return new Jacare(nome, raca, som, qtdPatas);

        }

        return new Animal(nome,raca,som,qtdPatas);


    }
}