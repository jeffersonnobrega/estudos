import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        int num1 = scan.nextInt();

        System.out.println("Informe o segundo número: ");
        int num2 = scan.nextInt();

         for ( ;num1 < num2; num1++ ) {
            System.out.println(num1);
         }

         for ( ;num2 < num1; num2++ ) {
            System.out.println(num2);
         }

    }
}
