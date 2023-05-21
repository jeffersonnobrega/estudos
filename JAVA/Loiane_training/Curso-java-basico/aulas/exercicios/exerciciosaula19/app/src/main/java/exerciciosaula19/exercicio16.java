package exerciciosaula19;

import java.util.Scanner;

/*16. Criar um vetor A com 10 elementos inteiros. Escrever um programa
que calcule e escreva: a) a soma de elementos armazenados neste
vetor que são inferiores a 15; b) a quantidade de elementos
armazenados no vetor que são iguais a 15; e c) a média dos
elementos armazenados no vetor que são superiores a 15*/
public class exercicio16 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] a = new int[15];
        int[] igual = new int[a.length];
        int media = 0;
        int soma = 0;
        int somaMaior = 0;
        int i = 0;
        int aux = 0;

        for (i = 0; i < a.length; i++) {
            System.out.println("Informe o número do vetor[" + i + "]: ");
            a[i] = scan.nextInt();

            if (a[i] < 15) {
                soma += a[i];
            }

            if (a[i] == 15) {
                igual[i] = a[i];
            }

            if (a[i] > 15) {
                somaMaior += a[i];
                aux++;

            }
        }
        media = somaMaior / aux;

        System.out.println("a soma de elementos armazenados neste vetor que são inferiores a 15 é " + soma);
        System.out.println("a quantidade de elementos armazenados no vetor que são iguais a 15 é " + igual.length);
        System.out.println("a média dos elementos armazenados no vetor que são superiores a 15 é " + media);
    }
}
