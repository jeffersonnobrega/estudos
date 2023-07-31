package exercicios;

import java.util.Scanner;

/**3. Capture do teclado valores para preenchimento de uma matriz M
 3x3. Após a captura imprima a matriz criada e encontre a
 quantidade de números pares, a quantidade de números ímpares.*/
public class exercicio3 {
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        int[][] matrizM = new int[3][3];

        for(int i=0;i< matrizM.length;i++) {
            for (int j=0;j<matrizM[i].length;j++){
                System.out.print("Linha ["+i+"] Coluna ["+j+"]: " + "\t");
                matrizM[i][j]=scan.nextInt();

            }
        }

        for(int i=0;i< matrizM.length;i++){
            System.out.print("["+i+"]: ");
            for (int j = 0; j < matrizM[i].length; j++) {
                System.out.print(matrizM[i][j] + "\t");
            }
            System.out.println(" ");
        }
        int par=0;
        int impar=0;
        for(int i=0;i< matrizM.length;i++) {
            for (int j=0;j<matrizM[i].length;j++){
                if(matrizM[i][j] % 2 == 0) {
                    par++;
                } else {
                    impar++;
                }
            }
        }
        System.out.println("Quantidade de pares: " + par);
        System.out.println("Quantidade de ímpares: " + impar);
    }
}
