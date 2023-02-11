import java.util.Scanner;

public class exercicio21 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int num = scan.nextInt();
        int cont = 0;

        for(int i=1; i <= num; i++){
            if (num % i == 0) {
                cont++;
            }
            if (cont > 2) {
                i = 0;
                System.out.println("Não é um número primot");
            } else {
                System.out.println("É um número primo");
            }
        }



    }

    /*21.Faça um programa que peça um número inteiro e determine se ele é
ou não um número primo. Um número primo é aquele que é divisível
somente por ele mesmo e por 1.*/
}