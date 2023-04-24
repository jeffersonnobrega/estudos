import java.util.Scanner;
public class exercicio14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1,num2;

        System.out.println("Informe o primeiro número: ");
        num1 = scan.nextInt();
        System.out.println("Informe o segundo número: ");
        num2 = scan.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " é maior que " + num2);
        } else if (num2 > num1){
            System.out.println(num2 + " é maior que " + num1);
        } else {
            System.out.println("Os números são iguais");
        }

        /** 14. Escreva um algoritmo que leia dois valores inteiro distintos e informe qual é o maior;
         */
    }
}
