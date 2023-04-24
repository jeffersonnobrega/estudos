import java.sql.SQLOutput;
import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;

        System.out.println("Informe o número: ");
        num = scan.nextInt();

        if (num >= 100 || num <= 200) {
            System.out.println(num + " está no intervalo entre 100 e 200");
        } else {
            System.out.println(num + " não está no intervalo entre 100 e 200");
        }
    }
}

/*15. Faça um algoritmo que receba um número e diga se este número está no intervalo entre 100 e 200*/
