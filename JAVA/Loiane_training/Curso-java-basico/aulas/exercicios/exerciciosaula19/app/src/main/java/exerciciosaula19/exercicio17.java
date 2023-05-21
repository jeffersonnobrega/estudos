package exerciciosaula19;

import java.util.Scanner;

/** . Ler um vetor A com 10 elementos inteiros correspondentes as idades
 de um grupo de pessoas. Escreva um programa que determine e
 escreva a quantidade de pessoas que possuem idade superior a 35
 anos*/
public class exercicio17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[]  idadeA = new int[10];

        for(int i=0;i<idadeA.length;i++) {
            System.out.println("Informe uma idade: ");
            idadeA[i] = scan.nextInt();
        }
        int cont=0;
        for(int i=0;i<idadeA.length;i++) {
            if (idadeA[i] > 35) {
                cont++;
            }
        }

        System.out.println("Há um total de "+ cont + "pessoa com idade superio a 35 anos");

    }
}
