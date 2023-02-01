
/*11- AS organizações tabajara resolveram dar um aumento de salário aos seus 
colaboradores e lhe contrataram para desenvolver o programa que calculará os reajustes.

Faça um programa que recebe o salário e o reajuste segundo o seguinte critério, baseado no salário atual:

Salários até 280,00 (incluindo): aumento de 20%
salários entre 280,00 e 70,00: aumento de 15%
salários entre 700,00 e 1500: aumento de 10%
salários de 1500,00 em diante: aumento de 5%.

Após o aumento ser realizado informe na tela:

O salário antes do reajuste;
o percentual de aumento aplicado;
o valor do aumento;
o novo salário, após o aumento. */

import java.util.Scanner;

public class exercicio11 {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe seu salário atual: ");
        double salarioAtual = scan.nextDouble();
        

        if (salarioAtual <= 280) {
            double novoSalario = ((salarioAtual * 20) / 100) + salarioAtual;

            double aumento = novoSalario - salarioAtual;
            System.out.println("Seu salário antes do reajuste era de R$ " + salarioAtual);
            System.out.println("Foi aplicado um percentual de 20%");
            System.out.println("Você recebeu um aumento de R$ " + aumento);
            System.out.println("Seu novo salário é de R$: " + novoSalario);

        } else if (salarioAtual > 280 && salarioAtual < 699) {

            double novoSalario = ((salarioAtual * 15) / 100) + salarioAtual;
            double aumento = novoSalario - salarioAtual;

            System.out.println("Seu salário antes do reajuste era de R$ " + salarioAtual);
            System.out.println("Foi aplicado um percentual de 15%");
            System.out.println("Você recebeu um aumento de R$ " + aumento);
            System.out.println("Seu novo salário é de R$: " + novoSalario);

        } else if (salarioAtual >=700 && salarioAtual < 1499) {
            
            double novoSalario = ((salarioAtual * 10) / 100) + salarioAtual;
            double aumento = novoSalario - salarioAtual;

            System.out.println("Seu salário antes do reajuste era de R$ " + salarioAtual);
            System.out.println("Foi aplicado um percentual de 10%");
            System.out.println("Você recebeu um aumento de R$ " + aumento);
            System.out.println("Seu novo salário é de R$: " + novoSalario);
        } else {
            double novoSalario = ((salarioAtual * 5) / 100) + salarioAtual;
            double aumento = novoSalario - salarioAtual;

            System.out.println("Seu salário antes do reajuste era de R$ " + salarioAtual);
            System.out.println("Foi aplicado um percentual de 5%");
            System.out.println("Você recebeu um aumento de R$ " + aumento);
            System.out.println("Seu novo salário é de R$: " + novoSalario);
        }


    }
}
