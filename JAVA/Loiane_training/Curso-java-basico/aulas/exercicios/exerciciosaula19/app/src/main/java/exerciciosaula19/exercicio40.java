package exerciciosaula19;

import java.util.Random;

/** Criar dois vetores A e B cada um com 10 elementos inteiros.
 Desenvolver um programa que crie um vetor C que é a diferença dos
 conjuntos formados pelos elementos dos vetores A e B. Diferença de
 conjuntos = todos os elementos do conjunto A que não existem no
 conjunto B.*/
public class exercicio40 {
    public static void main(String[] args) {
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];
        int position = 50;
        int tamanhoC = 0;

        Random aleatorio = new Random();

            for(int i=0;i< vetorA.length;i++){
                 vetorA[i] = aleatorio.nextInt(position);
                 vetorB[i] = aleatorio.nextInt(position);

             }

            for(int i=0;i< vetorA.length;i++){
                if ( vetorA[i] != vetorB[i]){
                   tamanhoC++;
                }
            }
            vetorC = new int[tamanhoC*2];

            int count = 0;
            for(int i=0;i< vetorA.length;i++){
                if ( vetorA[i] != vetorB[i]){
                    vetorC[count] = vetorA[i];
                    count++;
                    vetorC[count] = vetorB[i];
                    count++;
                }
            }

            System.out.print("VetorA: ");
            for (int i = 0; i < vetorA.length; i++) {
                System.out.print(vetorA[i] + ", ");
            }
            System.out.println(" ");
            System.out.print("VetorB: ");

            for (int i = 0; i < vetorA.length; i++) {
                System.out.print(vetorB[i] + ", ");
            }

            System.out.println(" ");
            System.out.println("Há no total " + tamanhoC + " números diferentes em ambos conjuntos que formarão o Vetor C");
            System.out.print("VetorC: ");

                if (count == 0) {
                    System.out.println("Todos o números são iguais. Não foi possível formar o vetor");
                } else {
                    for (int i = 0; i < vetorC.length; i++) {
                        System.out.print(vetorC[i] + ", ");
                    }
                }


    }
}
