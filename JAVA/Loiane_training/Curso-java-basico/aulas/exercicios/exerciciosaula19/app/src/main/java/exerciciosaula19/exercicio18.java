package exerciciosaula19;

import java.util.Scanner;

/** 18. Ler um vetor A com 10 elementos inteiros correspondentes as idades
 de um grupo de pessoas. Escreva um programa que determine e
 escreva a menor e a maior idades e suas respectivas posições.*/
public class exercicio18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] idade = new int[4];
        int maior = 0;
        int menor = 0;


        for(int i=0;i< idade.length;i++){
            System.out.println("Informe a idade ["+i+"]: ");
            idade[i] = scan.nextInt();


              if(idade[i] >= maior) {
                  maior = idade[i];
              }  else  {
                  menor=idade[i];
              }

        }

        System.out.println("A maior idade é: " + maior);
        System.out.println("A menor idade é: " + menor);


    }
}
