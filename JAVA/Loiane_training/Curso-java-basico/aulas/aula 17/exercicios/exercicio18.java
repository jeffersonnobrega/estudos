

import java.util.Scanner;

public class exercicio18 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a quantidade de números no conjunto: ");
        int i = scan.nextInt();
        int temp = i;
        int num = 0;
        int maior = Integer.MIN_VALUE; //esse é o menor número possível
        int menor = Integer.MAX_VALUE;
        int soma = 0;

        do {
            i--;
            System.out.println("Informe um número");
            num = scan.nextInt();
            soma += num;

                if (num < menor) {
                    menor = num;
                }
                if (num > maior) {
                    maior = num;
                }

            }while (i > 0 && i < temp);

        System.out.println("O número maior é " + maior);
        System.out.println("O número menor é " + menor);
        System.out.println("A soma é " + soma);

    }
}

/*18. Faça um programa que, dado um conjunto de N números, determine o
menor valor, o maior valor e a soma dos valores.*/