package AulaSete;

public class AnimalMain {
    public static void main(String[] Args){
        Animal animal = new Animal();
        animal.nome = "Toto";
        animal.altura = 0.47;
        animal.peso = 20.1;
        animal.Som = "Auauauauauau";


        animal.getSom();
        animal.pular(10.0);

    }

    public static class Animal {
        String nome;
        Double peso;
        Double altura;
        String Som;

        public void getSom() {
            System.out.println(Som);

    }
        public void pular(Double alturaPulo) {
           System.out.println("O animal pula nessa " + alturaPulo + " altura!");

        }


    }

}

