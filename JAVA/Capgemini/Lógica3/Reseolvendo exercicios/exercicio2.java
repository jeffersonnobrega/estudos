import java.util.Scanner;
public class exercicio2 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        float num1, num2, soma, sub, multiplicacao,div;

        //receba dois numeros
        System.out.println("Informe o primeiro número: ");
        num1 = scan.nextFloat();

        System.out.println("Informe o segundo número: ");
        num2 = scan.nextFloat();

        // realizar a soma, subtração, multiplicação e a divisão

        soma = num1 + num2;
        sub = num1 - num2;
        multiplicacao = num1 * num2;
        div = num1 / num2;

        // imprimir resultados

        System.out.println(num1 + " + " + num2 + " = " + soma);
        System.out.println(num1 + " - " + num2 + " = " + sub);
        System.out.println(num1 + " * " + num2 + " = " + multiplicacao);
        System.out.println(num1 + " / " + num2 + " = " + div);


    }
}
/* 2. Faça um algoritmo que receba dois números e
ao final mostre a soma, subtração, multiplicação e a divisão
dos dois números lidos;
*/