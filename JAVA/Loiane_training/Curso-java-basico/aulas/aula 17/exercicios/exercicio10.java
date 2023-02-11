import java.util.Scanner;
/*10.Faça um programa que receba dois números inteiros e gere os 
números inteiros que estão no intervalo compreendido por eles */
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

         //logica da professora abaixo

        /*for (int i=num1; i<=num2; i++){
            System.out.println(i);
        }*/

    }
}
