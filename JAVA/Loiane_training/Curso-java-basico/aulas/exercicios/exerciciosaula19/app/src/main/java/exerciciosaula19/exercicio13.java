package exerciciosaula19;
/*13. Criar um vetor A com 10 elementos inteiros. Implementar um programa
que determine a soma dos elementos armazenados neste vetor que
são múltiplos de 5.*/
public class exercicio13 {
    public static void main(String[] args) {

        int[] a = new int[10];
        int soma = 0;
        int i = 0;
        for(i=0;i<a.length;i++) {
            a[i]=i+1;
                if (a[i]%5==0){
                    soma += a[i];
                }
        }
        System.out.println("A soma é " + soma);
    }
}
