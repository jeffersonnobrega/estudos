package exercicios;

import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int cont = 10;
        int num = 0;
        int contPar = 0;
        int contImpar = 0;

        do {
            System.out.println("Informe um número: ");
            num = scan.nextInt();

            if (num%2 == 0) {
                contPar++;
            } else {
                contImpar++;
            }
            cont--;
        } while (cont > 0 && cont < 10);

        System.out.println("par: " + contPar);
        System.out.println("impar: " + contImpar);

    }
}

/*14. Faça um programa que peça 10 números inteiros, calcule e mostre a
quantidade de números pares e a quantidade de números impares.*/