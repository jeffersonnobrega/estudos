import java.util.Scanner;

public class exercicio35 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double kw;
        double total = 0;
        String tipo = " ";
        boolean flag = true;

        while (flag == true) {
            System.out.println("Informe o tipo de cliente. Digite: ");
            System.out.println("R para residência, C para Comércio, I para indústria: ");
            tipo = scan.next();

            switch (tipo) {
                case "r": flag = false; break;
                case "R": flag = false; break;
                case "C": flag = false; break;
                case "c": flag = false; break;
                case "i": flag = false; break;
                case "I": flag = false; break;
                default:
                    System.out.println("Caracter Inválido");
            }
        }
            System.out.println("Informe a quantida de Kw/h usadas no mês");
            kw = scan.nextDouble();

            if (tipo.equalsIgnoreCase("r")) {
                total = kw * 0.60;
            } else if (tipo.equalsIgnoreCase("c")) {
                total = kw * 0.48;
            } else if (tipo.equalsIgnoreCase("i")) {
                total = kw * 1.29;
            }
        System.out.println("Caro cliente o valor a ser pago é de R$ " + total);



    }
}
/*35. Faça um algoritmo que calcule o valor da conta de luz de uma pessoa. Sabe-se que o cálculo da conta de
luz segue a tabela abaixo:
Tipo de Cliente Valor do KW/h

a. (Residência) 0,60;
b. (Comércio) 0,48
c. (Indústria) 1,29 */