package exercicios;

import java.util.Scanner;

public class exercicio20 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número: ");
        long num1 = scan.nextInt();

        long num = num1;
        long i = num;

        while (i > 1) {
            i--;
            System.out.println("O fatorial de " + num1 + "!=" + num1 + "*" + i);
            num = (num * (i));
        }
        System.out.println("O fatorial de " + num1 + "! é " + num);
    }
}
/*20. Altere o programa de cálculo do fatorial, permitindo ao usuário calcular
o fatorial várias vezes e limitando o fatorial a números inteiros positivos
e menores que 16.*/
