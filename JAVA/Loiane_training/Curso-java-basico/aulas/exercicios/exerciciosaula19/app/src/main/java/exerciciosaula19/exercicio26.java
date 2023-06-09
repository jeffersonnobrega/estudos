package exerciciosaula19;

import java.util.Scanner;

/*26. Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
um vetor C de mesmo tipo e tamanho, obedecendo as seguintes
regras de formação:
a) Ci deverá receber 1 quando Ai for maior que Bi;
b) Ci deverá receber 0 quando Ai for igual a Bi;
c) Ci deverá receber -1
quando A i for menor que B i .*/
public class exercicio26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] a = new int[4];
        int[] b = new int[a.length];
        int[] c = new int[a.length];

        for(int i=0;i<a.length;i++){
            System.out.println("Informe o valor de A ["+i+"]: ");
            a[i] = scan.nextInt();

            System.out.println("Informe o valor de B ["+i+"]: ");
            b[i] = scan.nextInt();

             if(a[i] > b[i]) {
                 c[i] = 1;
             } else if(a[i] == b[i]) {
                 c[i] = 0;
             } else {
                 c[i] = -1;
             }
        }

        for(int i=0;i<a.length;i++){
            System.out.println("Valor de C na posição ["+i+"]: " + c[i]);
        }
    }
}
