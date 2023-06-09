package exerciciosaula19;

import java.util.Scanner;

/* Ler um vetor A com 10 elementos e construir um vetor B de mesmo
tipo e tamanho e com os mesmos elementos de A, sendo que estes
deverão estar invertidos, ou seja, o primeiro elemento de A passa a
ser o último de B, o segundo elemento de A passa a ser o penúltimo
de B e assim por diante*/
public class exercicio28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int i = 0;
        int count = vetorA.length - 1;

        for (i=0;i<vetorA.length;i++){
            System.out.println("Informe um número para a posição [" + (i+1) + "] do Vetor A: ");
            vetorA[i] = scan.nextInt();

           vetorB[count] = vetorA[i];
            count  --;
        }

        for (i=0;i< vetorA.length;i++){
            System.out.println("Vetor A: " + vetorA[i] + " | Vetor B: " + vetorB[i]);
        }
    }
}
