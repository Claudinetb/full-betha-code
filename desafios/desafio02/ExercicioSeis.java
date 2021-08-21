package desafio2;

public class ExercicioSeis {
    public static void main(String[] args) {

        System.out.println("Verificando se é par");
        for (int x = 15; x <= 35; x++ ) {
            if(x % 2 != 0) { // se o número for ímpar
                System.out.println(Math.pow(x,2)); //eleva na potência
            }
        }

        System.out.println("Pulando de 2 em 2");
        for (int x = 15; x <= 35; x = x+2 ) {
            System.out.println(Math.pow(x,2)); //eleva na potência
        }
    }
}
