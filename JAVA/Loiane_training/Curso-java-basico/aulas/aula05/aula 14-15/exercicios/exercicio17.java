import java.util.Scanner;

public class exercicio17 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um ano: ");
        int ano = scan.nextInt();

        double anoB = ano % 4; // aqui o número é divido por quato e é salvo na variável apenas o resto

        if (anoB == 0) {
            System.out.println("O ano " + ano + " é Bissexto");

        } else {
            System.out.println("O ano " + ano + " não é Bissexto");
        }

    }
}
