package exerciciosaula19;

import java.util.Scanner;

/*25. Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho, obedecendo as seguintes regras de formação:
a) B i deverá receber 1 quando A i for par; b) B i deverá receber 0
quando Ai for ímpar.*/
public class exercicio25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        for(int i=0;i<vetorA.length;i++){
            System.out.println("Informe um número: ");
            vetorA[i] = scan.nextInt();

             if (vetorA[i] % 2 == 0) {
                 vetorB[i] = 1;
             } else {
                 vetorB[i] = 0;
             }
        }

        for (int i=0;i<vetorA.length;i++) {
            System.out.print("Vetor B: " + vetorB[i]+",");
        }
    }
}
