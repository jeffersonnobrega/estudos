
/*7 - Faça um programa que leia três números e mostre o maior e o menor deles. */

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        int numero1 = scan.nextInt();

        System.out.print("Informe o segundo número: ");
        int numero2 = scan.nextInt();

        System.out.print("Informe o primeiro número: ");
        int numero3 = scan.nextInt();

        if (numero1 > numero2 && numero1 > numero3){
            System.out.println("O primeiro número informado " + numero1 + " é maior");
        } else if (numero2 > numero1 && numero2 > numero3){
            System.out.println("O segundo número informado " + numero2 + " é o maior");
        } else if (numero3 > numero1 && numero3 > numero1){
            System.out.println("O Terceiro número informado " + numero3 + " é maior ");
        } 

        if (numero1 < numero2 && numero1 < numero3){
            System.out.println("O primeiro número informado " + numero1 + " é menor");
        } else if (numero2 < numero1 && numero2 < numero3){
            System.out.println("O segundo número informado " + numero2 + " é menor");
        } else if (numero3 < numero1 && numero3 < numero1){
            System.out.println("O Terceiro número informado " + numero3 + " é menor");
        } else {
            System.out.println("Os números informados são iguais");
        }

    }
}
