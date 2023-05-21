package exerciciosaula19;

import java.util.Random;

/** 22. Gerar aleatoriamente um vetor A com 10 elementos inteiros e iguais a
 0 e 1, sugestão: A[i] = (int)Math.round(Math.random() * 1); Pede-se
 para implementar um programa que determine o percentual de
 números 0's e 1's existentes no vetor A*/
public class exercicio22 {
    public static void main(String[] args) {
        Random aleatorio = new Random();

        int[] vetorA = new int[10];
        int contZero = 0;
        int contUm = 0;
        double porcentZero;
        double porcentUm = 0;

        for(int i=0;i<vetorA.length;i++){
            //A função Math. round() retorna o valor de um número arredondado para o inteiro mais proximo
            //O Math.random() é por defenição um numero entre 0 e 1 vc multiplica
            // por um valor para ter números, por exemplo, multiplica por 20 para ter números até 20
            vetorA[i] = (int)Math.round(Math.random() * 1);
                if (vetorA[i] == 0) {
                    contZero++;
                } else {
                    contUm++;
                }
        }
        porcentZero = (contZero*100)/ vetorA.length;
        porcentUm = (contUm*100)/ vetorA.length;
        System.out.println("Há no vetor um total de " + porcentZero+"% de números Zeros");
        System.out.println("Há no vetor um total de " + porcentUm+"% de números Um");
        System.out.println(" ");
        System.out.println("Vetor para conferir: ");

            for(int i=0;i<vetorA.length;i++) {
                System.out.println("Na posição [" + i + "] do vetor está o número: " + vetorA[i]);
            }

    }
}
