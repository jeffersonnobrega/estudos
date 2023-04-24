import java.util.Scanner;
public class exercicio1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1, num2,total;
        //receba dois números

        System.out.println("Informe o primeiro número: ");
        num1 = scan.nextInt();

        System.out.println("Informe o segundo número: ");
        num2 = scan.nextInt();

        // somar e imprimir o resultado

        total = num1 + num2;

        System.out.println("A soma de " + num1 + " + " + num2 + " é: " + total);




    }
}
/** 1. Faça um algoritmo que receba dois números e exiba o resultado da sua soma;*/