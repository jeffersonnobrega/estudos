package exerciciosaula19;

import java.util.Scanner;

/**Criar um vetor A com 10 elementos inteiros. Escreva um programa que
 imprima cada elemento do vetor A e a relação de todos os pares de 0
 até o respectivo elemento.*/
public class exercicio34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

            for (int i=0;i<vetorA.length;i++){
                System.out.println("Informe o valor de A["+ (i+1) + "]: ");
                vetorA[i] = scan.nextInt();
            }

        int cont = 0;
            while (cont< vetorA.length) {
                    for (int i=0;i<vetorA[cont];i++) {
                        System.out.print(i+", ");
                    }
                System.out.print("Vator A: "+vetorA[cont]);
                cont++;
                System.out.println("");
            }
    }
}
