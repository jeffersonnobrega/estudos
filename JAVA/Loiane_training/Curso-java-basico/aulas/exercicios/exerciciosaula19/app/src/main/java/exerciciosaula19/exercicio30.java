package exerciciosaula19;

import java.util.Scanner;

/*30. Ler um vetor A com 20 elementos. Construir dois vetores B e C, sendo
que nos vetor B e C serão armazenados o valores pares e ímpares de
A, respectivament*/
public class exercicio30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] a = new int[6];
        int[] b = new int[a.length];
        int[] c = new int[a.length];

        for (int i=0;i<a.length;i++) {
            System.out.println("Informe o valor de A na posição ["+(i+1)+"]: ");
            a[i] = scan.nextInt();
        }

        int ultimaPosicaoB = 0;
        int ultimaPosicaoC = 0;

        for (int i=0;i<a.length;i++) {
            if(a[i] % 2 == 0) {
               b[ultimaPosicaoB] = a[i];
               ultimaPosicaoB++;
            } else {
                c[ultimaPosicaoC] = a[i];
                ultimaPosicaoC++;
            }
        }

        for (int i=0;i<a.length;i++) {
            System.out.print(" A["+(i+1)+"]:" + a[i]);
        }


        System.out.println(" ");
        for (int i=0;i<ultimaPosicaoB;i++) {
            System.out.print(" B["+(i+1)+"]:" + b[i]);
        }
        System.out.println(" ");
        for (int i=0;i<ultimaPosicaoC;i++) {
            System.out.print(" C["+(i+1)+"]:" + c[i]);
        }
    }
}
