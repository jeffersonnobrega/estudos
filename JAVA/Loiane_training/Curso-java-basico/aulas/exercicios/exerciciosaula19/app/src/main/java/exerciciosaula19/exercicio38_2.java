package exerciciosaula19;

import java.util.Scanner;

public class exercicio38_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[4];
        int[] vetorB = new int[vetorA.length];
        int i = 0;

        for( ;i<vetorA.length;i++){
            System.out.println("Informe o VetorA[" + (i+1) + "]: ");
            vetorA[i] = scan.nextInt();
        }
    }
}
