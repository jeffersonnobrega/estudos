package exerciciosaula19;
/** 10. Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
 mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
 ser o resto da divisão do respectivo elemento de A por 2 (dois), ou
 seja: B[i] := A[i] % 2*/
public class exercicio10 {
    public static void main(String[] args) {


        int[] a = new int[10];
        int[] b = new int[10];


        for (int i = 0; i < a.length; i++) {
            a[i] = (i+1) * 11;
            b[i] = a[i] % 2;
            System.out.println(b[i]);
        }
    }
}
