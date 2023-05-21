package exercicio;

public class util {


  /**
     * 2. Criar um vetor A com 8 elementos inteiros. Construir um vetor B de
     mesmo tipo e tamanho e com os elementos do vetor A multiplicados
     por 2, ou seja: B[i] = A[i] * 2.

     */

        public static void main(String[] args){

            int[] a = new int [8];
            int[] b = new int [8];

            a[0] = 1;
            a[1] = 2;
            a[2] = 3;
            a[3] = 4;
            a[4] = 5;
            a[5] = 6;
            a[6] = 7;
            a[7] = 8;
            a[8] = 9;

            for(int i=0;i<b.length;i++){
                b[i] = a[i];

                System.out.println("O valor de B na posição: " + (i+1) + " é: " + b[i]);
            }
        }

}


