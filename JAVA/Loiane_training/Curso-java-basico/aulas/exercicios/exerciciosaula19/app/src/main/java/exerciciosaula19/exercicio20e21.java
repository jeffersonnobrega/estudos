package exerciciosaula19;

import java.util.Scanner;

/*20. Implementar um programa que obtenha a cotação do dólar (U$) em
relação ao real (R$) e a seguir armazene em vetor A com 20
elementos as seguintes conversões:
21. A[i] = cotação do dolar * i,// para
/*todo i variando de 1 até 20*/
public class exercicio20e21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double cotacao;
        double[] vetorA = new double[20];

        System.out.println("Informe a cotação do dólar em relação ao real: ");
        cotacao = scan.nextDouble();

        for(int i=0;i<vetorA.length;i++) {
            vetorA[i] = cotacao * (i+1);
            System.out.println("Resultado " + vetorA[i] + " dólares");
        }

    }
}
