package exercicios;

import java.util.Random;

/**1. Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-
 9. Após isso determine o maior número da matriz e a sua posição
 (linha, coluna). */
public class exercicio1 {
    public static void main(String[] args) {
        Random aleatorio = new Random();

        int[][] matrizM = new int[4][4];
        int numMaior = Integer.MIN_VALUE;
        int linha=0;
        int coluna=0;

        for(int i=0;i<matrizM.length;i++){
             for(int j=0;j<matrizM[i].length;j++){
                 matrizM[i][j] = aleatorio.nextInt(100);

             }
         }
         //determine o maior número da matriz e a sua posição
        // (linha, coluna)

         for(int i=0;i<matrizM.length;i++){
            for(int j=0;j<matrizM[i].length;j++) {
                if (matrizM[i][j] > numMaior) {
                    numMaior = matrizM[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }

        System.out.println("O número maior é [" + numMaior + "] localizado nas coordenadas: LINHA["+linha+"] COLUNA["+coluna+"]");


    }
}

