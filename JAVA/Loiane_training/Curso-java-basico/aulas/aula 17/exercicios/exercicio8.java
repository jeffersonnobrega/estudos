/*. Faça um programa que leia 5 números e informe a soma e a média 
dos números */

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int num = 0;
        int num2 = 0;
        int soma = 0;
        int i = 0;

        do {
            i++;
            num2 = num2 + num;
            soma = num2;
            System.out.println("Informe um número: ");
            num = scan.nextInt();            
        } while (i<5);

        System.out.println("O valor da soma dos números é: " + soma);
    }
}
//NÃO CONSEGUI RESOLVER A LÓGICA TENTEI COM FOR TAMBÉM
