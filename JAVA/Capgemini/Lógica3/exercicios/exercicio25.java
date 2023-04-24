import java.util.Scanner;
public class exercicio25 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int num1, num2;

        System.out.println("Informe o primeiro número: ");
        num1 = leia.nextInt();

        System.out.println("Informe o segundo número: ");
        num2 = leia.nextInt();

            if (num1 == num2) {
                System.out.println(num1 + " e " + num2 + " são iguais");
            } else {
                System.out.println("Os números são diferentes: ");
                if (num1 > num2) {
                    System.out.println(num1 + " é maior que " + num2);
                } else {
                    System.out.println(num2 + " é maior que " + num1);
                }
            }
    }
}
/** 25. Faça um algoritmo que leia dois números
 * e identifique se são iguais ou diferentes.
 * Caso eles sejam iguais  imprima uma mensagem dizendo que eles são iguais.
 Caso sejam diferentes, informe qual número é o
 maior, e uma mensagem que são diferentes;
 */