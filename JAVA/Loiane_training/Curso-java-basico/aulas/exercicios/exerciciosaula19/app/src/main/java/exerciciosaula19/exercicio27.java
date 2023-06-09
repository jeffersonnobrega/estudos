package exerciciosaula19;

import java.util.Scanner;

/*27. Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho, obedecendo as seguintes regras de formação:
a) B i deverá receber 'a' quando A i for menor que 7;
b) B i deverá receber 'b' quando A i for igual a 7;
c) B i deverá receber 'c' quando A i for maior que 7 e menor que 10;
d) B i deverá receber 'd' quando A i for igual a 10; e
e) B i deverá receber 'e' quando A i for maior que 10.

Sugestão: char B[10]*/
public class exercicio27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] a = new int[10];
        char[] b = new char[a.length];

        for(int i=0;i<a.length;i++) {
            System.out.println("Informe o número do vetorA[" + i + "]: ");
            a[i] = scan.nextInt();

                if(a[i] < 7 ) {
                    b[i] = 'a';
                }

                if(a[i] == 7 ) {
                    b[i] = 'b';
                }

                if(a[i] > 7 && a[i] < 10) {
                    b[i] = 'c';
                }

                if(a[i] == 10 ) {
                    b[i] = 'd';
                }

                if(a[i] > 10 ) {
                    b[i] = 'e';
                }

            System.out.println("Vetor A na posição [" + i + "] é: " + a[i] + " onde Vetor B recebeu " + b[i] );
        }

    }
}
