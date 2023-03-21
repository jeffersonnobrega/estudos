import java.util.Scanner;

public class exercicio17 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número: ");
        long num1 = scan.nextInt();

        long num = num1;
        long i = num;

        while (i > 1) {
            i--;
            System.out.println("O fatorial de " + num1 + "!=" + num1+"*" + i);
            num *= i;
            }
        System.out.println("O fatorial de " + num1 + "! é " + num);

    }
}

    /*Faça um programa que calcule o fatorial de um número inteiro
fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120*/

