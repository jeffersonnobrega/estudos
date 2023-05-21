package exerciciosaula19;
/**6. Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
 um vetor C, onde cada elemento de C é a soma dos respectivos
 elementos em A e B, ou seja:
 C[i] = A[i] + B[i */
public class exercicio6 {
    public static void main(String[] args) {

        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[10];

        for(int i=0;i<a.length;i++){
            a[i] = i+1;
            b[i] = a[i];
            c[i] = a[i] + b[i];
            System.out.println("C é a soma de A e B na posição " + i +" portanto C = "+ c[i]);
        }


    }
}
