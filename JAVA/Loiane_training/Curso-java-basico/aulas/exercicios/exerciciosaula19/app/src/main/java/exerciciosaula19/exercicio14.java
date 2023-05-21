package exerciciosaula19;

/** 14. Criar um vetor A com 10 elementos inteiros. Implementar um programa
 que defina e escreva a média aritmética simples dos elementos
 ímpares armazenados neste vetor.*/
public class exercicio14 {
    public static void main(String[] args) {

        int[] vetor = new int[10];
        int cont = 0;
        int i =0;
        int soma = 0;
        float media = 0;

        for (i=0;i<vetor.length;i++) {
            if (i%2==0){

            } else {
                vetor[i] = i;
                soma += vetor[i];
                cont++;
            }
        }
        media = soma / cont;
        System.out.println("A média dos elementos ímpares do vetor é de " +media);
    }
}
