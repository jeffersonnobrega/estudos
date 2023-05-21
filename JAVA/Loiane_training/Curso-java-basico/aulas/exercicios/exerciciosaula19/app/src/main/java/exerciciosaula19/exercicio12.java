package exerciciosaula19;
/** 12. Criar um vetor A com 10 elementos inteiros. Implementar um programa
 que defina e escreva a soma de todos os elementos armazenados
 neste vetor*/
public class exercicio12 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[10];
        int aux = 0;
        int i;

        for( i=0;i<a.length;i++){
            a[i] = i+1;
            //b[i] += a[i];
            aux += a[i];

        }
        System.out.println("O valor da somas dos elementos do veto A é " + aux);
    }
}
