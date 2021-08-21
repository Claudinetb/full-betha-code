package AulaCinco;

public class MatrizMain {
    public static void main(String[] args) {
        double matriz [] [] = new double [4] [4]; //declaracao e construcao da matriz
        for(int i = 0; i < matriz.length; i++) //percorre a matrizno eixo i
        {
            for(int j = 0; j < matriz[i].length; j++) //percorre a matriz no eixo j
            {
                matriz[i] [j] = i*j; //atribui o  valor a ceula
            }
        }
        for(int i = 0; i < matriz.length; i++) //Percorre a matriz do eixo i
        {
            for (int j = 0; j < matriz[i].length; j++) //Percorre a matriz do eixo j
            {
                System.out.println("Valor da Prosição ["+i+", "+j+"]: " +matriz[i][j]);
            }
        }
    }
}
