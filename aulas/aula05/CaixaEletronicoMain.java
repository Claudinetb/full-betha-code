package AulaCinco;

public class CaixaEletronicoMain {
    public static void main(String[] args) {
        int[] cedulas = {100, 50, 20, 10, 5, 2, 1}; // Cedulas disponiveis no caixa eletronico
        int quantidadeTotal = 0; // Quantidade total de cedulas entregues ao cliente
        int valorReais = 163; // valor a ser sacado pelo cliente
        for (int i = 0; i < cedulas.length; i++) { // quantidade de cedulas para o valor cedulas[i]
            int quantidadeCedulas = valorReais / cedulas[i];//impressao da quantidade de cedulas
            System.out.println("Quantidade de cedulas de " + cedulas[i] + ": " + quantidadeCedulas);
            valorReais %= cedulas[i]; // Resto da divisão
            quantidadeTotal += quantidadeCedulas; //Quantidade total de cedulas entregues ao cliente
        }
        System.out.println("Quantidade total: " + quantidadeTotal); //Impressão
    }
}
