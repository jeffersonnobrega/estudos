package exerciciosaula19;

import java.util.Scanner;

/** 24. Números palíndromos são aqueles que escritos da direita para a
 esquerda têm o mesmo valor quando escritos da esquerda para a
 direita. Exemplo: 545; 789987; 97379; 123454321; etc. Escreva um
 programa que verifique se um dado vetor A de 10 elementos inteiros é
 um palíndromo, ou seja, se o primeiro elemento do vetor e igual ao
 último, se o segundo elemento do vetor é igual ao penúltimo e assim
 por diante até verificar todos os elementos ou chegar a conclusão que
 o vetor não é um palíndromo*/
public class exercicio24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[3];
        boolean palindromo = false;
        int fim = vetorA.length - 1;


        for(int i=0;i<vetorA.length;i++) {
            System.out.println("Informe um número: ");
            vetorA[i] = scan.nextInt();
        }

        for(int i=0;i<vetorA.length;i++) {
            if (vetorA[i] == vetorA[fim]) {
                palindromo = true;
            } else {
                palindromo = false;
            }
         fim--;

        }
        System.out.println("O número: ");

        for (int i=0;i< vetorA.length;i++) {
            System.out.print(vetorA[i]+",");
        }
        if ( palindromo == true) {
            System.out.println(" é um palíndromo!");
        } else {
            System.out.println(" Não é um palíndromo");
        }

    }
}
