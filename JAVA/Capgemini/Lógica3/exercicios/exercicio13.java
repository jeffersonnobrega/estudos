import java.util.Scanner;
public class exercicio13 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;

        System.out.println("Informe um número: ");
        num = scan.nextInt();

        if (num > 10) {
            System.out.println("Esse número é maior que 10");
        }
    }
}

/** 13. Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 10*/
