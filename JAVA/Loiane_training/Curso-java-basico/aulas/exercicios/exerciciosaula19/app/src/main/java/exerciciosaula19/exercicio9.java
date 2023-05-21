package exerciciosaula19;
/** Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
 um vetor C, onde cada elemento de C é a divisão dos respectivos
 elementos em A e B, ou seja C[i] = A[i] / float(B[i])*/
public class exercicio9 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[10];
        float[] c = new float[10];
        int aux = 10;

        for(int i=0;i<a.length;i++) {
            a[i] = aux--;
            b[i] = i+1;
            //b[i] = /*aux - */a[i];
            c[i] = a[i] / b[i];
            System.out.println("C["+i+"] = A["+i+"] = "+a[i] + " / B["+i+"] = "+b[i] +" C = "+ c[i]);
        }
    }
}
