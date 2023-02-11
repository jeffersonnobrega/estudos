

import java.util.Scanner;

/*13. Faça um programa que peça dois números, base e expoente, calcule e
mostre o primeiro número elevado ao segundo número. Não utilize a
função de potência da linguagem.*/

public class exercicio13 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro número base: ");
        int base = scan.nextInt();

        System.out.println("Informe o segundo número, o expoente: ");
        int power = scan.nextInt();

        int result = 1;

        for (; power != 0; power--) {
            result = result * base;
            //podia ser
            // result *= base;
        }
        System.out.println("Result =  " + result);
    }

}



