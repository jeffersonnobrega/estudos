package exerciciosaula19;

import java.util.Scanner;

/** Criar um vetor A com 10 elementos inteiros. Escreva um programa que
 imprima cada elemento do vetor A e a relação de todos os divisores do
 respectivo elemento*/
public class exercicio35 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[3];

        for (int i=0;i<vetorA.length;i++){
            System.out.println("Informe o vetor A[" + (i+1) + "]: ");
            vetorA[i] = scan.nextInt();
        }

        for (int i=0;i<vetorA.length;i++) {
            System.out.print("vetor A[" + (i+1) + "]= " + vetorA[i] + " Divisores: ");
                for (int j=1;j<=vetorA[i];j++) {
                    if(vetorA[i] % j == 0) {
                        System.out.print(j + ", ");
                    }
                }
            System.out.println(" ");
        }
    }
}
