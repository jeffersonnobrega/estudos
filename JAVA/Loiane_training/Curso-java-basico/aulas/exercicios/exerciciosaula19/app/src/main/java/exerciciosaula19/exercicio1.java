
package exerciciosaula19;

/**
 *1. Criar um vetor A com 5 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho e com os "mesmos" elementos do vetor A, ou
seja, B[i] = A[i].
 */
public class exercicio1 {
    public static void main(String[] args){
        
        int[] a = new int[5];
        int[] b = new int[5];
        
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
       
        for(int i=0; i < b.length;i++) {
            b[i] = a[i];
            System.out.println("Valor de B na posição " + i + " é " + b[i]);
        }
       
        
    }
}
