package exerciciosaula19;

import java.util.Random;
import java.util.Scanner;

/** Ler 10 elementos inteiros em um vetor A. Montar uma rotina de busca,
 para pesquisar se um dado elemento X está armazenado em A.*/
public class exercicio41 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int num;
        String pergunta;
        boolean continuar = true;

        for(int i=0;i<vetorA.length;i++){
            vetorA[i] = random.nextInt(100);
        }

        do {
            System.out.println("Digite o número inteiro que deseja buscar no Vetor: ");
            num = scan.nextInt();

                for(int i=0;i<vetorA.length;i++){
                    if(vetorA[i] == num) {
                        System.out.println("O número " + num + " foi encontrado no Vetor A na posição [" + i + "]");
                        break;
                    } else {
                        System.out.println("O número " + num + " não foi encontrado no Vetor A");
                        break;
                    }
                }


            System.out.println("Deseja listar o vetor A? S-sim N-Não");
            pergunta = scan.next();

                if (pergunta.equalsIgnoreCase("s")) {
                    System.out.print("Vetor A: ");
                    for(int i=0;i<vetorA.length;i++){
                        System.out.print(vetorA[i] + ", ");
                    }
                }
            System.out.println(" ");
            System.out.println("Deseja pesquisar um novo número? S-sim N-Não");
            pergunta = scan.next();

                if (pergunta.equalsIgnoreCase("n")) {
                    continuar = false;
                }



        } while(continuar == true);
    }
}
