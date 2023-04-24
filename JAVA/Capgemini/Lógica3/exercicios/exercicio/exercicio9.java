package exercicio;
import java.util.Scanner;
public class exercicio9 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double valor = 0;
        double total = 0;
        double juros;

        System.out.println("Informe o valor depositado:");
        valor = scan.nextDouble();

        juros = (valor * 0.7) / 100;
        total = valor + juros;

        System.out.println("O valor total com o rendimento mensal é de: R$ " + total);


    }
}
/** 9. Faça um algoritmo que receba um valor que foi depositado e exiba o valor com rendimento após um
 mês.Considere fixo o juro da poupança em 0,07% a. m*/