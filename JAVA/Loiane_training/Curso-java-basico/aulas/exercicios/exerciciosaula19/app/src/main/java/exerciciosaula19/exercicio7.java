package exerciciosaula19;
/** 7. Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
 um vetor C, onde cada elemento de C é a subtração dos respectivos
 elementos em A e B, ou seja:
 C[i] = A[i] – B[i].*/
public class exercicio7 {
    public static void main(String[] args) {

        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[10];
        int aux = 10;

        for(int i=0;i<a.length;i++){
            a[i] = i + 1;
            b[i] = aux - a[i];
            c[i] = a[i] - b[i];
            System.out.println("Valor A " + a[i] + " e valor B " + b[i]);
            //System.out.println("C ["+i+"] = A ["+i+"] - B ["+i+"] = " + c[i]);
        }
    }
}
