/*22- Faça um programa que peça um numero inteiro e determine se ele é par ou impar.

23- Faça um programa que peça um numero e informe se o número é inteiro ou decimal. Dica: utilize uma função de  */

import java.util.Scanner;

public class exercicio22e23 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um numero inteiro: ");
        int num = scan.nextInt();

        if ((num%2) == 0) {
            System.out.println("O número " + num + " é par e é um número inteiro");
            
        } else  {
            System.out.println("O número: " + num + " é ímpar e decimal");
        }

    }
    
}