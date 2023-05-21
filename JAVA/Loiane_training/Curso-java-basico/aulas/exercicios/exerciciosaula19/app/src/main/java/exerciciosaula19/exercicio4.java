package exerciciosaula19;

import java.text.DecimalFormat;

import static java.lang.Math.sqrt;

/** 4. Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
 mesmo tamanho, sendo que cada elemento do vetor B deverá ser a
 raiz quadrada do respectivo elemento de A, ou seja:
 B[i] = sqrt(A[i]).*/
public class exercicio4 {
    public static void main(String[] args) {
        int[] a = new int[15];
        double[] b = new double[a.length];

        DecimalFormat df = new DecimalFormat("###,###.###");

        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
            b[i] = sqrt (a[i]);
            System.out.println("Valor de A " + a[i] + " e valor de B " + df.format(b[i]));
        }
    }
}
