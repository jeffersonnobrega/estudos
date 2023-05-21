package exerciciosaula19;
/**15. Criar um vetor A com 10 elementos inteiros. Desenvolver um programa
 que defina o percentual de elementos pares e ímpares,
 respectivamente, armazenados neste vetor.*/
public class exercicio15 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int par = 0;
        int impar = 0;
        float porPar = 0;
        float porImpar = 0;

        for(int i=1;i<a.length;i++){
            a[i] = i;
            if(a[i]%2==0) {
                par++;
            } else {
                impar++;
            }
        }

        porPar = (par * 100) / 10;
        porImpar = (impar * 100) / 10;

        System.out.println("Porcentagem par" + porPar + "%");
        System.out.println("Porcentagem par" + porImpar + "%");

    }
}
