package exerciciosaula19;

import java.util.Scanner;

/**Ler 10 elementos inteiros em um vetor A e colocá-los em ordem
 crescente e apresentar os elementos ordenados.*/
public class exercicio42 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA= new int[4];

        for(int i=0;i< vetorA.length;i++){
            System.out.println("Informe o valor de VetorA[" + (i+1) + "]: ");
            vetorA[i] = scan.nextInt();
        }
        // Bubble Sort
        for (int i=0;i< vetorA.length -i;i++) {
            for(int j=0;j< vetorA.length-1 - i;j++){
                if(vetorA[j] > vetorA[j+1]) {
                    int temp = vetorA[j];
                    vetorA[j] = vetorA[j+1];
                    vetorA[j+1] = temp;
                }
            }
        }

        System.out.println("\nElementos do vetorA em ordem crescente:");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(vetorA[i]);
        }
    }
}
