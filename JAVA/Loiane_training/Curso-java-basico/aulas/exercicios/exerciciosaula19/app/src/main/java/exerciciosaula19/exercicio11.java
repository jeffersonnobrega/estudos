package exerciciosaula19;

/** 11. Criar um vetor A com 10 elementos inteiros. Implementar um programa
 que defina e escreva a quantidade de elementos armazenados neste
 vetor que são pares.*/
public class exercicio11 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int aux = 0;

        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                a[i] = i;
                aux++;
                System.out.println("A [" + i + "] = " + a[i] + " é par");

            }
        }
        System.out.println("Há no vetor  A " + aux + " elementos armazenados");
    }
}
