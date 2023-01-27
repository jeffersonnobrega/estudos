/*6 - Faça um programa que leia três números e mostre o maior deles.
 
 */

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Informe o primeiro número: ");
        int numero1 = scan.nextInt();

        System.out.print("Informe o segundo número: ");
        int numero2 = scan.nextInt();

        System.out.print("Informe o terceiro número: ");
        int numero3 = scan.nextInt();
        
        if (numero1 > numero2 && numero1 > numero3){
            System.out.println("O primeiro número informado " + numero1 + " é maior que os outros");
        } else if (numero2 > numero1 && numero2 > numero3){
            System.out.println("O segundo número informado " + numero2 + " é maior que os outros");
        } else if (numero3 > numero1 && numero3 > numero1){
            System.out.println("O Terceiro número informado " + numero3 + " é maior que os outros");
        } else {
            System.out.println("Os números informados são iguais");
        }
        
    }
}