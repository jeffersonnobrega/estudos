import java.util.Scanner;

public class exercicio22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double precoCusto;
        double precoVenda;
        double calculoProduto;
        double resultado;
        double mediaCusto;
        double mediaVenda;
        double somaCusto = 0;
        double somaVenda = 0;
        int i = 0;


        for (i=1; i<=40;i++) {
            System.out.println("Informe o preço de custo do produto: ");
            precoCusto = scan.nextDouble();

            somaCusto += precoCusto;

            System.out.println("Informe o preço de venda do produto: ");
            precoVenda = scan.nextDouble();

            somaVenda += precoVenda;

            if (precoVenda > precoCusto) {
                calculoProduto = precoVenda - precoCusto;
                System.out.println("Valor de custo é R$ : " + precoCusto);
                System.out.println("Valor de venda R$ : " + precoVenda);
                System.out.println("Houve lucro de R$ " + calculoProduto);
            }  else if (precoVenda == precoCusto) {
                System.out.println("Valor de custo é R$ : " + precoCusto);
                System.out.println("Valor de venda R$ : " + precoVenda);
                System.out.println("Não houve lucro ou prejuízo, os valores ficaram empatados");
            } else {
                System.out.println("Valor de custo é R$ : " + precoCusto);
                System.out.println("Valor de venda R$ : " + precoVenda);
                calculoProduto = precoCusto - precoVenda;
                System.out.println("Houve prejuízo de R$ " + calculoProduto);
            }
        }
        i = i - 1;
        mediaCusto = somaCusto / i;
        mediaVenda = somaVenda / i;

        System.out.println("Soma custo" + somaCusto);
        System.out.println("soma venda " + somaVenda);
        System.out.println("A média de custo de produto é de R$: " + mediaCusto);
        System.out.println("A média de venda de produto é de R$: " + mediaVenda);
    }
}

/*22. Faça um algoritmo que receba o preço de custo e o preço de venda de 40 produtos. Mostre como resultado
se houve lucro, prejuízo ou empate para cada produto.

Informe o valor de custo de cada produto, o valor
de venda de cada produto, amédia de preço de custo e do preço de venda; */
