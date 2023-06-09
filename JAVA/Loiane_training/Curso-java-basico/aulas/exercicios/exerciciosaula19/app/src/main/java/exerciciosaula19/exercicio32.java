package exerciciosaula19;

import java.util.Scanner;

/**32. Criar um vetor A com 5 elementos inteiros. Escreva um programa que
 imprima a tabuada de cada um dos elementos do vetor A.*/
public class exercicio32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];
        int i = 0;


        for(;i<vetorA.length;i++){
            System.out.println("Informe o valor de A["+(i+1)+"]: ");
            vetorA[i] = scan.nextInt();

        }

        i=0;
        int cont=0;
        while (i< vetorA.length){
            System.out.println("Tabuada do "+vetorA[i]);
            for(;cont<=vetorA.length*2;cont++) {
                System.out.println(vetorA[i]+" x "+cont + " = " + (vetorA[i] * cont));
            }
          i++;
          cont = 0;
            System.out.println("");
        }



        /*      int cont = 0;

        for(i=0;i<vetorA.length;i++){
            System.out.println("Tabuada do "+vetorA[i]);
            for(;cont<=vetorA.length*2;cont++) {
                System.out.println(vetorA[i]+" x "+cont + " = " + (vetorA[i] * cont));
            }
            cont=0;
            System.out.println("");

        }*/


    }
}
