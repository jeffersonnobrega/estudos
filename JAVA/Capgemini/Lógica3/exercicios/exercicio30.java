import java.util.Scanner;
public class exercicio30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1;
        int num2;
        int num3;

        System.out.println("Informe o primeiro número: ");
        num1 = scan.nextInt();
        System.out.println("Informe o segundo número: ");
        num2 = scan.nextInt();
        System.out.println("Informe o terceiro número: ");
        num3 = scan.nextInt();

        // num1 num2 num3
        //num1 num3 num2
        if (num1 > num2 && num1 > num3) {
            if (num2 > num3) {
                System.out.println("Ordem crescente: " + num1 + "," + num2 + "," + num3);
            } else {
                System.out.println("Ordem crescente: " + num1 + "," + num3 + "," + num2);
            }
        //num2 num1 num3 //* num2, num1 num3
        } else if (num2 > num1 && num2 > num3) {
            if (num1 > num3) {
                System.out.println("Ordem crescente: " + num2 + "," + num1 + "," + num3);
            } else {
                System.out.println("Ordem crescente: " + num2 + "," + num3 + "," + num1);
            }
        } else {
            System.out.println("Ordem crescente: " + num3 + "," + num2 + "," + num1);
        }
    }
}
/*
* num1 num2 num3 10 5 2
* num1 num3 num2
* num2 num1 num3
* num2, num1 num3
*
*decrescente
* */
