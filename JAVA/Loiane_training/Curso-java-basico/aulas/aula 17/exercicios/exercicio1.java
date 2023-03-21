/*1. Faça um programa que peça uma nota, entre zero e dez. Mostre uma
mensagem caso o valor seja inválido e continue pedindo até que o
usuário informe um valor válido. */

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int num = scan.nextInt();
        boolean primo = true;

        for(int i=2; i < num; i++){ //começa no 2 pq todo número é divisível por 1 e i < num ao invés de I <=, pq todo número é divisível por ele mesmo
            if (num % i == 0) {
                System.out.println("Não é número primo");
                primo = false;
            }        
        }

        if (primo) {
        System.out.println("é um número primo");
        }


    }
}