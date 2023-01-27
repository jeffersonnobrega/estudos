import java.util.Scanner;

/**
 * 1 - Faça um programa que peça dois números e imprima o maior deles.
 */
public class exercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        int num1 = scan.nextInt();
        System.out.println("Informe o segundo número: ");
        int num2 = scan.nextInt();

        if (num1 > num2) {
            System.out.println("O primeiro número: " + num1 + " é maior que o segundo número informado: " + num2);
        } else if (num1 == num2){
            System.out.println("Os números possuem o mesmo valor");
        } else {
            System.out.println("O segundo número informado: " + num2 + " é maior que o primeiro número informado: " + num1);
        }    
    }
    
}