package exerciciosaula19;
import java.util.Scanner;
public class teste {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int[] vetorA = new int[4];
            System.out.println("Digite 4 números para preencher o vetorA:");

            for (int i = 0; i < vetorA.length; i++) {
                System.out.print("Número " + (i + 1) + ": ");
                vetorA[i] = input.nextInt();
                System.out.println(vetorA[i]);
            }

            boolean palindromo = true;
            int inicio = 0;
            int fim = vetorA.length - 1;

            while (inicio < fim) {
                if (vetorA[inicio] != vetorA[fim]) {
                    palindromo = false;
                    break;
                }
                inicio++;
                fim--;
            }

            if (palindromo) {
                System.out.println("O vetorA é um palíndromo.");
            } else {
                System.out.println("O vetorA não é um palíndromo.");
            }
        }
    }


