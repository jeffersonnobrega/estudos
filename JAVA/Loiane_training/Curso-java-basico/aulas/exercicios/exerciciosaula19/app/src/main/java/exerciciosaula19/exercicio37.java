package exerciciosaula19;
import java.util.Random;
import java.util.Scanner;
/** Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
 mesmo tamanho, sendo que cada elemento do vetor B seja o fatorial
 do elemento correspondente em A.*/

// exemplo de fatorial para entender:
//O fatorial de 5 é 120, pois 5! = 5 * 4 * 3 * 2 * 1 = 120.
public class exercicio37 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] vetorA = new int[15];
        int[] vetorB = new int[vetorA.length];

       for (int i=0;i<vetorA.length;i++){
           vetorA[i] = random.nextInt(100);
           vetorB[i] = 1;
            for(int j=1;j<=vetorA[i];j++){
                vetorB[i] *= j;
           }
       }
        // Exibindo o vetor B
        System.out.println("Vetor B:");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println(vetorB[i] + " ");
        }
    }
}
