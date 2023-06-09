package exerciciosaula19;

import java.util.Scanner;

/*31. Ler um vetor A com 20 elementos. Separar os elementos pares e
ímpares de A utilizando apenas um vetor extra B. Sugestão: no início
do vetor B armazene os elementos pares de A e nas posições
restantes do vetor B armazene os elementos de A que são ímpares.*/
public class exercicio31 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        for(int i=0;i< vetorA.length;i++) {
            System.out.println("Informe o número da posição A["+(i+1)+"]: ");
            vetorA[i] = scan.nextInt();
        }

        int contPar = 0;
        int contImpar = vetorA.length/2;

        for(int i=0;i< vetorA.length;i++){
            if(vetorA[i] % 2 == 0) {
                vetorB[contPar] = vetorA[i];
                contPar++;
            } else {
                vetorB[contImpar] = vetorA[i];
                contImpar++;
            }
        }

        for (int i=0;i<vetorA.length;i++) {
            System.out.print(" A["+(i+1)+"]:" + vetorA[i]);
        }

        System.out.println(" ");

        for (int i=0;i< vetorB.length;i++) {
            System.out.print(" B["+(i+1)+"]:" + vetorB[i]);
        }



    }
}
