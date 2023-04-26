package exercicio;
import java.util.Scanner;
public class exercicio31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numA;
        int numB;
        char dadoC;
        double porcent = 0;

        System.out.println("Informe o valor A: ");
        numA = scan.nextInt();

        System.out.println("Informe o valor B: ");
        numB = scan.nextInt();

        System.out.println("Informe um operador aritmético (+,-,*,/,%): ");
        dadoC = scan.next().charAt(0);

        if (dadoC == '+' ) {
            System.out.println(numA + " + " + numB + " = " + (numA + numB));
        } else if (dadoC == '-' ) {
            System.out.println(numA + " + " + numB + " = " + (numA - numB));
        } else if  (dadoC == '*' ) {
            System.out.println(numA + " + " + numB + " = " + (numA * numB));
        } else if (dadoC == '%' ) {
            porcent = (numA * numB) / 100;
            System.out.println(numB + "% de " + numA + " = " + porcent);
        } else if (dadoC == '/' ) {
            if (numB == 0) {
                System.out.println("Não é possível dividir por zero");
            } else {
                System.out.println(numA + " / " + numB + " = " + (numA / numB));
            }
        } else {
            System.out.println("Operador aritmético inválido");
        }
    }
}
/*31. Dados três valores A, B e C, em que A e B são números reais e C é um caractere, pede-se para imprimir o
resultado da operação de A por B se C for um símbolo de operador aritmético; caso contrário deve ser
impressa uma mensagem de operador não definido. Tratar erro de divisão por zero;
*/