package desafio2;

import java.util.Scanner;

public class ExercicioQuatro {
    public static void main (String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Digite um número: ");
        String numero = s.next();
        if(numero.length() > 4) { // verifica se o tamanho está correto
            System.out.println("O número deve ter no máximo 4 posições");
        } else {
            String[] stringArray = numero.split(""); // divide a string em caracteres
            String novoNumero = "";
            for (int x = numero.length() -1; x >= 0; x-- ) { //percorre o for ao contrário
                novoNumero = novoNumero + stringArray[x];
            }
            System.out.println(novoNumero);
        }

    }
}
