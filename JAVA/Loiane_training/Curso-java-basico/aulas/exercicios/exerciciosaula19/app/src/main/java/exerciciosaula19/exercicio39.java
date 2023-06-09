package exerciciosaula19;

import java.util.Random;
import java.util.Scanner;

/** Criar dois vetores A e B cada um com 10 elementos inteiros.
 Desenvolver um programa que realize a interseção dos vetores A e B
 para produzir um vetor C. Interseção de conjuntos = todos os
 elementos que existem em A e também existem em B*/
public class exercicio39 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        int count = 0;

        //alimento o vetor A
        //alimento o vetor B
        //verifico se há iguais em ambos para ir para C
        //O C em teoria deve ter o dobro de tamanho
        //mas para economizar espaço, verificarei quantos iguais tem e o C terá esse tamanho

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = aleatorio.nextInt(20);
            vetorB[i] = aleatorio.nextInt(20);

            if (vetorA[i] == vetorB[i]) {
                count++;
            }
        }

        int[] vetorC = new int[count];
        int j = 0;

        for (int i = 0; i < vetorA.length; i++) {

            if (vetorA[i] == vetorB[i]) {
                vetorC[j] = vetorA[i];
                j++;
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
        System.out.print("VetorC: ");


        if (count == 0) {
            System.out.println("Não há números para formar o cojunto VetorC");
        } else {
            for (int i = 0; i < vetorC.length; i++) {
                System.out.print(vetorC[i] + ", ");
            }
        }
    }
}

