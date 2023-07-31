package exercicios;

import java.util.Random;

/** 2. Gere e imprima uma matriz M 10x10 com valores aleatórios entre
 0-9. Após isso indique qual é o maior e o menor valor da linha 5 e
 qual é o maior e o menor valor da coluna 7 */

public class exercicio2 {
    public static void main(String[] args) {
        Random aleatorio = new Random();

        int[][] matrizA = new int[10][10];

        for (int i=0;i<matrizA.length;i++){

            for(int j=0;j<matrizA[i].length;j++){
                matrizA[i][j] = aleatorio.nextInt(100);

            }
        }
        //qual é o maior e o menor valor da linha 5
        int maiorCinco = Integer.MIN_VALUE;
        int menorCinco = Integer.MAX_VALUE;

       for(int j=0;j<matrizA[5].length;j++) {
           if(matrizA[5][j] > maiorCinco) {
               maiorCinco = matrizA[5][j];
           }
           if(matrizA[5][j] < menorCinco){
               menorCinco = matrizA[5][j];
           }

        }
        // qual é o maior e menor número na COLUNA 7

        int maiorSete = Integer.MIN_VALUE;
        int menorSete = Integer.MAX_VALUE;

        for(int i=0;i<matrizA.length;i++) {
            if(matrizA[i][7] > maiorCinco) {
                maiorSete = matrizA[i][7];
            }
            if(matrizA[i][7] < menorCinco){
                menorSete = matrizA[i][7];
            }
        }

        System.out.println("Na linha 5 o número maior é " + maiorCinco + " e o número menor é: " + menorCinco);
        System.out.println("Na coluna 7 o número maior é " + maiorSete+ " e o número menor é: " + menorSete);



    }
}
