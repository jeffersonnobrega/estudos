import java.util.Scanner;
public class exercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double valorCompra;
        double valorPrestacoes;

        System.out.println("Bem vindo a Loja Mamão com Açucar");
        System.out.println("Informe o valor da compra: ");
        valorCompra = scan.nextDouble();

        valorPrestacoes = valorCompra / 5;

        System.out.println("A compra no valor de R$ " + valorCompra + " pode ser divida em 5 parcelas de R$ " + valorPrestacoes);

    }
}

/** 10. A Loja Mamão com Açúcar está vendendo seus produtos em5(cinco)prestações sem juros. Faça um
 algoritmo que receba um valor de uma compra e mostre o valor das prestações;
 */
