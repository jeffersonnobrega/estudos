package exerciciosaula19;

import static java.lang.Math.sqrt;

/** 5. Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
 mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
 ser o respectivo elemento de A multiplicado por sua posição (ou
 índice), ou seja:
 B[i] = A[i] * i*/
public class exercicio5 {

    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
            b[i] = a[i] * i;
            System.out.println("A na posição " + i + " tem o valor de " + a[i] + " e B na posição " + i + " é igual a " + b[i]);
        }
    }
}
