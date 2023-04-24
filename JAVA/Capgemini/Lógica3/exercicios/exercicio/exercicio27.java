package exercicio;

import java.util.Scanner;
public class exercicio27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float valorVeiculo = 1;
        String tipoCombustivel;
        float desconto = 0;
        float totalValor = 0;
        boolean flag = true;

       while (flag == true) {
            System.out.println("Informe o valor do veículo. Zero encerra o programa: ");
            valorVeiculo = scan.nextFloat();

                if (valorVeiculo == 0) {
                    flag = false;
                    break;
                }


            System.out.println("Qual o tipo de combustível? ");
            System.out.println("A-álcool");
            System.out.println("G-gasolina");
            System.out.println("D- diesel");
            System.out.println("Digite uma das opções: ");
            tipoCombustivel = scan.next();

                if (tipoCombustivel.equalsIgnoreCase("a")) {
                    desconto = valorVeiculo * 25 / 100;
                    totalValor = valorVeiculo - desconto;
                } else if (tipoCombustivel.equalsIgnoreCase("g")) {
                    desconto = valorVeiculo * 21 / 100;
                    totalValor = valorVeiculo - desconto;
                } else if (tipoCombustivel.equalsIgnoreCase("d")) {
                    desconto = valorVeiculo * 14 / 100;
                    totalValor = valorVeiculo - desconto;
                } else {
                    System.out.println("Combustível inválido");
                }

            System.out.println("O valor do carro é de: R$ " + valorVeiculo);
            System.out.println("Será dado um desconto de R$ " + desconto);
            System.out.println("Assim o valor a ser pago pelo cliente é de: " + totalValor);

        }
    }
}
/*27. A concessionária de veículos “CARANGO” está vendendo os seus veículos com desconto. Faça um
algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente. O desconto deverá ser
calculado sobre o valor do veículo de acordo com o combustível (álcool – 25%, gasolina – 21% ou diesel
–14%). Com valor do veículo zero encerra entrada de dados. Informe total de desconto e total pago pelos
clientes;*/