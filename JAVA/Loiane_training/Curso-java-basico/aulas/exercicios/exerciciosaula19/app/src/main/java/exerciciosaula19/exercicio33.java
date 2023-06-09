package exerciciosaula19;

import java.util.Scanner;

/**  Criar um vetor A com 10 elementos inteiros. Escreva um programa que
 imprima cada elemento do vetor A e uma mensagem indicando se o
 respectivo elemento é um número primo ou não.*/
public class exercicio33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        boolean primo = true;

        for(int i=0;i<vetorA.length;i++) {
            System.out.println("Informe o valor de A[" + (i+1) + "]: ");
            vetorA[i] = scan.nextInt();
        }
        //Um número primo é um, maior igual a 2 e é  número que só é divisível por si mesmo e por 1.
        /*Verifique se o número é menor ou igual a 1. Se for, ele não é primo.
        Para cada número inteiro i entre 2 e o número anterior ao número que você quer verificar (excluindo o próprio número), faça:
        Verifique se o número é divisível por i. Se for, ele não é primo.
        Se o número passou por todas as iterações do passo anterior sem ser divisível por nenhum i, então ele é primo.*/

        //for de verificação se é primo
        for(int i=0;i<vetorA.length;i++) {
            if(vetorA[i] <=1 ){
               primo = false;

            }

            for(int j=2;j<vetorA[i];j++) {
                if(vetorA[i] % j == 0) {
                   primo = false;
                }
            }

            if (primo == true) {
                System.out.println("VetorA["+i+"] = " + vetorA[i] + " | é primo");
            } else {
                System.out.println("VetorA["+i+"] = " + vetorA[i] + " | não é primo");
            }


        }

    }
}
