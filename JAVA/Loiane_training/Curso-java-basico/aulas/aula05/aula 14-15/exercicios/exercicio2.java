import java.util.Scanner;

/*2 - Faça um programa que peça um valor e mostre na tela se o valor é positivo ou negativo. */

public class exercicio2 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um valor: ");
        int valor = scan.nextInt();

        if (valor < 0) {
            System.out.println("O valor informado é negativo");
        } else {
            System.out.println("O valor informado é positivo");
        }

    }
}
