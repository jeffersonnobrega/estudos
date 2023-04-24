import java.util.Scanner;

public class exercicio23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = 0;

            for (int i=0;i<40;i++) {
                System.out.println("Informe um número: ");
                num = scan.nextInt();

                    if (num > 80 || num < 25 || num == 40 ) {
                        System.out.println("ALERTA!! Detectamos o número: " + num);
                    }
            }
    }
}
/* 23. Faça um algoritmo que receba um número e mostre uma mensagem caso este número sege maior que 80,
menor que 25 ou igual a 40;
*/