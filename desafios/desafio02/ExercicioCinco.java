package desafio2;

import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {
        float h, b, B, area = 0;

        Scanner s = new Scanner(System.in);
        System.out.print("Informe o valor da altura: ");
        h = s.nextFloat();
        System.out.print("Informe o valor da base menor: ");
        b = s.nextFloat();
        System.out.print("Informe o valor da base maior: ");
        B = s.nextFloat();

        area = (h*(b+B))/2;

        System.out.println("Área é: " + area);

    }
}
