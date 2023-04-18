import java.util.Scanner;
public class exercicio2 {
    /**2. Faça um algoritmo que receba dois números e ao final mostre a soma, subtração, multiplicação e a divisão
     dos dois números lidos;
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        float num1,num2, soma,sub,multip;
        float div;


        System.out.println("Informe o primeiro número");
        num1 = scan.nextInt();

        System.out.println("Informe o segundo número");
        num2 = scan.nextInt();

        soma = num1 + num2;
        sub = num1 - num2;
        multip = num1 * num1;
        div = num1 / num2;

        System.out.println("A soma de " + num1 + " + " + num2 +  " é igual a: " + soma);
        System.out.println("A subtração de " + num1 + " - " + num2 + " é igual a: " + sub);
        System.out.println("A multiplicação de " + num1 + " x " + num2 + " é igual a: " + multip);
        System.out.println("A divisão de " + num1 + " / " + num2 + " é igual a: " + div);


    }
}
