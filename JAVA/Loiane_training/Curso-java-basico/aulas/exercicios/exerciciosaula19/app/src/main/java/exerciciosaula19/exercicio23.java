package exerciciosaula19;

import java.util.Scanner;

/** 23. Criar um vetor A com 10 elementos inteiros. Desenvolver um programa
 que verifique se "todos" os elementos do vetor A são pares. Se pelo
 menos um elemento do vetor não for par o processo de repetição para
 percorrer os elementos do vetor deve ser encerrado, como sugestão:
 utilize uma variável do tipo flag para atingir este proposito*/
public class exercicio23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        boolean flag = true;
        int i = 0;

        while (flag == true) {
            System.out.println("Informe um número: ");
            vetorA[i] = scan.nextInt();
            if (vetorA[i] % 2 != 0 ) {
                System.out.println("Você informou um número ímpar e o programa será interrompido");
                flag = false;
            }
            i++;
        }
    }
}
