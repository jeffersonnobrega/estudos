import java.util.Scanner;

/** 1. Faça um algoritmo que receba dois números e exiba o resultado da sua soma;*/
public class exercicio1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1,num2;

        System.out.println("Informe o primeiro número");
        num1 = scan.nextInt();

        System.out.println("Informe o segundo número");
        num2 = scan.nextInt();

        System.out.println("A soma de " + num1 + " + " + num2 + " é: " + (num1+num2));
    }
}
