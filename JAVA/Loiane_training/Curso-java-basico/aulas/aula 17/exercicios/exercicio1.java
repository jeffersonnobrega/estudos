/*1. Faça um programa que peça uma nota, entre zero e dez. Mostre uma
mensagem caso o valor seja inválido e continue pedindo até que o
usuário informe um valor válido. */

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe uma nota entre 0 e 10");
        int numero = scan.nextInt();


        while (0 > numero  || 10 < numero) {
            
            System.out.println("Valor inválido. Entre com o número entre 0 e 10");
            numero = scan.nextInt();
            
        }



    }
}