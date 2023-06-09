package exerciciosaula19;

import java.util.Scanner;

/**. Ler um vetor A com 10 elementos. Construir um vetor B de mesmo tipo
 e tamanho, sendo que cada elemento de B deverá ser o seguinte
 somatório: vetorBi = Somatório de Aj, */

public class exercicio38 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[4];
        int[] vetorB = new int[vetorA.length];
        int i = 0;

        for( ;i<vetorA.length;i++){
            System.out.println("Informe o VetorA[" + (i+1) + "]: ");
            vetorA[i] = scan.nextInt();
        }
        // Bi = vetorA[i] + j, para todo j variando de i até 10
        for(i=0;i<vetorA.length;i++ ) {
            for(int j=i;j<=vetorA.length;j++) {
                vetorB[i] += vetorA[i] + j;
            }
        }

        for(i=0;i< vetorA.length;i++) {
            System.out.println("Vetor A[" + i + "]: " + vetorA[i] + " | Vetor B [" + i + "]: " + vetorB[i]);
        }

    }
}
