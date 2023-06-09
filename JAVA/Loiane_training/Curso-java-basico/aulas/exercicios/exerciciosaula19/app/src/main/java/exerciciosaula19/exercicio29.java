package exerciciosaula19;

import java.util.Scanner;

/*29. Ler dois vetores A e B com 10 elementos cada. Construir um vetor C,
sendo este a junção dos dois outros vetores. Os primeiros 10
elementos de C deverão receber os elementos de A e os últimos
elementos C deverão receber os elementos de B. Desta forma, C
deverá ter o dobro de elementos de A e B, ou seja, 20 elementos.*/
public class exercicio29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[4];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length * 2];
        int i=0;

        for(i=0;i< vetorA.length;i++) {
            System.out.println("Informe o número do índice [" + (i+1) + "] do VetorA: ");
            vetorA[i] = scan.nextInt();
        }

        for(i=0;i< vetorA.length;i++) {
            System.out.println("Informe o número do índice [" + (i+1) + "] do VetorB: ");
            vetorB[i] = scan.nextInt();
        }

        for(i=0;i<vetorA.length;i++) {
            vetorC[i] = vetorA[i];
        }

        for(i=0;i<vetorA.length;i++) {
            vetorC[i+4] = vetorB[i];
        }

        for(i=0;i< vetorC.length;i++) {
            System.out.println("Vetor C: " + vetorC[i]);
        }
    }
}
