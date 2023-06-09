package exerciciosaula19;

import java.util.Scanner;
import java.lang.Math;

/** Criar um vetor A com 11 elementos, indexados de 0 até 10. Sendo que
 cada elemento do vetor A é formado pela potência de base 2 elevado
 ao expoente igual a posição do respectivo elemento, ou seja:
 A[i] = 2 i . Sugestão int A[11];*/

public class exercicio36 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[11];

        for(int i=0;i<vetorA.length;i++) {
            vetorA[i] = (int) Math.pow(2, i); //como pow é um double, a gente põe (int) para converter em inteiro
        }
        for(int i=0;i<vetorA.length;i++) {
            System.out.print(vetorA[i] + ", ");
        }
    }
}
/*O método pow() da classe Math em Java é usado para
calcular a potência de um número.
Ele recebe dois parâmetros: a base e o expoente,
e retorna a base elevada ao expoente.*/