import java.util.Scanner;
public class exercicio24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 0;
        String seguir;
        boolean flag = true;

        while (flag == true) {

            System.out.println("Informe um número: ");
            num = scan.nextInt();

                if (num > 0 ) {
                    System.out.println("Número positivo");
                } else if (num == 0) {
                    System.out.println("O número é 0");
                } else {
                    System.out.println("O número é negativo");
                }

            System.out.println("Deseja continuar? S-sim N-Não: ");
            seguir = scan.next();

                if (seguir.equalsIgnoreCase("n")) {
                    flag = false;
                }

        }
    }
}

/*24. Faça um algoritmo que receba “N” números e mostre positivo, negativo ou zero para cada número;*/
